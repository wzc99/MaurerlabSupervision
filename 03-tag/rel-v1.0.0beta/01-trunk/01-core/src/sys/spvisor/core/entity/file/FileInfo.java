package sys.spvisor.core.entity.file;

import java.util.Date;

public class FileInfo {
	
	private Integer fileId;

    private String fileName;

    private String fileContentIntroduction;

    private String releaseOrganization;

    private Date releaseDate;

    private Date validDate;

    private Integer postUserId;
    
    private String userName;
    
    private Date postDate;

    private String postPath;

    private Integer type;

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileContentIntroduction() {
		return fileContentIntroduction;
	}

	public void setFileContentIntroduction(String fileContentIntroduction) {
		this.fileContentIntroduction = fileContentIntroduction;
	}

	public String getReleaseOrganization() {
		return releaseOrganization;
	}

	public void setReleaseOrganization(String releaseOrganization) {
		this.releaseOrganization = releaseOrganization;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public Integer getPostUserId() {
		return postUserId;
	}

	public void setPostUserId(Integer postUserId) {
		this.postUserId = postUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String UserName) {
		userName = UserName;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getPostPath() {
		return postPath;
	}

	public void setPostPath(String postPath) {
		this.postPath = postPath;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
    
    


}
