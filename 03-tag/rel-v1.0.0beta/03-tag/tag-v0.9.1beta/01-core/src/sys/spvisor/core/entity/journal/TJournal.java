package sys.spvisor.core.entity.journal;

import java.sql.Timestamp;
import java.sql.Date;

public class TJournal {
	private Integer id;

	private Integer pid;

	private String pname;

	private Integer type;

	private Integer status;

	private Timestamp firstTime;

	private String file;

	private Integer week;

	private Date jTime;

	private Timestamp lastTime;

	private Integer handler;

	private Integer yearInt;
	
	
	private String handlerName;
	

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname == null ? null : pname.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(Timestamp firstTime) {
		this.firstTime = firstTime;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file == null ? null : file.trim();
	}

	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public Date getjTime() {
		return jTime;
	}

	public void setjTime(Date jTime) {
		this.jTime = jTime;
	}

	public Timestamp getLastTime() {
		return lastTime;
	}

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

	public Integer getHandler() {
		return handler;
	}

	public void setHandler(Integer handler) {
		this.handler = handler;
	}

	public Integer getYearInt() {
		return yearInt;
	}

	public void setYearInt(Integer yearInt) {
		this.yearInt = yearInt;
	}
}