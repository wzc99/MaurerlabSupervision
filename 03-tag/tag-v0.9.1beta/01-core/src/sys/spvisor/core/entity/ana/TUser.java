package sys.spvisor.core.entity.ana;

import java.util.Date;

public class TUser {
    private Integer userId;

    private String userLoginName;

    private String userName;

    private String userLoginPassword;

    private String status;

    private Integer pwdErrCnt;

    private Date expirationDate;

    private String mobile;

    private String email;

    private String memo;

    private Date createDatetime;

    private Date updateDatetime;

    private String checkStatus;

    private String userUnit;

    private String userSex;

    private String userIdentityCard;

    private Integer userWorkStatusId;

    private String userLocationDes;

    private Date userLatestWorkTime;

    private Date userBirthdate;

    private String userEducation;

    private String userMajor;

    private String userProfessionalQualification;

    private String userProfessionalTitle;

    private String userCareerQualification;

    private Integer userRoleFlag;

    private String userSignature;

    private byte[] userPic;
    
	//新增 岗位状态记录
	private Integer toStatusId;

    private Integer statusIdStatus;
    
    private Integer statusLinkId;
    
    
	
	public Integer getStatusLinkId() {
		return statusLinkId;
	}

	public void setStatusLinkId(Integer statusLinkId) {
		this.statusLinkId = statusLinkId;
	}

	public Integer getToStatusId() {
		return toStatusId;
	}

	public void setToStatusId(Integer toStatusId) {
		this.toStatusId = toStatusId;
	}

	public Integer getStatusIdStatus() {
		return statusIdStatus;
	}

	public void setStatusIdStatus(Integer statusIdStatus) {
		this.statusIdStatus = statusIdStatus;
	}

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
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword == null ? null : userLoginPassword.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getPwdErrCnt() {
        return pwdErrCnt;
    }

    public void setPwdErrCnt(Integer pwdErrCnt) {
        this.pwdErrCnt = pwdErrCnt;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getUserUnit() {
        return userUnit;
    }

    public void setUserUnit(String userUnit) {
        this.userUnit = userUnit == null ? null : userUnit.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserIdentityCard() {
        return userIdentityCard;
    }

    public void setUserIdentityCard(String userIdentityCard) {
        this.userIdentityCard = userIdentityCard == null ? null : userIdentityCard.trim();
    }

    public Integer getUserWorkStatusId() {
        return userWorkStatusId;
    }

    public void setUserWorkStatusId(Integer userWorkStatusId) {
        this.userWorkStatusId = userWorkStatusId;
    }

    public String getUserLocationDes() {
        return userLocationDes;
    }

    public void setUserLocationDes(String userLocationDes) {
        this.userLocationDes = userLocationDes == null ? null : userLocationDes.trim();
    }

    public Date getUserLatestWorkTime() {
        return userLatestWorkTime;
    }

    public void setUserLatestWorkTime(Date userLatestWorkTime) {
        this.userLatestWorkTime = userLatestWorkTime;
    }

    public Date getUserBirthdate() {
        return userBirthdate;
    }

    public void setUserBirthdate(Date userBirthdate) {
        this.userBirthdate = userBirthdate;
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation == null ? null : userEducation.trim();
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor == null ? null : userMajor.trim();
    }

    public String getUserProfessionalQualification() {
        return userProfessionalQualification;
    }

    public void setUserProfessionalQualification(String userProfessionalQualification) {
        this.userProfessionalQualification = userProfessionalQualification == null ? null : userProfessionalQualification.trim();
    }

    public String getUserProfessionalTitle() {
        return userProfessionalTitle;
    }

    public void setUserProfessionalTitle(String userProfessionalTitle) {
        this.userProfessionalTitle = userProfessionalTitle == null ? null : userProfessionalTitle.trim();
    }

    public String getUserCareerQualification() {
        return userCareerQualification;
    }

    public void setUserCareerQualification(String userCareerQualification) {
        this.userCareerQualification = userCareerQualification == null ? null : userCareerQualification.trim();
    }

    public Integer getUserRoleFlag() {
        return userRoleFlag;
    }

    public void setUserRoleFlag(Integer userRoleFlag) {
        this.userRoleFlag = userRoleFlag;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public byte[] getUserPic() {
        return userPic;
    }

    public void setUserPic(byte[] userPic) {
        this.userPic = userPic;
    }



	
    
    
}