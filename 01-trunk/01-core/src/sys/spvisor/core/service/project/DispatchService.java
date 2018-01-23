package sys.spvisor.core.service.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.codec.binary.Base64;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
//import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import sys.spvisor.core.util.WordUtil;
import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.common.PermissionException;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.project.TFileCheckProcessMapper;
import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.dao.project.TProjectMapper;
import sys.spvisor.core.dao.project.TProjectPeopleMapper;
import sys.spvisor.core.dao.project.TSendCardMapper;



import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.message.TMessage;
import sys.spvisor.core.entity.project.TFileCheckProcess;
import sys.spvisor.core.entity.project.TFileCheckProcessExample;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TFileFormExample;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;
import sys.spvisor.core.entity.project.TSendCard;
import sys.spvisor.core.entity.project.TSendCardExample;
import sys.spvisor.core.service.message.TextMessageService;
import sys.spvisor.core.util.DispatchWord;

@Service
public class DispatchService {
	
	@Autowired 
	TProjectMapper tProjectMapper;
	@Autowired
	TUserMapper tUserMapper;
	@Autowired
	TProjectPeopleMapper projectPeopleMapper;
	@Autowired
	TFileFormMapper fileFormMapper;
	@Autowired
	TFileCheckProcessMapper tFileCheckProcessMapper;
	@Autowired
	TSendCardMapper tSendCardMapper;
	@Autowired
	TextMessageService textMessageService;
	//人员派遣选人
/*	@Transactional
	public List<PeopleProjectBigClass> selectPeople() {
		List<PeopleProjectBigClass> result = new ArrayList<PeopleProjectBigClass>();
		TPeopleExample tPeopleExample = new TPeopleExample();
		Criteria criteria1 = tPeopleExample.createCriteria();
		criteria1.andPeoStationDescLike("%待岗");
		List<TPeople> list1 = tPeopleMapper.selectByExample(tPeopleExample);
		tPeopleExample.clear();
		
		Criteria criteria2 = tPeopleExample.createCriteria();
		criteria2.andPeoStationDescEqualTo("休假");
		List<TPeople> list2 = tPeopleMapper.selectByExample(tPeopleExample);
		tPeopleExample.clear();
		
		Criteria criteria3 = tPeopleExample.createCriteria();
		criteria3.andPeoStationDescNotLike("%待岗");
		criteria3.andPeoStationDescNotEqualTo("休假");
		criteria3.andPeoStationDescNotEqualTo("离职");
		List<TPeople> list3 = tPeopleMapper.selectByExample(tPeopleExample);
		tPeopleExample.clear();
		
		list1.addAll(list2);
		list1.addAll(list3);
		//与项目人员表连接找所在项目
		for(TPeople tPeople : list1){
			PeopleProjectBigClass peoProBigCla = new PeopleProjectBigClass();
			peoProBigCla.setPeople(tPeople);
			TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
			sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tProjectPeopleCriteria = tProjectPeopleExample.createCriteria();
			tProjectPeopleCriteria.andPpPeopleidEqualTo(tPeople.getPeoId());
			List<TProjectPeople> tProjectPeopleList = projectPeopleMapper.selectByExample(tProjectPeopleExample);
			tProjectPeopleExample.clear();
			if(tProjectPeopleList.size() == 0){
				result.add(peoProBigCla);
			}
			else{
				peoProBigCla.setProjectPeople(tProjectPeopleList.get(0));
				Integer proId = tProjectPeopleList.get(0).getPpMsgid();
				TProjectExample tProjectExample = new TProjectExample();
				sys.spvisor.core.entity.project.TProjectExample.Criteria tProjectCriteria = tProjectExample.createCriteria();
				tProjectCriteria.andProIdEqualTo(proId);
				List<TProject> tProjects = tProjectMapper.selectByExample(tProjectExample);
				tProjectExample.clear();
				if(tProjects.size() > 0){
					peoProBigCla.setProject(tProjects.get(0));
				}
				result.add(peoProBigCla);	
			}
		}
		return result;
	}*/
	
	@Transactional
	public List<TProjectPeople> getPeopleByProjectIdAndPostId(Integer projectId,int postId) {
		TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria = tProjectPeopleExample.createCriteria();
		
		criteria.andPpProIdEqualTo(projectId);
		criteria.andPpProRoleIdEqualTo(postId);
		return projectPeopleMapper.selectByExample(tProjectPeopleExample);
	}
	
