package sys.spvisor.core.entity.quality;

import java.util.List;
import java.util.Map;

public class QualityData {
	private String name;

	private Map<String,String> unchange;
	
	private List<Map<String,String>> change;
	
	private List<Map<String,String>> change2;
	
	private List<Map<String,String>> change3;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
