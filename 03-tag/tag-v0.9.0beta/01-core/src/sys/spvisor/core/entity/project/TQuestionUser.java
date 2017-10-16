package sys.spvisor.core.entity.project;

import java.sql.Date;

public class TQuestionUser {
	private Integer qusId;

    private Integer proId;

    private Date findTime;

    private String quesDescription;

    private String quesNoSuitBasis;

    private Date updateTime;

    private String updateProcessDescription;

    private String userName;

    private Date postTime;

	public Integer getQusId() {
		return qusId;
	}

	public void setQusId(Integer qusId) {
		this.qusId = qusId;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Date getFindTime() {
		return findTime;
	}

	public void setFindTime(Date findTime) {
		this.findTime = findTime;
	}

	public String getQuesDescription() {
		return quesDescription;
	}

	public void setQuesDescription(String quesDescription) {
		this.quesDescription = quesDescription;
	}

	public String getQuesNoSuitBasis() {
		return quesNoSuitBasis;
	}

	public void setQuesNoSuitBasis(String quesNoSuitBasis) {
		this.quesNoSuitBasis = quesNoSuitBasis;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateProcessDescription() {
		return updateProcessDescription;
	}

	public void setUpdateProcessDescription(String updateProcessDescription) {
		this.updateProcessDescription = updateProcessDescription;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
    
}