	@Transactional
	public List<TProjectPeople> getPeopleInProByProjectIdAndPost(Integer projectId,String post) {
		TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria = tProjectPeopleExample.createCriteria();
		int postId = -1;
		if(post.equals("projectChief"))
			postId = 10;
		else if(post.equals("projectManager"))
			postId = 11;
		else if(post.equals("groupLeader"))
			postId = 12;
		else if(post.equals("member"))
			postId = 13;
		criteria.andPpProIdEqualTo(projectId);
		criteria.andPpProRoleIdEqualTo(postId);
		criteria.andPpStatusEqualTo("O");
		return projectPeopleMapper.selectByExample(tProjectPeopleExample);
	}
	
/*	@Transactional
	public void dispatchGroupLeaderAndMemberByProjectIdAndPost(Integer projectId,String post,List<TProjectPeople> tProjectPeoples) throws PermissionException, ModifyPeopleException {
		//先获取项目开始时间
		TProject tProject = tProjectMapper.selectByPrimaryKey(projectId);
		Date date = tProject.getBegintime();
		if(new java.util.Date().getTime() > date.getTime())
			throw new PermissionException("项目已开始，无法派遣，请到人员变更模块进行人员变更！");
		if(projectId != null && tProjectPeoples != null){
			TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
			sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria = tProjectPeopleExample.createCriteria();
			criteria.andPpProIdEqualTo(projectId);
			criteria.andPpProRoleIdEqualTo(post);
			List<TProjectPeople> existProjectPeoples = projectPeopleMapper.selectByExample(tProjectPeopleExample);
			boolean[] flag = new boolean[existProjectPeoples.size()];
			for(TProjectPeople tProjectPeople : tProjectPeoples){
				int i = 0;
				for(i = 0; i< existProjectPeoples.size(); i++){
					if(tProjectPeople.getPpPeopleid() == existProjectPeoples.get(i).getPpPeopleid()){
						flag[i] = true;
						break;
					}
				}
				//insert
				if(i == existProjectPeoples.size()){
					projectPeopleMapper.insert(tProjectPeople);
				}
			}
			for(int i = 0; i< existProjectPeoples.size(); i++){
				if(flag[i] == false)
					projectPeopleMapper.deleteByPrimaryKey(existProjectPeoples.get(i).getProjectPeopleId());
			}
			
		}
		else{
			throw new ModifyPeopleException("派遣失败");
		}
	}
	*/
	@Transactional
	public void saveProjectPeopleByProjectId(Integer projectId,List<TProjectPeople> tProjectPeoples,long userId,Integer postId,String projectName){
		for(TProjectPeople tProjectPeople : tProjectPeoples){
			if(tProjectPeople.getProjectPeopleId() == null){
				//insert
				projectPeopleMapper.insert(tProjectPeople);
				//给他发消息
				TMessage message = new TMessage();
				message.setMsgTitle("派遣消息");
				message.setMsgSumitId((int)userId);
				message.setMsgSubmitTime(new Date(new java.util.Date().getTime()));
				String post = "";
				if(postId == 10)
					post = "项目总监";
				else if(postId == 11)
					post = "项目经理";
				else if(postId == 12)
					post = "监理组长";
				else if(postId == 13)
					post = "监理员";
					
				message.setMsgContent("您被派遣为"+projectName+"项目的"+post+"。");
				List<Integer> URID = new ArrayList<Integer>();
				URID.add(tProjectPeople.getPpUserId());
				textMessageService.insertTextMessage(message, projectId, false, URID);
			}
			
			//update
			else{
				projectPeopleMapper.updateByPrimaryKey(tProjectPeople);
				if(tProjectPeople.getPpStatus().equals("C")){
					//给他发消息
					TMessage message = new TMessage();
					message.setMsgTitle("离开项目消息");
					message.setMsgSumitId((int)userId);
					message.setMsgSubmitTime(new Date(new java.util.Date().getTime()));
					message.setMsgContent("您已离开"+projectName+"项目。");
					List<Integer> URID = new ArrayList<Integer>();
					URID.add(tProjectPeople.getPpUserId());
					textMessageService.insertTextMessage(message, projectId, false, URID);
					
				}
			}
			
			
			
		}
	}
	
