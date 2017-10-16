package sys.spvisor.core.criteria.file;

import sys.spvisor.core.criteria.AbstractCriteria;

public class FileCriteria extends AbstractCriteria{
	

    private String fileName;

    private String fileContentIntroduction;
    
    private String releaseOrganization;
    
    private Integer type;

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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
    
    

}
