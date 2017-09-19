package model.hibernate.util;

import model.hibernate.entity.ContractEntity;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class DatabaseProcess {
    private static final Logger log = Logger.getLogger(DatabaseProcess.class);

    public static List<ContractEntity> getListContract(long id) {
        SessionFactory factory = HibernateUtils.getInstance().getSessionFactory();
        Session session = factory.openSession();
        List<ContractEntity> lst = new ArrayList<ContractEntity>();
        try {
            session.getTransaction().begin();
            String sql = " SELECT * FROM Contract where 1=1 ";
            if (id > 0) {
                sql += "and id = :id";
            }
            Query query = session.createSQLQuery(sql).addEntity(ContractEntity.class);
            if (id > 0) {
                query.setParameter("id", id);
            }
            lst = query.list();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error getListContract:" + e);
        } finally {
            session.close();
        }
        return lst;
    }

}
