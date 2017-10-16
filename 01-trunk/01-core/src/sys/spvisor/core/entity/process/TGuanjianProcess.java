package sys.spvisor.core.entity.process;

import java.sql.Date;

public class TGuanjianProcess {
    private Integer guanjianId;

    private Integer typeId;

    private Integer proId;

    private String productName;

    private String productNorm;

    private Integer userId;

    private String xialiao;

    private String chengxing;

    private String hanjie;

    private String rechuli;

    private String wusunjiance;

    private Double chengpinruku;

    private Double fayun;

    private Double completeRateToday;

    private Date planDate;

    private Date promiseDate;

    private Date whichDay;

    private Date submitDate;

    public Integer getGuanjianId() {
        return guanjianId;
    }

    public void setGuanjianId(Integer guanjianId) {
        this.guanjianId = guanjianId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductNorm() {
        return productNorm;
    }

    public void setProductNorm(String productNorm) {
        this.productNorm = productNorm == null ? null : productNorm.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getXialiao() {
        return xialiao;
    }

    public void setXialiao(String xialiao) {
        this.xialiao = xialiao == null ? null : xialiao.trim();
    }

    public String getChengxing() {
        return chengxing;
    }

    public void setChengxing(String chengxing) {
        this.chengxing = chengxing == null ? null : chengxing.trim();
    }

    public String getHanjie() {
        return hanjie;
    }

    public void setHanjie(String hanjie) {
        this.hanjie = hanjie == null ? null : hanjie.trim();
    }

    public String getRechuli() {
        return rechuli;
    }

    public void setRechuli(String rechuli) {
        this.rechuli = rechuli == null ? null : rechuli.trim();
    }

    public String getWusunjiance() {
        return wusunjiance;
    }

    public void setWusunjiance(String wusunjiance) {
        this.wusunjiance = wusunjiance == null ? null : wusunjiance.trim();
    }

    public Double getChengpinruku() {
        return chengpinruku;
    }

    public void setChengpinruku(Double chengpinruku) {
        this.chengpinruku = chengpinruku;
    }

    public Double getFayun() {
        return fayun;
    }

    public void setFayun(Double fayun) {
        this.fayun = fayun;
    }

    public Double getCompleteRateToday() {
        return completeRateToday;
    }

    public void setCompleteRateToday(Double completeRateToday) {
        this.completeRateToday = completeRateToday;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Date getPromiseDate() {
        return promiseDate;
    }

    public void setPromiseDate(Date promiseDate) {
        this.promiseDate = promiseDate;
    }

    public Date getWhichDay() {
        return whichDay;
    }

    public void setWhichDay(Date whichDay) {
        this.whichDay = whichDay;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }
}