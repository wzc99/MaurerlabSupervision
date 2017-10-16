package sys.spvisor.core.entity.project;

import java.sql.Date;

public class TProjectUnionBigProject {
	 private Integer bigProjectId;

	    private String bigProjectName;

	    private Date bigProjectCreateTime;

	    private String bigProjectCreatePeople;

	    private Integer bigProjectCreatePeopleId;
	    
	    private TProject tProject;

	    public TProject gettProject() {
			return tProject;
		}

		public void settProject(TProject tProject) {
			this.tProject = tProject;
		}

		public Integer getBigProjectId() {
	        return bigProjectId;
	    }

	    public void setBigProjectId(Integer bigProjectId) {
	        this.bigProjectId = bigProjectId;
	    }

	    public String getBigProjectName() {
	        return bigProjectName;
	    }

	    public void setBigProjectName(String bigProjectName) {
	        this.bigProjectName = bigProjectName == null ? null : bigProjectName.trim();
	    }

	    public Date getBigProjectCreateTime() {
	        return bigProjectCreateTime;
	    }

	    public void setBigProjectCreateTime(Date bigProjectCreateTime) {
	        this.bigProjectCreateTime = bigProjectCreateTime;
	    }

	    public String getBigProjectCreatePeople() {
	        return bigProjectCreatePeople;
	    }

	    public void setBigProjectCreatePeople(String bigProjectCreatePeople) {
	        this.bigProjectCreatePeople = bigProjectCreatePeople == null ? null : bigProjectCreatePeople.trim();
	    }

	    public Integer getBigProjectCreatePeopleId() {
	        return bigProjectCreatePeopleId;
	    }

	    public void setBigProjectCreatePeopleId(Integer bigProjectCreatePeopleId) {
	        this.bigProjectCreatePeopleId = bigProjectCreatePeopleId;
	    }
}