	public TProjectPeople selectByProjectPeopleId(Integer projectPeopleId){
		return projectPeopleMapper.selectByPrimaryKey(projectPeopleId);
		
	}
	public void deleteByProjectPeopleId(Integer projectPeopleId,Integer projectId,String projectName,long fromUserId,Integer toUserId){
		projectPeopleMapper.deleteByPrimaryKey(projectPeopleId);
		//给他发消息
		TMessage message = new TMessage();
		message.setMsgTitle("项目中的记录被删除");
		message.setMsgSumitId((int)fromUserId);
		message.setMsgSubmitTime(new Date(new java.util.Date().getTime()));
		message.setMsgContent("您在"+projectName+"项目中的记录被删除。");
		List<Integer> URID = new ArrayList<Integer>();
		URID.add(toUserId);
		textMessageService.insertTextMessage(message, projectId, false, URID);
	}

	@Transactional
	public List<TFileForm> selectDispatchFileByProjectId(Integer projectId){
		List<TFileForm> TFileForms = new ArrayList<TFileForm>();
		if(projectId == null)
			return TFileForms;
		TFileFormExample example = new  TFileFormExample();
		sys.spvisor.core.entity.project.TFileFormExample.Criteria criteria = example.createCriteria();
		criteria.andFileFormProjectIdEqualTo(projectId);
		criteria.andFileFormTypeEqualTo("Dispatch");
		List<TFileForm> selectTFileForms = fileFormMapper.selectByExample(example);
		example.clear();
		addExistsFile("技术交底会议纪要",selectTFileForms,TFileForms);
		//往TFileForms添加可有文件
		for(TFileForm tFileForm : selectTFileForms){
			TFileForms.add(tFileForm);
		}
		return TFileForms;
	}
	//往TFileForms添加必有文件
	private void addExistsFile(String fileName,List<TFileForm> selectTFileForms,List<TFileForm> TFileForms){
		for(TFileForm tFileForm : selectTFileForms){
			if(tFileForm.getFileFormName().equals(fileName)){
				TFileForms.add(tFileForm);
				selectTFileForms.remove(tFileForm);
				return;
			}
		}
		TFileForm fileForm = new TFileForm();
		fileForm.setFileFormName(fileName);
		TFileForms.add(fileForm);
	}
	
	
	@Transactional
	public List<TSendCard> getSendCardByProjectId(Integer projectId) {
		TSendCardExample tSendCardExample = new TSendCardExample();
		sys.spvisor.core.entity.project.TSendCardExample.Criteria criteria = tSendCardExample.createCriteria();
		criteria.andTSendProjectIdEqualTo(projectId);
		return tSendCardMapper.selectByExample(tSendCardExample);
	}
	@Transactional
	public void submitFileAndSendcard(Integer projectId, String fileNameTotal,TSendCard sendCard, Map<String, MultipartFile> fileMap,String userName,long userId,HttpServletRequest request) throws PermissionException, IOException{
		String[] name = fileNameTotal.split("&");
		//文件上传
		int index = 0;
		TFileFormExample tFileFormExample = new TFileFormExample();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf 	= entity.getValue();
			//System.out.println(mf.getOriginalFilename());
			if(!mf.getOriginalFilename().equals("")){
				//判断上传文件里有没有此文件
				sys.spvisor.core.entity.project.TFileFormExample.Criteria ifExistCriteria = tFileFormExample.createCriteria();
				ifExistCriteria.andFileFormTypeEqualTo("Dispatch");
				ifExistCriteria.andFileFormNameEqualTo(name[index]);
				ifExistCriteria.andFileFormProjectIdEqualTo(projectId);
				List<TFileForm> fileForms = fileFormMapper.selectByExample(tFileFormExample);
				tFileFormExample.clear();
				//若没有
				if(fileForms.size() == 0){
					TFileForm tff = new TFileForm();
					tff.setFileFormFilename(mf.getOriginalFilename());
					File targetFile = AutoCreateFileName.createFileName(request, mf, projectId);
					//设置存放的服务器路径
					tff.setFileFormPath(targetFile.getName());
					tff.setFileFormName(name[index]);
					tff.setFileFormPeople(userName);
					tff.setFileFormUserId((int)userId);
					tff.setFileFormDate(new Date(new java.util.Date().getTime()));
					tff.setFileFormType("Dispatch");
					tff.setFileFormProjectId(projectId);
					//tff.setFileFormCurrentStatus("W");
					tff.setFileFormCurrentStatus("W");
					tff.setFileFormCurrentStatusNum(0);
					tff.setFileFormNotpassTimes(0);
					fileFormMapper.insert(tff);
					//刚上传的文件状态默认待审核，后面判断是否需要审核，若不需要则改为已上传
					changeStatusIfNoNeedCheck("Dispatch",name[index],tff);
					
				}
				//若有
				//判断是否审核未通过或者已上传，若是则更新
				else {
					TFileForm tff = fileForms.get(0);
					if(tff.getFileFormCurrentStatus().equals("W")||tff.getFileFormCurrentStatus().equals("P"))
						throw new PermissionException(name[index]+"当前状态已无法操作！");
					else{
						tff.setFileFormFilename(mf.getOriginalFilename());
						AutoCreateFileName.updateFileName(request, mf, tff.getFileFormPath(),projectId);

						tff.setFileFormName(name[index]);
						tff.setFileFormPeople(userName);
						tff.setFileFormUserId((int)userId);
						tff.setFileFormDate(new Date(new java.util.Date().getTime()));
						tff.setFileFormProjectId(projectId);
						//tff.setFileFormCurrentStatus("W");
						tff.setFileFormCurrentStatus("D");
						tff.setFileFormCurrentStatusNum(0);
						if(tff.getFileFormCurrentStatus().equals("D"))
							tff.setFileFormNotpassTimes(0);
						else{
							tff.setFileFormNotpassTimes(tff.getFileFormNotpassTimes()+1);
						}
						fileFormMapper.updateByPrimaryKey(tff);
						changeStatusIfNoNeedCheck("Dispatch",name[index],tff);
					}
						
				}
			}
			index++;
		}//文件上传结束
		//派遣单上传

