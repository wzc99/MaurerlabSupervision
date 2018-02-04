package sys.spvisor.core.service.project;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.dao.project.TQuestionFileFormMapper;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TFileFormExample;
import sys.spvisor.core.entity.project.TQuestionFileForm;
import sys.spvisor.core.entity.project.TQuestionFileFormExample;
import sys.spvisor.core.entity.project.TFileFormExample.Criteria;

@Service
public class FileService {
	
	@Autowired
	TFileFormMapper tFileFormMapper;
	@Autowired
	TQuestionFileFormMapper tQuestionFileFormMapper;
	
	
	public List<TFileForm> selectByMsgIdAndType(int msgId, String type){
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormTypeEqualTo(type);
		criteria.andFileFormProjectIdEqualTo(msgId);
		return tFileFormMapper.selectByExample(tFileFormExample);
		
	}
	
	public List<TFileForm> selectByMsgIdAndTypeAndName(int msgId, String type,String name){
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormTypeEqualTo(type);
		criteria.andFileFormProjectIdEqualTo(msgId);
		criteria.andFileFormNameEqualTo(name);
		return tFileFormMapper.selectByExample(tFileFormExample);
		
	}
	
	public List<TFileForm> selectByMsgIdAndTypeAndNameAndQusId(int msgId, String type,String name,int qusId){
		TQuestionFileFormExample example = new TQuestionFileFormExample();
		sys.spvisor.core.entity.project.TQuestionFileFormExample.Criteria criteria = example.createCriteria();
		criteria.andTProblemIdEqualTo(qusId);
		List<TQuestionFileForm> tQuestionFileForms = tQuestionFileFormMapper.selectByExample(example);
		example.clear();
		if(tQuestionFileForms.size()>0) {
			List<Integer> values = new ArrayList<Integer>();
			//从数据库查找这个问题的所有文件信息
			for (int i = 0; i < tQuestionFileForms.size(); i++) {
				TFileForm fm = tFileFormMapper.selectByPrimaryKey(tQuestionFileForms.get(i).gettFileFormId());
				values.add(fm.getFileFormId());
			}
			
			TFileFormExample tFileFormExample = new TFileFormExample();
			Criteria criteria1 = tFileFormExample.createCriteria();
			criteria1.andFileFormTypeEqualTo(type);
			criteria1.andFileFormProjectIdEqualTo(msgId);
			criteria1.andFileFormNameEqualTo(name);
			
			criteria1.andFileFormIdIn(values);
			List<TFileForm> lists = tFileFormMapper.selectByExample(tFileFormExample);
			return lists;
		}
		return null;
		
	}
	
	public List<TFileForm> selectByTypeAndName(String type,String name){
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormTypeEqualTo(type);
		criteria.andFileFormNameEqualTo(name);
		return tFileFormMapper.selectByExample(tFileFormExample);
		 
	}
	
	public int deleteByTypeAndNameAndMsgId(int msgId, String type,String name){
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormTypeEqualTo(type);
		criteria.andFileFormNameEqualTo(name);
		criteria.andFileFormProjectIdEqualTo(msgId);
		return tFileFormMapper.deleteByExample(tFileFormExample);
	}
	
	public int deleteByNameAndMsgId(int msgId,String name){
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormNameEqualTo(name);
		criteria.andFileFormProjectIdEqualTo(msgId);
		return tFileFormMapper.deleteByExample(tFileFormExample);
	}
	
	public int deleteByPrimaryKey(int id){
		return tFileFormMapper.deleteByPrimaryKey(id);
	}
	
	@Transactional
	public List<TFileForm> selectByProId(int proId) {
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormProjectIdEqualTo(proId);
		List<TFileForm> lists = tFileFormMapper.selectByExample(tFileFormExample);
		return lists;
	}
	
