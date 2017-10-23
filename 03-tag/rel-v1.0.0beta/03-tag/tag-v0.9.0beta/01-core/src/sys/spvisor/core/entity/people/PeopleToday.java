package sys.spvisor.core.entity.people;

import java.util.Date;

public class PeopleToday {

	
    private Integer userId;

    private String userLoginName;

    private String userName;

    private String userSex;

    private Integer userWorkStatusId;
    
    private String userWorkStatus;

    private String userLocationDes;

    private Date userLatestWorkTime;
   
    private Integer projectPeopleId;

    private Integer ppProId;
    
    private String projectName;

    private String proUnit;

    private Integer ppUserId;

    private String ppStatus;

    private Integer ppProRoleId;
    
    private String ppProRole;
    
    private String role;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

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

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Integer getUserWorkStatusId() {
		return userWorkStatusId;
	}

	public void setUserWorkStatusId(Integer userWorkStatusId) {
		this.userWorkStatusId = userWorkStatusId;
	}

	public String getUserWorkStatus() {
		return userWorkStatus;
	}

	public void setUserWorkStatus(String userWorkStatus) {
		this.userWorkStatus = userWorkStatus;
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

	public String getUserLocationDes() {
		return userLocationDes;
	}

	public void setUserLocationDes(String userLocationDes) {
		this.userLocationDes = userLocationDes;
	}

	public Date getUserLatestWorkTime() {
		return userLatestWorkTime;
	}

	public void setUserLatestWorkTime(Date userLatestWorkTime) {
		this.userLatestWorkTime = userLatestWorkTime;
	}

	public Integer getProjectPeopleId() {
		return projectPeopleId;
	}

	public void setProjectPeopleId(Integer projectPeopleId) {
		this.projectPeopleId = projectPeopleId;
	}

	public Integer getPpProId() {
		return ppProId;
	}

	public void setPpProId(Integer ppProId) {
		this.ppProId = ppProId;
	}

	public Integer getPpUserId() {
		return ppUserId;
	}

	public void setPpUserId(Integer ppUserId) {
		this.ppUserId = ppUserId;
	}

	public String getPpStatus() {
		return ppStatus;
	}

	public void setPpStatus(String ppStatus) {
		this.ppStatus = ppStatus;
	}

	public Integer getPpProRoleId() {
		return ppProRoleId;
	}

	public void setPpProRoleId(Integer ppProRoleId) {
		this.ppProRoleId = ppProRoleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPpProRole() {
		return ppProRole;
	}

	public void setPpProRole(String ppProRole) {
		this.ppProRole = ppProRole;
	}
	

}
