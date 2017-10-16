package sys.spvisor.console.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sys.spvisor.core.criteria.project.ProjectCriteria;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.project.TBigProject;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectAndMember;
import sys.spvisor.core.entity.project.TProjectCustom;
import sys.spvisor.core.service.ana.UserService;
import sys.spvisor.core.service.project.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	@Autowired
	UserService userService;
	@Autowired
	TUserMapper tUserMapper;
	
	@RequestMapping("/addProject.ajax")
	public @ResponseBody Map<String, Object> addProject(TProjectCustom custom,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String, Object> result = new HashMap<String, Object>(2);
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		String msg = "";
		try {
			msg = projectService.addProject(custom,fileMap,username,userId,req);
			result.put("success", true);
			result.put("message", "新增项目成功！");
		} catch (Exception e) {
			if(msg == "批量导入EXCEL失败！") {
				result.put("success", false);
				result.put("message", "新增项目失败！导入物资清单出现了问题");
			} else {
				result.put("success", false);
				result.put("message", "新增项目失败！");
			}
		}
		
		return result;
		
	}
	
	//获取所有的大项目名称
	@ResponseBody
	@RequestMapping("/getAllBigProjectName.ajax")
	public List<TBigProject> getAllBigProjectName() {
		return projectService.getAllBigProjectName();
	}
	
	//根据业主单位查询委托信息
	@ResponseBody
	@RequestMapping(value="/viewProjectByUnitName.ajax", method = { RequestMethod.POST })
	public TProject viewProjectByUnitName(@RequestParam("unitName") String unitName) {
		return projectService.viewProjectByUnitName(unitName);
		
	}
	
	//根据条件查询项目
	@RequestMapping("/queryProject.ajax")
	public @ResponseBody Map<String, Object> queryProject(ProjectCriteria msg,String member) {
		Map<String, Object> result = new HashMap<String, Object>(3);
		List<TProjectAndMember> lists = null;
		try {
			lists = projectService.selectByExample(msg,member);
			int count = projectService.selectAllCount(msg,member);
			result.put("total", count);
			result.put("rows", lists);
			result.put("success", true);
			result.put("message", "查询成功");
		} catch (Exception e) {
			result.put("rows", null);
			result.put("success", false);
			result.put("message", "没有查到相关项目，请重新输入");
		}
		return result;
		
	}
	
	//根据项目的id，查找项目对应的委托信息以及文件
	@RequestMapping("/getEntrustFileInfo.ajax")
	public @ResponseBody Map<String, Object> getEntrustFileInfo(int proId) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<TFileForm> tFileForm = projectService.selectEntrustFileByProjectId(proId);
		
		result.put("tFileForm", tFileForm);
		result.put("length", tFileForm.size());

		return result;
		
	}
	//根据项目id查找子项目详细信息
	@RequestMapping(value="/viewProject.ajax", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody Map<String, Object> viewProject(@RequestParam("proId")int proId) {
	
		System.out.println("testview");
		Map<String, Object> result = new HashMap<String,Object>();
		TProject project = projectService.selectByPrimaryKey(proId);
		result.put("project", project);
		TUser user = tUserMapper.selectByPrimaryKey(project.getProCreateUserId());
		result.put("userName", user.getUserName());
		return result;
		
	}
	
	
	//修改委托信息
	@RequestMapping("/modifyEntrusting.ajax")
	public @ResponseBody Map<String, Object> modifyEntrusting(int proId,TProjectCustom custom,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		custom.gettProject().setProId(proId);
		System.out.println(custom.gettProject().getProId());
		
		Map<String, Object> result = new HashMap<String, Object>(2);
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		try {
			projectService.modifyEntrustingByMsgId(custom,fileMap,username,userId,req);
			result.put("success", true);
			result.put("message", "修改委托信息成功！");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "修改委托信息失败！");
		}
		
		return result;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/getProjectName.ajax", method = { RequestMethod.POST })
	public  String getProjectName(Integer projectId) {
		return projectService.getEncodeProjectNameBymsgId(projectId);
	}
	
	//删除项目
	@RequestMapping(value="/deleteProject.ajax", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody Map<String, Object> deleteProject(@Param("parm")String parm, HttpSession session, HttpServletRequest req) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		try {
			int rows = projectService.delete(parm);
			result.put("success", true);
			result.put("message", "删除项目信息成功！影响行数:" + rows);
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "删除项目信息失败！");
		}
		return result;
	}

}
