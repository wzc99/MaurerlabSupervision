package sys.spvisor.core.entity.process;

import java.sql.Date;

public class TShebeiBengProcess {
    private Integer id;

    private Integer proId;

    private String pumpProductName;

    private Integer userId;

    private Date promiseDate;

    private Date sumbitDate;

    private Date planDate;

    private String bengProductSpecification;

    private Double bengOrderNum;

    private Integer bengBodyProcessCheck;

    private Integer bengSpindleProcessCheck;

    private Integer bengImpellerProcessCheck;

    private Integer bengFinalAssembly;

    private Integer bengPerformanceTest;

    private Integer bengPaint;

    private Integer fayun;

    private Integer typeId;

    private Integer chengpinruku;

    private Date whichDay;

    private Double completeRateToday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getPumpProductName() {
        return pumpProductName;
    }

    public void setPumpProductName(String pumpProductName) {
        this.pumpProductName = pumpProductName == null ? null : pumpProductName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getPromiseDate() {
        return promiseDate;
    }

    public void setPromiseDate(Date promiseDate) {
        this.promiseDate = promiseDate;
    }

    public Date getSumbitDate() {
        return sumbitDate;
    }

    public void setSumbitDate(Date sumbitDate) {
        this.sumbitDate = sumbitDate;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getBengProductSpecification() {
        return bengProductSpecification;
    }

    public void setBengProductSpecification(String bengProductSpecification) {
        this.bengProductSpecification = bengProductSpecification == null ? null : bengProductSpecification.trim();
    }

    public Double getBengOrderNum() {
        return bengOrderNum;
    }

    public void setBengOrderNum(Double bengOrderNum) {
        this.bengOrderNum = bengOrderNum;
    }

    public Integer getBengBodyProcessCheck() {
        return bengBodyProcessCheck;
    }

    public void setBengBodyProcessCheck(Integer bengBodyProcessCheck) {
        this.bengBodyProcessCheck = bengBodyProcessCheck;
    }

    public Integer getBengSpindleProcessCheck() {
        return bengSpindleProcessCheck;
    }

    public void setBengSpindleProcessCheck(Integer bengSpindleProcessCheck) {
        this.bengSpindleProcessCheck = bengSpindleProcessCheck;
    }

    public Integer getBengImpellerProcessCheck() {
        return bengImpellerProcessCheck;
    }

    public void setBengImpellerProcessCheck(Integer bengImpellerProcessCheck) {
        this.bengImpellerProcessCheck = bengImpellerProcessCheck;
    }

    public Integer getBengFinalAssembly() {
        return bengFinalAssembly;
    }

    public void setBengFinalAssembly(Integer bengFinalAssembly) {
        this.bengFinalAssembly = bengFinalAssembly;
    }

    public Integer getBengPerformanceTest() {
        return bengPerformanceTest;
    }

    public void setBengPerformanceTest(Integer bengPerformanceTest) {
        this.bengPerformanceTest = bengPerformanceTest;
    }

    public Integer getBengPaint() {
        return bengPaint;
    }

    public void setBengPaint(Integer bengPaint) {
        this.bengPaint = bengPaint;
    }

    public Integer getFayun() {
        return fayun;
    }

    public void setFayun(Integer fayun) {
        this.fayun = fayun;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getChengpinruku() {
        return chengpinruku;
    }

    public void setChengpinruku(Integer chengpinruku) {
        this.chengpinruku = chengpinruku;
    }

    public Date getWhichDay() {
        return whichDay;
    }

    public void setWhichDay(Date whichDay) {
        this.whichDay = whichDay;
    }

    public Double getCompleteRateToday() {
        return completeRateToday;
    }

    public void setCompleteRateToday(Double completeRateToday) {
        this.completeRateToday = completeRateToday;
    }
}