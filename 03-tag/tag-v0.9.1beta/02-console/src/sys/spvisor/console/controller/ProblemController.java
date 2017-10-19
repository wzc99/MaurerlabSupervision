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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TQuestion;
import sys.spvisor.core.entity.project.TQuestionUser;
import sys.spvisor.core.service.project.ProblemService;

@Controller
@RequestMapping("/question")
public class ProblemController {
	@Autowired
	ProblemService problemService; 
	
	@RequestMapping("/addQuestion.ajax")
	public @ResponseBody Map<String,Object> addQuestion(@Param("proId") int proId,TQuestion record,String fileNametotal,String picNameTotal,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		int rows = problemService.addQuetion(record,fileNametotal,picNameTotal,fileMap,username,userId,req,proId);
		//problemService.addPicAndFile(filesAndPic);
		if(rows != 0) {
			result.put("message", "添加问题成功");
			result.put("success", true);
		} else {
			result.put("message", "添加问题失败");
			result.put("success", false);
		}
		return result;
	}
	
	@RequestMapping("/updateQuestion.ajax")
	public @ResponseBody Map<String,Object> updateQuestion(@Param("proId") int proId,TQuestion record,String fileNametotal,String picNameTotal,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		int rows = problemService.updateQuestion(record,fileNametotal,picNameTotal,fileMap,username,userId,req,proId);
		//problemService.addPicAndFile(filesAndPic);
		if(rows != 0) {
			result.put("message", "修改问题成功");
			result.put("success", true);
		} else {
			result.put("message", "修改问题失败");
			result.put("success", false);
		}
		return result;
	}
	
	@RequestMapping(value="/findQuestionsByProId.ajax", method = { RequestMethod.POST }) 
	public @ResponseBody Map<String,Object> findQuestionsByProId(int proId) {
		Map<String,Object> result = new HashMap<String,Object>();
		List<TQuestionUser> lists = problemService.findQuestionsByProId(proId);
		result.put("size", lists.size());
		result.put("lists", lists);
		return result;
	}
	
	@RequestMapping(value="/viewQuestion.ajax",method = {RequestMethod.POST})
	public @ResponseBody TQuestion viewQuestion(int qusId) {
		TQuestion question = problemService.getQuestionByQueId(qusId);
		return question;
		
	}
	
	@RequestMapping(value="/viewQuestionPic.ajax",method = {RequestMethod.POST})
	public @ResponseBody Map<String, Object> viewQuestionPic(int qusId) {
		Map<String, Object> result = new HashMap<String, Object>();
		problemService.selectPic(qusId);
		List<TFileForm> tFileForm = problemService.selectPic(qusId);
		result.put("tFileForm", tFileForm);
		return result;
		
	}
	
	@RequestMapping(value="/viewQuestionFile.ajax",method = {RequestMethod.POST})
	public @ResponseBody Map<String, Object> viewQuestionFile(int qusId) {
		Map<String, Object> result = new HashMap<String, Object>();
		problemService.selectPic(qusId);
		List<TFileForm> tFileForm = problemService.selectFiles(qusId);
		result.put("tFileForm", tFileForm);
		result.put("length", tFileForm.size());
		return result;
		
	}
}
