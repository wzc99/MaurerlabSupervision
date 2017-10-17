package sys.spvisor.console.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sys.spvisor.core.criteria.people.PeopleCriteria;
import sys.spvisor.core.criteria.people.PeopleManageCriteria;
import sys.spvisor.core.entity.ana.TPeoplePoststatus;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.people.PeopleToday;
import sys.spvisor.core.service.people.PeopleService;

@Controller
@RequestMapping("/people")
public class PeopleController {

	@Autowired
	PeopleService peopleService;

	@ResponseBody
	@RequestMapping("/getPostStatus.ajax")
	public List<TPeoplePoststatus> getPostStatus() {
		// System.out.println("______________________________________________________");
		// System.out.println(peopleService.getPostStatus());
		return peopleService.getPostStatus();
	}

	// @ResponseBody
	// @RequestMapping("/getAllPeople.ajax")
	// public List<PeopleToday> getAllPeople() {
	// System.out.println("______________________________________________________");
	// System.out.println(peopleService.getAllPeople());
	// return peopleService.getAllPeople();
	// }
	//
	// @ResponseBody
	// @RequestMapping("/getAllUser.ajax")
	// public List<TUser> getAllUser() {
	// System.out.println("______________________________________________________");
	// System.out.println(peopleService.getAllUser());
	// return peopleService.getAllUser();
	// }

	// 根据条件查询项目
	@RequestMapping("/queryPeople.ajax")
	public @ResponseBody Map<String, Object> queryPeople(PeopleCriteria msg) {
		System.out.println(msg.getUserWorkStatusId());
		Map<String, Object> result = new HashMap<String, Object>(3);
		List<PeopleToday> lists = null;
		try {
			lists = peopleService.selectByExample(msg);
			int count = peopleService.selectByExampleCount(msg);
			result.put("total", count);
			result.put("rows", lists);
			result.put("success", true);
			result.put("message", "查询成功");
		} catch (Exception e) {
			result.put("rows", null);
			result.put("success", false);
			result.put("message", "没有查到相关人员，请重新输入");
		}
		return result;

	}

	@RequestMapping("/queryPeopleUser.ajax")
	public @ResponseBody Map<String, Object> queryPeopleUser(PeopleManageCriteria params) {
		Map<String, Object> result = new HashMap<String, Object>(3);
		System.out.println("进入查询ajax");
		List<TUser> lists = null;
		try {
			lists = peopleService.queryPeopleUser(params);
			int count = peopleService.queryPeopleUserCount(params);
			result.put("total", count);
			result.put("rows", lists);
			result.put("success", true);
			result.put("message", "查询成功");
		} catch (Exception e) {
			result.put("rows", null);
			result.put("success", false);
			result.put("message", "没有查到相关人员，请重新输入");
		}
		System.out.println("返回结果" + result);
		return result;

	}

	@RequestMapping("/EditPeopleUserData.ajax")
	public @ResponseBody Map<String, Object> EditPeopleUserData(TUser people) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		try {
			peopleService.EditPeopleUserData(people);
			result.put("success", true);
			result.put("message", "修改人员成功！");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "修改人员失败！");
		}
		System.out.println("返回结果" + result);
		return result;
	}

	@RequestMapping("/AddPeopleUserData.ajax")
	public @ResponseBody Map<String, Object> AddPeopleUserData(TUser people) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		System.out.println("进入查询ajax");
		try {
			peopleService.AddPeopleUserData(people);
			result.put("success", true);
			result.put("message", "新增人员成功！");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "新增人员失败！");
		}
		System.out.println("返回结果" + result);
		return result;

	}

	@RequestMapping(value = "/RemovePeopleData.ajax", method = { RequestMethod.POST })
	public @ResponseBody Map<String, Object> RemovePeopleData(@RequestParam("userId") String userId) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		try {
			peopleService.RemovePeopleData(userId);
			result.put("success", true);
			result.put("message", "删除人员成功！");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "删除人员失败！");
		}
		System.out.println("返回结果" + result);
		return result;

	}

	@RequestMapping(value = "/delePeopleDutyData.ajax", method = { RequestMethod.POST })
	public @ResponseBody Map<String, Object> delePeopleDutyData(@RequestParam("userId") String userId) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		try {
			peopleService.renewPeopleDutyData(userId);
			result.put("success", true);
			result.put("message", "恢复职员身份成功！");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "恢复职员身份失败！");
		}
		System.out.println("返回结果" + result);
		return result;

	}

	@RequestMapping(value = "/JudgeAdduserLoginNameIn.ajax", method = { RequestMethod.POST })
	public @ResponseBody Map<String, Object> JudgeAdduserLoginNameIn(
			@RequestParam("userLoginName") String userLoginName) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		try {
			int count = peopleService.JudgeAddUserLoginNameIn(userLoginName);
			if (count == 1) {
				result.put("success", false);
				result.put("message", "员工编号已经被占用！");
			} else if (count == 0) {
				result.put("success", true);
				result.put("message", "员工编号可以使用！");
			}

		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "删除人员失败！");
		}
		System.out.println("返回结果" + result);
		return result;

	}
}
