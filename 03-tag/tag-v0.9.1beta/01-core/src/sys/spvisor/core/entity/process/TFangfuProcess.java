package sys.spvisor.core.entity.process;

import java.sql.Date;

public class TFangfuProcess {
    private Integer fangfuId;

    private Integer typeId;

    private Integer proId;

    private String productName;

    private String productNorm;

    private Integer userId;

    private Double gangguanjieshouZhi;

    private Double gangguanjieshouMi;

    private Double gangguanjieshouDun;

    private Double wanguanjieshouZhi;

    private Double wanguanjieshouMi;

    private Double wanguanjieshouDun;

    private Double tufuZhi;

    private Double tufuMi;

    private Double tufuDun;

    private Double fangfuguanrukuZhi;

    private Double fangfuguanrukuMi;

    private Double fangfuguanrukuDun;

    private Double fangfuguanliufang;

    private Double fayunZhi;

    private Double fayunMi;

    private Double fayunDun;

    private Double completeRateToday;

    private Date planDate;

    private Date promiseDate;

    private Date whichDay;

    private Date sumbitDate;

    public Integer getFangfuId() {
        return fangfuId;
    }

    public void setFangfuId(Integer fangfuId) {
        this.fangfuId = fangfuId;
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

    public Double getGangguanjieshouZhi() {
        return gangguanjieshouZhi;
    }

    public void setGangguanjieshouZhi(Double gangguanjieshouZhi) {
        this.gangguanjieshouZhi = gangguanjieshouZhi;
    }

    public Double getGangguanjieshouMi() {
        return gangguanjieshouMi;
    }

    public void setGangguanjieshouMi(Double gangguanjieshouMi) {
        this.gangguanjieshouMi = gangguanjieshouMi;
    }

    public Double getGangguanjieshouDun() {
        return gangguanjieshouDun;
    }

    public void setGangguanjieshouDun(Double gangguanjieshouDun) {
        this.gangguanjieshouDun = gangguanjieshouDun;
    }

    public Double getWanguanjieshouZhi() {
        return wanguanjieshouZhi;
    }

    public void setWanguanjieshouZhi(Double wanguanjieshouZhi) {
        this.wanguanjieshouZhi = wanguanjieshouZhi;
    }

    public Double getWanguanjieshouMi() {
        return wanguanjieshouMi;
    }

    public void setWanguanjieshouMi(Double wanguanjieshouMi) {
        this.wanguanjieshouMi = wanguanjieshouMi;
    }

    public Double getWanguanjieshouDun() {
        return wanguanjieshouDun;
    }

    public void setWanguanjieshouDun(Double wanguanjieshouDun) {
        this.wanguanjieshouDun = wanguanjieshouDun;
    }

    public Double getTufuZhi() {
        return tufuZhi;
    }

    public void setTufuZhi(Double tufuZhi) {
        this.tufuZhi = tufuZhi;
    }

    public Double getTufuMi() {
        return tufuMi;
    }

    public void setTufuMi(Double tufuMi) {
        this.tufuMi = tufuMi;
    }

    public Double getTufuDun() {
        return tufuDun;
    }

    public void setTufuDun(Double tufuDun) {
        this.tufuDun = tufuDun;
    }

    public Double getFangfuguanrukuZhi() {
        return fangfuguanrukuZhi;
    }

    public void setFangfuguanrukuZhi(Double fangfuguanrukuZhi) {
        this.fangfuguanrukuZhi = fangfuguanrukuZhi;
    }

    public Double getFangfuguanrukuMi() {
        return fangfuguanrukuMi;
    }

    public void setFangfuguanrukuMi(Double fangfuguanrukuMi) {
        this.fangfuguanrukuMi = fangfuguanrukuMi;
    }

    public Double getFangfuguanrukuDun() {
        return fangfuguanrukuDun;
    }

    public void setFangfuguanrukuDun(Double fangfuguanrukuDun) {
        this.fangfuguanrukuDun = fangfuguanrukuDun;
    }

    public Double getFangfuguanliufang() {
        return fangfuguanliufang;
    }

    public void setFangfuguanliufang(Double fangfuguanliufang) {
        this.fangfuguanliufang = fangfuguanliufang;
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

    public Date getSumbitDate() {
        return sumbitDate;
    }

    public void setSumbitDate(Date sumbitDate) {
        this.sumbitDate = sumbitDate;
    }
}