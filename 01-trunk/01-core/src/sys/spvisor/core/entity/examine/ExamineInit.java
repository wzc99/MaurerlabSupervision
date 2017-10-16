package sys.spvisor.core.entity.examine;

import java.sql.Date;

public class ExamineInit {

	private int submitId;

	private int exaType;

	private String exaTitle;

	private String exaContent;

	private int exaFileFlag;

	private String exaFilePath;

	private String nodeName;

	private int proId;

	private String note;

	private Integer exaLinkId;

	// 标志是否在项目里面
	int isProType;

	public int getSubmitId() {
		return submitId;
	}

	public void setSubmitId(int submitId) {
		this.submitId = submitId;
	}

	public int getExaType() {
		return exaType;
	}

	public void setExaType(int exaType) {
		this.exaType = exaType;
	}

	public String getExaContent() {
		return exaContent;
	}

	public void setExaContent(String exaContent) {
		this.exaContent = exaContent;
	}

	public int getExaFileFlag() {
		return exaFileFlag;
	}

	public void setExaFileFlag(int exaFileFlag) {
		this.exaFileFlag = exaFileFlag;
	}

	public String getExaFilePath() {
		return exaFilePath;
	}

	public void setExaFilePath(String exaFilePath) {
		this.exaFilePath = exaFilePath;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getExaTitle() {
		return exaTitle;
	}

	public void setExaTitle(String exaTitle) {
		this.exaTitle = exaTitle;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getIsProType() {
		return isProType;
	}

	public void setIsProType(int isProType) {
		this.isProType = isProType;
	}

	public Integer getExaLinkId() {
		return exaLinkId;
	}

	public void setExaLinkId(Integer exaLinkId) {
		this.exaLinkId = exaLinkId;
	}

}
