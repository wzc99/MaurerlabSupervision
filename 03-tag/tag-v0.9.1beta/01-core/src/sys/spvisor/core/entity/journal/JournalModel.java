package sys.spvisor.core.entity.journal;

import java.util.Date;
import java.util.List;

public class JournalModel {

	private int proId;

	private List<LookDetail> list;

	private String hseContent;

	private String picDescription;

	private Date dailyDate;

	private int weekDate;

	private int yearDate;

	private String nextWeekPlan;

	private String[] picPath;

	private String[] picDes;

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String[] getPicDes() {
		return picDes;
	}

	public void setPicDes(String[] picDes) {
		this.picDes = picDes;
	}

	public String[] getPicPath() {
		return picPath;
	}

	public void setPicPath(String[] picPath) {
		this.picPath = picPath;
	}

	public String getHseContent() {
		return hseContent;
	}

	public void setHseContent(String hseContent) {
		this.hseContent = hseContent;
	}

	public String getPicDescription() {
		return picDescription;
	}

	public void setPicDescription(String picDescription) {
		this.picDescription = picDescription;
	}

	public Date getDailyDate() {
		return dailyDate;
	}

	public void setDailyDate(Date dailyDate) {
		this.dailyDate = dailyDate;
	}

	public int getWeekDate() {
		return weekDate;
	}

	public void setWeekDate(int weekDate) {
		this.weekDate = weekDate;
	}

	public int getYearDate() {
		return yearDate;
	}

	public void setYearDate(int yearDate) {
		this.yearDate = yearDate;
	}

	public String getNextWeekPlan() {
		return nextWeekPlan;
	}

	public void setNextWeekPlan(String nextWeekPlan) {
		this.nextWeekPlan = nextWeekPlan;
	}

	public List<LookDetail> getList() {
		return list;
	}

	public void setList(List<LookDetail> list) {
		this.list = list;
	}

}
