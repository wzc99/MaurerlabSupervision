package sys.spvisor.core.criteria.project;

import java.sql.Date;

import sys.spvisor.core.criteria.AbstractCriteria;

//有注释的可当做查询条件，没注释的不能当查询条件，只能当查询结果
public class ProcessCriteria extends AbstractCriteria {
	
	private Integer id;
	
	private Integer proId;//项目id
	
	private Integer bigTypeId;
	
	private Integer typeId;
	
	private String userName;//填写人
	
	private Date whichDay;//日期
	
	private Date planDate;//计划完成日期
	
	private Date promiseDate;
	
	private Double completeRateToday;
	
	private String productName;//产品名称
	
	private String productName2;
	
	private String productNorm;
	
	private String productNum;

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

	public Integer getBigTypeId() {
		return bigTypeId;
	}

	public void setBigTypeId(Integer bigTypeId) {
		this.bigTypeId = bigTypeId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getWhichDay() {
		return whichDay;
	}

	public void setWhichDay(Date whichDay) {
		this.whichDay = whichDay;
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

	public Double getCompleteRateToday() {
		return completeRateToday;
	}

	public void setCompleteRateToday(Double completeRateToday) {
		this.completeRateToday = completeRateToday;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public String getProductName2() {
		return productName2;
	}

	public void setProductName2(String productName2) {
		this.productName2 = productName2;
	}

	public String getProductNorm() {
		return productNorm;
	}

	public void setProductNorm(String productNorm) {
		this.productNorm = productNorm;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	
	
	

}
