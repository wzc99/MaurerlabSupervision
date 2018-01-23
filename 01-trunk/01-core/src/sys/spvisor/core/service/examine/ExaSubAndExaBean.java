package sys.spvisor.core.service.examine;

import java.util.List;

public class ExaSubAndExaBean {
	private int id;
	private String subName;
	private List<ExaBean> exaList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public List<ExaBean> getExaList() {
		return exaList;
	}

	public void setExaList(List<ExaBean> exaList) {
		this.exaList = exaList;
	}

	class ExaBean {
		private String exaName;
		private String exaStatus;

		public String getExaName() {
			return exaName;
		}

		public void setExaName(String exaName) {
			this.exaName = exaName;
		}

		public String getExaStatus() {
			return exaStatus;
		}

		public void setExaStatus(String exaStatus) {
			this.exaStatus = exaStatus;
		}

	}
}
