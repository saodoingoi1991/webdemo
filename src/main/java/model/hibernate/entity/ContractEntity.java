package model.hibernate.entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "CONTRACT")
public class ContractEntity {
    private long id;
    private String contractName;
    private Time startDate;
    private Time endDate;
    private Time signDay;
    private Long totalValueContract;
    private Long totalValueContractVat;
    private Long contractType;
    private String linkImg;
    private Long statusPay;
    private Time createDate;
//    private String linkUrl;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CONTRACT_NAME", nullable = true, length = 200)
    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    @Basic
    @Column(name = "START_DATE", nullable = true)
    public Time getStartDate() {
        return startDate;
    }

    public void setStartDate(Time startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true)
    public Time getEndDate() {
        return endDate;
    }

    public void setEndDate(Time endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "SIGN_DAY", nullable = true)
    public Time getSignDay() {
        return signDay;
    }

    public void setSignDay(Time signDay) {
        this.signDay = signDay;
    }

    @Basic
    @Column(name = "TOTAL_VALUE_CONTRACT", nullable = true, precision = 0)
    public Long getTotalValueContract() {
        return totalValueContract;
    }

    public void setTotalValueContract(Long totalValueContract) {
        this.totalValueContract = totalValueContract;
    }

    @Basic
    @Column(name = "TOTAL_VALUE_CONTRACT_VAT", nullable = true, precision = 0)
    public Long getTotalValueContractVat() {
        return totalValueContractVat;
    }

    public void setTotalValueContractVat(Long totalValueContractVat) {
        this.totalValueContractVat = totalValueContractVat;
    }

    @Basic
    @Column(name = "CONTRACT_TYPE", nullable = true, precision = 0)
    public Long getContractType() {
        return contractType;
    }

    public void setContractType(Long contractType) {
        this.contractType = contractType;
    }

    @Basic
    @Column(name = "LINK_IMG", nullable = true, length = 200)
    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    @Basic
    @Column(name = "STATUS_PAY", nullable = true, precision = 0)
    public Long getStatusPay() {
        return statusPay;
    }

    public void setStatusPay(Long statusPay) {
        this.statusPay = statusPay;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Time getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Time createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractEntity that = (ContractEntity) o;

        if (id != that.id) return false;
        if (contractName != null ? !contractName.equals(that.contractName) : that.contractName != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (signDay != null ? !signDay.equals(that.signDay) : that.signDay != null) return false;
        if (totalValueContract != null ? !totalValueContract.equals(that.totalValueContract) : that.totalValueContract != null)
            return false;
        if (totalValueContractVat != null ? !totalValueContractVat.equals(that.totalValueContractVat) : that.totalValueContractVat != null)
            return false;
        if (contractType != null ? !contractType.equals(that.contractType) : that.contractType != null) return false;
        if (linkImg != null ? !linkImg.equals(that.linkImg) : that.linkImg != null) return false;
        if (statusPay != null ? !statusPay.equals(that.statusPay) : that.statusPay != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (contractName != null ? contractName.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (signDay != null ? signDay.hashCode() : 0);
        result = 31 * result + (totalValueContract != null ? totalValueContract.hashCode() : 0);
        result = 31 * result + (totalValueContractVat != null ? totalValueContractVat.hashCode() : 0);
        result = 31 * result + (contractType != null ? contractType.hashCode() : 0);
        result = 31 * result + (linkImg != null ? linkImg.hashCode() : 0);
        result = 31 * result + (statusPay != null ? statusPay.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }

//    public String getLinkUrl() {
//        return linkUrl;
//    }
//
//    public void setLinkUrl(String linkUrl) {
//        this.linkUrl = linkUrl;
//    }
}
