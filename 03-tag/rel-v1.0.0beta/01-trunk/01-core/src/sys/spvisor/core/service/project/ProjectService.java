package sys.spvisor.core.service.project;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.criteria.project.ProjectCriteria;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.project.TBigProjectMapper;
import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.dao.project.TGoodsListsMapper;
import sys.spvisor.core.dao.project.TProjectMapper;
import sys.spvisor.core.dao.project.TProjectPeopleMapper;
import sys.spvisor.core.dao.project.TQuestionMapper;
import sys.spvisor.core.dao.project.TSendCardMapper;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserExample;
import sys.spvisor.core.entity.examine.ExamineInit;
import sys.spvisor.core.entity.examine.TExamine;
import sys.spvisor.core.entity.project.TBigProjectExample;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TFileFormExample;
import sys.spvisor.core.entity.project.TBigProject;
import sys.spvisor.core.entity.project.TGoodsLists;
import sys.spvisor.core.entity.project.TGoodsListsExample;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectAndMember;
import sys.spvisor.core.entity.project.TProjectCustom;
import sys.spvisor.core.entity.project.TProjectExample;
import sys.spvisor.core.entity.project.TProjectExample.Criteria;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;
import sys.spvisor.core.service.examine.ExamineService;
import sys.spvisor.core.service.process.ScheduleService;
import sys.spvisor.core.util.DatetimeUtil;

@Service
public class ProjectService {
	
	@Autowired
	FileService fileService;
	
	@Autowired
	TFileFormMapper fileFormMapper;
	
	@Autowired
	TProjectPeopleMapper tProjectPeopleMapper;
	
	@Autowired
	TProjectMapper tProjectMapper;
	
	@Autowired
	TBigProjectMapper tBigProjectMapper;
	
	@Autowired
	ExamineService examineService;
	
	@Autowired
	TSendCardMapper tSendCardMapper;
	
	@Autowired
	UploadExcelService goodService;
	
	@Autowired
	TGoodsListsMapper goodMapper;
	
	@Autowired
	TUserMapper userMapper;
	
	@Autowired
	ScheduleService scheduleService;
	
	@Autowired
	TQuestionMapper tQuestionMapper;
	
	
	@Transactional
	//这个返回值用于标识导入物资清单是否成功
	public String addProject(TProjectCustom custom,Map<String, MultipartFile> fileMap,String userName,long userId, HttpServletRequest request) throws IOException {
		
		/*PushMessageCustom pushMessageCustom = new PushMessageCustom();*/
		
		int bigProjectId = 0;
		List<TBigProject> bigProjects = getAllBigProjectName();
		for (TBigProject tBigProject : bigProjects) {
			if(tBigProject.getBigProjectName().equals(custom.getBigProName())) {
				bigProjectId = tBigProject.getBigProjectId();
				break;
			}
		}
		if(bigProjectId == 0) {
			TBigProject bigProject = new TBigProject();
			bigProject.setBigProjectCreatePeople(userName);
			bigProject.setBigProjectCreatePeopleId((int)userId);
			bigProject.setBigProjectCreateTime(new Date(new java.util.Date().getTime()));
			bigProject.setBigProjectName(custom.getBigProName());
			tBigProjectMapper.insert(bigProject);
			bigProjectId = bigProject.getBigProjectId();
		}
		
		TProject record = custom.gettProject();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
		java.util.Date date1=record.getProEndtime();
		String str=sdf.format(date1); 
		if(str.equals("1900-01-01") || str == "1900-01-01") {
			record.setProEndtime(null);
		}
		java.util.Date date2 = record.getProStartTime();
		String str2 = sdf.format(date2);
		if(str2.equals("1900-01-01") || str2 == "1900-01-01") {
			record.setProStartTime(null);
		}
		
		record.setProCreateTime(new Date(new java.util.Date().getTime()));
		record.setProLastUpdateTime(new Date(new java.util.Date().getTime()));
		record.setProCreateUserId((int)userId);
		record.setProBigProjectId(bigProjectId);
		record.setProStatus("O");
		record.setProBigProjectName(custom.getBigProName());
		tProjectMapper.insert(record);
		
		String fileNameTotal = custom.getFileNameTotal();
		//如果为空，说明这一次没有上传物资清单这个文件，否则，上传了
		String Msg = "";
		if(fileNameTotal != null){
			//如果需要传递文件，需要设置文件名称
			//可能会传递多个文件，用&进行分割
			String sendFileName = "监造委托书&监理委托单";
			String[] fileName = sendFileName.split("&");
			String[] name = fileNameTotal.split("&");
			//文件上传
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				if(!mf.getOriginalFilename().equals("")) {
					TFileForm tPlanForm = new TFileForm();
					System.out.println(mf.getOriginalFilename());
					System.out.println(mf.getName());
					tPlanForm.setFileFormFilename(mf.getOriginalFilename());
					/*tPlanForm.setFileFormContent(mf.getBytes());*/
					tPlanForm.setFileFormName(name[index]);
					tPlanForm.setFileFormPeople(userName);
					tPlanForm.setFileFormUserId((int)userId);
					tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
					tPlanForm.setFileFormProjectId(record.getProId());
					tPlanForm.setFileFormCurrentStatus("D");
					tPlanForm.setFileFormCurrentStatusNum(0);
					tPlanForm.setFileFormNotpassTimes(0);
					tPlanForm.setFileFormType("委托信息");
					
					File targetFile = AutoCreateFileName.createFileName(request, mf,record.getProId());
					//设置存放的服务器路径
					tPlanForm.setFileFormPath(targetFile.getName());
					fileFormMapper.insert(tPlanForm);
							
							/*//发送文件审核消息
							ExamineInit examine = new ExamineInit();
							examine.setSubmitId(new Long(userId).intValue());
							//设置为文件消息
							examine.setExaType(2);
							examine.setExaTitle("有个文件需要你审核");
							examine.setExaContent(name[index] + "需要你审核");
							examine.setNodeName(name[index]);
							examine.setExaFileFlag(1);
							examine.setIsProType(1);
							examine.setProId(record.getProId());
							examine.setExaFilePath(targetFile.getName());
							examine.setExaLinkId(tPlanForm.getFileFormId());
							
							try {
								examineService.insertExamine(examine);
							} catch (Exception e) {
								e.printStackTrace();
							}*/
						
				}
				index++;
			}
		}
		
