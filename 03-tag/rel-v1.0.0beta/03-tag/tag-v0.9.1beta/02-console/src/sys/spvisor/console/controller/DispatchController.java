package sys.spvisor.console.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sys.spvisor.core.common.ModifyPeopleException;
import sys.spvisor.core.common.PermissionException;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TSendCard;
import sys.spvisor.core.service.people.PeopleService;
import sys.spvisor.core.service.project.DispatchService;
import sys.spvisor.core.service.project.ProjectService;


@Controller
@RequestMapping("/dispatch")
public class DispatchController {
	
	@Autowired
	private DispatchService dispatchService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private PeopleService peopleService;
	@Autowired
	private TUserMapper userMapper;
	
/*	@RequestMapping("/selectByStationStatus.ajax")	
	public @ResponseBody List<PeopleProjectBigClass> selectByStationStatus() {
		
		List<PeopleProjectBigClass> lists = dispatchService.selectPeople();
		return lists;
	}*/
	
/*	@Transactional
	@RequestMapping("/dispatchGroupLeaderAndMember.ajax")    
   	public @ResponseBody Map<String, Object> dispatchGroupLeaderAndMember(Integer projectId,String projectGroupLeader,String projectGroupLeaderId,String projectMember_total, String projectMemberId_total) {
   		Map<String, Object> result = new HashMap<String, Object>(2);
   		List<TProjectPeople> groupLeader = new ArrayList<TProjectPeople>();
   		List<TProjectPeople> members = new ArrayList<TProjectPeople>();
   		TProject project = projectService.selectByPrimaryKey(projectId);
   		Date inProTime = project.getBegintime();
   		try {
   			if(projectGroupLeaderId != null && !projectGroupLeaderId.equals("")){
   	   			TProjectPeople groupLeader1 = new TProjectPeople();
   	   			groupLeader1.setPpInProTime(inProTime);
   	   			groupLeader1.setPpProId(projectId);
   	   			groupLeader1.setPpUserId(Integer.valueOf(projectGroupLeaderId));
   	   			groupLeader1.setPpProRoleId("监理组长");
   	   			groupLeader1.setPpStatus("O");
   	   			groupLeader1.setPpUsername(projectGroupLeader);
   	   			groupLeader.add(groupLeader1);
   	   		}
   	   		String[] memberName = projectMember_total.split("&");
   	   		String[] memberId = projectMemberId_total.split("&");
   	   		if(memberName.length != memberId.length){
   	   			System.out.println("监理员id数目和姓名数目不一致！");
   	   			throw new Exception();
   	   		}
   	   		if(memberId != null && memberId.length > 0 && !memberId[0].equals("")){
   	   			for(int i = 0; i < memberId.length; i++){
   	   				if(memberId[i].equals("#"))
   	   					continue;
   	   				else{
   	   					TProjectPeople member = new TProjectPeople();
   	   					member.setPpInProTime(inProTime);
   	   					member.setPpProId(projectId);
   	   					member.setPpUserId(Integer.valueOf(memberId[i]));
   	   					member.setPpProRoleId("监理员");
   	   					member.setPpStatus("O");
   	   					member.setPpUsername(memberName[i]);
   	   					members.add(member);
   	   				}
   	   			}
   	   		}
   	   		
   			dispatchService.dispatchGroupLeaderAndMemberByProjectIdAndPost(projectId,"监理组长",groupLeader);
   			dispatchService.dispatchGroupLeaderAndMemberByProjectIdAndPost(projectId,"监理员",members);
			result.put("success", true);
			result.put("message", "派遣成功！");
		} catch (PermissionException e) {
			result.put("success", false);
			result.put("message", e.getMessage());
		}catch (ModifyPeopleException e) {
			result.put("success", false);
			result.put("message", e.getMessage());
		}catch (Exception e) {
			result.put("success", false);
			result.put("message", "派遣失败！");
		}
   		return result;
   		
   	}*/
	@Transactional
	@RequestMapping("/getPeopleByProjectId.ajax")	
	public @ResponseBody Map<String,Object> getPeopleByProjectId(Integer projectId) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<TProjectPeople> lists1 = dispatchService.getPeopleByProjectIdAndPostId(projectId,10);
		List<String> nameLists1 = new ArrayList<String>();
		for(TProjectPeople tpp : lists1){
			nameLists1.add(userMapper.selectByPrimaryKey(tpp.getPpUserId()).getUserName());
		}
		result.put("projectChiefName", nameLists1);
		result.put("projectChief", lists1);
		List<TProjectPeople> lists2 = dispatchService.getPeopleByProjectIdAndPostId(projectId,11);
		List<String> nameLists2 = new ArrayList<String>();
		for(TProjectPeople tpp : lists2){
			nameLists2.add(userMapper.selectByPrimaryKey(tpp.getPpUserId()).getUserName());
		}
		result.put("projectManagerName", nameLists2);
		result.put("projectManager", lists2);
		List<TProjectPeople> lists3 = dispatchService.getPeopleByProjectIdAndPostId(projectId,12);
		List<String> nameLists3 = new ArrayList<String>();
		for(TProjectPeople tpp : lists3){
			nameLists3.add(userMapper.selectByPrimaryKey(tpp.getPpUserId()).getUserName());
		}
		result.put("groupLeaderName", nameLists3);
		result.put("groupLeader", lists3);
		List<TProjectPeople> lists4 = dispatchService.getPeopleByProjectIdAndPostId(projectId,13);
		List<String> nameLists4 = new ArrayList<String>();
		for(TProjectPeople tpp : lists4){
			nameLists4.add(userMapper.selectByPrimaryKey(tpp.getPpUserId()).getUserName());
		}
		result.put("memberName", nameLists4);
		result.put("member", lists4);
		return result;
	}
	@Transactional
	@RequestMapping("/getGroupLeaderAndMemberByProjectId.ajax")
	public @ResponseBody Map<String,Object> getGroupLeaderAndMemberByProjectId(Integer projectId) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<TProjectPeople> lists1 = dispatchService.getPeopleInProByProjectIdAndPost(projectId,"groupLeader");
		List<TProjectPeople> lists2 = dispatchService.getPeopleInProByProjectIdAndPost(projectId,"member");
		TUser groupLeader = null;
		String members = "";
		if(lists1.size() > 0){
			groupLeader = userMapper.selectByPrimaryKey(lists1.get(0).getPpUserId());
		}
		for(TProjectPeople member : lists2){
			members += userMapper.selectByPrimaryKey(member.getPpUserId()).getUserName()+"，";
		}
		if(members.endsWith("，"))
			members = members.substring(0, members.length()-1);
		if(groupLeader == null)
			result.put("groupLeader", "");
		else
			result.put("groupLeader", groupLeader.getUserName());
		result.put("members", members);

		return result;
	}
	@Transactional
	@RequestMapping("/saveProjectPeople.ajax")	
	public @ResponseBody Map<String,Object> saveProjectPeopleByProjectIdAndPost(Integer projectId,String post,String[] projectPeopleId,String[] peopleId,String[] inProjectDate,String[] outProjectDate,HttpSession session) {
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String, Object> result = new HashMap<String, Object>();
		List<TProjectPeople> tProjectPeoples = new ArrayList<TProjectPeople>();
		int postId = -1;
		if(post.equals("projectChief"))
			postId = 10;
		else if(post.equals("projectManager"))
			postId = 11;
		else if(post.equals("groupLeader"))
			postId = 12;
		else if(post.equals("member"))
			postId = 13;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); 
		TProjectPeople tProjectPeople;
		try {
			for(int i = 1;i < peopleId.length; i++){//从1开始是因为第0个没用，只是为了使数组size大于1
				/*if(peopleId[i].length() <= 0 || inProjectDate[i].length() <= 0){
					throw new ModifyPeopleException("姓名和进入项目日期是必填项！");
				}*/
				tProjectPeople = new TProjectPeople();
				if(projectPeopleId != null && i < projectPeopleId.length)
					tProjectPeople.setProjectPeopleId(Integer.valueOf(projectPeopleId[i]));
				tProjectPeople.setPpProId(projectId);
				tProjectPeople.setPpProRoleId(postId);
				tProjectPeople.setPpUserId(Integer.valueOf(peopleId[i]));
				if(inProjectDate[i]!=null && inProjectDate[i].length() > 0)
					tProjectPeople.setPpInProTime(new Date(sf.parse(inProjectDate[i]).getTime()));
				if(outProjectDate[i].equals("")){
					tProjectPeople.setPpOutProTime(null);
					tProjectPeople.setPpStatus("O");
				}
				else{
					if(sf.parse(outProjectDate[i]).after(new java.util.Date()))
						throw new ModifyPeopleException("离开项目日期不能晚于当天！");
					else{
						tProjectPeople.setPpOutProTime(new Date(sf.parse(outProjectDate[i]).getTime()));
						tProjectPeople.setPpStatus("C");
					}
				}
				tProjectPeoples.add(tProjectPeople);
			}
			String projectName = projectService.selectByPrimaryKey(projectId).getProjectName();
			dispatchService.saveProjectPeopleByProjectId(projectId,tProjectPeoples,userId,postId,projectName);
			result.put("success", true);
			result.put("message", "保存成功！");
		} catch (ModifyPeopleException e) {
			result.put("success", false);
			result.put("message", e.getMessage());
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "保存失败！");
		}
		return result;
	}
	
	@Transactional
	@RequestMapping("/deleteByProjectPeopleId.ajax")    
   	public @ResponseBody Map<String, Object> deleteByProjectPeopleId(Integer projectPeopleId,HttpSession session) {
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String, Object> result = new HashMap<String, Object>(2);
   		try {
   			TProjectPeople pp = dispatchService.selectByProjectPeopleId(projectPeopleId);
   			String projectName = projectService.selectByPrimaryKey(pp.getPpProId()).getProjectName();
   			dispatchService.deleteByProjectPeopleId(projectPeopleId,pp.getPpProId(),projectName,userId,pp.getPpUserId());
			result.put("success", true);
			result.put("message", "删除成功！");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "删除失败！");
		}
   		return result;
   		
   	}
	@Transactional
	@RequestMapping("/getDispatchFileInfo.ajax")
	public @ResponseBody Map<String,Object> getDispatchFileInfo(Integer proId) {
		Map<String, Object> result = new HashMap<String, Object>();
        List<TFileForm> tFileForm = dispatchService.selectDispatchFileByProjectId(proId);
		result.put("tFileForm", tFileForm);
		result.put("length", tFileForm.size());
		return result;
	}
	
	@Transactional
	@RequestMapping("/getSendCardInfo.ajax")
	public @ResponseBody Map<String,Object> getSendCardInfo(Integer projectId) {
		Map<String, Object> result = new HashMap<String, Object>();
		TProject project = projectService.selectByPrimaryKey(projectId);
		result.put("project", project);
		List<TProjectPeople> tpp1 = dispatchService.getPeopleInProByProjectIdAndPost(projectId, "projectManager");//经理
		List<TProjectPeople> tpp2 = dispatchService.getPeopleInProByProjectIdAndPost(projectId, "groupLeader");
		List<TProjectPeople> tpp3 = dispatchService.getPeopleInProByProjectIdAndPost(projectId, "member");
		List<TSendCard> sendCards = dispatchService.getSendCardByProjectId(projectId);
		TUser projectManager = null;
		TUser groupLeader = null;
		TSendCard sendCard = null;
		String members = "";
		if(tpp1.size() > 0){
			projectManager = userMapper.selectByPrimaryKey(tpp1.get(0).getPpUserId());
		}
		if(tpp2.size() > 0){
			groupLeader = userMapper.selectByPrimaryKey(tpp2.get(0).getPpUserId());
		}
		for(TProjectPeople member : tpp3){
			String professionalQualification = "";
			TUser m = userMapper.selectByPrimaryKey(member.getPpUserId());
			if(m.getUserProfessionalQualification()!=null && m.getUserProfessionalQualification().length()>0)
				professionalQualification = "("+m.getUserProfessionalQualification()+")";
			members += m.getUserName()+professionalQualification+"，";
		}
		if(members.endsWith("，"))
			members = members.substring(0, members.length()-1);

		TUser tManagerLeader = null;
		TUser tBianzhi = null;
		TUser tShenpi = null;
		if(sendCards.size() > 0){
			sendCard = sendCards.get(0);
			tManagerLeader = userMapper.selectByPrimaryKey(sendCard.gettManagerLeader());
			tBianzhi = userMapper.selectByPrimaryKey(sendCard.gettBianzhiId());
			tShenpi = userMapper.selectByPrimaryKey(sendCard.gettShenpiId());
		}
		result.put("projectManager", projectManager);
		result.put("groupLeader", groupLeader);
		result.put("members", members);
		result.put("sendCard", sendCard);
		result.put("tManagerLeader", tManagerLeader);
		result.put("tBianzhi", tBianzhi);
		result.put("tShenpi", tShenpi);
		return result;
	}
	
	@Transactional
	@RequestMapping("/submitFileAndSendcard.ajax")    
   	public @ResponseBody Map<String, Object> submitFileAndSendcard(Integer projectId,String fileNameTotal,TSendCard sendCard, MultipartHttpServletRequest request,HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		Map<String, Object> result = new HashMap<String, Object>(2);
   		try {
   			dispatchService.submitFileAndSendcard(projectId, fileNameTotal, sendCard, fileMap, username, userId,req);
			result.put("success", true);
			result.put("message", "提交成功！");
		} catch (IOException e) {
			result.put("success", false);
			result.put("message", "文件上传失败!");
		} catch(PermissionException e){
			result.put("success", false);
			result.put("message", e.getMessage());
		}catch (Exception e) {
			result.put("success", false);
			result.put("message", "提交失败！");
		}
   		return result;
   		
   	}
	@Transactional
	@RequestMapping("/generateDispatchForm.ajax")
	public void generateDispatchForm(Integer projectId, HttpServletRequest request, HttpServletResponse response) throws IOException{
        //生成
		String filename = "pqd"+(int)(Math.random()*10000+1)+".docx";
		File fileDir = new File(request.getSession().getServletContext().getRealPath("upload"));
		
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}
		System.out.println(fileDir +"//"+ fileDir);
		
		dispatchService.generate(projectId,request,response,filename);
		//File outFile = new File(fileDir,filename); //导出文件   
		//下载
        //设置文件MIME类型  
        response.setContentType("multipart/form-data");  
        //设置Content-Disposition  
        response.setHeader("Content-Disposition", "attachment;filename="+filename);  
        //读取目标文件，通过response将目标文件写到客户端  
        //读取文件  
        String fullFileName = request.getSession().getServletContext().getRealPath("upload")+System.getProperty("file.separator")+filename;
        System.out.println(fullFileName);
        InputStream in = new FileInputStream(fullFileName);  
        OutputStream resOut = response.getOutputStream();
          
        //写文件  
        int b;  
        while((b=in.read())!= -1)  
        {  
        	resOut.write(b);  
        }  
          
        in.close();  
        resOut.close();
        //if(outFile.exists())
        	//outFile.delete();
	}
	
}
