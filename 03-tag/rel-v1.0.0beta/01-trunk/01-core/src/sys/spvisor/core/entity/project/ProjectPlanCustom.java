package sys.spvisor.core.entity.project;

import java.util.List;

import sys.spvisor.core.entity.ana.TUser;

public class ProjectPlanCustom {
	String fileNameTotal;
	List<TUser> peoples;
	public List<TUser> getPeoples() {
		return peoples;
	}
	public void setPeoples(List<TUser> peoples) {
		this.peoples = peoples;
	}

	public String getFileNameTotal() {
		return fileNameTotal;
	}
	public void setFileNameTotal(String fileNameTotal) {
		this.fileNameTotal = fileNameTotal;
	}
	
}
