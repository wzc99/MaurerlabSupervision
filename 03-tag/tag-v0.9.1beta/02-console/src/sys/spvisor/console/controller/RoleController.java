package sys.spvisor.console.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sys.spvisor.core.criteria.ana.RoleCaseCriteria;
import sys.spvisor.core.criteria.ana.RoleCriteria;
import sys.spvisor.core.entity.ana.Permission;
import sys.spvisor.core.entity.ana.Role;
import sys.spvisor.core.entity.ana.RoleCase;
import sys.spvisor.core.service.ana.AnaService;
import sys.spvisor.core.service.ana.PermissionService;
import sys.spvisor.core.service.ana.RoleService;
import sys.spvisor.core.vo.ana.MenuTreeNode;
import sys.spvisor.core.vo.ana.RoleVoConvertor;

@Controller
@RequestMapping("/role")
@SuppressWarnings("unchecked")
public class RoleController {
	@Autowired
	RoleService roleService;
	
	@Autowired
	PermissionService permissionService;
	
	@Autowired
	AnaService anaService;
	
	@RequestMapping("/query.ajax")
	public @ResponseBody
	Map<String, Object> query(RoleCriteria criteria, HttpSession session) {
		Map<String,Object> map = new HashMap<String,Object>(2);
		map.put("total", roleService.queryCount(criteria));
		map.put("rows", (new RoleVoConvertor()).convertList(roleService.query(criteria)));
		return map;
	}
	
/*	@RequestMapping("/queryCheck.ajax")
	public @ResponseBody
	Map<String, Object> queryCheck(RoleCaseCriteria criteria, HttpSession session) {
		Map<String,Object> map = new HashMap<String,Object>(2);
		List<String> myStatus = new ArrayList<String>();
		myStatus.add("IW");
		myStatus.add("UW");
		criteria.setCaseStatus(myStatus);
		map.put("total", roleService.queryCheckCount(criteria));
		map.put("rows", (new RoleVoConvertorCase()).convertList(roleService.queryCheck(criteria)));
		return map;
	}
	
	@RequestMapping("/queryStatus.ajax")
	public @ResponseBody
	Map<String, Object> queryStatus(RoleCaseCriteria criteria, HttpSession session) {
		Map<String,Object> map = new HashMap<String,Object>(2);
		criteria.setCaseOperator(Long.valueOf(session.getAttribute("USER_ID").toString()));
		List<String> myStatus = new ArrayList<String>();
		if(criteria.getMyStatus().equals("W")){
			myStatus.add("IW");
			myStatus.add("UW");
		}else if(criteria.getMyStatus().equals("R")){
			myStatus.add("IR");
			myStatus.add("UR");
		}else{
			myStatus.add("IW");
			myStatus.add("UW");
			myStatus.add("IR");
			myStatus.add("UR");
		}
		criteria.setCaseStatus(myStatus);
		map.put("total", roleService.queryCheckCount(criteria));
		map.put("rows", (new RoleVoConvertorCase()).convertList(roleService.queryCheck(criteria)));
		return map;
	}
	*/
	
	@RequestMapping("/getPermissionAll.ajax")
	public @ResponseBody
	List<Permission> getPermissionAll(HttpSession session) {
		return permissionService.getAllPermission();
	}
	
	@RequestMapping("/getAllMenuTreeNodes.ajax")
	public @ResponseBody
	List<MenuTreeNode> getAllMenuTreeNodes(HttpServletRequest req,HttpServletResponse res, HttpSession session) {
		return anaService.getAllMenuTreeNodes();
	}
	
	@RequestMapping("/getAllMenuTreeNodesForEdit.ajax")
	public @ResponseBody
	List<MenuTreeNode> getAllMenuTreeNodesForEdit(@RequestParam("roleId") String roleId,HttpServletRequest req,
			HttpServletResponse res, HttpSession session) {
		return anaService.getAllMenuTreeNodesForEdit(Long.parseLong(roleId));
	}
	
	@RequestMapping("/getAllMenuTreeNodesCaseForEdit.ajax")
	public @ResponseBody
	List<MenuTreeNode> getAllMenuTreeNodesCaseForEdit(@RequestParam("roleId") String roleId,HttpServletRequest req,
			HttpServletResponse res, HttpSession session) {
		return anaService.getAllMenuTreeNodesCaseForEdit(Long.parseLong(roleId));
	}
	
