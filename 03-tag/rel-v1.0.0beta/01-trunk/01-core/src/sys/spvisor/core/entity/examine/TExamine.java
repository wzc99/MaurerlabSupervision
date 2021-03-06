package sys.spvisor.core.entity.examine;

import java.sql.Timestamp;

public class TExamine {
	private Integer id;

	private Integer submitId;
	
	private String submitName;

	private Timestamp submitTime;

	private Integer status;

	private Integer exaType;

	private String exaTitle;

	private String exaContent;

	private Integer exaFileFlag;

	private String exaFilePath;

	private Integer exaLinkId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSubmitId() {
		return submitId;
	}

	public void setSubmitId(Integer submitId) {
		this.submitId = submitId;
	}
	
	

	public String getSubmitName() {
		return submitName;
	}

	public void setSubmitName(String submitName) {
		this.submitName = submitName;
	}

	public Timestamp getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getExaType() {
		return exaType;
	}

	public void setExaType(Integer exaType) {
		this.exaType = exaType;
	}

	public String getExaTitle() {
		return exaTitle;
	}

	public void setExaTitle(String exaTitle) {
		this.exaTitle = exaTitle == null ? null : exaTitle.trim();
	}

	public String getExaContent() {
		return exaContent;
	}

	public void setExaContent(String exaContent) {
		this.exaContent = exaContent == null ? null : exaContent.trim();
	}

	public Integer getExaFileFlag() {
		return exaFileFlag;
	}

	public void setExaFileFlag(Integer exaFileFlag) {
		this.exaFileFlag = exaFileFlag;
	}

	public String getExaFilePath() {
		return exaFilePath;
	}

	public void setExaFilePath(String exaFilePath) {
		this.exaFilePath = exaFilePath == null ? null : exaFilePath.trim();
	}

	public Integer getExaLinkId() {
		return exaLinkId;
	}

	public void setExaLinkId(Integer exaLinkId) {
		this.exaLinkId = exaLinkId;
	}
}