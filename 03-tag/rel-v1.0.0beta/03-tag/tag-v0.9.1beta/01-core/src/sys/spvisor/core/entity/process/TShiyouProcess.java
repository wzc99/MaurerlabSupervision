package sys.spvisor.core.entity.process;

import java.sql.Date;

public class TShiyouProcess {
    private Integer shiyouId;

    private Integer typeId;

    private Integer proId;

    private String productName;

    private String productNorm;

    private Integer userId;

    private Double gangguanchengxingshuliang;

    private Double wusunjiance;

    private Double gangguanchicunjianyan;

    private Double luowenjiagong;

    private Double shuiya;

    private Double chengpinrukuZhi;

    private Double chengpinrukuMi;

    private Double chengpinrukuDun;

    private Double fayunZhi;

    private Double fayunMi;

    private Double fayunDun;

    private Double completeRateToday;

    private Date planDate;

    private Date promiseDate;

    private Date whichDay;

    private Date submitDate;

    public Integer getShiyouId() {
        return shiyouId;
    }

    public void setShiyouId(Integer shiyouId) {
        this.shiyouId = shiyouId;
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

    public Double getGangguanchengxingshuliang() {
        return gangguanchengxingshuliang;
    }

    public void setGangguanchengxingshuliang(Double gangguanchengxingshuliang) {
        this.gangguanchengxingshuliang = gangguanchengxingshuliang;
    }

    public Double getWusunjiance() {
        return wusunjiance;
    }

    public void setWusunjiance(Double wusunjiance) {
        this.wusunjiance = wusunjiance;
    }

    public Double getGangguanchicunjianyan() {
        return gangguanchicunjianyan;
    }

    public void setGangguanchicunjianyan(Double gangguanchicunjianyan) {
        this.gangguanchicunjianyan = gangguanchicunjianyan;
    }

    public Double getLuowenjiagong() {
        return luowenjiagong;
    }

    public void setLuowenjiagong(Double luowenjiagong) {
        this.luowenjiagong = luowenjiagong;
    }

    public Double getShuiya() {
        return shuiya;
    }

    public void setShuiya(Double shuiya) {
        this.shuiya = shuiya;
    }

    public Double getChengpinrukuZhi() {
        return chengpinrukuZhi;
    }

    public void setChengpinrukuZhi(Double chengpinrukuZhi) {
        this.chengpinrukuZhi = chengpinrukuZhi;
    }

    public Double getChengpinrukuMi() {
        return chengpinrukuMi;
    }

    public void setChengpinrukuMi(Double chengpinrukuMi) {
        this.chengpinrukuMi = chengpinrukuMi;
    }

    public Double getChengpinrukuDun() {
        return chengpinrukuDun;
    }

    public void setChengpinrukuDun(Double chengpinrukuDun) {
        this.chengpinrukuDun = chengpinrukuDun;
    }

    public Double getFayunZhi() {
        return fayunZhi;
    }

    public void setFayunZhi(Double fayunZhi) {
        this.fayunZhi = fayunZhi;
    }

    public Double getFayunMi() {
        return fayunMi;
    }

    public void setFayunMi(Double fayunMi) {
        this.fayunMi = fayunMi;
    }

    public Double getFayunDun() {
        return fayunDun;
    }

    public void setFayunDun(Double fayunDun) {
        this.fayunDun = fayunDun;
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