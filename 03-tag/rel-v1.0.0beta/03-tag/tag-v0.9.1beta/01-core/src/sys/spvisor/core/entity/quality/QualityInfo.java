package sys.spvisor.core.entity.quality;

public class QualityInfo {
	private String date;

	private String people;
	
	private String qId;
	
	private String proId; 
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}
	
	public String getQId() {
		return qId;
	}

	public void setQId(String QId) {
		this.qId = QId;
	}
	
	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}
}
