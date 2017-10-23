package sys.spvisor.core.service.project;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.dao.project.TQuestionFileFormMapper;
import sys.spvisor.core.dao.project.TQuestionMapper;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TProjectAndMember;
import sys.spvisor.core.entity.project.TQuestion;
import sys.spvisor.core.entity.project.TQuestionExample;
import sys.spvisor.core.entity.project.TQuestionExample.Criteria;
import sys.spvisor.core.entity.project.TQuestionFileForm;
import sys.spvisor.core.entity.project.TQuestionFileFormExample;
import sys.spvisor.core.entity.project.TQuestionUser;
import sys.spvisor.core.entity.question.ProblemResult;

@Service
public class ProblemService {
	
	@Autowired
	TQuestionMapper tQuestionMapper;
	
	@Autowired
	TQuestionFileFormMapper tQuestionFileFormMapper;
	
	@Autowired
	TFileFormMapper tFileFormMapper;
	
	@Autowired
	TUserMapper tUserMapper;
	
	@Autowired
	FileService fileService;

	//往数据库添加问题信息
	@Transactional
	public int addQuetion(TQuestion record, String fileNametotal, String picNameTotal, Map<String, MultipartFile> fileMap, String username, Long userId, HttpServletRequest request, int proId) {
		//无序排放
		//Map<String,Object> result = new HashMap<String,Object>();
		//有序排放
		//Map<String,Object> result = new LinkedHashMap<String,Object>();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
		java.util.Date date1=record.getUpdateTime();
		String str=sdf.format(date1); 
		if(str.equals("1900-01-01") || str == "1900-01-01") {
			record.setUpdateTime(null);
		}
		record.setUserId(userId.intValue());
		record.setProId(proId);
		record.setPostTime(new Date(new java.util.Date().getTime()));
	
		tQuestionMapper.insert(record);
		int problemId = 0;
		problemId = record.getQusId();
		System.out.println(problemId);
		//插入图片信息
		List<TQuestionFileForm> lists = new ArrayList<TQuestionFileForm>();
		if(picNameTotal != null || picNameTotal != "") {
			String[] picNames = picNameTotal.split("&");
			String[] fileNames = fileNametotal.split("&");
			int picLength = picNames.length;
			//文件上传
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				if(!mf.getOriginalFilename().equals("")){
					TFileForm tPlanForm = new TFileForm();
					System.out.println(mf.getOriginalFilename());
					System.out.println(mf.getName());
					tPlanForm.setFileFormFilename(mf.getOriginalFilename());
					//判断上传的东西是图片还是文件
					/*if(index < picLength) {*/
					if(index < 4) {
						tPlanForm.setFileFormName(picNames[index]);
					}else {
						tPlanForm.setFileFormName(fileNames[index-4]);
					}
					
					tPlanForm.setFileFormUserId(userId.intValue());
					tPlanForm.setFileFormPeople(username);
					tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
					tPlanForm.setFileFormProjectId(proId);
					tPlanForm.setFileFormCurrentStatus("D");
					tPlanForm.setFileFormCurrentStatusNum(0);
					tPlanForm.setFileFormNotpassTimes(0);
					tPlanForm.setFileFormType("问题");
					File targetFile = AutoCreateFileName.createFileName(request, mf, proId);
					//设置存放的服务器路径
					tPlanForm.setFileFormPath(targetFile.getName());
					tFileFormMapper.insert(tPlanForm);
					int num = tPlanForm.getFileFormId();
					TQuestionFileForm mapQF = new TQuestionFileForm();
					mapQF.settProblemId(problemId);
					mapQF.settFileFormId(num);
					
					if(index<picLength) {
						//1表示图片
						mapQF.settType(1);
					}else {
						//2表示文件
						mapQF.settType(2);
					}
					
					tQuestionFileFormMapper.insertSelective(mapQF);
					lists.add(mapQF);
				}
				index++;
			}
		}
	
