package model.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CONTRACT")
public class Contract implements Serializable {
    private long id;
    private String contractName;
    private Date startDate;
    private Date endDate;
    private Date signDate;
    private Long totalValueContract;
    private Long totalValueContractVAT;
    private long contractType;
    private String linkImg;
    private long statusPay;
    private Date createDate;

    public Contract() {
    }

    public Contract(long id, String contractName, Date startDate, Date endDate, Date signDate, Long totalValueContract, Long totalValueContractVAT, long contractType, String linkImg, long statusPay, Date createDate) {
        this.id = id;
        this.contractName = contractName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.signDate = signDate;
        this.totalValueContract = totalValueContract;
        this.totalValueContractVAT = totalValueContractVAT;
        this.contractType = contractType;
        this.linkImg = linkImg;
        this.statusPay = statusPay;
        this.createDate = createDate;
    }

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "CONTRACT_NAME", length = 200)
    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    @Column(name = "START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "END_DATE")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "SIGN_DATE")
    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    @Column(name = "TOTAL_VALUE_CONTRACT")
    public Long getTotalValueContract() {
        return totalValueContract;
    }

    public void setTotalValueContract(Long totalValueContract) {
        this.totalValueContract = totalValueContract;
    }

    @Column(name = "TOTAL_VALUE_CONTRACT_VAT")
    public Long getTotalValueContractVAT() {
        return totalValueContractVAT;
    }

    public void setTotalValueContractVAT(Long totalValueContractVAT) {
        this.totalValueContractVAT = totalValueContractVAT;
    }

    @Column(name = "CONTRACT_TYPE")
    public long getContractType() {
        return contractType;
    }

    public void setContractType(long contractType) {
        this.contractType = contractType;
    }

    @Column(name = "LINK_IMG", length = 200)
    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    @Column(name = "STATUS_PAY")
    public long getStatusPay() {
        return statusPay;
    }

    public void setStatusPay(long statusPay) {
        this.statusPay = statusPay;
    }

    @Column(name = "CREATE_DATE")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
