package sys.spvisor.core.entity.ana;

import java.util.Date;

public class TUserCase {
    private Long userId;

    private String userLoginName;

    private String userName;

    private String userLoginPassword;

    private String dkeySerialNo;

    private String status;

    private Integer pwdErrCnt;

    private Date expirationDate;

    private String mobile;

    private String phone;

    private String email;

    private String memo;

    private Date createDatetime;

    private Date updateDatetime;

    private Integer caseOperator;

    private String caseStatus;

    private String caseOpenStatus;

    private Date caseTime;

    private String caseJudgment;

    private Long realId;

    private Integer lastCompanyCaseId;

    private Integer caseOwnerId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public String getDkeySerialNo() {
        return dkeySerialNo;
    }

    public void setDkeySerialNo(String dkeySerialNo) {
        this.dkeySerialNo = dkeySerialNo == null ? null : dkeySerialNo.trim();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public Integer getCaseOperator() {
        return caseOperator;
    }

    public void setCaseOperator(Integer caseOperator) {
        this.caseOperator = caseOperator;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus == null ? null : caseStatus.trim();
    }

    public String getCaseOpenStatus() {
        return caseOpenStatus;
    }

    public void setCaseOpenStatus(String caseOpenStatus) {
        this.caseOpenStatus = caseOpenStatus == null ? null : caseOpenStatus.trim();
    }

    public Date getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(Date caseTime) {
        this.caseTime = caseTime;
    }

    public String getCaseJudgment() {
        return caseJudgment;
    }

    public void setCaseJudgment(String caseJudgment) {
        this.caseJudgment = caseJudgment == null ? null : caseJudgment.trim();
    }

    public Long getRealId() {
        return realId;
    }

    public void setRealId(Long realId) {
        this.realId = realId;
    }

    public Integer getLastCompanyCaseId() {
        return lastCompanyCaseId;
    }

    public void setLastCompanyCaseId(Integer lastCompanyCaseId) {
        this.lastCompanyCaseId = lastCompanyCaseId;
    }

    public Integer getCaseOwnerId() {
        return caseOwnerId;
    }

    public void setCaseOwnerId(Integer caseOwnerId) {
        this.caseOwnerId = caseOwnerId;
    }
}