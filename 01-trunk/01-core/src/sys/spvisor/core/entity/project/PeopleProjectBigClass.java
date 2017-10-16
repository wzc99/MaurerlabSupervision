package sys.spvisor.core.entity.project;

import sys.spvisor.core.entity.ana.TUser;

public class PeopleProjectBigClass {
	
	private TProject project;
	
	private TUser user;
	
	public TUser getUser() {
		return user;
	}

	public void setUser(TUser user) {
		this.user = user;
	}

	private TProjectPeople projectPeople;

	public TProject getProject() {
		return project;
	}

	public void setProject(TProject project) {
		this.project = project;
	}

	public TProjectPeople getProjectPeople() {
		return projectPeople;
	}

	public void setProjectPeople(TProjectPeople projectPeople) {
		this.projectPeople = projectPeople;
	}
	


	

}
