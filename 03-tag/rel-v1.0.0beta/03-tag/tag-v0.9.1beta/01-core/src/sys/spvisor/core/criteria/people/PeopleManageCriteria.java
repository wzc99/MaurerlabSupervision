package sys.spvisor.core.criteria.people;

import sys.spvisor.core.criteria.AbstractCriteria;

public class PeopleManageCriteria extends AbstractCriteria{
	
	String userLoginName;
	
	String userName;
	
	Integer userWorkStatusId;
	
	Integer userRoleFlag;
	
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
	public Integer getUserRoleFlag() {
		return userRoleFlag;
	}
	public void setUserRoleFlag(Integer userRoleFlag) {
		this.userRoleFlag = userRoleFlag;
	}

}
