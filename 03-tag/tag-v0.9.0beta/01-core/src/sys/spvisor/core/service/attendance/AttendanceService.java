package sys.spvisor.core.service.attendance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.ana.TPeoplePoststatusMapper;
import sys.spvisor.core.dao.attendance.TAttendanceMapper;
import sys.spvisor.core.entity.ana.Role;
import sys.spvisor.core.entity.attendance.AttendanceResultBean;
import sys.spvisor.core.entity.attendance.TAttendance;
import sys.spvisor.core.entity.attendance.TAttendanceExample;
import sys.spvisor.core.entity.attendance.TAttendanceExample.Criteria;
import sys.spvisor.core.entity.examine.ExamineInit;
import sys.spvisor.core.service.ana.RoleService;
import sys.spvisor.core.service.examine.ExamineService;
import sys.spvisor.core.util.DatetimeUtil;
import sys.spvisor.core.util.Enumerations;

@Service
public class AttendanceService {
	@Autowired
	private ExamineService exaService;
	@Autowired
	private TAttendanceMapper attDao;
	@Autowired
	private RoleService roleService;
	@Autowired
	private TPeoplePoststatusMapper statusDao;

	@Transactional
	public int changeAttendance(int userId, int targertStatus, String title, String content, int linkId)
			throws Exception {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		TAttendance ta = attDao.selectByPrimaryKey(linkId);
		if (ta.getStatusId() == targertStatus) {
			return result;
		}
		ExamineInit init = new ExamineInit();
		init.setSubmitId(userId);
		init.setExaType(0);
		init.setExaTitle(title);
		init.setExaContent(content);
		init.setExaFileFlag(0);
		init.setIsProType(0);
		init.setExaLinkId(linkId);
		result = exaService.insertExamine(init);
		if (result == Enumerations.ServiceReturnCode.操作成功.getCode()) {
			TAttendance to = new TAttendance();
			to.setId(linkId);
			to.setStatusIdStatus(1);
			to.setToStatusId(targertStatus);
			attDao.updateByPrimaryKeySelective(to);
		}
		return result;
	}

	/**
	 * 获取岗位状态
	 * 
	 * @param userId
	 * @return 出错异常或者无数据返回null
	 */
	@Transactional
	public TAttendance getAttendance(int userId) throws Exception {
		TAttendanceExample attExample = new TAttendanceExample();
		Criteria criteria = attExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<Integer> statusList = new ArrayList<Integer>();
		statusList.add(0);
		statusList.add(1);
		criteria.andStatusIdStatusIn(statusList);
		attExample.setOrderByClause("id desc");
		List<TAttendance> tempList = attDao.selectByExample(attExample);
		if (tempList == null || tempList.isEmpty()) {
			return null;
		}
		TAttendance temp = tempList.get(0);
		Role roleNow = roleService.getRoleByRoleId(temp.getStatusId().longValue());
		temp.setStatusName(roleNow.getDesc());
		if (temp.getStatusIdStatus() == 1) {
			Role roleTarget = roleService.getRoleByRoleId(temp.getToStatusId().longValue());
			temp.setStatusName(roleTarget.getDesc());
		}

		return temp;
	}

	public List<AttendanceResultBean> getAttendanceList(int userId, int limit, int index) {
		List<AttendanceResultBean> bean = new ArrayList<>();
		List<TAttendance> result = new ArrayList<>();
		TAttendanceExample example = new TAttendanceExample();
		example.setOrderByClause("start_time desc");
		if (limit != -1 && index != -1) {
			example.setLimit(limit);
			example.setOffset((index - 1) * limit);
		}
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		result = attDao.selectByExample(example);
		String lastTime = "至今";
		for (int i = 0; i < result.size(); i++) {
			AttendanceResultBean temp = new AttendanceResultBean();
			String time = DatetimeUtil.timestamp2StringDatetime(result.get(i).getStartTime());
			temp.setTime(time + " - " + lastTime);
			lastTime = time;
			String att = statusDao.selectByPrimaryKey(result.get(i).getStatusId()).getPostStatusDes();
			temp.setAttendance(att);
			temp.setNode(result.get(i).getNote1());
			bean.add(temp);
		}

		return bean;
	}

	public int getAttendanceCount(int userId) {
		int result = 0;
		TAttendanceExample example = new TAttendanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		result = attDao.countByExample(example);
		return result;
	}

}