	@RequestMapping("/addRole.ajax")
	public @ResponseBody Map<String, Object> addRole(@Valid Role role,BindingResult error,
			HttpSession session, HttpServletRequest req) {
		
		Map<String, Object> result = new HashMap<String, Object>(2);
		
		try {
			//添加case信息
			role.setStatus("O");
			role.setCreateDatetime(new Timestamp(new Date().getTime()));
			role.setCheckStatus("O");
			role.setModuleCode("CONSOLE");
			role.setName(String.valueOf(new Date().getTime()));
			roleService.addRole(role);
			result.put("success", true);
			result.put("message", "Add user successfully.");
			req.setAttribute("log", "新增角色成功");
			req.setAttribute("logType", "ROLE_ADD_SUCCESS");
		} catch(Exception e) {
			result.put("success", false);
			result.put("message", "新增角色操作失败:" + e.getMessage());
			req.setAttribute("log", "新增角色失败" + e.getMessage());
			req.setAttribute("logType", "ROLE_ADD_FAIL");
		}
		
		return result;
	}
	
	@RequestMapping("/editRole.ajax")
	public @ResponseBody Map<String, Object> editRole(@Valid RoleCase role,
			HttpSession session) {
		
		Map<String, Object> result = new HashMap<String, Object>(2);
		
		try {
			Long roleId = roleService.editRole(role);
			result.put("roleId", roleId);
			result.put("success", true);
			result.put("message", "修改角色成功.");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "修改角色操作失败！");
		}	
		
		return result;
	}
	
	@RequestMapping("/checkRole.ajax")
	public @ResponseBody Map<String, Object> checkRole(@Valid RoleCase role,HttpSession session, HttpServletRequest req) {
		Map<String, Object> result	 				= new HashMap<String, Object>();
		try {
			//添加case信息
			role.setCaseUserId(Long.valueOf(session.getAttribute("USER_ID").toString()));
			role.setCaseOpenStatus("O");
			roleService.checkRole(role);
			result.put("success", true);
			result.put("message", "审核角色成功。");
			req.setAttribute("log", "审核角色成功。");
			req.setAttribute("logType", "ROLE_CHECK_SUCCESS");
		} catch(Exception e) {
			
			result.put("success", false);
			result.put("message", "审核角色失败:" + e.getMessage());
			req.setAttribute("log", "审核角色失败:" + e.getMessage());
			req.setAttribute("logType", "ROLE_CHECK_FAIL");
		}
		return result;
	}
	
	@RequestMapping("/getRoleByRoleId.ajax")
	public @ResponseBody Role getRoleByRoleId(@RequestParam("roleId") String roleId, HttpSession session) {
		Role role = roleService.getRoleByRoleId(Long.parseLong(roleId));
		role.setRealId(role.getId());
		return role;
	}
	
	@RequestMapping("/getRoleCaseByRoleId.ajax")
	public @ResponseBody RoleCase getRoleCaseByRoleId(@RequestParam("roleId") String roleId, HttpSession session) {
		RoleCase role = roleService.getRoleCaseByRoleId(Long.parseLong(roleId));
		return role;
	}
	
	@RequestMapping("/getPermissionByRoleId.ajax")
	public @ResponseBody List<Permission> getPermissionByRoleId(@RequestParam("roleId") String roleId, HttpSession session) {
		return roleService.getPermissionByRoleId(Long.parseLong(roleId));
	}
	
	@RequestMapping("/getPermissionByRoleCaseId.ajax")
	public @ResponseBody List<Permission> getPermissionByRoleCaseId(@RequestParam("roleId") String roleId, HttpSession session) {
		return roleService.getPermissionByRoleCaseId(Long.parseLong(roleId));
	}
	
/*	@ResponseBody
	@RequestMapping("/downloadRoleByQuery.ajax")
	public void downloadRoleByQuery(RoleCriteria criteria, @RequestParam("downloadS")int downloadS, @RequestParam("countNow")int countNow, HttpServletResponse response) throws UnsupportedEncodingException{
		criteria.setPaging(true);
		criteria.setLimit(downloadS);
		criteria.setOffset((downloadS*(countNow-1)));
		List<ExcelEntity> lists = roleService.downloadByQuery(criteria);
		Workbook wb = ExcelUtil.createExcel(lists);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String excelName = "角色"+sdf.format(new Date());
		response.setCharacterEncoding("UTF-8");
        response.setContentType("application/vnd.ms-excel");  
        response.setHeader("Content-disposition", "attachment;filename="+java.net.URLEncoder.encode(excelName, "UTF-8")+".xls"); 
        OutputStream ouputStream;
		try {
			ouputStream = response.getOutputStream();
			wb.write(ouputStream);  
	        ouputStream.flush();  
	        ouputStream.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
