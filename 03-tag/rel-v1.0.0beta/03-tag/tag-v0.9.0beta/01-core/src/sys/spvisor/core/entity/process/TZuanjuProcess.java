package sys.spvisor.core.entity.process;

import java.sql.Date;

public class TZuanjuProcess {
    private Integer zuanjuId;

    private Integer typeId;

    private Integer proId;

    private String productName;

    private String productNorm;

    private Double daoliao;

    private Double guantitiaozhi;

    private Double zuankongcheyuan;

    private Double mocahanjie;

    private Double wusunjiance;

    private Double luowenjiagong;

    private Double zuantingluoxuan;

    private Double tufu;

    private Double chengpinruku;

    private Double fayun;

    private Double completeRateToday;

    private Date planDate;

    private Date promiseDate;

    private Date whichDay;

    private Date sumbitDate;

    private Integer userId;

    public Integer getZuanjuId() {
        return zuanjuId;
    }

    public void setZuanjuId(Integer zuanjuId) {
        this.zuanjuId = zuanjuId;
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

    public Double getDaoliao() {
        return daoliao;
    }

    public void setDaoliao(Double daoliao) {
        this.daoliao = daoliao;
    }

    public Double getGuantitiaozhi() {
        return guantitiaozhi;
    }

    public void setGuantitiaozhi(Double guantitiaozhi) {
        this.guantitiaozhi = guantitiaozhi;
    }

    public Double getZuankongcheyuan() {
        return zuankongcheyuan;
    }

    public void setZuankongcheyuan(Double zuankongcheyuan) {
        this.zuankongcheyuan = zuankongcheyuan;
    }

    public Double getMocahanjie() {
        return mocahanjie;
    }

    public void setMocahanjie(Double mocahanjie) {
        this.mocahanjie = mocahanjie;
    }

    public Double getWusunjiance() {
        return wusunjiance;
    }

    public void setWusunjiance(Double wusunjiance) {
        this.wusunjiance = wusunjiance;
    }

    public Double getLuowenjiagong() {
        return luowenjiagong;
    }

    public void setLuowenjiagong(Double luowenjiagong) {
        this.luowenjiagong = luowenjiagong;
    }

    public Double getZuantingluoxuan() {
        return zuantingluoxuan;
    }

    public void setZuantingluoxuan(Double zuantingluoxuan) {
        this.zuantingluoxuan = zuantingluoxuan;
    }

    public Double getTufu() {
        return tufu;
    }

    public void setTufu(Double tufu) {
        this.tufu = tufu;
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

    public Date getSumbitDate() {
        return sumbitDate;
    }

    public void setSumbitDate(Date sumbitDate) {
        this.sumbitDate = sumbitDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}