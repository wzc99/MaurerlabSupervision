package sys.spvisor.core.entity.attendance;

import java.sql.Timestamp;

public class TAttendance {
    private Integer id;

    private Integer userId;

    private Integer proId;

    private Integer statusId;

    private Timestamp startTime;

    private String note1;

    private Integer toStatusId;

    private Integer statusIdStatus;
    
    private String statusName;
    
    private String targetStatusName;
    
    

    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getTargetStatusName() {
		return targetStatusName;
	}

	public void setTargetStatusName(String targetStatusName) {
		this.targetStatusName = targetStatusName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
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
}