	//判断文件是否已经存在
		@Transactional
		public TFileForm decideIsHave(List<TFileForm> TFileForms,String fileName) {
			for (TFileForm tFileForm : TFileForms) {
				if(tFileForm.getFileFormName().equals(fileName)) {
					return tFileForm;
				}	
			}
				
			return null;
		}
			
		
		@Transactional
		public int addOrUpdateFile(String fileNametotal,
				Map<String, MultipartFile> fileMap,String username,Long userId,
				HttpServletRequest request,int proId) {
			
			//保存运行结果
			int rows  = 0;
					
			TFileFormExample tFileFormExample = new TFileFormExample();
			Criteria criteria = tFileFormExample.createCriteria();
			criteria.andFileFormProjectIdEqualTo(proId);
			List<TFileForm> lists = tFileFormMapper.selectByExample(tFileFormExample);
					
			String[] fileNames = fileNametotal.split("&");
					
			//判断是否是第一次提交
			if(lists.size() == 0) {
				if(fileNametotal!=null||fileNametotal!="") {
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
							tPlanForm.setFileFormName(fileNames[index]);
									
							tPlanForm.setFileFormUserId(userId.intValue());
							tPlanForm.setFileFormPeople(username);
							tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							tPlanForm.setFileFormProjectId(proId);
							tPlanForm.setFileFormCurrentStatus("D");
							tPlanForm.setFileFormCurrentStatusNum(0);
							tPlanForm.setFileFormNotpassTimes(0);
							tPlanForm.setFileFormType("完工资料");
							File targetFile = AutoCreateFileName.createFileName(request, mf,proId);
							//设置存放的服务器路径
							tPlanForm.setFileFormPath(targetFile.getName());
							tFileFormMapper.insert(tPlanForm);
							rows++;
						}
						index++;
					}
				}
			}
			else {
				if(fileNametotal!=null||fileNametotal!="") {
					
					int index = 0;
					for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
						MultipartFile mf 	= entity.getValue();
						System.out.println(mf.getOriginalFilename());
						System.out.println("index:" + index);
						if(!mf.getOriginalFilename().equals("")){
							System.out.println(decideIsHave(lists,fileNames[index]));
							if(decideIsHave(lists,fileNames[index])!=null) {
								TFileForm tPlanForm = decideIsHave(lists,fileNames[index]);
								//AutoCreateFileName.updateFileName(request, mf, tPlanForm.getFileFormPath());
								File targetFile = AutoCreateFileName.createFileName(request, mf,proId);
								//设置存放的服务器路径
								tPlanForm.setFileFormPath(targetFile.getName());
								tPlanForm.setFileFormFilename(mf.getOriginalFilename());
								tPlanForm.setFileFormName(fileNames[index]);
								tPlanForm.setFileFormNotpassTimes(tPlanForm.getFileFormNotpassTimes() + 1);
								System.out.println(tPlanForm.getFileFormId());
								tFileFormMapper.updateByPrimaryKey(tPlanForm);
							} else {
								TFileForm tPlanForm = new TFileForm();
								System.out.println(mf.getOriginalFilename());
								System.out.println(mf.getName());
								tPlanForm.setFileFormFilename(mf.getOriginalFilename());
								tPlanForm.setFileFormName(fileNames[index]);
										
								tPlanForm.setFileFormUserId(userId.intValue());
								tPlanForm.setFileFormPeople(username);
								tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
								tPlanForm.setFileFormProjectId(proId);
								tPlanForm.setFileFormCurrentStatus("D");
								tPlanForm.setFileFormCurrentStatusNum(0);
								tPlanForm.setFileFormNotpassTimes(0);
								tPlanForm.setFileFormType("完工资料");
								File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
								//设置存放的服务器路径
								tPlanForm.setFileFormPath(targetFile.getName());
								tFileFormMapper.insert(tPlanForm);
							}
									
							rows++;
						}
						index++;
					}
				}
			}
			
			//需要从数据库删除的文件
			List<TFileForm> fLists = selectFileByProId(proId);
			for(String n : fileNames)
			{
				for(TFileForm tFileForm : fLists){
					if(n.equals(tFileForm.getFileFormName())){
						fLists.remove(tFileForm);
						break;
					}
				}
			}
			for(TFileForm tFileForm : fLists){
				deleteByNameAndMsgId(proId,tFileForm.getFileFormName());
				
			}
			
			
			return rows;
		}
		
		@Transactional
		public List<TFileForm> selectFileByProId(int proId) {
			TFileFormExample tFileFormExample = new TFileFormExample();
			Criteria criteria = tFileFormExample.createCriteria();
			criteria.andFileFormProjectIdEqualTo(proId);
			List<TFileForm> lists = tFileFormMapper.selectByExample(tFileFormExample);
			List<TFileForm> results = new ArrayList<TFileForm>();
			addExistsFile("资料提交目录",lists,results);
			addExistsFile("完工报告报审表",lists,results);
			addExistsFile("工程交工证明书",lists,results);
			addExistsFile("产品监造证明书",lists,results);
			addExistsFile("驻厂监造报告",lists,results);
			addExistsFile("出厂验收报告",lists,results);
			addExistsFile("服务评价报告",lists,results);
			addExistsFile("HSE文件",lists,results);
			addExistsFile("项目交接清单",lists,results);
			addExistsFile("被监理单位生产能力评价表",lists,results);
			//加入其余数据库中的文件
			for(TFileForm tFileForm : lists){
				results.add(tFileForm);
			}
			return results;
		}
		
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
	
	//如果为空，那么久没有修改成功，否则修改成功了
	@Transactional
	public String updateFileForm(int exaLinkId,Map<String, MultipartFile> fileMap, HttpServletRequest request) {
		String path = "";
		TFileForm form = tFileFormMapper.selectByPrimaryKey(exaLinkId);
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf 	= entity.getValue();
			File targetFile = AutoCreateFileName.createFileName(request, mf,form.getFileFormProjectId());
			path = targetFile.getName();
			form.setFileFormPath(path);
			tFileFormMapper.updateByPrimaryKey(form);
		}
		return "/upload/"+form.getFileFormProjectId() + "/" + path;
	}

}
