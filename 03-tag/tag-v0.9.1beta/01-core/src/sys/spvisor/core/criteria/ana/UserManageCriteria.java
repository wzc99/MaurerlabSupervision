package sys.spvisor.core.criteria.ana;

import sys.spvisor.core.criteria.AbstractCriteria;

public class UserManageCriteria  extends AbstractCriteria{
	
	 private String userLoginName;

	 private String userName;

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
	 
	 

}
