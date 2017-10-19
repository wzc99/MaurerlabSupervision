package sys.spvisor.core.entity.process;

import java.sql.Date;

public class TValveProcess {
    private Integer id;

    private Integer proId;

    private Integer userId;

    private Date valvePromiseDate;

    private Date valveSumbitDate;

    private Date valvePlanDate;

    private String valveProductNorm;

    private Integer valveBodyArrive;

    private Integer valveBodyProcess;

    private Integer valveFinalAssembly;

    private Integer valvePerformanceTest;

    private Integer valveOilPaint;

    private Integer valveSend;

    private Integer valveBodyWeld;

    private Integer nonDesCheck;

    private Integer strengthExperiment;

    private Integer finishingWarehousing;

    private Double completeRate;

    private Integer typeId;

    private Date whichDay;

    private String valveProductName;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getValvePromiseDate() {
        return valvePromiseDate;
    }

    public void setValvePromiseDate(Date valvePromiseDate) {
        this.valvePromiseDate = valvePromiseDate;
    }

    public Date getValveSumbitDate() {
        return valveSumbitDate;
    }

    public void setValveSumbitDate(Date valveSumbitDate) {
        this.valveSumbitDate = valveSumbitDate;
    }

    public Date getValvePlanDate() {
        return valvePlanDate;
    }

    public void setValvePlanDate(Date valvePlanDate) {
        this.valvePlanDate = valvePlanDate;
    }

    public String getValveProductNorm() {
        return valveProductNorm;
    }

    public void setValveProductNorm(String valveProductNorm) {
        this.valveProductNorm = valveProductNorm == null ? null : valveProductNorm.trim();
    }

    public Integer getValveBodyArrive() {
        return valveBodyArrive;
    }

    public void setValveBodyArrive(Integer valveBodyArrive) {
        this.valveBodyArrive = valveBodyArrive;
    }

    public Integer getValveBodyProcess() {
        return valveBodyProcess;
    }

    public void setValveBodyProcess(Integer valveBodyProcess) {
        this.valveBodyProcess = valveBodyProcess;
    }

    public Integer getValveFinalAssembly() {
        return valveFinalAssembly;
    }

    public void setValveFinalAssembly(Integer valveFinalAssembly) {
        this.valveFinalAssembly = valveFinalAssembly;
    }

    public Integer getValvePerformanceTest() {
        return valvePerformanceTest;
    }

    public void setValvePerformanceTest(Integer valvePerformanceTest) {
        this.valvePerformanceTest = valvePerformanceTest;
    }

    public Integer getValveOilPaint() {
        return valveOilPaint;
    }

    public void setValveOilPaint(Integer valveOilPaint) {
        this.valveOilPaint = valveOilPaint;
    }

    public Integer getValveSend() {
        return valveSend;
    }

    public void setValveSend(Integer valveSend) {
        this.valveSend = valveSend;
    }

    public Integer getValveBodyWeld() {
        return valveBodyWeld;
    }

    public void setValveBodyWeld(Integer valveBodyWeld) {
        this.valveBodyWeld = valveBodyWeld;
    }

    public Integer getNonDesCheck() {
        return nonDesCheck;
    }

    public void setNonDesCheck(Integer nonDesCheck) {
        this.nonDesCheck = nonDesCheck;
    }

    public Integer getStrengthExperiment() {
        return strengthExperiment;
    }

    public void setStrengthExperiment(Integer strengthExperiment) {
        this.strengthExperiment = strengthExperiment;
    }

    public Integer getFinishingWarehousing() {
        return finishingWarehousing;
    }

    public void setFinishingWarehousing(Integer finishingWarehousing) {
        this.finishingWarehousing = finishingWarehousing;
    }

    public Double getCompleteRate() {
        return completeRate;
    }

    public void setCompleteRate(Double completeRate) {
        this.completeRate = completeRate;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Date getWhichDay() {
        return whichDay;
    }

    public void setWhichDay(Date whichDay) {
        this.whichDay = whichDay;
    }

    public String getValveProductName() {
        return valveProductName;
    }

    public void setValveProductName(String valveProductName) {
        this.valveProductName = valveProductName == null ? null : valveProductName.trim();
    }
}