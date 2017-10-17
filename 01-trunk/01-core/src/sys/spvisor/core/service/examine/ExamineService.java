package sys.spvisor.core.service.examine;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.attendance.TAttendanceMapper;
import sys.spvisor.core.dao.examine.ExamineDao;
import sys.spvisor.core.dao.examine.TExaProcessMapper;
import sys.spvisor.core.dao.examine.TExamineMapper;
import sys.spvisor.core.dao.project.TProjectPeopleMapper;
import sys.spvisor.core.entity.ana.Role;
import sys.spvisor.core.entity.ana.User;
import sys.spvisor.core.entity.attendance.TAttendance;
import sys.spvisor.core.entity.examine.ExamineInit;
import sys.spvisor.core.entity.examine.TExaProcess;
import sys.spvisor.core.entity.examine.TExaProcessExample;
import sys.spvisor.core.entity.examine.TExaProcessExample.Criteria;
import sys.spvisor.core.entity.examine.TExamine;
import sys.spvisor.core.entity.examine.TExamineExample;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;
import sys.spvisor.core.service.ana.RoleService;
import sys.spvisor.core.service.ana.UserService;
import sys.spvisor.core.util.DatetimeUtil;
import sys.spvisor.core.util.Enumerations;

@Service
public class ExamineService {
	@Autowired
	TAttendanceMapper tAttendanceMapper;
	@Autowired
	TExamineMapper tExamineMapper;
	@Autowired
	TExaProcessMapper tExaProcessMapper;
	@Autowired
	RoleService roleService;
	@Autowired
	TProjectPeopleMapper tProjectPeopleMapper;
	@Autowired
	ExamineDao examineDao;
	@Autowired
	UserService userService;
	@Autowired
	ExamineCallBack callBack;

