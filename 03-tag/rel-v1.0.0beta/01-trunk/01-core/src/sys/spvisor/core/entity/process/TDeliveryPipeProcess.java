package sys.spvisor.core.entity.process;

import java.sql.Date;

public class TDeliveryPipeProcess {
    private Integer id;

    private Integer typeId;

    private Integer proId;

    private String productName;

    private String productNorm;

    private Double pipeArriveJuan;

    private Double pipeArriveDun;

    private Integer pipeRollingDrawing;

    private Integer formingWelding;

    private Integer nonDesCheck;

    private Integer waterPressExperoment;

    private Integer demotion;

    private Integer finishingWarehousingZhi;

    private Double finishingWarehousingMi;

    private Double finishingWarehousingDun;

    private Integer tufuZhi;

    private Double tufuMi;

    private Double tufuDun;

    private Integer pipeRukuZhi;

    private Double pipeRukuMi;

    private Double pipeRukuDun;

    private Integer pipeLiufang;

    private Integer pipeFalaingZhi;

    private Double pipeFalaingMi;

    private Double pipeFalaingDun;

    private Double completeRate;

    private Date planDate;

    private Date promiseDate;

    private Date submitDate;

    private Date whichDay;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getPipeArriveJuan() {
        return pipeArriveJuan;
    }

    public void setPipeArriveJuan(Double pipeArriveJuan) {
        this.pipeArriveJuan = pipeArriveJuan;
    }

    public Double getPipeArriveDun() {
        return pipeArriveDun;
    }

    public void setPipeArriveDun(Double pipeArriveDun) {
        this.pipeArriveDun = pipeArriveDun;
    }

    public Integer getPipeRollingDrawing() {
        return pipeRollingDrawing;
    }

    public void setPipeRollingDrawing(Integer pipeRollingDrawing) {
        this.pipeRollingDrawing = pipeRollingDrawing;
    }

    public Integer getFormingWelding() {
        return formingWelding;
    }

    public void setFormingWelding(Integer formingWelding) {
        this.formingWelding = formingWelding;
    }

    public Integer getNonDesCheck() {
        return nonDesCheck;
    }

    public void setNonDesCheck(Integer nonDesCheck) {
        this.nonDesCheck = nonDesCheck;
    }

    public Integer getWaterPressExperoment() {
        return waterPressExperoment;
    }

    public void setWaterPressExperoment(Integer waterPressExperoment) {
        this.waterPressExperoment = waterPressExperoment;
    }

    public Integer getDemotion() {
        return demotion;
    }

    public void setDemotion(Integer demotion) {
        this.demotion = demotion;
    }

    public Integer getFinishingWarehousingZhi() {
        return finishingWarehousingZhi;
    }

    public void setFinishingWarehousingZhi(Integer finishingWarehousingZhi) {
        this.finishingWarehousingZhi = finishingWarehousingZhi;
    }

    public Double getFinishingWarehousingMi() {
        return finishingWarehousingMi;
    }

    public void setFinishingWarehousingMi(Double finishingWarehousingMi) {
        this.finishingWarehousingMi = finishingWarehousingMi;
    }

    public Double getFinishingWarehousingDun() {
        return finishingWarehousingDun;
    }

    public void setFinishingWarehousingDun(Double finishingWarehousingDun) {
        this.finishingWarehousingDun = finishingWarehousingDun;
    }

    public Integer getTufuZhi() {
        return tufuZhi;
    }

    public void setTufuZhi(Integer tufuZhi) {
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

    public Integer getPipeRukuZhi() {
        return pipeRukuZhi;
    }

    public void setPipeRukuZhi(Integer pipeRukuZhi) {
        this.pipeRukuZhi = pipeRukuZhi;
    }

    public Double getPipeRukuMi() {
        return pipeRukuMi;
    }

    public void setPipeRukuMi(Double pipeRukuMi) {
        this.pipeRukuMi = pipeRukuMi;
    }

    public Double getPipeRukuDun() {
        return pipeRukuDun;
    }

    public void setPipeRukuDun(Double pipeRukuDun) {
        this.pipeRukuDun = pipeRukuDun;
    }

    public Integer getPipeLiufang() {
        return pipeLiufang;
    }

    public void setPipeLiufang(Integer pipeLiufang) {
        this.pipeLiufang = pipeLiufang;
    }

    public Integer getPipeFalaingZhi() {
        return pipeFalaingZhi;
    }

    public void setPipeFalaingZhi(Integer pipeFalaingZhi) {
        this.pipeFalaingZhi = pipeFalaingZhi;
    }

    public Double getPipeFalaingMi() {
        return pipeFalaingMi;
    }

    public void setPipeFalaingMi(Double pipeFalaingMi) {
        this.pipeFalaingMi = pipeFalaingMi;
    }

    public Double getPipeFalaingDun() {
        return pipeFalaingDun;
    }

    public void setPipeFalaingDun(Double pipeFalaingDun) {
        this.pipeFalaingDun = pipeFalaingDun;
    }

    public Double getCompleteRate() {
        return completeRate;
    }

    public void setCompleteRate(Double completeRate) {
        this.completeRate = completeRate;
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

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Date getWhichDay() {
        return whichDay;
    }

    public void setWhichDay(Date whichDay) {
        this.whichDay = whichDay;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}