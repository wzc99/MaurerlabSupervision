package sys.spvisor.core.service.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.criteria.file.FileCriteria;
import sys.spvisor.core.criteria.people.PeopleCriteria;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.file.FileDao;
import sys.spvisor.core.dao.file.TCompanyFileManageMapper;
import sys.spvisor.core.dao.people.PeopleDao;
import sys.spvisor.core.entity.ana.TPeoplePoststatus;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.file.FileInfo;
import sys.spvisor.core.entity.file.TCompanyFileManage;
import sys.spvisor.core.entity.file.TCompanyFileManageExample;
import sys.spvisor.core.entity.file.TCompanyFileManageModel;
import sys.spvisor.core.entity.people.PeopleToday;
import sys.spvisor.core.entity.work.TQualityPeopleRecoder;
import sys.spvisor.core.service.project.FileService;

@Service
public class FileManageService {

	
	@Autowired
	private FileDao FileDao;
	
	@Autowired
	private TUserMapper TUserMapper;
	
	@Autowired
	private TCompanyFileManageMapper TCompanyFileManageMapper;
	
	//查询当前人员动态表
	@Transactional
	public List<FileInfo> selectByExample(FileCriteria params) {
		
		/*if(!params.getFileName().trim().isEmpty()) {
			
		}*/
		if(params.getFileName() != null) {
			params.setFileName("%" +params.getFileName().trim() + "%");
		}
		
		if(params.getFileContentIntroduction()!= null) {
			params.setFileContentIntroduction( "%" + params.getFileContentIntroduction().trim() + "%");
		}
		if(params.getReleaseOrganization() != null) {
			params.setReleaseOrganization( "%" + params.getReleaseOrganization() +  "%");
		}
		
		List<FileInfo> lists  = FileDao.query(params);
		
		for (int i = 0; i < lists.size(); i++) {
			if(lists.get(i).getPostUserId()!= null  ){
				String userName ="";
				userName= getUserName(lists.get(i).getPostUserId());
				lists.get(i).setUserName(userName);
			}			
		}
		
		return lists;
		
	}
	
	@Transactional
	public String getUserName(Integer postUserId) {
		// TODO Auto-generated method stub
		
		String UserName = "";
		if(postUserId == null){
			return UserName;
		}else{
			TUser TUser  = TUserMapper.selectByPrimaryKey(postUserId);
			UserName = TUser.getUserName();
			return UserName;	
		}
	}

	//查询当前人员动态表的总数
		@Transactional
		public int selectByExampleCount(FileCriteria params) {
			
			List<FileInfo>  lists = FileDao.queryCount(params);
			int count = lists.size();
			return count;
			
		}
		
		@Transactional
		public int addFileRecoder(TCompanyFileManageModel model,
				Map<String, MultipartFile> fileMap, String username,
				Long userId, HttpServletRequest req, int fileTypeId) {
			// TODO Auto-generated method stub
			
			List<TCompanyFileManage> lists = model.getList();
			//记录改变了和新增了几行
			int rows = 0;
			
			
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				System.out.println(mf.getOriginalFilename());
				System.out.println("index:" + index);
				TCompanyFileManage recoder = lists.get(index);
				while(recoder.getFileContentIntroduction() == null) {
					index++;
					recoder = lists.get(index);
				}
				
				//有可能中间空着不填，就不添加到数据库里面了
				if( recoder.getFileContentIntroduction() != null && recoder.getFileContentIntroduction().length() != 0 ) {
					recoder.setType(fileTypeId);
					if(!mf.getOriginalFilename().equals("")){
						//如果提交了问价就保存，没有就不保存
						recoder.setFileName(mf.getOriginalFilename());
						//tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
						File targetFile = AutoCreateFileName.createFileName(req, mf,0);
						//设置存放的服务器路径
						recoder.setPostPath(targetFile.getName());
						recoder.setType(fileTypeId);
						recoder.setPostUserId(Integer.parseInt(String.valueOf(userId)));
						recoder.setPostDate(new Date());
						recoder.setReleaseDate(new Date());
						recoder.setValidDate(new Date());
						
					}
					TCompanyFileManageMapper.insert(recoder);
					rows++;
				}
				index++;
			}
			
			return rows;
		}
		
		@Transactional
		public void EditFileData(FileInfo file,Map<String, MultipartFile> fileMap,HttpServletRequest req) throws IOException{
			// TODO Auto-generated method stub
			/*TCompanyFileManageExample example = new TCompanyFileManageExample();
			sys.spvisor.core.entity.file.TCompanyFileManageExample.Criteria criteria  = example.createCriteria();
			criteria.andFileNameEqualTo(file.getFileName());
			criteria.andReleaseOrganizationEqualTo(file.getReleaseOrganization());
			criteria.andFileContentIntroductionEqualTo(file.getFileContentIntroduction());
			criteria.andReleaseDateEqualTo(file.getReleaseDate());
			criteria.andPostDateEqualTo(file.getPostDate());
			criteria.andValidDateEqualTo(file.getValidDate());
			TCompanyFileManageMapper.updateByExample(record, example);*/
			
			TCompanyFileManage file_m = new TCompanyFileManage();
			
			file_m.setFileId(file.getFileId());
			file_m.setType(file.getType());
			/**/
			file_m.setFileContentIntroduction(file.getFileContentIntroduction());
			file_m.setReleaseOrganization(file.getReleaseOrganization());
			file_m.setReleaseDate(file.getReleaseDate());
//			file_m.setPostDate(file.getPostDate());
			file_m.setValidDate(file.getValidDate());
			
			
			int index = 0;
			for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
				MultipartFile mf 	= entity.getValue();
				if(!mf.getOriginalFilename().equals("")){
					File file1 = AutoCreateFileName.createFileName(req, mf, 0);
					file_m.setPostPath(file1.getName());
					file_m.setFileName(mf.getOriginalFilename());
					index++;
					break;
				}
			}
			if(index == 0) {
				file_m.setFileName(file.getFileName());
			}
			
			TCompanyFileManageMapper.updateByPrimaryKeySelective(file_m);
			System.out.println(index);
			
		}

		@Transactional
		public FileInfo selectFileByFileId(int fileId) {
			// TODO Auto-generated method stub
			
			TCompanyFileManage file = TCompanyFileManageMapper.selectByPrimaryKey(fileId);
			FileInfo info = new FileInfo();
			info.setType(file.getType());
			info.setFileId(file.getFileId());
			info.setFileName(file.getFileName());
			info.setFileContentIntroduction(file.getFileContentIntroduction());
			info.setReleaseOrganization(file.getReleaseOrganization());
			info.setPostDate(file.getPostDate());
			info.setReleaseDate(file.getReleaseDate());
			info.setValidDate(file.getValidDate());
			info.setUserName(getUserName(fileId));
			info.setPostPath(file.getPostPath());
			return info;
			
		}

		@Transactional
		public void RemoveFileData(String fileId) {
			// TODO Auto-generated method stub
			
			int Id = Integer.parseInt(fileId);
			
			TCompanyFileManageExample example = new TCompanyFileManageExample();
			sys.spvisor.core.entity.file.TCompanyFileManageExample.Criteria criteria  = example.createCriteria();
			
			criteria.andFileIdEqualTo(Id);
			TCompanyFileManageMapper.deleteByPrimaryKey(Id);
			
		}

		
	
}
