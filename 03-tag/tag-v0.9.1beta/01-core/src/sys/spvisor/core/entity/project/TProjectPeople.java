package sys.spvisor.core.entity.project;

import java.sql.Date;

public class TProjectPeople {
    private Integer projectPeopleId;

    private Integer ppProId;

    private Integer ppUserId;

    private String ppStatus;

    private Date ppInProTime;

    private Date ppOutProTime;

    private Integer ppProRoleId;

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
        this.ppStatus = ppStatus == null ? null : ppStatus.trim();
    }

    public Date getPpInProTime() {
        return ppInProTime;
    }

    public void setPpInProTime(Date ppInProTime) {
        this.ppInProTime = ppInProTime;
    }

    public Date getPpOutProTime() {
        return ppOutProTime;
    }

    public void setPpOutProTime(Date ppOutProTime) {
        this.ppOutProTime = ppOutProTime;
    }

    public Integer getPpProRoleId() {
        return ppProRoleId;
    }

    public void setPpProRoleId(Integer ppProRoleId) {
        this.ppProRoleId = ppProRoleId;
    }
}