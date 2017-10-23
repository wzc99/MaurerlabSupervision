package sys.spvisor.core.result.process;
/**
 * 用于保存单个节点信息
 * @author leixiaojing
 *
 */
public class ScheduleNodeModel {
	/**
	 * 节点中文名字
	 */
	private String nodeName;
	
	/**
	 * html表格name名
	 */
	private String name[];
	/**
	 * value值
	 */
	private String value[];
	
	/**
	 * 单位
	 */
	private String unit[];


	public ScheduleNodeModel(String nodeName, String[] name, String[] unit) {
		super();
		this.nodeName = nodeName;
		this.name = name;
		this.unit = unit;
	}
	

	public ScheduleNodeModel(ScheduleNodeModel o) {
		super();
		this.nodeName = o.getNodeName();
		this.name = o.getName();
		this.unit = o.getUnit();
	}


	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String[] getValue() {
		return value;
	}

	public void setValue(String[] value) {
		this.value = value;
	}

	public String[] getUnit() {
		return unit;
	}

	public void setUnit(String[] unit) {
		this.unit = unit;
	}

	

}
