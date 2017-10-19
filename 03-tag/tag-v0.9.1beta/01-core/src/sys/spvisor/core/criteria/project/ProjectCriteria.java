package sys.spvisor.core.criteria.project;

import sys.spvisor.core.criteria.AbstractCriteria;

import java.sql.Date;

public class ProjectCriteria extends AbstractCriteria{
	
	String proBigProjectName;
	
	String proNum;
	
	Integer userId;
	
	String projectName;
	
	String proUnit;
	
	Date proStartTime;
	
	String proGoods;
	
	String proStatus;
	
	public String getProBigProjectName() {
		return proBigProjectName;
	}
	
	public void setProBigProjectName(String proBigProjectName) {
		this.proBigProjectName = proBigProjectName;
	}
	
	public String getProNum() {
		return proNum;
	}
	
	public void setProNum(String proNum) {
		this.proNum = proNum;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getProUnit() {
		return proUnit;
	}
	
	public void setProUnit(String proUnit) {
		this.proUnit = proUnit;
	}
	
	public Date getProStartTime() {
		return proStartTime;
	}
	
	public void setProStartTime(Date proStartTime) {
		this.proStartTime = proStartTime;
	}
	
	public String getProGoods() {
		return proGoods;
	}
	
	public void setProGoods(String proGoods) {
		this.proGoods = proGoods;
	}
	
	public String getProStatus() {
		return proStatus;
	}
	
	public void setProStatus(String proStatus) {
		this.proStatus = proStatus;
	}

	
}
