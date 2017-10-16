package sys.spvisor.core.result.process;

import java.util.List;

public class Table2 {
	
	List<String> procedureName;//工序名称
	
	List<Table22> rows;//行

	public List<String> getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(List<String> procedureName) {
		this.procedureName = procedureName;
	}

	public List<Table22> getRows() {
		return rows;
	}

	public void setRows(List<Table22> rows) {
		this.rows = rows;
	}
	
	

}
