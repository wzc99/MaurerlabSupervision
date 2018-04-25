package sys.spvisor.core.service.work;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.dao.work.TQualityCertificateMapper;
import sys.spvisor.core.dao.work.TQualityCheckRecoderMapper;
import sys.spvisor.core.dao.work.TQualityFileRecoderMapper;
import sys.spvisor.core.dao.work.TQualityPeopleRecoderMapper;
import sys.spvisor.core.dao.work.TQualityReviewMapper;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TFileFormExample;
import sys.spvisor.core.entity.project.TFileFormExample.Criteria;
import sys.spvisor.core.entity.work.TQualityCertificate;
import sys.spvisor.core.entity.work.TQualityCertificateExample;
import sys.spvisor.core.entity.work.TQualityCheckRecoder;
import sys.spvisor.core.entity.work.TQualityCheckRecoderExample;
import sys.spvisor.core.entity.work.TQualityFileRecoder;
import sys.spvisor.core.entity.work.TQualityFileRecoderExample;
import sys.spvisor.core.entity.work.TQualityPeopleRecoder;
import sys.spvisor.core.entity.work.TQualityPeopleRecoderExample;
import sys.spvisor.core.entity.work.TQualityReview;
import sys.spvisor.core.entity.work.TQualityReviewExample;
import sys.spvisor.core.result.work.TQualityCertificateModel;
import sys.spvisor.core.result.work.TQualityCheckRecoderModel;
import sys.spvisor.core.result.work.TQualityFileRecoderModel;
import sys.spvisor.core.result.work.TQualityPeopleRecoderModel;
import sys.spvisor.core.result.work.TQualityReviewModel;
import sys.spvisor.core.service.project.FileService;


@Service
public class WorkService {
	
	@Autowired
	FileService fileService;
	
	@Autowired
	TFileFormMapper tFileFormMapper;
	@Autowired
	TQualityFileRecoderMapper tQualityFileRecoderMapper;	//生产厂质量体系文件审核记录
	@Autowired
	TQualityPeopleRecoderMapper tQualityPeopleRecoderMapper;	//生产厂人员资质审查记录
	@Autowired
	TQualityCheckRecoderMapper tQualityCheckRecoderMapper;	//生产厂设备仪器检定审查记录
	@Autowired
	TQualityCertificateMapper tQualityCertificateMapper;  //原材料质量证明书审核记录
	@Autowired
	TQualityReviewMapper tQualityReviewMapper;  //原材料复验报告审核记录

	//获取项目中的生产厂设备仪器检定审查记录
	@Transactional
	public List<TQualityCheckRecoder> getTQualityCheckRecoder(int proId) {
		TQualityCheckRecoderExample example = new TQualityCheckRecoderExample();
		sys.spvisor.core.entity.work.TQualityCheckRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityCheckRecoder> result = tQualityCheckRecoderMapper.selectByExample(example);
		return result;
	}
	
	//获取项目中的生产厂质量体系文件审核记录
	public List<TQualityFileRecoder> getTQualityFileRecoder(int proId) {
		TQualityFileRecoderExample example = new TQualityFileRecoderExample();
		sys.spvisor.core.entity.work.TQualityFileRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityFileRecoder> result = tQualityFileRecoderMapper.selectByExample(example);
		return result;
	}
	
	//获取项目中的生产厂人员资质审查记录
	public List<TQualityPeopleRecoder> getTQualityPeopleRecoder(int proId) {
		TQualityPeopleRecoderExample example = new TQualityPeopleRecoderExample();
		sys.spvisor.core.entity.work.TQualityPeopleRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityPeopleRecoder> result = tQualityPeopleRecoderMapper.selectByExample(example);
		return result;
	}
	
	//获取项目中的原材料质量证明书审核记录
	public List<TQualityCertificate> getTQualityCertificate(int proId) {
		TQualityCertificateExample example = new TQualityCertificateExample();
		sys.spvisor.core.entity.work.TQualityCertificateExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityCertificate> lists = tQualityCertificateMapper.selectByExample(example);
		return lists;
	}
	
