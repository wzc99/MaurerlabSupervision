package sys.spvisor.core.criteria.people;

import sys.spvisor.core.criteria.AbstractCriteria;

public class PeopleCriteria extends AbstractCriteria{
	
	String userLoginName;
	
	String userName;
	
	Integer userWorkStatusId;
	
	String projectName;
	
	String proUnit;

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserWorkStatusId() {
		return userWorkStatusId;
	}

	public void setUserWorkStatusId(Integer userWorkStatusId) {
		this.userWorkStatusId = userWorkStatusId;
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
	
	
}
