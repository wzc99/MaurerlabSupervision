package sys.spvisor.core.criteria.ana;

import sys.spvisor.core.criteria.AbstractCriteria;


public class UserCriteria extends AbstractCriteria{
//	private Long userId;
	private String userName;
	private String userLoginName;
//	private String email;
//	private String dkSerialNumber;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLoginName() {
		return userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	
}