	//获取项目中的原材料复验报告审核记录
	public List<TQualityReview> getTQualityReview(int proId) {
		TQualityReviewExample example = new TQualityReviewExample();
		sys.spvisor.core.entity.work.TQualityReviewExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityReview> lists = tQualityReviewMapper.selectByExample(example);
		return lists;
	}
	
	@Transactional
	public int addOrUpdateBeginWork(String fileNametotal,
			Map<String, MultipartFile> fileMap, String username, Long userId,
			HttpServletRequest request, int proId) {
		
		//保存运行结果
		int rows  = 0;
		
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormProjectIdEqualTo(proId);
		criteria.andFileFormTypeEqualTo("开工报审");
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
						tPlanForm.setFileFormType("开工报审");
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
						for(TFileForm tFileForm:lists){
							System.out.println(tFileForm.getFileFormName());
						}
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
							tPlanForm.setFileFormType("开工报审");
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
		
		System.out.println("删除需要从数据库删除的开工报审文件");
		
		//需要从数据库删除的开工报审文件
		List<TFileForm> fLists = initBeginWorkByProId(proId);
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
			fileService.deleteByTypeAndNameAndMsgId(proId, "开工报审", tFileForm.getFileFormName());
			
		}
		
		return rows;
	}
	
	//获取数据库中的开工报审文件
	@Transactional
	public List<TFileForm> initBeginWorkByProId(int proId) {
		TFileFormExample tFileFormExample = new TFileFormExample();
		Criteria criteria = tFileFormExample.createCriteria();
		criteria.andFileFormProjectIdEqualTo(proId);
		criteria.andFileFormTypeEqualTo("开工报审");
		List<TFileForm> lists = tFileFormMapper.selectByExample(tFileFormExample);
		List<TFileForm> results = new ArrayList<TFileForm>();
		//判断数据库的开工报审文件中是否有以下文件，如果没有则加上
		addExistsFile("开工报审表",lists,results);
		addExistsFile("方案报审表",lists,results);
		addExistsFile("检验设备仪器检定证书",lists,results);
		addExistsFile("入厂监理会议纪要",lists,results);
		addExistsFile("进度计划表",lists,results);
		//加入其余数据库中的文件
		for(TFileForm tFileForm : lists){
			results.add(tFileForm);
		}
		return results;
	}
	
	//往TFileForms添加已经存储在数据库中的文件信息
	@Transactional
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
	public int addTQualityCertificate(TQualityCertificateModel model,
			Map<String, MultipartFile> fileMap, String username, Long userId,
			HttpServletRequest request, int proId) {
		List<TQualityCertificate> lists = model.getList();
		//记录改变了和新增了几行
		int rows = 0;
		
		//查看是否是第一次添加
		TQualityCertificateExample example = new TQualityCertificateExample();
		sys.spvisor.core.entity.work.TQualityCertificateExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityCertificate> originalLists = tQualityCertificateMapper.selectByExample(example);
		if(originalLists.size() == 0) {
			
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityCertificate recoder = lists.get(index);
				while(recoder.getMaterialName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				if( recoder.getMaterialName() != null && recoder.getMaterialName().length() != 0 ) {
					recoder.setProId(proId);
					recoder.setUserId(userId.intValue());
					//recoder.setUploadTime(new Date(new java.util.Date().getTime()));
					if(!mf.getOriginalFilename().equals("")){
						//如果提交了问价就保存，没有就不保存
						recoder.setFileName(mf.getOriginalFilename());
						//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
						//设置存放的服务器路径
						recoder.setPath(targetFile.getName());
						recoder.setSaveName(targetFile.getName());
					}
					tQualityCertificateMapper.insert(recoder);
					rows++;
				}
				index++;
			}
		}else {
			//如果不是第一次添加
			int index = 0;
			
			//把删除的从数据库中去掉
			for (int i = 0; i < originalLists.size(); i++) {
				for (int j = 0; j < model.getList().size(); j++) {
					//TODO
					//这里需要什么条件才能判别是同一项记录
					if(originalLists.get(i).getMaterialName().equals(model.getList().get(j).getMaterialName())&&
							originalLists.get(i).getMaterialNum().equals(model.getList().get(j).getMaterialNum())
							&&originalLists.get(i).getSpecifications().equals(model.getList().get(j).getSpecifications())) {
						originalLists.remove(i);
						i--;
						break;
					}
				}
			}
			
			//这样剩下的就是要删除的元素了
			for (int i = 0; i < originalLists.size(); i++) {
				tQualityCertificateMapper.deleteByPrimaryKey(originalLists.get(i).getId());
			}
			
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityCertificate recoder = lists.get(index);
				while(recoder.getMaterialName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				if( recoder.getMaterialName() != null && recoder.getMaterialName().length() != 0 ) {
					TQualityCertificate isBoolean = checkIsTQualityCertificate(lists.get(index),proId);
					//如果原来已经存在了，
					if(isBoolean != null) {
						//TODO
						//看到底用几个条件判断是否是一条记录
						//isBoolean.setDesignName(recoder.getDesignName());
						//isBoolean.setUnit(recoder.getUnit());
						//isBoolean.setNumVersion(recoder.getNumVersion());
						isBoolean.setUserId(userId.intValue());
						isBoolean.setCheckResult(recoder.getCheckResult());
						isBoolean.setCheckDate(recoder.getCheckDate());
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了文件就保存，没有就不保存
							isBoolean.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
							//设置存放的服务器路径
							isBoolean.setPath(targetFile.getName());
							isBoolean.setSaveName(targetFile.getName());
						}
						tQualityCertificateMapper.updateByPrimaryKey(isBoolean);
					}else {
						recoder.setProId(proId);
						recoder.setUserId(userId.intValue());
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了问价就保存，没有就不保存
							recoder.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
							//设置存放的服务器路径
							recoder.setPath(targetFile.getName());
							recoder.setSaveName(targetFile.getName());
						}
						tQualityCertificateMapper.insert(recoder);
					}
					rows++;
					index++;
				}
					
			}
		}
		
		return rows;
	}
	
	@Transactional
	public TQualityCertificate checkIsTQualityCertificate(TQualityCertificate recoder,int proId) {
		TQualityCertificateExample example = new TQualityCertificateExample();
		sys.spvisor.core.entity.work.TQualityCertificateExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		if(!recoder.getMaterialName().trim().isEmpty()) {
			criteria.andMaterialNameEqualTo(recoder.getMaterialName());
		}
		if(!recoder.getMaterialNum().trim().isEmpty()) {
			criteria.andMaterialNumEqualTo(recoder.getMaterialNum());
		}
		if(!recoder.getSpecifications().trim().isEmpty()) {
			criteria.andSpecificationsEqualTo(recoder.getSpecifications());
		}
		//TODO
		//看到底用几个条件判断是否是一条记录
		
		List<TQualityCertificate> lists = tQualityCertificateMapper.selectByExample(example);
		if(lists.size()>0) {
			return lists.get(0);
		}
		return null;
	}
	
	@Transactional
	public int addTQualityReview(TQualityReviewModel model,
			Map<String, MultipartFile> fileMap, String username, Long userId,
			HttpServletRequest request, int proId) {
		List<TQualityReview> lists = model.getList();
		//记录改变了和新增了几行
		int rows = 0;
		
		//查看是否是第一次添加
		TQualityReviewExample example = new TQualityReviewExample();
		sys.spvisor.core.entity.work.TQualityReviewExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityReview> originalLists = tQualityReviewMapper.selectByExample(example);
		if(originalLists.size() == 0) {
			
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityReview recoder = lists.get(index);
				while(recoder.getMaterialName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				if( recoder.getMaterialName() != null && recoder.getMaterialName().length() != 0 ) {
					recoder.setProId(proId);
					recoder.setUserId(userId.intValue());
					//recoder.setUploadTime(new Date(new java.util.Date().getTime()));
					if(!mf.getOriginalFilename().equals("")){
						//如果提交了问价就保存，没有就不保存
						recoder.setFileName(mf.getOriginalFilename());
						//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
						//设置存放的服务器路径
						recoder.setPath(targetFile.getName());
						recoder.setSaveName(targetFile.getName());
					}
					tQualityReviewMapper.insert(recoder);
					rows++;
				}
				index++;
			}
		}else {
			//如果不是第一次添加
			int index = 0;
			
			//把删除的从数据库中去掉
			for (int i = 0; i < originalLists.size(); i++) {
				for (int j = 0; j < model.getList().size(); j++) {
					//TODO
					//这里需要什么条件才能判别是同一项记录
					if(originalLists.get(i).getMaterialName().equals(model.getList().get(j).getMaterialName())&&
							originalLists.get(i).getMaterialNum().equals(model.getList().get(j).getMaterialNum())
							&&originalLists.get(i).getSpecifications().equals(model.getList().get(j).getSpecifications())) {
						originalLists.remove(i);
						i--;
						break;
					}
				}
			}
			
			//这样剩下的就是要删除的元素了
			for (int i = 0; i < originalLists.size(); i++) {
				tQualityReviewMapper.deleteByPrimaryKey(originalLists.get(i).getId());
			}
			
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityReview recoder = lists.get(index);
				while(recoder.getMaterialName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				if( recoder.getMaterialName() != null && recoder.getMaterialName().length() != 0 ) {
					TQualityReview isBoolean = checkIsTQualityReview(lists.get(index),proId);
					//如果原来已经存在了，
					if(isBoolean != null) {
						//TODO
						//看到底用几个条件判断是否是一条记录
						isBoolean.setUserId(userId.intValue());
						isBoolean.setCheckResult(recoder.getCheckResult());
						isBoolean.setCheckDate(recoder.getCheckDate());
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了文件就保存，没有就不保存
							isBoolean.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
							//设置存放的服务器路径
							isBoolean.setPath(targetFile.getName());
							isBoolean.setSaveName(targetFile.getName());
						}
						tQualityReviewMapper.updateByPrimaryKey(isBoolean);
					}else {
						recoder.setProId(proId);
						recoder.setUserId(userId.intValue());
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了问价就保存，没有就不保存
							recoder.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
							//设置存放的服务器路径
							recoder.setPath(targetFile.getName());
							recoder.setSaveName(targetFile.getName());
						}
						tQualityReviewMapper.insert(recoder);
					}
					rows++;
					index++;
				}
					
			}
		}
		return rows;
	}
	
	@Transactional
	public TQualityReview checkIsTQualityReview(TQualityReview recoder,int proId) {
		TQualityReviewExample example = new TQualityReviewExample();
		sys.spvisor.core.entity.work.TQualityReviewExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		if(!recoder.getMaterialName().trim().isEmpty()) {
			criteria.andMaterialNameEqualTo(recoder.getMaterialName());
		}
		if(!recoder.getMaterialNum().trim().isEmpty()) {
			criteria.andMaterialNumEqualTo(recoder.getMaterialNum());
		}
		if(!recoder.getSpecifications().trim().isEmpty()) {
			criteria.andSpecificationsEqualTo(recoder.getSpecifications());
		}
		//TODO
		//看到底用几个条件判断是否是一条记录
		
		List<TQualityReview> lists = tQualityReviewMapper.selectByExample(example);
		if(lists.size()>0) {
			return lists.get(0);
		}
		return null;
	}
	
	
	@Transactional
	public int addTQualityFileRecoder(TQualityFileRecoderModel model,
			Map<String, MultipartFile> fileMap, String username, Long userId,
			HttpServletRequest request, int proId) {
		List<TQualityFileRecoder> lists = model.getList();
		//记录改变了和新增了几行
		int rows = 0;
		
		//查看是否是第一次添加
		TQualityFileRecoderExample example = new TQualityFileRecoderExample();
		sys.spvisor.core.entity.work.TQualityFileRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityFileRecoder> originalLists = tQualityFileRecoderMapper.selectByExample(example);
		if(originalLists.size() == 0) {
			
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityFileRecoder recoder = lists.get(index);
				while(recoder.getDesignName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				if( recoder.getDesignName() != null && recoder.getDesignName().length() != 0 ) {
					recoder.setProId(proId);
					recoder.setUserId(userId.intValue());
					recoder.setUploadTime(new Date(new java.util.Date().getTime()));
					if(!mf.getOriginalFilename().equals("")){
						//如果提交了问价就保存，没有就不保存
						recoder.setFileName(mf.getOriginalFilename());
						//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
						//设置存放的服务器路径
						recoder.setPath(targetFile.getName());
						recoder.setFileSaveName(targetFile.getName());
					}
					tQualityFileRecoderMapper.insert(recoder);
					rows++;
				}
				index++;
			}
		}else {
			//如果不是第一次添加
			int index = 0;
			
			//把删除的从数据库中去掉
			for (int i = 0; i < originalLists.size(); i++) {
				for (int j = 0; j < model.getList().size(); j++) {
					//TODO
					//这里需要什么条件才能判别是同一项生产厂质量体系文件审核记录
					if(originalLists.get(i).getDesignName().equals(model.getList().get(j).getDesignName())&&
							originalLists.get(i).getNumVersion().equals(model.getList().get(j).getNumVersion())
							&&originalLists.get(i).getUnit().equals(model.getList().get(j).getUnit())) {
						originalLists.remove(i);
						i--;
						break;
					}
				}
			}
			
			//这样剩下的就是要删除的元素了
			for (int i = 0; i < originalLists.size(); i++) {
				tQualityFileRecoderMapper.deleteByPrimaryKey(originalLists.get(i).getId());
			}
			
			
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityFileRecoder recoder = lists.get(index);
				while(recoder.getDesignName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				if( recoder.getDesignName() != null && recoder.getDesignName().length() != 0 ) {
					TQualityFileRecoder isBoolean = checkIsTQualityFileRecoder(lists.get(index),proId);
					//如果原来已经存在了，
					if(isBoolean != null) {
						//TODO
						//看到底用几个条件判断是否是一条记录
						//isBoolean.setDesignName(recoder.getDesignName());
						//isBoolean.setUnit(recoder.getUnit());
						//isBoolean.setNumVersion(recoder.getNumVersion());
						isBoolean.setUploadTime(new Date(new java.util.Date().getTime()));
						isBoolean.setValidDate(recoder.getValidDate());
						isBoolean.setUserId(userId.intValue());
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了问价就保存，没有就不保存
							isBoolean.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
							//设置存放的服务器路径
							isBoolean.setPath(targetFile.getName());
							isBoolean.setFileSaveName(targetFile.getName());
						}
						tQualityFileRecoderMapper.updateByPrimaryKey(isBoolean);
					}else {
						
						recoder.setProId(proId);
						recoder.setUserId(userId.intValue());
						recoder.setUploadTime(new Date(new java.util.Date().getTime()));
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了问价就保存，没有就不保存
							recoder.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf ,proId);
							//设置存放的服务器路径
							recoder.setPath(targetFile.getName());
							recoder.setFileSaveName(targetFile.getName());
						}
						tQualityFileRecoderMapper.insert(recoder);
					}
					rows++;
					index++;
				}
					
			}
		}
		
		return rows;
	}
	
	@Transactional
	public TQualityFileRecoder checkIsTQualityFileRecoder(TQualityFileRecoder recoder,int proId) {
		TQualityFileRecoderExample example = new TQualityFileRecoderExample();
		sys.spvisor.core.entity.work.TQualityFileRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		if(!recoder.getDesignName().trim().isEmpty()) {
			criteria.andDesignNameEqualTo(recoder.getDesignName());
		}
		if(!recoder.getNumVersion().trim().isEmpty()) {
			criteria.andNumVersionEqualTo(recoder.getNumVersion());
		}
		//TODO
		//看到底用几个条件判断是否是一条记录
		
		if(!recoder.getUnit().trim().isEmpty()) {
			criteria.andUnitEqualTo(recoder.getUnit());
		}
		/*if(!recoder.getValidDate().trim().isEmpty()) {
			criteria.andValidDateEqualTo(recoder.getValidDate());
		}*/
		List<TQualityFileRecoder> lists = tQualityFileRecoderMapper.selectByExample(example);
		if(lists.size()>0) {
			return lists.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public List<TQualityFileRecoder> initTQualityFileRecoder(int proId) {
		TQualityFileRecoderExample example = new TQualityFileRecoderExample();
		sys.spvisor.core.entity.work.TQualityFileRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityFileRecoder> lists = tQualityFileRecoderMapper.selectByExample(example);
		return lists;
	}

	@Transactional
	public List<TQualityPeopleRecoder> initTQualityPeopleRecoder(int proId) {
		TQualityPeopleRecoderExample example = new TQualityPeopleRecoderExample();
		TQualityPeopleRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityPeopleRecoder> lists = tQualityPeopleRecoderMapper.selectByExample(example);
		return lists;
	}
	
	
	@Transactional
	public int addTQualityPeopleRecoder(TQualityPeopleRecoderModel model,
			Map<String, MultipartFile> fileMap, String username, Long userId,
			HttpServletRequest request, int proId) {
		List<TQualityPeopleRecoder> lists = model.getList();
		//记录改变了和新增了几行
		int rows = 0;
		
		//查看是否是第一次添加
		/*TQualityFileRecoderExample example = new TQualityFileRecoderExample();
		sys.spvisor.core.entity.work.TQualityFileRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);*/
		List<TQualityPeopleRecoder> originalLists = initTQualityPeopleRecoder(proId);
		if(originalLists.size() == 0) {
			
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityPeopleRecoder recoder = lists.get(index);
				while(recoder.getUserName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				if( recoder.getUserName() != null && recoder.getUserName().length() != 0 ) {
				//有可能中间空着不填，就不添加到数据库里面了
					recoder.setProId(proId);
					recoder.setUserId(userId.intValue());
					recoder.setPostTime(new Date(new java.util.Date().getTime()));
					if(!mf.getOriginalFilename().equals("")){
						//如果提交了问价就保存，没有就不保存
						recoder.setFileName(mf.getOriginalFilename());
						//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						File targetFile = AutoCreateFileName.createFileName(request, mf, proId);
						//设置存放的服务器路径
						recoder.setPath(targetFile.getName());
						recoder.setFileRecoderName(targetFile.getName());
					}
					tQualityPeopleRecoderMapper.insert(recoder);
					rows++;
				}
				index++;
			}
		}else {
			//如果不是第一次添加
			int index = 0;
			
			//把删除的从数据库中去掉
			for (int i = 0; i < originalLists.size(); i++) {
				for (int j = 0; j < model.getList().size(); j++) {
					//TODO
					//这里需要什么条件才能判别是同一项生产厂质量体系文件审核记录
					/*&&originalLists.get(i).getJob().equals(model.getList().get(j).getJob())
					&&originalLists.get(i).getNum().equals(model.getList().get(j).getNum())
					&&originalLists.get(i).getLicenseUnit().equals(model.getList().get(j).getLicenseUnit())
					&&originalLists.get(i).getValidDate().equals(model.getList().get(j).getValidDate())*/
					if(originalLists.get(i).getUserName().equals(model.getList().get(j).getUserName())&&
							originalLists.get(i).getZhengshuName().equals(model.getList().get(j).getZhengshuName())
							) {
						originalLists.remove(i);
						i--;
						break;
					}
				}
			}
			
			//这样剩下的就是要删除的元素了
			for (int i = 0; i < originalLists.size(); i++) {
				tQualityPeopleRecoderMapper.deleteByPrimaryKey(originalLists.get(i).getId());
			}
			
			
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityPeopleRecoder recoder = lists.get(index);
				while(recoder.getUserName() == null) {
					index++;
					recoder = lists.get(index);
				}

				//有可能中间空着不填，就不添加到数据库里面了
				if(recoder.getUserName() != null  && recoder.getUserName().length() != 0) {
					TQualityPeopleRecoder isBoolean = checkIsTQualityPeopleRecoder(lists.get(index),proId);
					//如果原来已经存在了，
					if(isBoolean != null) {
						//TODO
						//看到底用几个条件判断是否是一条记录
						//isBoolean.setDesignName(recoder.getDesignName());
						//isBoolean.setUnit(recoder.getUnit());
						//isBoolean.setNumVersion(recoder.getNumVersion());
						isBoolean.setPostTime(new Date(new java.util.Date().getTime()));
						isBoolean.setValidDate(recoder.getValidDate());
						isBoolean.setUserId(userId.intValue());
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了问价就保存，没有就不保存
							isBoolean.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf, proId);
							//设置存放的服务器路径
							isBoolean.setPath(targetFile.getName());
							isBoolean.setFileRecoderName(targetFile.getName());
						}
						tQualityPeopleRecoderMapper.updateByPrimaryKey(isBoolean);
					}else {
						
						recoder.setProId(proId);
						recoder.setUserId(userId.intValue());
						recoder.setPostTime(new Date(new java.util.Date().getTime()));
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了问价就保存，没有就不保存
							recoder.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf,proId);
							//设置存放的服务器路径
							recoder.setPath(targetFile.getName());
							recoder.setFileRecoderName(targetFile.getName());
						}
						tQualityPeopleRecoderMapper.insert(recoder);
					}
					rows++;
					index++;
				}
					
			}
		}
		
		return rows;
	}
	
	@Transactional
	public TQualityPeopleRecoder checkIsTQualityPeopleRecoder(TQualityPeopleRecoder recoder,int proId) {
		TQualityPeopleRecoderExample example = new TQualityPeopleRecoderExample();
		TQualityPeopleRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		
		if(!recoder.getUserName().trim().isEmpty()) {
			criteria.andUserNameEqualTo(recoder.getUserName());
		}
		if(!recoder.getJob().trim().isEmpty()) {
			criteria.andJobEqualTo(recoder.getJob());
		}
		//TODO
		//看到底用几个条件判断是否是一条记录
		
		if(!recoder.getZhengshuName().trim().isEmpty()) {
			criteria.andZhengshuNameEqualTo(recoder.getZhengshuName());
		}
		if(!recoder.getNum().trim().isEmpty()) {
			criteria.andNumEqualTo(recoder.getNum());
		}
		if(!recoder.getLicenseUnit().trim().isEmpty()) {
			criteria.andLicenseUnitEqualTo(recoder.getLicenseUnit());
		}
		if(!recoder.getValidDate().trim().isEmpty()) {
			criteria.andValidDateEqualTo(recoder.getValidDate());
		}
		List<TQualityPeopleRecoder> lists = tQualityPeopleRecoderMapper.selectByExample(example);
		if(lists.size()>0) {
			return lists.get(0);
		}
		return null;
		
	}

	@Transactional
	public List<TQualityCheckRecoder> initTQualityCheckRecoder(int proId) {
		TQualityCheckRecoderExample example = new TQualityCheckRecoderExample();
		TQualityCheckRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TQualityCheckRecoder> lists = tQualityCheckRecoderMapper.selectByExample(example);
		return lists;
	}

	@Transactional
	public int addAndUpdateQualityCheckRecoder(TQualityCheckRecoderModel model,
			Map<String, MultipartFile> fileMap, String username, Long userId,
			HttpServletRequest request, int proId) {
		List<TQualityCheckRecoder> lists = model.getList();
		
		//记录改变了和新增了几行
		int rows = 0;
		
		//查看是否是第一次添加
		/*TQualityFileRecoderExample example = new TQualityFileRecoderExample();
		sys.spvisor.core.entity.work.TQualityFileRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);*/
		List<TQualityCheckRecoder> originalLists = initTQualityCheckRecoder(proId);
		if(originalLists.size() == 0) {
			
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityCheckRecoder recoder = lists.get(index);
				while(recoder.getDeviceName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				//!recoder.getDeviceName().trim().isEmpty()
				//recoder.getDeviceName().length() != 0 ||
				if( recoder.getDeviceName() != null && recoder.getDeviceName().length() != 0 ) {
					recoder.setProId(proId);
					recoder.setUserId(userId.intValue());
					recoder.setPostTime(new Date(new java.util.Date().getTime()));
					if(!mf.getOriginalFilename().equals("")){
						//如果提交了问价就保存，没有就不保存
						recoder.setFileName(mf.getOriginalFilename());
						//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						File targetFile = AutoCreateFileName.createFileName(request, mf,proId);
						//设置存放的服务器路径
						recoder.setPath(targetFile.getName());
						recoder.setFileSaveName(targetFile.getName());
					}
					tQualityCheckRecoderMapper.insert(recoder);
					rows++;
				}
				index++;
			}
		}else {
			//如果不是第一次添加
			int index = 0;
			
			//把删除的从数据库中去掉
			for (int i = 0; i < originalLists.size(); i++) {
				for (int j = 0; j < model.getList().size(); j++) {
					//TODO
					//这里需要什么条件才能判别是同一项生产厂质量体系文件审核记录
					/*&&originalLists.get(i).getJob().equals(model.getList().get(j).getJob())
					&&originalLists.get(i).getNum().equals(model.getList().get(j).getNum())
					&&originalLists.get(i).getLicenseUnit().equals(model.getList().get(j).getLicenseUnit())
					&&originalLists.get(i).getValidDate().equals(model.getList().get(j).getValidDate())*/
					if(originalLists.get(i).getDeviceName().equals(model.getList().get(j).getDeviceName())&&
							originalLists.get(i).getDeviceNo().equals(model.getList().get(j).getDeviceNo())
							) {
						originalLists.remove(i);
						i--;
						break;
					}
				}
			}
			
			//这样剩下的就是要删除的元素了
			for (int i = 0; i < originalLists.size(); i++) {
				tQualityCheckRecoderMapper.deleteByPrimaryKey(originalLists.get(i).getId());
			}
			
			
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TQualityCheckRecoder recoder = lists.get(index);
				while(recoder.getDeviceName() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				//!recoder.getDeviceName().trim().isEmpty()
				//recoder.getDeviceName().length() != 0 ||
				if( recoder.getDeviceName() != null && recoder.getDeviceName().length() != 0 ) {
					TQualityCheckRecoder isBoolean = checkIsTQualityCheckRecoder(lists.get(index),proId);
					//如果原来已经存在了，
					if(isBoolean != null) {
						//TODO
						//看到底用几个条件判断是否是一条记录
						//isBoolean.setDesignName(recoder.getDesignName());
						//isBoolean.setUnit(recoder.getUnit());
						//isBoolean.setNumVersion(recoder.getNumVersion());
						isBoolean.setPostTime(new Date(new java.util.Date().getTime()));
						isBoolean.setValidDate(recoder.getValidDate());
						isBoolean.setUserId(userId.intValue());
						if(!mf.getOriginalFilename().equals("")){
							//如果提交了问价就保存，没有就不保存
							isBoolean.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf,proId);
							//设置存放的服务器路径
							isBoolean.setPath(targetFile.getName());
							isBoolean.setFileSaveName(targetFile.getName());
						}
						tQualityCheckRecoderMapper.updateByPrimaryKey(isBoolean);
					}else {
						
						recoder.setProId(proId);
						recoder.setUserId(userId.intValue());
						recoder.setPostTime(new Date(new java.util.Date().getTime()));
						if(!mf.getOriginalFilename().equals("")||recoder.getDeviceName().length() != 0 ){
							//如果提交了问价就保存，没有就不保存
							recoder.setFileName(mf.getOriginalFilename());
							//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
							File targetFile = AutoCreateFileName.createFileName(request, mf,proId);
							//设置存放的服务器路径
							recoder.setPath(targetFile.getName());
							recoder.setFileSaveName(targetFile.getName());
						}
						tQualityCheckRecoderMapper.insert(recoder);
					}
					rows++;
					index++;
				}
					
			}
		}
		
		return rows;
	}
	
	@Transactional
	public TQualityCheckRecoder checkIsTQualityCheckRecoder(TQualityCheckRecoder recoder,int proId) {
		TQualityCheckRecoderExample example = new TQualityCheckRecoderExample();
		TQualityCheckRecoderExample.Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		
		if(!recoder.getDeviceName().trim().isEmpty()) {
			criteria.andDeviceNameEqualTo(recoder.getDeviceName());
		}
		if(!recoder.getDeviceNo().trim().isEmpty()) {
			criteria.andDeviceNoEqualTo(recoder.getDeviceNo());
		}
		//TODO
		//看到底用几个条件判断是否是一条记录
		
		if(!recoder.getYunxingQingkuang().trim().isEmpty()) {
			criteria.andYunxingQingkuangEqualTo(recoder.getYunxingQingkuang());
		}
		if(!recoder.getProductFactory().trim().isEmpty()) {
			criteria.andProductFactoryEqualTo(recoder.getProductFactory());
		}
		if(!recoder.getBookNo().trim().isEmpty()) {
			criteria.andBookNoEqualTo(recoder.getBookNo());
		}
		if(!recoder.getValidDate().trim().isEmpty()) {
			criteria.andValidDateEqualTo(recoder.getValidDate());
		}
		List<TQualityCheckRecoder> lists = tQualityCheckRecoderMapper.selectByExample(example);
		if(lists.size()>0) {
			return lists.get(0);
		}
		return null;

	}
}
