package sys.spvisor.core.result.process;

import java.util.List;

import sys.spvisor.core.entity.project.TGoodsLists;

/**
 * 保存物资清单中每条记录的相关信息
 * @author leixiaojing
 *
 */
public class GoodsListsModel {
	/**
	 * 物资清单中的一条记录
	 */
	TGoodsLists goodsLists;
	/**
	 * 完成比例
	 */
	double completeRate;
	
	/**
	 * 其大类id
	 */
	Integer bigTypeId;//1:输送管 2：弯管 3：输送管弯管防腐 4：石油 5：管件 6：阀门 7：设备 8：设备泵 9：钻具 10：绝缘
		
	/**
	 * 此记录所选的所有节点相关信息
	 */
	List<ScheduleNodeModel> scheduleTableList;

	public TGoodsLists getGoodsLists() {
		return goodsLists;
	}

	public void setGoodsLists(TGoodsLists goodsLists) {
		this.goodsLists = goodsLists;
	}
	

	public double getCompleteRate() {
		return completeRate;
	}

	public void setCompleteRate(double completeRate) {
		this.completeRate = completeRate;
	}

	public Integer getBigTypeId() {
		return bigTypeId;
	}

	public void setBigTypeId(Integer bigTypeId) {
		this.bigTypeId = bigTypeId;
	}

	public List<ScheduleNodeModel> getScheduleTableList() {
		return scheduleTableList;
	}

	public void setScheduleTableList(List<ScheduleNodeModel> scheduleTableList) {
		this.scheduleTableList = scheduleTableList;
	}

}