		List<TSendCard> sendCards = getSendCardByProjectId(projectId);
		if(sendCards.size() > 0){
			TSendCard sc = sendCards.get(0);
			sc.settManagerLeader(sendCard.gettManagerLeader());
			sc.settSendQualityPlan(sendCard.gettSendQualityPlan());
			sc.settSendGoTime(sendCard.gettSendGoTime());
			sc.settBianzhiId(sendCard.gettBianzhiId());
			sc.settShenpiId(sendCard.gettShenpiId());
			sc.setsubmissions(sendCard.getsubmissions());
			sc.setremarks(sendCard.getremarks());
			tSendCardMapper.updateByPrimaryKey(sc);
		}
		else{
			TSendCardExample tSendCardExample = new TSendCardExample();
            tSendCardExample.createCriteria();
            List<TSendCard> sendCardsAll = tSendCardMapper.selectByExample(tSendCardExample);
            tSendCardExample.clear();
            TSendCard tSendCardLast = null;
            if(sendCardsAll.size() > 0)
            	tSendCardLast = sendCardsAll.get(sendCardsAll.size()-1);
            if(tSendCardLast != null){
            	int yearLast = tSendCardLast.gettSubmitTime().getYear();
            	int year = new java.util.Date().getYear();
            	if(yearLast == year)
            		sendCard.settSendNum(tSendCardLast.gettSendNum()+1);
            	else
            		sendCard.settSendNum(1);
            }
        	else
        		sendCard.settSendNum(1);
            String sendNumStr = "";
            int sendNum = sendCard.gettSendNum();
        if(sendNum < 10)
            	sendNumStr = "00"+sendNum;
            else if(sendNum < 100)
            	sendNumStr = "0"+sendNum;
            sendCard.settSendNumStr(new java.util.Date().getYear()+1900+"-"+sendNumStr);	
            sendCard.settSubmitTime(new Date(new java.util.Date().getTime()));
			sendCard.settSendProjectId(projectId);			
			tSendCardMapper.insert(sendCard);
		}
	}
	
	private void changeStatusIfNoNeedCheck(String belong, String filename, TFileForm fileForm){
		TFileCheckProcessExample tFileCheckProcessExample = new TFileCheckProcessExample();
  		sys.spvisor.core.entity.project.TFileCheckProcessExample.Criteria criteria = tFileCheckProcessExample.createCriteria();
  		criteria.andFileBelongToEqualTo(belong);
  		criteria.andFileNameEqualTo(filename);
  		criteria.andFileCurrentStatusEqualTo(1);
  		List<TFileCheckProcess> fcp = tFileCheckProcessMapper.selectByExample(tFileCheckProcessExample);
  		tFileCheckProcessExample.clear();
  		if(fcp == null || fcp.size() == 0){
  			fileForm.setFileFormCurrentStatus("D");
  			fileFormMapper.updateByPrimaryKey(fileForm);
  		}
  	}
	
	public void generate(Integer projectId,HttpServletRequest request, HttpServletResponse response,String filename){
		Map<String,Object> dataMap=new HashMap<String,Object>();
		getData(dataMap,projectId);
		/*Configuration configuration = new Configuration();
		configuration.setDefaultEncoding("UTF-8");
		//System.out.println(dispatchService.getClass().getResource("").getPath());
		//System.out.println(getClass().getResource("/template/dispatchForm.ftl"));
		//      configuration.setClassForTemplateLoading(getClass(), "/template/");
		//configuration.setDirectoryForTemplateLoading(new File(request.getSession().getServletContext().getRealPath("/")+System.getProperty("file.separator")+"WEB-INF"+System.getProperty("file.separator")+"lib"+System.getProperty("file.separator")+"core.jar!"+System.getProperty("file.separator")+"template"));
		List<TSendCard> s = getSendCardByProjectId(projectId);
		//有派遣单
		if(s.size() > 0){
			TSendCard sc = s.get(0);
			//有照片
			if(tUserMapper.selectByPrimaryKey(sc.gettShenpiId()).getUserPic()!=null){
				//          t = configuration.getTemplate("dispatchForm.ftl");
			//没有照片
			}else {
				//           t = configuration.getTemplate("dispatchForm1.ftl");
			}
		}
		//没有派遣单
		else {
			//           t = configuration.getTemplate("dispatchForm1.ftl");
		}*/
		DispatchWord dispa = new DispatchWord();
		try {
			dispa.testTemplateWrite(request, response, dataMap,filename);
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		/*Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}           
		try {
			//          t.process(dataMap, out); //将填充数据填入模板文件并输出到目标文件   
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//写图片
		 //Map<String, Object> mapAll = new HashMap<String, Object>();
		 
		 List<TSendCard> s = getSendCardByProjectId(projectId);
		//有派遣单
		if(s.size() > 0){
			TSendCard sc = s.get(0);
			//有照片
			if(tUserMapper.selectByPrimaryKey(sc.gettShenpiId()).getUserSignature()!=null){
				//          t = configuration.getTemplate("dispatchForm.ftl");
				System.out.println("分割线-----");
				String picPath = request.getSession().getServletContext().getRealPath(tUserMapper.selectByPrimaryKey(sc.gettShenpiId()).getUserSignature());
				System.out.println(picPath);
				//mapAll.put(WordUtil.IMAGE_ + "image",picPath);
				/*try {
		            WordUtil a = new WordUtil();
		            String dirPath = request.getSession().getServletContext().getRealPath("upload/"+filename);
		            String from = request.getSession().getServletContext().getRealPath("files/templates/Template.docx");
		            String dirPath = request.getSession().getServletContext().getRealPath("files/templates/test.docx");
		            String to = request.getSession().getServletContext().getRealPath("upload/mubiao.docx");
		            a.generateWordFromTemplate(dirPath,dirPath, mapAll);
		            System.out.println(dirPath);
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } catch (InvalidFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				try {
		        	InputStream is = null;
					XWPFDocument document = null;
					is = new FileInputStream(request.getSession().getServletContext().getRealPath("upload/"+filename));
					document = new XWPFDocument(is);
							//new XWPFDocument(POIXMLDocument.openPackage("D:\\Template.docx"));
					Iterator<XWPFTable> itTable = document.getTablesIterator();
					/*while (itTable.hasNext()) {*/
			            XWPFTable table = itTable.next();
			            
			            XWPFTableRow row11 = table.getRow(16);
			           InputStream ip1 = new FileInputStream(picPath);
						XWPFRun picRun1 = row11.getCell(3).getParagraphArray(0).createRun();
						try {
							//picRun1.addPicture(ip1, Document.PICTURE_TYPE_PNG, "", Units.toEMU(230), Units.toEMU(170));
							String houzhui = getPicSuffix(picPath).toLowerCase(); 
							if(houzhui.equals("jpg")||houzhui.equals("jpeg")){
								picRun1.addPicture(ip1, Document.PICTURE_TYPE_JPEG, "", Units.toEMU(100), Units.toEMU(40));
							}else if(houzhui.equals("png")) {
								picRun1.addPicture(ip1, Document.PICTURE_TYPE_PNG, "", Units.toEMU(100), Units.toEMU(40));
							}else if(houzhui.equals("gif")) {
								picRun1.addPicture(ip1, Document.PICTURE_TYPE_GIF, "", Units.toEMU(100), Units.toEMU(40));
							}else if(houzhui.equals("bmp")){
								picRun1.addPicture(ip1, Document.PICTURE_TYPE_BMP, "", Units.toEMU(100), Units.toEMU(40));
							}
							
						} catch (InvalidFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						ip1.close();
						//row11.getCell(1).setText("我的图片1");
						FileOutputStream out;
						String uuid = request.getSession().getServletContext().getRealPath("upload/"+filename);
						out = new FileOutputStream(uuid);
						
						document.write(out);
						document.close();
						out.close();
						is.close();
						
			       // }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//没有照片
			}else {
				//           t = configuration.getTemplate("dispatchForm1.ftl");
			}
		}
		//没有派遣单
		else {
			//           t = configuration.getTemplate("dispatchForm1.ftl");
		}
		  
	}
	public  String getPicSuffix(String img_path){    
	   if (img_path == null || img_path.indexOf(".") == -1){    
	        return ""; //如果图片地址为null或者地址中没有"."就返回""    
	   }    
	   return img_path.substring(img_path.lastIndexOf(".") + 1).    
	          trim().toLowerCase();    
	}
	
	
	private void getData(Map<String, Object> dataMap,Integer projectId) {
		//项目部分
		TProject project = tProjectMapper.selectByPrimaryKey(projectId);
		dataMap.put("project", project.getProjectName()==null?"":project.getProjectName());
		dataMap.put("category", project.getProType()==null?"":project.getProType());
		dataMap.put("unit", project.getProUnit()==null?"":project.getProUnit());
		dataMap.put("telephone", project.getProConntel()==null?"":project.getProConntel());
		dataMap.put("number", project.getProNum()==null?"":project.getProNum());
		dataMap.put("goods", project.getProGoods()==null?"":project.getProGoods());
		dataMap.put("quantity", project.getProGoodsnum()==null?"":project.getProGoodsnum());
		dataMap.put("basis", project.getProBasis()==null?"":project.getProBasis());
		dataMap.put("manufacturer", project.getProFactory()==null?"":project.getProFactory());
		dataMap.put("contact", project.getProFactoryconntel()==null?"":project.getProFactoryconntel());
		dataMap.put("rate", project.getProReportRate()==null?"":project.getProReportRate());
		dataMap.put("way", project.getProReportway()==null?"":project.getProReportway());
		List<TProjectPeople> projectManager = getPeopleInProByProjectIdAndPost(projectId,"projectManager");
		if(projectManager.size()>0){
			dataMap.put("PM", tUserMapper.selectByPrimaryKey(projectManager.get(0).getPpUserId()).getUserName()==null?"":tUserMapper.selectByPrimaryKey(projectManager.get(0).getPpUserId()).getUserName());
			dataMap.put("PMP", tUserMapper.selectByPrimaryKey(projectManager.get(0).getPpUserId()).getUserProfessionalQualification()==null?"":tUserMapper.selectByPrimaryKey(projectManager.get(0).getPpUserId()).getUserProfessionalQualification());
			dataMap.put("PMM", tUserMapper.selectByPrimaryKey(projectManager.get(0).getPpUserId()).getMobile()==null?"":tUserMapper.selectByPrimaryKey(projectManager.get(0).getPpUserId()).getMobile());
		}
		else{
			dataMap.put("PM","");
			dataMap.put("PMP","");
			dataMap.put("PMM","");
		}
		List<TProjectPeople> groupLeader = getPeopleInProByProjectIdAndPost(projectId,"groupLeader");
		if(groupLeader.size()>0){
			dataMap.put("GL", tUserMapper.selectByPrimaryKey(groupLeader.get(0).getPpUserId()).getUserName()==null?"":tUserMapper.selectByPrimaryKey(groupLeader.get(0).getPpUserId()).getUserName());
			dataMap.put("GLP", tUserMapper.selectByPrimaryKey(groupLeader.get(0).getPpUserId()).getUserProfessionalQualification()==null?"":tUserMapper.selectByPrimaryKey(groupLeader.get(0).getPpUserId()).getUserProfessionalQualification());
			dataMap.put("GLM", tUserMapper.selectByPrimaryKey(groupLeader.get(0).getPpUserId()).getMobile()==null?"":tUserMapper.selectByPrimaryKey(groupLeader.get(0).getPpUserId()).getMobile());
		}
		else{
			dataMap.put("GL","");
			dataMap.put("GLP","");
			dataMap.put("GLM","");
		}
		List<TProjectPeople> membersList = getPeopleInProByProjectIdAndPost(projectId, "member");
		String members = "";
		for(TProjectPeople member : membersList){
			String professionalQualification = "";
			TUser m = tUserMapper.selectByPrimaryKey(member.getPpUserId());
			if(m.getUserProfessionalQualification()!=null && m.getUserProfessionalQualification().length()>0)
				professionalQualification = "("+m.getUserProfessionalQualification()+")";
			members += m.getUserName()+professionalQualification+"，";
		}
		if(members.endsWith("，"))
			members = members.substring(0, members.length()-1);
		dataMap.put("group",members);
		//派遣单部分

		List<TSendCard> s = getSendCardByProjectId(projectId);
		if(s.size() > 0){
			TSendCard sc = s.get(0);
			dataMap.put("dispatch", sc.gettSendNumStr()==null?"":sc.gettSendNumStr());
			dataMap.put("plan", sc.gettSendQualityPlan()==null?"":sc.gettSendQualityPlan());
			dataMap.put("time",sc.gettSendGoTime()==null?"":sc.gettSendGoTime());
			dataMap.put("submission",sc.getsubmissions()==null?"":sc.getsubmissions());
			dataMap.put("remark",sc.getremarks()==null?"":sc.getremarks());
			dataMap.put("MLN",tUserMapper.selectByPrimaryKey(sc.gettManagerLeader()).getUserName()==null?"":tUserMapper.selectByPrimaryKey(sc.gettManagerLeader()).getUserName());
			dataMap.put("MLM",tUserMapper.selectByPrimaryKey(sc.gettManagerLeader()).getMobile()==null?"":tUserMapper.selectByPrimaryKey(sc.gettManagerLeader()).getMobile());
			dataMap.put("compiler",tUserMapper.selectByPrimaryKey(sc.gettBianzhiId()).getUserName()==null?"":tUserMapper.selectByPrimaryKey(sc.gettBianzhiId()).getUserName());
			dataMap.put("approvers",getImageStr(tUserMapper.selectByPrimaryKey(sc.gettShenpiId()).getUserPic()));
					//tUserMapper.selectByPrimaryKey(sc.gettShenpiId()).getUserName()==null?"":tUserMapper.selectByPrimaryKey(sc.gettShenpiId()).getUserName());
		
		}
		else{
			dataMap.put("dispatch", "");
			dataMap.put("plan", "");
			dataMap.put("time","");
			dataMap.put("submission","");
			dataMap.put("remark","");
			dataMap.put("MLN","");
			dataMap.put("MLM","");
			dataMap.put("compiler","");
			dataMap.put("approvers","");
		
		}
		/*dataMap.put("projectName", "bengxiangmu");
		dataMap.put("proType", "A");
		dataMap.put("proUnit", "xd");
		dataMap.put("shenheren", "lc");
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < 10; i++) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("xuehao", i);
			map.put("neirong", "内容"+i);
			list.add(map);
		} 
		dataMap.put("list", list);*/

	}
	private String getImageStr(byte[] data){
/*        InputStream in=null;
        byte[] data=null;
        try {
            in=new FileInputStream(imgFile);
            data=new byte[in.available()];
            in.read(data);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //BASE64Encoder encoder = new BASE64Encoder();
		return data != null ? Base64.encodeBase64String(data) : "";
        //return imageCodeBase64;
        //return data != null ? encoder.encode(data) : "";
    }
	
}
