package sys.spvisor.core.service.file;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.dao.file.TCompanyFileManageMapper;
import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.dao.work.TQualityCheckRecoderMapper;
import sys.spvisor.core.dao.work.TQualityFileRecoderMapper;
import sys.spvisor.core.dao.work.TQualityPeopleRecoderMapper;
import sys.spvisor.core.entity.file.TCompanyFileManage;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.work.TQualityCheckRecoder;
import sys.spvisor.core.entity.work.TQualityFileRecoder;
import sys.spvisor.core.entity.work.TQualityPeopleRecoder;
import sys.spvisor.core.util.DecideFileType;
import sys.spvisor.core.util.OfficeUtils;

@Service
public class FileDownAndPrewService {
	@Autowired
	TFileFormMapper tFileFormMapper;
	@Autowired
	TQualityFileRecoderMapper tQualityFileRecoderMapper;
	@Autowired
	TQualityCheckRecoderMapper tQualityCheckRecoderMapper;
	@Autowired
	TQualityPeopleRecoderMapper tQualityPeopleRecoderMapper;
	@Autowired
	TCompanyFileManageMapper tCompanyFileManageMapper;
	
	
	/**
	 * 下载文件
	 * @param session
	 * @param request
	 * @param type  :分类别，1是在t_file_form的文件，2是在日报里面（t_journal）的文件
	 * 3表示在生产厂设备仪器检定审查记录里面的文件（t_quality_check_recoder）
	 * 4表示在生产厂质量体系文件审核记录里面的文件（t_quality_file_recoder）
	 * 5表示在生产厂人员资质审查记录里面的文件（t_quality_people_recoder）
	 * 6表示资料档案
	 * @param fileId
	 */
	public void download(HttpServletResponse response, HttpServletRequest request,int type,int fileId) {
		int proId = 0;
		String fileName = "";
		if(type == 1) {
			TFileForm tFileForm = tFileFormMapper.selectByPrimaryKey(fileId);
			proId = tFileForm.getFileFormProjectId();
			fileName = tFileForm.getFileFormPath();
		}else if(type == 2) {
			//TODO
			//日志这一块还没有弄
		}else if(type == 3) {
			TQualityCheckRecoder recoder = tQualityCheckRecoderMapper.selectByPrimaryKey(fileId);
			proId = recoder.getProId();
			fileName = recoder.getPath();
		}else if(type == 4) {
			TQualityFileRecoder recoder = tQualityFileRecoderMapper.selectByPrimaryKey(fileId);
			proId = recoder.getProId();
			fileName = recoder.getPath();
		}else if(type == 5) {
			TQualityPeopleRecoder recoder = tQualityPeopleRecoderMapper.selectByPrimaryKey(fileId);
			proId = recoder.getProId();
			fileName = recoder.getPath();
		}else if(type==6) {
			TCompanyFileManage recoder = tCompanyFileManageMapper.selectByPrimaryKey(fileId);
			fileName = recoder.getPostPath();
			proId = 0;
		}else if(type == 7) {
			System.out.println(fileId);
			TFileForm tFileForm = tFileFormMapper.selectByPrimaryKey(fileId);
			proId = tFileForm.getFileFormProjectId();
			fileName = "material_list.docx";
			
		}
		AutoCreateFileName.FilesDownload(request, response, "/upload/"+proId+"/"+fileName);
	}
	
	/**
	 * 预览文件
	 * @param session
	 * @param request
	 * @param type  :分类别，1是在t_file_form的文件，2是在日报里面（t_journal）的文件
	 * 3表示在生产厂设备仪器检定审查记录里面的文件（t_quality_check_recoder）
	 * 4表示在生产厂质量体系文件审核记录里面的文件（t_quality_file_recoder）
	 * 5表示在生产厂人员资质审查记录里面的文件（t_quality_people_recoder）
	 * @param fileId
	 * @return 
	 * @throws Exception 
	 */
	public String previewFile(HttpServletResponse response, HttpServletRequest request,int type,int fileId) throws Exception {
		int proId = 0;
		String fileName = "";
		if(type == 1) {
			TFileForm tFileForm = tFileFormMapper.selectByPrimaryKey(fileId);
			proId = tFileForm.getFileFormProjectId();
			fileName = tFileForm.getFileFormPath();
			
		}else if(type == 2) {
			//TODO
			//日志这一块还没有弄
		}else if(type == 3) {
			TQualityCheckRecoder recoder = tQualityCheckRecoderMapper.selectByPrimaryKey(fileId);
			proId = recoder.getProId();
			fileName = recoder.getPath();
		}else if(type == 4) {
			TQualityFileRecoder recoder = tQualityFileRecoderMapper.selectByPrimaryKey(fileId);
			proId = recoder.getProId();
			fileName = recoder.getPath();
		}else if(type == 5) {
			TQualityPeopleRecoder recoder = tQualityPeopleRecoderMapper.selectByPrimaryKey(fileId);
			proId = recoder.getProId();
			fileName = recoder.getPath();
		}else if(type==6) {
			TCompanyFileManage recoder = tCompanyFileManageMapper.selectByPrimaryKey(fileId);
			fileName = recoder.getPostPath();
			proId = 0;
		}
		//判断文件是图片还是PDF还是其他文件
		boolean isPicture = DecideFileType.isPicture(fileName);
		boolean isPdf = DecideFileType.isPDF(fileName);
		String realPath = "";
		if(!isPicture && !isPdf) {
			realPath = request.getSession().getServletContext().getRealPath("/upload/"+proId+"/"+fileName);
			OfficeUtils.office2PDF(realPath,request.getSession().getServletContext().getRealPath("/download/"+proId+"/"+fileName.substring(0, fileName.lastIndexOf("."))+".pdf"));
			return "console/../../download/"+proId+"/"+fileName.substring(0, fileName.lastIndexOf("."))+".pdf";
		}else if(isPicture) {
			//否则，直接返回路径
			realPath = request.getSession().getServletContext().getRealPath("/upload/"+proId+"/"+fileName);
			return "console/../../upload/"+proId+"/"+fileName;
		}else if(isPdf) {
			realPath = request.getSession().getServletContext().getRealPath("/upload/"+proId+"/"+fileName);
			return "console/../../upload/"+proId+"/"+fileName;
		}
		return realPath;
		
	}
}
