package sys.spvisor.core.entity.project;

public class TProjectCustom {
	
	String fileNameTotal;
	
	String bigProName;
	
	TProject tProject;
	
	public TProject gettProject() {
		return tProject;
	}

	public void settProject(TProject tProject) {
		this.tProject = tProject;
	}

	public String getFileNameTotal() {
		return fileNameTotal;
	}

	public void setFileNameTotal(String fileNameTotal) {
		this.fileNameTotal = fileNameTotal;
	}

	public String getBigProName() {
		return bigProName;
	}

	public void setBigProName(String bigProName) {
		this.bigProName = bigProName;
	}

}
