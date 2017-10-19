package sys.spvisor.core.result.process;

import java.sql.Date;

public class Table1 {
	private String productName;//产品名称
	
	private String productNorm;//产品规格
	
	private double orderTotal;//订货数量
	
	private String unit;//单位
	
	private double completeRateToday;//本日完成比例
	
	private double completeRateTotal;//累计完成比例
	
	private Date promiseDate;//约定交货日期
	
	private Date planDate;//计划交货日期

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

	public double getCompleteRateToday() {
		return completeRateToday;
	}

	public void setCompleteRateToday(double completeRateToday) {
		this.completeRateToday = completeRateToday;
	}

	public double getCompleteRateTotal() {
		return completeRateTotal;
	}

	public void setCompleteRateTotal(double completeRateTotal) {
		this.completeRateTotal = completeRateTotal;
	}

	public Date getPromiseDate() {
		return promiseDate;
	}

	public void setPromiseDate(Date promiseDate) {
		this.promiseDate = promiseDate;
	}

	public Date getPlanDate() {
		return planDate;
	}

	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	
	

}