		return Msg;
	}
	
	//修改委托信息
	@Transactional
	public void modifyEntrustingByMsgId(TProjectCustom custom,Map<String, MultipartFile> fileMap,String userName,long userId,HttpServletRequest request) throws IOException {
		
		int bigProjectId = 0;
		List<TBigProject> bigProjects = getAllBigProjectName();
		for (TBigProject tBigProject : bigProjects) {
			if(tBigProject.getBigProjectName().equals(custom.getBigProName()) || tBigProject.getBigProjectName() == custom.getBigProName()) {
				bigProjectId = tBigProject.getBigProjectId();
				break;
			}
			System.out.println(tBigProject.getBigProjectName());
		}
		if(bigProjectId == 0) {
			TBigProject bigProject = new TBigProject();
			bigProject.setBigProjectCreatePeople(userName);
			bigProject.setBigProjectCreatePeopleId((int)userId);
			bigProject.setBigProjectCreateTime(new Date(new java.util.Date().getTime()));
			bigProject.setBigProjectName(custom.getBigProName());
			tBigProjectMapper.insert(bigProject);
			bigProjectId = bigProject.getBigProjectId();
		}
		
		TProject record = custom.gettProject();

		TProject oldPro = tProjectMapper.selectByPrimaryKey(record.getProId());
		
		record.setProCreateTime(oldPro.getProCreateTime());
		record.setProCreateUserId(oldPro.getProCreateUserId());
		record.setProBigProjectName(custom.getBigProName());
		record.setProLastUpdateTime(new Date(new java.util.Date().getTime()));
		record.setProBigProjectId(bigProjectId);
		record.setProStatus(oldPro.getProStatus());
		record.setProBigProjectName(custom.getBigProName());

		tProjectMapper.updateByPrimaryKey(record);
		
		String fileNameTotal = custom.getFileNameTotal();
		System.out.println(fileNameTotal);
		if(fileNameTotal != null){
			String[] name = fileNameTotal.split("&");
			List<TFileForm> tFileForms = selectEntrustFileByProjectId(custom.gettProject().getProId());
			//删除的文件要在数据库中进行删除
			for(String n : name){
				for(TFileForm tFileForm : tFileForms){
					if(n.equals(tFileForm.getFileFormName())){
						tFileForms.remove(tFileForm);
						break;
					}
				}
			}
			
			for(TFileForm tFileForm : tFileForms){
				fileService.deleteByTypeAndNameAndMsgId(custom.gettProject().getProId(),"委托信息",tFileForm.getFileFormName());
			}
			
			//文件上传
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
					
				MultipartFile mf= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				if(!mf.getOriginalFilename().equals("")){
					
					List<TFileForm> list = fileService.selectByMsgIdAndTypeAndName(record.getProId(),"委托信息", name[index]);
					//原来不存在
					if(list == null || list.size() == 0) {
						TFileForm tPlanForm = new TFileForm();
						System.out.println(mf.getOriginalFilename());
						System.out.println(mf.getName());
						tPlanForm.setFileFormFilename(mf.getOriginalFilename());
						tPlanForm.setFileFormName(name[index]);
						tPlanForm.setFileFormPeople(userName);
						tPlanForm.setFileFormUserId((int)userId);
						tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						tPlanForm.setFileFormProjectId(record.getProId());
						tPlanForm.setFileFormCurrentStatus("D");
						tPlanForm.setFileFormCurrentStatusNum(0);
						tPlanForm.setFileFormType("委托信息");
						//TODO
						File targetFile = AutoCreateFileName.createFileName(request, mf,record.getProId());
						//设置存放的服务器路径
						tPlanForm.setFileFormPath(targetFile.getName());
						//如果是没修改，那么文件未通过次数为0
						tPlanForm.setFileFormNotpassTimes(0);
						fileFormMapper.insert(tPlanForm);
						
						/*//发送文件审核消息
						ExamineInit examine = new ExamineInit();
						examine.setSubmitId(new Long(userId).intValue());
						//设置为文件消息
						examine.setExaType(2);
						examine.setExaTitle("有个文件需要你审核");
						examine.setExaContent(name[index] + "需要你审核");
						examine.setNodeName(name[index]);
						examine.setExaFileFlag(1);
						examine.setIsProType(1);
						examine.setProId(record.getProId());
						examine.setExaFilePath(targetFile.getName());
						examine.setExaLinkId(tPlanForm.getFileFormId());
						
						try {
							examineService.insertExamine(examine);
						} catch (Exception e) {
							e.printStackTrace();
						}*/
						
					} else {	//原来存在的，只需要修改文件名，和文件内容就可以了
						//如果是修改的，那么文件未通过次数+1
						//注意数据库FileFormNotpassTimes字段为空，会报错误
						TFileForm tPlanForm = list.get(0);
						/*File targetFile = AutoCreateFileName.updateFileName(request, mf, tPlanForm.getFileFormPath());*/
						File targetFile = AutoCreateFileName.createFileName(request, mf, record.getProId());
						//设置存放的服务器路径
						tPlanForm.setFileFormPath(targetFile.getName());
						tPlanForm.setFileFormFilename(mf.getOriginalFilename());
						tPlanForm.setFileFormName(name[index]);
						tPlanForm.setFileFormNotpassTimes(tPlanForm.getFileFormNotpassTimes() + 1);
						System.out.println(tPlanForm.getFileFormId());
						fileFormMapper.updateByPrimaryKey(tPlanForm);
						
						/*//发送文件审核消息
						ExamineInit examine = new ExamineInit();
						examine.setSubmitId(new Long(userId).intValue());
						//设置为文件消息
						examine.setExaType(2);
						examine.setExaTitle("有个文件重新上传了，需要你审核");
						examine.setExaContent(name[index] + "需要你的重新审核");
						examine.setNodeName(name[index]);
						examine.setExaFileFlag(1);
						examine.setProId(record.getProId());
						examine.setExaFilePath(targetFile.getName());
						examine.setExaLinkId(tPlanForm.getFileFormId());
						
						try {
							examineService.insertExamine(examine);
						} catch (Exception e) {
							e.printStackTrace();
						}*/
					}
					
					
				}
				index++;
			}
		}
	}
	
	//查询相关子项目
	@SuppressWarnings("deprecation")
	@Transactional
	 public List<TProjectAndMember> selectByExample(ProjectCriteria params,String member) {
		//根据人名找其userId
		int userId = 0;
		if(member.equals("") || member == "") {
		}else {
			TUserExample uExample = new TUserExample();
			sys.spvisor.core.entity.ana.TUserExample.Criteria uCriteria = uExample.createCriteria();
			uCriteria.andUserNameLike("%" + member.trim() + "%");
			List<TUser> userList =  userMapper.selectByExample(uExample);
			if(userList.size()>0) {
				userId = userList.get(0).getUserId();
			}
		}
		params.setUserId(userId);
		
		Date compare = new Date(1900, 01, 01);
		
		if(compare.getDate() != params.getProStartTime().getDate()) {
			params.setProStartTime(params.getProStartTime());
		}else {
			params.setProStartTime(null);
		}
		if(!params.getProBigProjectName().trim().isEmpty()) {
			params.setProBigProjectName("%"+params.getProBigProjectName().trim() + "%");
		}
		if(!params.getProNum().trim().isEmpty()) {
			params.setProNum("%"+params.getProNum().trim()+"%");
		}
		if(!params.getProGoods().trim().isEmpty()) {
			params.setProGoods("%" + params.getProGoods().trim() + "%");
		}
		if(!params.getProjectName().trim().isEmpty()) {
			params.setProjectName("%" + params.getProjectName().trim() +"%");
		}
		
		if(!params.getProUnit().trim().isEmpty()) {
			params.setProUnit("%" + params.getProUnit() + "%");
		}
		List<TProject> lists  = tProjectMapper.getSearchProjects(params);
		List<TProjectAndMember> last = new ArrayList<TProjectAndMember>();
		
		for (int i = 0; i < lists.size(); i++) {
			TProjectAndMember beanMuBiao = new TProjectAndMember();
			//在两个具有很多相同属性的bean，直接将一个bean的属性值复制给另一个bean的属性。
			//因此如果对象包含时间类型的属性，且希望被转换的时候，一定要使用java.sql.Date类型。否则在转换时会提示argument mistype异常
			BeanUtils.copyProperties(lists.get(i),beanMuBiao); 
			if(beanMuBiao.getProStatus() != null) {
				String status = lists.get(i).getProStatus();
				if (status == "O" || status.equalsIgnoreCase("O")) {
					beanMuBiao.setProStatus("项目正在运行");
					System.out.println("项目正在运行");
				}else if(status == "C" || status.equalsIgnoreCase("C")) {
					beanMuBiao.setProStatus("项目已完成");
					System.out.println("项目已完成");
				}else if(status == "S" || status.equalsIgnoreCase("S")) {
					beanMuBiao.setProStatus("项目暂停");
					System.out.println("项目暂停");
				}
			}
			last.add(beanMuBiao);
		}
		//查找项目里面的人员
		for (int i = 0; i < lists.size(); i++) {
			int proId = lists.get(i).getProId();
			TProjectPeopleExample peopleExample = new TProjectPeopleExample();
			sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria = peopleExample.createCriteria();
			criteria.andPpProIdEqualTo(proId);
			List<TProjectPeople> memebers  = tProjectPeopleMapper.selectByExample(peopleExample);
			String allMemberName = "";
			if(memebers.size() != 0) {
				System.out.println(proId);
				for (int j = 0; j < memebers.size(); j++) {
					int userId1 = memebers.get(j).getPpUserId();
					allMemberName += userMapper.selectByPrimaryKey(userId1).getUserName();
				}
				System.out.println(allMemberName);
			}
			last.get(i).setMemberName(allMemberName);
		}
		return last;
		
	}
	//查询相关子项目的个数
		@Transactional
		 public int selectAllCount(ProjectCriteria params,String member) {
			//根据人名找其userId
			int userId = 0;
			if(member.equals("") || member == "") {
			}else {
				TUserExample uExample = new TUserExample();
				sys.spvisor.core.entity.ana.TUserExample.Criteria uCriteria = uExample.createCriteria();
				uCriteria.andUserNameLike("%" + member.trim() + "%");
				List<TUser> userList =  userMapper.selectByExample(uExample);
				if(userList.size()>0) {
					userId = userList.get(0).getUserId();
				}
			}
			params.setUserId(userId);
			
			/*Date compare = new Date(1900, 01, 01);
			
			if(compare.getDate() != params.getProStartTime().getDate()) {
				params.setProStartTime(params.getProStartTime());
			}else {
				params.setProStartTime(null);
			}*/
			/*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
			System.out.println(params.getProStartTime());
			java.util.Date date1=new java.util.Date(params.getProStartTime().getTime());
			
			String str=sdf.format(date1); 
			System.out.println(str);
			if(str.equals("1900-01-01") || str == "1900-01-01") {
				params.setProStartTime(null);
			}
			params.setProStartTime(null);
			if(!params.getProBigProjectName().trim().isEmpty()) {
				params.setProBigProjectName("%"+params.getProBigProjectName().trim() + "%");
			}
			if(!params.getProNum().trim().isEmpty()) {
				params.setProNum("%"+params.getProNum().trim()+"%");
			}
			if(!params.getProGoods().trim().isEmpty()) {
				params.setProGoods("%" + params.getProGoods().trim() + "%");
			}
			if(!params.getProjectName().trim().isEmpty()) {
				params.setProjectName("%" + params.getProjectName().trim() +"%");
			}
			
			if(!params.getProUnit().trim().isEmpty()) {
				params.setProUnit("%" + params.getProUnit() + "%");
			}*/
			List<TProject> lists  = tProjectMapper.getSearchCount(params);
			
			System.out.println(lists.size());
			return lists.size();
			
		}
	
	@Transactional
	public TProject selectByPrimaryKey(Integer msgId) {
		TProject msg = tProjectMapper.selectByPrimaryKey(msgId);
		return msg;
		
	}
	
	public int delete(String params) {
		String[] proIds = params.split(",");
		int fluenceRows = 0;
		
		for (int i = 0; i < proIds.length; i++) {
			tProjectMapper.deleteByPrimaryKey(Integer.parseInt(proIds[i]));
			fluenceRows++;
		}
		
		return fluenceRows;
	}
	//根据业主单位查询委托信息
	@Transactional
	public TProject viewProjectByUnitName(String unitName) {
		TProjectExample msgExample = new TProjectExample();
		Criteria criteria = msgExample.createCriteria();
		criteria.andProUnitLike("%" + unitName + "%");
		List<TProject> lists = tProjectMapper.selectByExample(msgExample);
		TProject msg = null;
		if(lists.size() > 0) {
			//TODO
			//如果没有相应的业主单位应该有处理
			msg = lists.get(lists.size() - 1);
		}
		return msg;
	}
	
	@Transactional
	public List<TBigProject> getAllBigProjectName() {
		TBigProjectExample example = new TBigProjectExample();
		example.createCriteria();
		List<TBigProject> lists = tBigProjectMapper.selectByExample(example);
		return lists;
	}
	
	public String getProjectNameBymsgId(Integer proId){
		TProject pro = tProjectMapper.selectByPrimaryKey(proId);
		return pro.getProjectName();
	}
	
	//根据子项目id查找其对应的委托文件
		@Transactional
		public List<TFileForm> selectEntrustFileByProjectId(int msgId) {
			List<TFileForm> TFileForms = new ArrayList<TFileForm>();
			
			TFileFormExample example = new  TFileFormExample();
			sys.spvisor.core.entity.project.TFileFormExample.Criteria criteria = example.createCriteria();
			criteria.andFileFormProjectIdEqualTo(msgId);
			criteria.andFileFormTypeEqualTo("委托信息");
			List<TFileForm> selectTFileForms = fileFormMapper.selectByExample(example);
			addExistsFile("监造委托书",selectTFileForms,TFileForms);
			addExistsFile("监理服务合同",selectTFileForms,TFileForms);
			addExistsFile("监理委托单",selectTFileForms,TFileForms);
			addExistsFile("监理物资清单",selectTFileForms,TFileForms);
			addExistsFile("技术协议",selectTFileForms,TFileForms);
			//往TFileForms添加没有存储到数据库中的信息
			for(TFileForm tFileForm : selectTFileForms){
				TFileForms.add(tFileForm);
			}
			
			return TFileForms;
		}
		
		//往TFileForms添加已经存储在数据库中的文件信息
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
		
		public String getProjectNameByProId(int proId){
			TProject tmsg = tProjectMapper.selectByPrimaryKey(proId);
			return tmsg.getProjectName();
		}
		
		public String getEncodeProjectNameBymsgId(Integer proId){
			TProject pro = tProjectMapper.selectByPrimaryKey(proId);
			String result = "";
			try {
				result = URLEncoder.encode(pro.getProjectName(),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			return result;
			
		}
		
		//public Map<String,Object> getMyDailyLog(Date date1,Date date2,int proId) {
			//java.util.Date d=new java.util.Date();   
			  /* SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");   
			   System.out.println("今天的日期："+df.format(d));   
			   System.out.println("两天前的日期：" + df.format(new Date(d.getTime() - 24 * 24 * 60 * 60 * 1000)));  
			   System.out.println("三天后的日期：" + df.format(new Date(d.getTime() + 3 * 24 * 60 * 60 * 1000)));*/
			
		//}
		/* public static String getWeekOfDate(Date dt) {
		        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		        Calendar cal = Calendar.getInstance();
		        cal.setTime(dt);
		        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		        if (w < 0)
		            w = 0;
		        return weekDays[w];
		    }*/
		
		
		
		/*//根据项目id查询参与项目的相关人员
			@Transactional
			public List<TProjectPeople> getAllItemPeopleByProId (int proId){
				TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
				sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria = tProjectPeopleExample.createCriteria();
				criteria.andPpMsgidEqualTo(proId);
				List<TProjectPeople> lists = tProjectPeopleMapper.selectByExample(tProjectPeopleExample);
				return lists;
				
			}
			
			//根据项目id查询项目所有的文件信息
			public List<TFileForm> getAllItemFileByProId(int proId) {
				TFileFormExample tFileFormExample = new TFileFormExample();
				sys.spvisor.core.entity.project.TFileFormExample.Criteria criteria = tFileFormExample.createCriteria();
				criteria.andFileFormProjectIdEqualTo(proId);
				List<TFileForm> lists = fileFormMapper.selectByExample(tFileFormExample);
				return lists;
				
			}
			
			//根据项目id查找其对应的派遣单信息
			public TSendCard getSendCardByProId(int proId) {
				TSendCardExample sendCardExample = new TSendCardExample();
				sys.spvisor.core.entity.project.TSendCardExample.Criteria criteria = sendCardExample.createCriteria();
				criteria.andTSendProjectIdEqualTo(proId);
				List<TSendCard> lists = tSendCardMapper.selectByExample(sendCardExample);
				return lists.get(0);
				
			}
			
			//添加或者修改开工报审资料
			public void addOrUpdateBeginWork(int proId,String fileNameTotal,Map<String, MultipartFile> fileMap, String userName,Long userId) throws IOException {
				if(fileNameTotal != null){
					String[] name = fileNameTotal.split("&");
					//文件上传
					int index = 0;
					for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
							
						MultipartFile mf 	= entity.getValue();
						System.out.println(mf.getOriginalFilename());
						if(!mf.getOriginalFilename().equals("")){
							TFileForm tPlanForm = new TFileForm();
							System.out.println(mf.getOriginalFilename());
							System.out.println(mf.getName());
							tPlanForm.setFileFormFilename(mf.getOriginalFilename());
							tPlanForm.setFileFormContent(mf.getBytes());
							tPlanForm.setFileFormName(name[index]);
							tPlanForm.setFileFormPeople(userName);
							tPlanForm.setFileFormPeopleId(userId.intValue());
							tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							tPlanForm.setFileFormProjectId(proId);
							tPlanForm.setFileFormType("开工报审");
							tPlanForm.setFileFormCurrentStatus("W");
							tPlanForm.setFileFormCurrentStatusNum(0);
							List<TFileForm> list = fileService.selectByMsgIdAndTypeAndName(proId,"开工报审", name[index]);
							if(list == null || list.size() == 0) {
								//如果是新增的，那么文件未通过次数为0
								tPlanForm.setFileFormNotpassTimes(0);
								fileFormMapper.insert(tPlanForm);
							}
							else {
								//如果是修改的，那么文件未通过次数+1
								tPlanForm.setFileFormNotpassTimes(list.get(0).getFileFormNotpassTimes() + 1);
								tPlanForm.setFileFormId(list.get(0).getFileFormId());
								fileFormMapper.updateByPrimaryKey(tPlanForm);
							}
						}
						index++;
					}
				}
				
			}
			
			//查找开工报审资料
			public List<TFileForm> getBeginWorkByProId(int proId) {
				List<TFileForm> tFileForms = fileService.selectByMsgIdAndType(proId,"开工报审");	
				return tFileForms;
				
			}*/
			
	
}
