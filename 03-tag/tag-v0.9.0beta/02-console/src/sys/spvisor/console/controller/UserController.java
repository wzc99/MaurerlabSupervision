package sys.spvisor.console.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sys.spvisor.core.criteria.ana.UserCriteria;
import sys.spvisor.core.entity.ana.Role;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.User;
import sys.spvisor.core.entity.ana.UserCase;
import sys.spvisor.core.service.ana.RoleService;
import sys.spvisor.core.service.ana.UserService;
import sys.spvisor.core.vo.ana.UserVo;
import sys.spvisor.core.vo.ana.UserVoConvertor;



@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping("/query.ajax")
	public @ResponseBody
	Map<String, Object> query(UserCriteria criteria, HttpSession session) {
		long count = userService.queryCount(criteria);
//		int offset = criteria.getOffset()-criteria.getLimit();
//		if(offset < 0){
//			offset = 0;
//		}
//		criteria.setOffset(offset);
		
		List<UserVo> records =  (new UserVoConvertor()).convertList(userService.query(criteria));
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", records);

		return result;
	}
	
	
	
	
	@RequestMapping("/getUserByUserId.ajax")
	public @ResponseBody UserVo getUserByUserId(@RequestParam("userId") String userId, HttpSession session) {
		User user = userService.getUserByUserId(Long.parseLong(userId));
		return new UserVoConvertor().convert(user);
	}
	
	
	@RequestMapping("/getUserMessage.ajax")
	public @ResponseBody TUser getUserMessgage( HttpSession session) {
		Long userId =  (Long) session.getAttribute("USER_ID");
		TUser user = userService.getUserMessage(userId);
		return user;
	}
	
	
	@RequestMapping("/getRolesByUserId.ajax")
	public @ResponseBody List<Role> getRolesByUserId(@RequestParam("userId") String userId, HttpSession session) {
		return roleService.getRolesByUserId(Long.parseLong(userId));
	}
	
/*	@RequestMapping("/getRolesByUserCaseId.ajax")
	public @ResponseBody List<RoleCase> getRolesByUserCaseId(@RequestParam("userId") String userId, HttpSession session) {
		return roleService.getRolesByUserCaseId(Long.parseLong(userId));
	}*/
	

	
	@RequestMapping("/getAllRoles.ajax")
	public @ResponseBody List<Role> getAllRoles(HttpSession session) {
		return roleService.getRolesByModuleCode("CONSOLE");
	}
	

	
	@RequestMapping("/editUser.ajax")
	public @ResponseBody Map<String, Object> editUser(@Valid UserCase user,
			HttpSession session) {
		
		Map<String, Object> result = new HashMap<String, Object>(2);
		
		try {
			Long userId = userService.editUser(user);
			result.put("userId", userId);
			result.put("success", true);
			result.put("message", "修改人员成功");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "修改人员失败！");
		}		
		return result;
	}
	
	
	
	private String getErrorMessage(BindingResult error) {
		String sumError = "";
		for (Object object : error.getAllErrors()) {
		    if(object instanceof FieldError) {
		        FieldError fieldError = (FieldError) object;
		        sumError += fieldError.getDefaultMessage();
		    }
		}
		return sumError;
	}
	
	@RequestMapping("/changePassword.ajax")
	public @ResponseBody Map<String, Object> changePassword(
			@RequestParam("id") String id,
			@RequestParam("password") String password,
			HttpSession session, HttpServletRequest req) {
		
		Map<String, Object> result = new HashMap<String, Object>(2);
		
		try {
			userService.changePassword(Long.parseLong(id), password);
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "修改密码失败：" + e.getMessage());
			req.setAttribute("log", "修改密码失败：" + e.getMessage());
			req.setAttribute("logType", "USER_CHANGE_PASSWORD_FAIL");
			return result;
		}
		
		result.put("success", true);
		result.put("message", "提交成功");
		req.setAttribute("log", "提交成功。");
		req.setAttribute("logType", "USER_CHANGE_PASSWORD_SUCCESS");
		return result;
	}
	
	@RequestMapping("/changePasswordForLoginUser.ajax")
	public @ResponseBody Map<String, Object> changePasswordForLoginUser(
			@RequestParam("id") String id,@RequestParam("password") String password,
			@RequestParam("newPasswd") String newPasswd,
			HttpSession session, HttpServletRequest req) {
		
		Map<String, Object> result = new HashMap<String, Object>(2);
		
		try {
			userService.changePasswordForLoginUser(Long.parseLong(id), password,newPasswd);
			result.put("success", true);
			result.put("message", "修改密码成功");
			req.setAttribute("log", "修改密码成功。");
			req.setAttribute("logType", "USER_CHANGE_PASSWORD_FOR_LOGIN_USER_FAIL");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "修改密码失败：" + e.getMessage());
			req.setAttribute("log", "修改密码失败：" + e.getMessage());
			req.setAttribute("logType", "USER_CHANGE_PASSWORD_FOR_LOGIN_USER_FAIL");
			return result;
		}
		return result;
	}
	
	
}
	