	/**
	 * 新增审核
	 * 
	 * @param init
	 *            审核初始化数据
	 * @return 插入状态
	 * @throws Exception
	 */
	@Transactional
	public int insertExamine(ExamineInit init) throws Exception {

		try {
			// 往审核表里面添加一条数据
			TExamine te = new TExamine();
			te.setSubmitId(init.getSubmitId());
			te.setSubmitTime(DatetimeUtil.getCurrentTimestamp());
			te.setStatus(0);
			te.setExaType(init.getExaType());
			te.setExaTitle(init.getExaTitle());
			te.setExaContent(init.getExaContent());
			te.setExaFileFlag(init.getExaFileFlag());
			te.setExaLinkId(init.getExaLinkId());
			if (init.getExaFileFlag() > 0) {
				te.setExaFilePath(init.getExaFilePath());
			}

			int TexamId = examineDao.insertAndReturnId(te);
			
			// System.out.println(TexamId+" 111");
			// 获取新增审核表中的id，并更新流程表
			TExaProcessExample tExaProcessExample = new TExaProcessExample();
			sys.spvisor.core.entity.examine.TExaProcessExample.Criteria criteria = tExaProcessExample.createCriteria();
			criteria.andExamineIdEqualTo(TexamId);
			List<TExaProcess> lists = tExaProcessMapper.selectByExample(tExaProcessExample);
			for (int i = 0; i < lists.size(); i++) {
				TExaProcess one = lists.get(i);
				one.setIsProType(init.getIsProType());
				if (init.getIsProType() == 1) {
					one.setProId(init.getProId());
				}
				tExaProcessMapper.updateByPrimaryKeySelective(one);
			}
			return Enumerations.ServiceReturnCode.操作成功.getCode();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/**
	 * 获取由我审核的列表 待审核状态
	 * 
	 * @param userId
	 * @param pageSize
	 * @param index
	 *            从1开始
	 * @return
	 */
	@Transactional
	public List<HashMap<String, Object>> getExamineByMeList(int userId, int pageSize, int index) {
		HashMap<Integer, ExamineQueryTempBean> map = getRolesByUserIdProjectOrNot(userId);

		TExaProcessExample tExaProcessExample = new TExaProcessExample();
		boolean tag = false;
		for (int roleId : map.keySet()) {
			Criteria criteria = tExaProcessExample.createCriteria();
			criteria.andNodeStatusEqualTo(0);
			criteria.andProNodeStatusEqualTo(1);
			criteria.andCheckerEqualTo(roleId);
			if (map.get(roleId).isProType()) {
				criteria.andIsProTypeEqualTo(1);
				criteria.andProIdEqualTo(map.get(roleId).getProId());
			} else {
				criteria.andIsProTypeEqualTo(0);
			}
			if (tag)
				tExaProcessExample.or(criteria);
			tag = true;
		}
		if (pageSize != -1 && index != -1) {
			tExaProcessExample.setLimit(pageSize);
			tExaProcessExample.setOffset((index - 1) * pageSize);
		}
		tExaProcessExample.setOrderByClause("id desc");
		List<TExaProcess> exaPList = tExaProcessMapper.selectByExample(tExaProcessExample);
		ArrayList<HashMap<String, Object>> result = new ArrayList<>();
		for (TExaProcess temp : exaPList) {
			HashMap<String, Object> mapT = new HashMap<>();
			mapT.put("nodeName", temp.getNodeName());
			mapT.put("processId", temp.getId());
			mapT.put("exaByMeType", temp.getNodeStatus());
			TExamine exa = tExamineMapper.selectByPrimaryKey(temp.getExamineId());
			User tempUser = userService.getUserByUserId(exa.getSubmitId().longValue());
			mapT.put("userName", tempUser.getName());
			mapT.put("exaType", exa.getExaType());
			mapT.put("exaContent", exa);
			result.add(mapT);
		}

		return result;
	}

	/**
	 * 根据ProcessId获取审核条目
	 * 
	 * @param processId
	 * @param type
	 *            0:审核中 1:审核记录 通过 未通过 通过撤销 未通过撤销
	 * @return
	 */
	@Transactional
	public HashMap<String, Object> getExamineByMeById(int processId, int type) {

		TExaProcess temp = tExaProcessMapper.selectByPrimaryKey(processId);
		int status = temp.getNodeStatus();
		if (type == 0) {
			if (status != 0) {
				return null;
			}
		} else if (type == 1) {
			if (status != 1 && status != 2 && status != 11 && status != 12) {
				return null;
			}
		}

		HashMap<String, Object> result = new HashMap<>();
		result.put("nodeName", temp.getNodeName());
		result.put("processId", temp.getId());
		result.put("exaByMeType", temp.getNodeStatus());
		TExamine exa = tExamineMapper.selectByPrimaryKey(temp.getExamineId());
		User tempUser = userService.getUserByUserId(exa.getSubmitId().longValue());
		result.put("userName", tempUser.getName());
		result.put("exaType", exa.getExaType());
		result.put("exaContent", exa);

		return result;
	}

	/**
	 * 获取由我审核的条目数量 待审核状态
	 * 
	 * @param userId
	 *            用户id
	 * @return 该类的数目
	 */
	public int getExamineByMeCount(int userId) {
		List<TExaProcess> exaPList = null;
		try {
			HashMap<Integer, ExamineQueryTempBean> map = getRolesByUserIdProjectOrNot(userId);

			if(map.size()==0)
				return 0;
			TExaProcessExample tExaProcessExample = new TExaProcessExample();
			boolean tag = false;
			for (int roleId : map.keySet()) {
				Criteria criteria = tExaProcessExample.createCriteria();
				criteria.andNodeStatusEqualTo(0);
				criteria.andProNodeStatusEqualTo(1);
				criteria.andCheckerEqualTo(roleId);
				if (map.get(roleId).isProType()) {
					criteria.andIsProTypeEqualTo(1);
					criteria.andProIdEqualTo(map.get(roleId).getProId());
				} else {
					criteria.andIsProTypeEqualTo(0);
				}
				if (tag)
					tExaProcessExample.or(criteria);
				tag = true;
			}

			exaPList = tExaProcessMapper.selectByExample(tExaProcessExample);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return exaPList.size();
	}

	/**
	 * 
	 * 我提交的审核列表
	 * 
	 * @param userId
	 * @param status
	 *            4:全部 0:审核中 1通过 2未通过 3撤销 tip:不包括不可见的审核
	 * @param pageSize
	 * @param index
	 *            从1开始
	 * @return
	 */
	@Transactional
	public List<TExamine> getMyExamineList(int userId, int status, int pageSize, int index) {

		TExamineExample tExamineExample = new TExamineExample();
		sys.spvisor.core.entity.examine.TExamineExample.Criteria criteria = tExamineExample.createCriteria();
		criteria.andSubmitIdEqualTo(userId);
		if (status == 4) {
			criteria.andStatusNotEqualTo(-1);
		} else if (status == -1) {
			return null;
		} else {
			criteria.andStatusEqualTo(status);
		}
		// 根据提交时间进行降序查询，这里根据id，提交时间约靠后id越大
		tExamineExample.setOrderByClause("id desc");
		if (pageSize != -1 && index != -1) {
			tExamineExample.setLimit(pageSize);
			tExamineExample.setOffset((index - 1) * pageSize);
		}
		List<TExamine> result = tExamineMapper.selectByExample(tExamineExample);
		for (TExamine process : result) {
			User tempUser = userService.getUserByUserId(process.getSubmitId().longValue());
			process.setSubmitName(tempUser.getName());
		}
		return result;

	}

	/**
	 * 根据Id获取审核条目 －1状态返回null
	 * 
	 * @param exaId
	 * @return
	 */
	public TExamine getExamineById(int exaId) {
		TExamine result = tExamineMapper.selectByPrimaryKey(exaId);
		if (result.getStatus() == -1) {
			return null;
		} else {
			User tempUser = userService.getUserByUserId(result.getSubmitId().longValue());
			result.setSubmitName(tempUser.getName());
			return result;
		}

	}

	/**
	 * 获取我提交的审核的条目
	 * 
	 * @param userId
	 *            用户id
	 * @param status
	 *            审核状态 4:全部 0:审核中 1通过 2未通过 3撤销tip:不包括不可见的审核
	 * @return 该类的数目
	 */
	public int getMyExamineCount(int userId, int status) {
		TExamineExample tExamineExample = new TExamineExample();
		sys.spvisor.core.entity.examine.TExamineExample.Criteria criteria = tExamineExample.createCriteria();
		criteria.andSubmitIdEqualTo(userId);
		if (status == 4) {
			criteria.andStatusNotEqualTo(-1);
		} else if (status == -1) {
			return status;
		} else {
			criteria.andStatusEqualTo(status);
		}
		return tExamineMapper.countByExample(tExamineExample);
	}

	/**
	 * 获取用户的角色 项目中的带项目ID 项目外的不带
	 * 
	 * @param userId
	 * @return
	 */

	private HashMap<Integer, ExamineQueryTempBean> getRolesByUserIdProjectOrNot(int userId) {
		// 通过userid获取该用户角色
		List<Role> roles = roleService.getRolesByUserId(userId);
		// 获取该用户 项目中角色和项目外的角色 存储到map里面
		HashMap<Integer, ExamineQueryTempBean> map = new HashMap<>();
		for (int j = 0; j < roles.size(); j++) {
			int tempRoleIds = roles.get(j).getId().intValue();
			System.out.println(tempRoleIds + "RoleId");
			if (tempRoleIds >= 10 && tempRoleIds <= 13) {
				TProjectPeopleExample ppExample = new TProjectPeopleExample();
				TProjectPeopleExample.Criteria ppCriteria = ppExample.createCriteria();
				ppCriteria.andPpProRoleIdEqualTo(tempRoleIds);
				ppCriteria.andPpStatusEqualTo("O");
				ppCriteria.andPpUserIdEqualTo(userId);
				List<TProjectPeople> ppList = tProjectPeopleMapper.selectByExample(ppExample);
				for (TProjectPeople temp : ppList) {
					ExamineQueryTempBean queryBean = new ExamineQueryTempBean();
					queryBean.setProId(temp.getPpProId());
					queryBean.setProType(true);
					map.put(tempRoleIds, queryBean);
				}
			} else {
				ExamineQueryTempBean queryBean = new ExamineQueryTempBean();
				queryBean.setProType(false);
				map.put(tempRoleIds, queryBean);
			}
		}
		return map;
	}

	/**
	 * 获取由我审核的记录数量
	 * 
	 * @param userId
	 * @param status
	 *            1:通过 2:未通过 11:通过用户撤销 12:未通过用户撤销 3：包括1、2、11、12
	 * @return
	 */
	public int getExamineByMeRecordCount(int userId, int status) {
		HashMap<Integer, ExamineQueryTempBean> map = getRolesByUserIdProjectOrNot(userId);
		TExaProcessExample tExaProcessExample = new TExaProcessExample();
		if(map.size()==0)
			return 0;
		boolean tag = false;
		for (int roleId : map.keySet()) {
			Criteria criteria = tExaProcessExample.createCriteria();
			if (status == 3) {
				List<Integer> nodeStatusList = new ArrayList<>();
				nodeStatusList.add(1);
				nodeStatusList.add(2);
				nodeStatusList.add(11);
				nodeStatusList.add(12);
				criteria.andNodeStatusIn(nodeStatusList);
			} else {
				criteria.andNodeStatusEqualTo(status);
			}

			criteria.andProNodeStatusEqualTo(1);
			criteria.andCheckerEqualTo(roleId);
			if (map.get(roleId).isProType()) {
				criteria.andIsProTypeEqualTo(1);
				criteria.andProIdEqualTo(map.get(roleId).getProId());
			} else {
				criteria.andIsProTypeEqualTo(0);
			}
			if (tag)
				tExaProcessExample.or(criteria);
			tag = true;
		}

		List<TExaProcess> exaPList = tExaProcessMapper.selectByExample(tExaProcessExample);

		return exaPList.size();
	}

	/**
	 * 获取由我审核过的记录列表
	 * 
	 * @param userId
	 * @param status
	 *            1:通过 2:未通过 11:通过用户撤销 12:未通过用户撤销 3：包括1、2、11、12
	 * @param pageSize
	 *            分页大小
	 * @param index
	 *            当前页 从1开始
	 * @return
	 */

	public ArrayList<HashMap<String, Object>> getExamineByMeRecordList(int userId, int status, int pageSize,
			int index) {
		HashMap<Integer, ExamineQueryTempBean> map = getRolesByUserIdProjectOrNot(userId);
		TExaProcessExample tExaProcessExample = new TExaProcessExample();
		boolean tag = false;
		if(map.size()==0)
			return new ArrayList<>();
		for (int roleId : map.keySet()) {
			Criteria criteria = tExaProcessExample.createCriteria();
			if (status == 3) {
				List<Integer> nodeStatusList = new ArrayList<>();
				nodeStatusList.add(1);
				nodeStatusList.add(2);
				nodeStatusList.add(11);
				nodeStatusList.add(12);
				criteria.andNodeStatusIn(nodeStatusList);
			} else {
				criteria.andNodeStatusEqualTo(status);
			}

			criteria.andProNodeStatusEqualTo(1);
			criteria.andCheckerEqualTo(roleId);
			if (map.get(roleId).isProType()) {
				criteria.andIsProTypeEqualTo(1);
				criteria.andProIdEqualTo(map.get(roleId).getProId());
			} else {
				criteria.andIsProTypeEqualTo(0);
			}
			if (tag)
				tExaProcessExample.or(criteria);
			tag = true;
		}
		if (pageSize != -1 && index != -1) {
			tExaProcessExample.setLimit(pageSize);
			tExaProcessExample.setOffset((index - 1) * pageSize);
		}
		tExaProcessExample.setOrderByClause("id desc");
		List<TExaProcess> exaPList = tExaProcessMapper.selectByExample(tExaProcessExample);
		ArrayList<HashMap<String, Object>> result = new ArrayList<>();
		for (TExaProcess temp : exaPList) {
			HashMap<String, Object> mapT = new HashMap<>();
			mapT.put("nodeName", temp.getNodeName());
			mapT.put("processId", temp.getId());
			mapT.put("exaByMeType", temp.getNodeStatus());
			TExamine exa = tExamineMapper.selectByPrimaryKey(temp.getExamineId());
			User tempUser = userService.getUserByUserId(exa.getSubmitId().longValue());
			exa.setSubmitName(tempUser.getName());
			mapT.put("exaType", exa.getExaType());
			mapT.put("exaContent", exa);
			result.add(mapT);
		}

		return result;
	}

	/**
	 * 撤销审核条目 由提交者操作 状态0、2到3 （状态1为审核通过 流程结束不可以再撤销）
	 * 
	 * @param exaId
	 * @param userId
	 * @return 0:失败或异常 1:成功 2:权限问题 3:参数问题
	 */
	@Transactional
	public int ToPullBackExamine(int exaId, int userId) {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		TExamine target = tExamineMapper.selectByPrimaryKey(exaId);
		if (target.getSubmitId().equals(userId)) {
			if (target.getStatus() == 0 || target.getStatus() == 2) {
				if (target.getExaType() == 0) {
					int attendanceId = target.getExaLinkId();
					callBack.exaAttendanceCall(attendanceId, "撤销");
					TAttendance attendance = tAttendanceMapper.selectByPrimaryKey(attendanceId);
					if (attendance.getStatusIdStatus() == 1) {
						attendance = new TAttendance();
						attendance.setId(attendanceId);
						attendance.setToStatusId(0);
						attendance.setStatusIdStatus(0);
						tAttendanceMapper.updateByPrimaryKeySelective(attendance);
					} else {
						return Enumerations.ServiceReturnCode.非法操作.getCode();
					}
				} else if (target.getExaType() == 10) {
					callBack.journalCall(target.getExaLinkId(), 3);
				}
				target = new TExamine();
				target.setId(exaId);
				target.setStatus(3);
				tExamineMapper.updateByPrimaryKeySelective(target);
				result = Enumerations.ServiceReturnCode.操作成功.getCode();
			} else {
				result = Enumerations.ServiceReturnCode.参数验证出错.getCode();
			}
		} else {
			result = Enumerations.ServiceReturnCode.非法权限.getCode();
		}

		return result;
	}

	/**
	 * 修改审核条目 修改要从 3状态开始 到0状态结束 ：重新插入新的条目 以前的不变
	 * 
	 * @param exaId
	 * @param userId
	 * @param title
	 * @param content
	 * @param filePath
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int ToFixExamine(int exaId, int userId, String title, String content, String filePath, int fileFlag)
			throws Exception {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		TExamine temp = tExamineMapper.selectByPrimaryKey(exaId);
		if (temp.getSubmitId().equals(userId)) {
			if (temp.getStatus() == 3) {
				TExaProcessExample example = new TExaProcessExample();
				TExaProcessExample.Criteria tpCriteria = example.createCriteria();
				tpCriteria.andExamineIdEqualTo(exaId);
				TExaProcess ePTemp = tExaProcessMapper.selectByExample(example).get(0);

				ExamineInit init = new ExamineInit();
				init.setSubmitId(temp.getSubmitId());
				init.setExaType(temp.getExaType());
				if (StringUtils.isEmpty(title)) {
					init.setExaTitle(temp.getExaTitle());
				} else {
					init.setExaTitle(title);
				}
				if (StringUtils.isEmpty(content)) {
					init.setExaContent(temp.getExaContent());
				} else {
					init.setExaContent(content);
				}

				if (fileFlag != 0) {
					init.setExaFileFlag(fileFlag);
					init.setExaFilePath(filePath);
				} else {
					init.setExaFileFlag(temp.getExaFileFlag());
					init.setExaFilePath(temp.getExaFilePath());
				}

				init.setIsProType(ePTemp.getIsProType());
				init.setExaLinkId(temp.getExaLinkId());
				if (ePTemp.getIsProType() == 1) {
					init.setProId(ePTemp.getProId());
				}
				result = insertExamine(init);

			} else {
				result = Enumerations.ServiceReturnCode.非法操作.getCode();
			}
		} else {
			result = Enumerations.ServiceReturnCode.非法权限.getCode();
		}

		return result;
	}

	/**
	 * 条目不可见 权限(0:审核提交者 要从1 3状态到－1状态 1:审核者 要从 1、2到－1）
	 * 
	 * @param id
	 *            根据type决定 审核条目id 或者 审核流程id
	 * @param type
	 *            0:提交者移除 1:审核者移除
	 * @return
	 */
	@Transactional
	public int ToInvisibleExamineOrProcess(int id, int type) {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		try {
			if (type == 0) {
				// 审核提交者 删除
				TExamine exa = tExamineMapper.selectByPrimaryKey(id);
				if (exa.getStatus() == 1 || exa.getStatus() == 3) {
					exa = new TExamine();
					exa.setId(id);
					exa.setStatus(-1);
					tExamineMapper.updateByPrimaryKeySelective(exa);
				} else {
					result = Enumerations.ServiceReturnCode.非法操作.getCode();
				}
			} else if (type == 1) {
				TExaProcess exaProcess = tExaProcessMapper.selectByPrimaryKey(id);
				if (exaProcess.getNodeStatus() == 1 || exaProcess.getNodeStatus() == 2) {
					exaProcess = new TExaProcess();
					exaProcess.setId(id);
					exaProcess.setNodeStatus(-1);
					tExaProcessMapper.updateByPrimaryKeySelective(exaProcess);
				} else {
					result = Enumerations.ServiceReturnCode.非法操作.getCode();
				}
			} else {
				result = Enumerations.ServiceReturnCode.参数验证出错.getCode();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}

		return result;
	}

	/**
	 * 审核操作 由审核着操作 状态0到1、2 同步操作：审核流程表：节点状态、时间、备注 如果节点状态为2 或者节点状态为1并且为流程最后一个节点
	 * 修改审核表的status 同步操作：修改 审核提交者的审核内容表 ：例如：岗位状态以及用户岗位状态
	 * 
	 * @param processId
	 * @param toNodeStatus
	 *            1，2状态
	 * @param note
	 *            备注
	 * @return
	 * @throws ParseException
	 */
	@Transactional
	public int ToDoExamine(int processId, int toNodeStatus, String note) throws ParseException {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		TExaProcess targert = tExaProcessMapper.selectByPrimaryKey(processId);
		if (targert.getNodeStatus() == 0 && targert.getProNodeStatus() == 1
				&& (toNodeStatus == 1 || toNodeStatus == 2)) {
			TExamine temp = tExamineMapper.selectByPrimaryKey(targert.getExamineId());
			if (targert.getIsLastNode() && toNodeStatus == 1) {
				// 审核通过 流程结束
				if (temp.getExaType() == 0) {
					// 考勤审核
					int attendanceId = temp.getExaLinkId();
					TAttendance attendance = tAttendanceMapper.selectByPrimaryKey(attendanceId);
					if (attendance.getStatusIdStatus() == 1) {
						// 修改上一条记录 目标状态为0 不可用 状态id的状态为2 过期状态
						attendance.setStatusIdStatus(2);
						// 插入一条新的记录 记录新的岗位状态
						TAttendance insertAttendance = new TAttendance();
						insertAttendance.setStatusId(attendance.getToStatusId());
						attendance.setToStatusId(0);
						tAttendanceMapper.updateByPrimaryKeySelective(attendance);
						
						insertAttendance.setProId(attendance.getProId());
						insertAttendance.setStartTime(DatetimeUtil.getCurrentTimestamp());
						
						insertAttendance.setUserId(attendance.getUserId());
						// 当前状态可用
						insertAttendance.setStatusIdStatus(0);
						// 目标状态不可用为0
						insertAttendance.setToStatusId(0);
						tAttendanceMapper.insertSelective(insertAttendance);
					} else {
						result = Enumerations.ServiceReturnCode.非法操作.getCode();
					}

				} else if (temp.getExaType() == 1) {
					// 其他审核
				} else if (temp.getExaType() == 10) {
					// 日志审核
					callBack.journalCall(temp.getExaLinkId(), 1);
				}

			} else if (targert.getIsLastNode() && toNodeStatus == 2) {
				if (temp.getExaType() == 1) {

				} else if (temp.getExaType() == 10) {
					callBack.journalCall(temp.getExaLinkId(), 2);
				}
			}

			targert = new TExaProcess();
			targert.setId(processId);
			targert.setNodeStatus(toNodeStatus);
			if (!StringUtils.isEmpty(note)) {
				targert.setNote(note);
			}
			tExaProcessMapper.updateByPrimaryKeySelective(targert);

			result = Enumerations.ServiceReturnCode.操作成功.getCode();
		} else {
			result = Enumerations.ServiceReturnCode.参数验证出错.getCode();
		}
		return result;
	}
}

final class ExamineQueryTempBean {
	private boolean isProType;
	private int proId;

	public boolean isProType() {
		return isProType;
	}

	public void setProType(boolean isProType) {
		this.isProType = isProType;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

}