package sys.spvisor.core.result.process;

import java.util.List;

public class Table22 {
	
	String productName;//产品名称
	
	String productNorm;//产品规格
	
	double orderTotal;//订货数量
	
	String unit;//单位
	
	List<Table222> procedureValue;

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

	public List<Table222> getProcedureValue() {
		return procedureValue;
	}

	public void setProcedureValue(List<Table222> procedureValue) {
		this.procedureValue = procedureValue;
	}
	

}
