package sys.spvisor.core.entity.project;

import java.sql.Date;

public class TProject {
    private Integer proId;

    private String projectName;

    private String proUnit;

    private Date proEntrustTime;

    private String proNum;

    private String proConpeople;

    private String proConntel;

    private String proGoods;

    private String proType;

    private String proFactory;

    private String proFactoryconnpeople;

    private String proFactoryconntel;

    private String proBasis;

    private String proReportway;

    private String proReportfilename;

    private Date proEndtime;

    private String proProducttype;

    private String proReporttime;

    private Integer proCreateUserId;

    private Date proCreateTime;

    private Date proLastUpdateTime;

    private Integer proBigProjectId;

    private String proReportRate;

    private String proStatus;

    private Date proStartTime;

    private String proBigProjectName;

    private String proGoodsnum;

    private String proSmallProductType;
    
    private double sumMoney;

	public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProUnit() {
        return proUnit;
    }

    public void setProUnit(String proUnit) {
        this.proUnit = proUnit == null ? null : proUnit.trim();
    }

    public Date getProEntrustTime() {
        return proEntrustTime;
    }

    public void setProEntrustTime(Date proEntrustTime) {
        this.proEntrustTime = proEntrustTime;
    }

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum == null ? null : proNum.trim();
    }

    public String getProConpeople() {
        return proConpeople;
    }

    public void setProConpeople(String proConpeople) {
        this.proConpeople = proConpeople == null ? null : proConpeople.trim();
    }

    public String getProConntel() {
        return proConntel;
    }

    public void setProConntel(String proConntel) {
        this.proConntel = proConntel == null ? null : proConntel.trim();
    }

    public String getProGoods() {
        return proGoods;
    }

    public void setProGoods(String proGoods) {
        this.proGoods = proGoods == null ? null : proGoods.trim();
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType == null ? null : proType.trim();
    }

    public String getProFactory() {
        return proFactory;
    }

    public void setProFactory(String proFactory) {
        this.proFactory = proFactory == null ? null : proFactory.trim();
    }

    public String getProFactoryconnpeople() {
        return proFactoryconnpeople;
    }

    public void setProFactoryconnpeople(String proFactoryconnpeople) {
        this.proFactoryconnpeople = proFactoryconnpeople == null ? null : proFactoryconnpeople.trim();
    }

    public String getProFactoryconntel() {
        return proFactoryconntel;
    }

    public void setProFactoryconntel(String proFactoryconntel) {
        this.proFactoryconntel = proFactoryconntel == null ? null : proFactoryconntel.trim();
    }

    public String getProBasis() {
        return proBasis;
    }

    public void setProBasis(String proBasis) {
        this.proBasis = proBasis == null ? null : proBasis.trim();
    }

    public String getProReportway() {
        return proReportway;
    }

    public void setProReportway(String proReportway) {
        this.proReportway = proReportway == null ? null : proReportway.trim();
    }

    public String getProReportfilename() {
        return proReportfilename;
    }

    public void setProReportfilename(String proReportfilename) {
        this.proReportfilename = proReportfilename == null ? null : proReportfilename.trim();
    }

    public Date getProEndtime() {
        return proEndtime;
    }

    public void setProEndtime(Date proEndtime) {
        this.proEndtime = proEndtime;
    }

    public String getProProducttype() {
        return proProducttype;
    }

    public void setProProducttype(String proProducttype) {
        this.proProducttype = proProducttype == null ? null : proProducttype.trim();
    }

    public String getProReporttime() {
        return proReporttime;
    }

    public void setProReporttime(String proReporttime) {
        this.proReporttime = proReporttime == null ? null : proReporttime.trim();
    }

    public Integer getProCreateUserId() {
        return proCreateUserId;
    }

    public void setProCreateUserId(Integer proCreateUserId) {
        this.proCreateUserId = proCreateUserId;
    }

    public Date getProCreateTime() {
        return proCreateTime;
    }

    public void setProCreateTime(Date proCreateTime) {
        this.proCreateTime = proCreateTime;
    }

    public Date getProLastUpdateTime() {
        return proLastUpdateTime;
    }

    public void setProLastUpdateTime(Date proLastUpdateTime) {
        this.proLastUpdateTime = proLastUpdateTime;
    }

    public Integer getProBigProjectId() {
        return proBigProjectId;
    }

    public void setProBigProjectId(Integer proBigProjectId) {
        this.proBigProjectId = proBigProjectId;
    }

    public String getProReportRate() {
        return proReportRate;
    }

    public void setProReportRate(String proReportRate) {
        this.proReportRate = proReportRate == null ? null : proReportRate.trim();
    }

    public String getProStatus() {
        return proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus == null ? null : proStatus.trim();
    }

    public Date getProStartTime() {
        return proStartTime;
    }

    public void setProStartTime(Date proStartTime) {
        this.proStartTime = proStartTime;
    }

    public String getProBigProjectName() {
        return proBigProjectName;
    }

    public void setProBigProjectName(String proBigProjectName) {
        this.proBigProjectName = proBigProjectName == null ? null : proBigProjectName.trim();
    }

    public String getProGoodsnum() {
        return proGoodsnum;
    }

    public void setProGoodsnum(String proGoodsnum) {
        this.proGoodsnum = proGoodsnum == null ? null : proGoodsnum.trim();
    }

    public String getProSmallProductType() {
        return proSmallProductType;
    }

    public void setProSmallProductType(String proSmallProductType) {
        this.proSmallProductType = proSmallProductType == null ? null : proSmallProductType.trim();
    }

	public double getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}
    
}