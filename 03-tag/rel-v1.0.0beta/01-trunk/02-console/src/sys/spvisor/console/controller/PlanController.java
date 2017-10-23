package sys.spvisor.console.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sys.spvisor.core.common.PermissionException;
import sys.spvisor.core.common.PlanChoosePeopleException;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.project.PeopleProjectBigClass;
import sys.spvisor.core.entity.project.ProjectPlanCustom;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.service.project.PlanService;


@Controller
@RequestMapping("/plan")
public class PlanController {

	@Autowired
	PlanService planService;
	
	@RequestMapping("/getChiefAndManager.ajax")	
	public @ResponseBody Map<String, String> getChiefAndManager(Integer proId) {
		return planService.getChiefAndManagerByMsgId(proId);
	}
	
	@RequestMapping("/getPlanFileInfo.ajax")
	public @ResponseBody Map<String, Object> getPlanFileInfo(Integer proId) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<TFileForm> tFileForm = planService.selectPlanFileByProjectId(proId);
		
		result.put("tFileForm", tFileForm);
		result.put("length", tFileForm.size());

		return result;
		
	}
	
	@RequestMapping("/selectByStationStatus.ajax")	
	public @ResponseBody List<PeopleProjectBigClass> selectByStationStatus() {
		
		List<PeopleProjectBigClass> lists = planService.selectPeople();
		return lists;
	}
	
/*	@RequestMapping("/submitPlanPeople.ajax")	
	public @ResponseBody Map<String,Object> submitPlanPeople(@RequestParam("projectId")Integer projectId, 
			                                                   @RequestParam("projectChief_peoName") String projectChief_peoName, @RequestParam("projectChief_peoId") Integer projectChief_peoId,
			                                                   @RequestParam("projectManager_peoName") String projectManager_peoName, @RequestParam("projectManager_peoId") Integer projectManager_peoId) {
		
	public @ResponseBody Map<String,Object> submitPlanPeople(@RequestParam("projectId")Integer projectId, 
            @RequestParam("projectChief") TPeople projectChief, @RequestParam("projectManager") TPeople projectManager){
		Map<String, Object> result = new HashMap<String, Object>(2);
		TUser projectChief = new TUser();
		projectChief.setUserId(projectChief_peoId);
		projectChief.setUserName(projectChief_peoName);
		TUser projectManager = new TUser();
		projectManager.setUserId(projectManager_peoId);
		projectManager.setUserName(projectManager_peoName);
		try {
			planService.dispatchPlanPeople(projectId, "项目总监", projectChief);
			planService.dispatchPlanPeople(projectId, "项目经理", projectManager);
			result.put("success", true);
			result.put("message", "提交成功");
		} catch(PlanChoosePeopleException e){
			result.put("success", false);
			result.put("message", e.getMessage());
		} 
		return result;
	}
	*/
	
	@RequestMapping(value="/submitPlanFile.ajax")
	public @ResponseBody Map<String,Object> submitPlanFile(@RequestParam("projectId")Integer projectId,ProjectPlanCustom custom,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String, Object> result = new HashMap<String, Object>(2);
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		
		try {
			planService.pushPlanFile(projectId, custom, fileMap, username, userId,req);
			result.put("success", true);
			result.put("message", "提交成功");
		} catch (IOException e) {
			result.put("success", false);
			result.put("message", "文件上传失败!");
		}  catch(PermissionException e){
			result.put("success", false);
			result.put("message", e.getMessage());
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "提交失败！");
		}
		return result;
		
	}
	
}
