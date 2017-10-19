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
import sys.spvisor.core.service.project.BigProjectService;
import sys.spvisor.core.service.project.ProjectService;

@Controller
@RequestMapping("/bigproject")
public class BigProjectController {
	
	@Autowired
	BigProjectService bigProjectService;
	
	
	
	//根据条件查询项目
	@RequestMapping("/queryBigProject.ajax")
	public @ResponseBody Map<String, Object> queryBigProject(String bigName,String userName,int index,int pageSize) {
		Map<String, Object> result = new HashMap<String, Object>(3);
		List<TBigProject> lists = null;
		try {
			lists = bigProjectService.selectByExample(bigName,userName,index,pageSize);
			int count = bigProjectService.selectAllCount();
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
	
	@RequestMapping("/getSmallProjectsByBigId.ajax")
	public @ResponseBody Map<String, Object> getSmallProjectsByBigId(int bigProId) {
		Map<String, Object> result = new HashMap<String, Object>(3);
		List<TProject> lists = null;
		try {
			lists = bigProjectService.getSmallProjectsByBigId(bigProId);
			result.put("total", lists.size());
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
	
	//根据项目id查找子项目详细信息
	@RequestMapping(value="/viewProject.ajax", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody Map<String, Object> viewProject(@RequestParam("proId")int proId) {
	
		System.out.println("testview");
		Map<String, Object> result = new HashMap<String,Object>();
		/*TProject project = projectService.selectByPrimaryKey(proId);
		result.put("project", project);
		TUser user = tUserMapper.selectByPrimaryKey(project.getProCreateUserId());
		result.put("userName", user.getUserName());*/
		return result;
		
	}
	
	@RequestMapping("/insertProjectMoney.ajax")
	public @ResponseBody Map<String, Object> insertProjectMoney(int proId,double money,int bigProId) {
		Map<String, Object> result = new HashMap<String,Object>();
		int influenceRows  = bigProjectService.insertBalance(proId, money, bigProId);
		
		if(influenceRows != 0 ) {
			result.put("success", true);
		}else {
			result.put("success", false);
		}
		return result;
	}
	
	
	
	
	

}
