package sys.spvisor.core.result.process;

import java.util.List;

public class Table3 {
	
	String productName;//产品名称
	
	String productNorm;//产品规格
	
	String daoliaoJuan;//到料卷
	
	String daoliaoDun;//到料吨
	
    double orderTotal;//订货数量
	
	String unit;//单位
	
	List<Table33> procedure;//关键工序

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNorm() {
		return productNorm;
	}

	public void setProductNorm(String productNorm) {
		this.productNorm = productNorm;
	}

	public String getDaoliaoJuan() {
		return daoliaoJuan;
	}

	public void setDaoliaoJuan(String daoliaoJuan) {
		this.daoliaoJuan = daoliaoJuan;
	}

	public String getDaoliaoDun() {
		return daoliaoDun;
	}

	public void setDaoliaoDun(String daoliaoDun) {
		this.daoliaoDun = daoliaoDun;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<Table33> getProcedure() {
		return procedure;
	}

	public void setProcedure(List<Table33> procedure) {
		this.procedure = procedure;
	}
	
	

}