		//result.put("lists", lists);
		return problemId;
	}
	
	@Transactional
	public int updateQuestion(TQuestion record, String fileNametotal, String picNameTotal, Map<String, MultipartFile> fileMap, String username, Long userId, HttpServletRequest request, int proId) {
		//无序排放
		//Map<String,Object> result = new HashMap<String,Object>();
		//有序排放
		//Map<String,Object> result = new LinkedHashMap<String,Object>();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
		java.util.Date date1=record.getUpdateTime();
		String str=sdf.format(date1); 
		if(str.equals("1900-01-01") || str == "1900-01-01") {
			record.setUpdateTime(null);
		}
		record.setUserId(userId.intValue());
		record.setProId(proId);
		record.setPostTime(new Date(new java.util.Date().getTime()));
		//修改问题
		tQuestionMapper.updateByPrimaryKeySelective(record);
		
		int problemId = record.getQusId();
		System.out.println(problemId);
		
		
		
		
		
		
		List<TQuestionFileForm> lists = new ArrayList<TQuestionFileForm>();
		if(picNameTotal != null || picNameTotal != "" || fileNametotal!=null || fileNametotal !="") {
			String[] picNames = picNameTotal.split("&");
			String[] fileNames = fileNametotal.split("&");
			
			//从数据库删除从前端删除的文件信息
			TQuestionFileFormExample example = new TQuestionFileFormExample();
			sys.spvisor.core.entity.project.TQuestionFileFormExample.Criteria criteria = example.createCriteria();
			criteria.andTProblemIdEqualTo(problemId);
			//文件类型为2
			criteria.andTTypeEqualTo(2);
			List<TQuestionFileForm> tQuestionFileForms = tQuestionFileFormMapper.selectByExample(example);
			//从数据库查找这个问题的所有文件信息
			List<TFileForm> selectTFileForms = new ArrayList<TFileForm>();
			for (int i = 0; i < tQuestionFileForms.size(); i++) {
				TFileForm fm = tFileFormMapper.selectByPrimaryKey(tQuestionFileForms.get(i).gettFileFormId());
				selectTFileForms.add(fm);
			}
			//删除的文件要在数据库中进行删除
			for(String n : fileNames){
				for(TFileForm tFileForm : selectTFileForms){
					if(n.equals(tFileForm.getFileFormName())){
						selectTFileForms.remove(tFileForm);
						break;
					}
				}
			}
			
			for(TFileForm tFileForm : selectTFileForms){
				fileService.deleteByTypeAndNameAndMsgId(proId,"问题",tFileForm.getFileFormName());
			}
			
			int picLength = picNames.length;
			//文件上传
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				if(!mf.getOriginalFilename().equals("")){
					String fileName = "";
					if(index < picLength) {
						fileName = picNames[index];
					}else {
						fileName = fileNames[index-4];
					}
					List<TFileForm> list = fileService.selectByMsgIdAndTypeAndNameAndQusId(record.getProId(),"问题", fileName, problemId);
					//图片原来不存在
					if(list == null || list.size() == 0) {
						TFileForm tPlanForm = new TFileForm();
						System.out.println(mf.getOriginalFilename());
						System.out.println(mf.getName());
						tPlanForm.setFileFormFilename(mf.getOriginalFilename());
						tPlanForm.setFileFormName(fileName);
						tPlanForm.setFileFormUserId(userId.intValue());
						tPlanForm.setFileFormPeople(username);
						tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						tPlanForm.setFileFormProjectId(proId);
						tPlanForm.setFileFormCurrentStatus("D");
						tPlanForm.setFileFormCurrentStatusNum(0);
						tPlanForm.setFileFormNotpassTimes(0);
						tPlanForm.setFileFormType("问题");
						File targetFile = AutoCreateFileName.createFileName(request, mf, proId);
						//设置存放的服务器路径
						tPlanForm.setFileFormPath(targetFile.getName());
						tFileFormMapper.insert(tPlanForm);
						int num = tPlanForm.getFileFormId();
						TQuestionFileForm mapQF = new TQuestionFileForm();
						mapQF.settProblemId(problemId);
						mapQF.settFileFormId(num);
						if(index<picLength) {
							//1表示图片
							mapQF.settType(1);
						}else {
							//2表示文件
							mapQF.settType(2);
						}
						tQuestionFileFormMapper.insertSelective(mapQF);
						lists.add(mapQF);
					}else {	//图片原本存在
						//原来存在的，只需要修改文件名，和文件内容就可以了
						//如果是修改的，那么文件未通过次数+1
						//注意数据库FileFormNotpassTimes字段为空，会报错误
						TFileForm tPlanForm = list.get(0);
						//AutoCreateFileName.updateFileName(request, mf, tPlanForm.getFileFormPath());
						File targetFile = AutoCreateFileName.createFileName(request, mf, proId);
						//设置存放的服务器路径
						tPlanForm.setFileFormPath(targetFile.getName());
						tPlanForm.setFileFormFilename(mf.getOriginalFilename());
						tPlanForm.setFileFormName(fileName);
						tPlanForm.setFileFormNotpassTimes(tPlanForm.getFileFormNotpassTimes() + 1);
						System.out.println(tPlanForm.getFileFormId());
						tFileFormMapper.updateByPrimaryKey(tPlanForm);
					}
					
				}
				index++;
			}
		}
	
		//result.put("lists", lists);
		return problemId;
	}
	
	@Transactional
	public List<TQuestionUser> findQuestionsByProId(int proId) {
		TQuestionExample example = new TQuestionExample();
		Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQuestion> lists = tQuestionMapper.selectByExample(example);
		List<TQuestionUser> tQULists = new ArrayList<TQuestionUser>();
		for (int i = 0; i < lists.size(); i++) {
			TQuestionUser tQU = new TQuestionUser();
			BeanUtils.copyProperties(lists.get(i),tQU);
			TUser user = tUserMapper.selectByPrimaryKey(lists.get(i).getUserId());
			tQU.setUserName(user.getUserName());
			tQULists.add(tQU);
		}
		return tQULists;
	}
	
	@Transactional
	public List<TQuestionUser> findQuestionsByProIdAndDate(int proId,Date date) {
		TQuestionExample example = new TQuestionExample();
		Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		criteria.andFindTimeEqualTo(date);
		List<TQuestion> lists = tQuestionMapper.selectByExample(example);
		List<TQuestionUser> tQULists = new ArrayList<TQuestionUser>();
		for (int i = 0; i < lists.size(); i++) {
			TQuestionUser tQU = new TQuestionUser();
			BeanUtils.copyProperties(lists.get(i),tQU);
			TUser user = tUserMapper.selectByPrimaryKey(lists.get(i).getUserId());
			tQU.setUserName(user.getUserName());
			tQULists.add(tQU);
		}
		return tQULists;
	}
	
	@Transactional
	public TQuestion getQuestionByQueId(int qusId) {
		
		TQuestion  question = tQuestionMapper.selectByPrimaryKey(qusId);
		return question;
	}
	
	//得到问题中的所有图片信息
	@Transactional
	public List<TFileForm> selectPic(int qusId) {
		TQuestionFileFormExample example = new TQuestionFileFormExample();
		sys.spvisor.core.entity.project.TQuestionFileFormExample.Criteria criteria = example.createCriteria();
		criteria.andTProblemIdEqualTo(qusId);
		//图片类型为1
		criteria.andTTypeEqualTo(1);
		List<TQuestionFileForm> lists = tQuestionFileFormMapper.selectByExample(example);
		List<TFileForm> results = new ArrayList<TFileForm>();
		for (int i = 0; i < lists.size(); i++) {
			TFileForm fm = tFileFormMapper.selectByPrimaryKey(lists.get(i).gettFileFormId());
			results.add(fm);
		}
		return results;
	}
	
	//得到问题中的所有文件信息
	@Transactional
	public List<TFileForm> selectFiles(int qusId) {
		TQuestionFileFormExample example = new TQuestionFileFormExample();
		sys.spvisor.core.entity.project.TQuestionFileFormExample.Criteria criteria = example.createCriteria();
		criteria.andTProblemIdEqualTo(qusId);
		//图片类型为1
		criteria.andTTypeEqualTo(2);
		List<TQuestionFileForm> lists = tQuestionFileFormMapper.selectByExample(example);
		List<TFileForm> selectTFileForms = new ArrayList<TFileForm>();
		List<TFileForm> results = new ArrayList<TFileForm>();
		for (int i = 0; i < lists.size(); i++) {
			TFileForm fm = tFileFormMapper.selectByPrimaryKey(lists.get(i).gettFileFormId());
			selectTFileForms.add(fm);
		}
		addExistsFile("暂停令",selectTFileForms,results);
		addExistsFile("监理备忘录",selectTFileForms,results);
		addExistsFile("工作联络函",selectTFileForms,results);
		addExistsFile("监理工程师通知单",selectTFileForms,results);
		addExistsFile("专题汇报",selectTFileForms,results);
		//往TFileForms添加没有存储到数据库中的信息
		for(TFileForm tFileForm : selectTFileForms){
			results.add(tFileForm);
		}
		return results;
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
	
	//date1是从那一天开始查找，date2是查找到那一天，两个都包括
	//proId，项目id
	public List<ProblemResult> getWeekQuestion(Date date1,Date date2,int proId) {
		TQuestionExample questionExample = new TQuestionExample();
		Criteria criteria =  questionExample.createCriteria();
		criteria.andFindTimeBetween(date1, date2);
		criteria.andProIdEqualTo(proId);
		List<TQuestion> lists = tQuestionMapper.selectByExample(questionExample);
		List<ProblemResult> results = new ArrayList<ProblemResult>();
		for (int i = 0; i < lists.size(); i++) {
			ProblemResult result = new ProblemResult();
			TUser user = tUserMapper.selectByPrimaryKey(lists.get(i).getUserId());
			BeanUtils.copyProperties(lists.get(i),result);
			result.setUserName(user.getUserName());
			results.add(result);
		}
		return results;
	}
	
	//查找那一天的问题
	//proId，项目id
	public List<ProblemResult> getDailyQuestion(Date date,int proId) {
		TQuestionExample questionExample = new TQuestionExample();
		Criteria criteria =  questionExample.createCriteria();
		criteria.andFindTimeEqualTo(date);
		criteria.andProIdEqualTo(proId);
		List<TQuestion> lists = tQuestionMapper.selectByExample(questionExample);
		List<ProblemResult> results = new ArrayList<ProblemResult>();
		for (int i = 0; i < lists.size(); i++) {
			ProblemResult result = new ProblemResult();
			TUser user = tUserMapper.selectByPrimaryKey(lists.get(i).getUserId());
			BeanUtils.copyProperties(lists.get(i),result);
			result.setUserName(user.getUserName());
			results.add(result);
		}
		return results;
	}
	
	/*@Transactional
	public void addPicAndFile( Map<String, Object> map) {
		//利用迭代 （Iterator）  
        Set set=map.entrySet();  
        Iterator iterator=set.iterator();  
        while(iterator.hasNext()){  
                Map.Entry<String, Object> enter=(Entry<String, Object>) iterator.next();  
                List<TQuestionFileForm> forms = (List<TQuestionFileForm>) enter.getValue();
                System.out.println(enter.getKey()+"\t"+enter.getValue());
                for (int i = 0; i < forms.size(); i++) {
            	    tQuestionFileFormMapper.insertSelective(forms.get(i));
			    }
        }
	}*/
	
	
	
}
