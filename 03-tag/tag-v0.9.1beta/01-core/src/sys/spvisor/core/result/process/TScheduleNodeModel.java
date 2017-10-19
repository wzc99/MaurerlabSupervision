package sys.spvisor.core.result.process;

import java.util.List;

import sys.spvisor.core.entity.process.TScheduleNode;

/**
 * 保存节点的时候用于接受参数
 * @author leixiaojing
 *
 */
public class TScheduleNodeModel {
	
	private List<TScheduleNode> list;

	public List<TScheduleNode> getList() {
		return list;
	}

	public void setList(List<TScheduleNode> list) {
		this.list = list;
	}
	
}
