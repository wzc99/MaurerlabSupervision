package sys.spvisor.core.service.project;

import java.io.File;
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
		return path;
	}

}
