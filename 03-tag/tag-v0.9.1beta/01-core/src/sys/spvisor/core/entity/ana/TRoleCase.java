package sys.spvisor.core.entity.ana;

import java.util.Date;

public class TRoleCase {
    private Long roleId;

    private String roleName;

    private String roleDesc;

    private String status;

    private String moduleCode;

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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
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