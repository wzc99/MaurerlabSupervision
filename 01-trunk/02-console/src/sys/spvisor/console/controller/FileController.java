package sys.spvisor.console.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sys.spvisor.core.common.BaseController;
import sys.spvisor.core.criteria.file.FileCriteria;
import sys.spvisor.core.criteria.people.PeopleCriteria;
import sys.spvisor.core.entity.file.FileInfo;
import sys.spvisor.core.entity.file.TCompanyFileManage;
import sys.spvisor.core.entity.file.TCompanyFileManageModel;
import sys.spvisor.core.entity.people.PeopleToday;
import sys.spvisor.core.result.work.TQualityFileRecoderModel;
import sys.spvisor.core.service.file.FileManageService;
import sys.spvisor.core.service.people.PeopleService;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.service.file.FileDownAndPrewService;
import sys.spvisor.core.service.project.FileService;
import sys.spvisor.core.util.DecideFileType;



@Controller
@RequestMapping("/file")
public class FileController extends BaseController{

	@Autowired
	FileManageService FileManageService;
	
	@Autowired
	FileService fileService;
	
	@Autowired
	FileDownAndPrewService fileDownAndPrewService;
	
	//根据条件查询项目
			@RequestMapping("/queryFile.ajax")
			public @ResponseBody Map<String, Object> queryPeople(FileCriteria msg) {
				
				Map<String, Object> result = new HashMap<String, Object>(3);
				List<FileInfo> lists = null;
				try {
					lists = FileManageService.selectByExample(msg);
					int count = FileManageService.selectByExampleCount(msg);
					result.put("total", count);
					result.put("rows", lists);
					result.put("length", lists.size());
					result.put("success", true);
					result.put("message", "查询成功");
				} catch (Exception e) {
					result.put("rows", null);
					result.put("success", false);
					result.put("message", "没有查到相关人员，请重新输入");
				}
				return result;
				
			}
	//根据条件查询项目
			@RequestMapping("/saveFile.ajax")
			public @ResponseBody Map<String, Object> saveFile(TCompanyFileManageModel model,int fileTypeId,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
				
				String username = (String) session.getAttribute("USER_NAME");
				Long userId =  (Long) session.getAttribute("USER_ID");
				Map<String,Object> result = new HashMap<String,Object>();
				Map<String, MultipartFile> fileMap 	= request.getFileMap();
				int rows = FileManageService.addFileRecoder(model,fileMap,username,userId,req,fileTypeId);
				if(rows != 0) {
					result.put("message", "上传文件成功");
					result.put("success", true);
				} else {
					result.put("message", "上传文件失败");
					result.put("success", false);
				}
				return result;
				
			}
			
	
	/*@RequestMapping("/EditFileData.ajax") 
	 * public @ResponseBody Map<String, Object> EditFileData(FileInfo file){
		Map<String, Object> result = new HashMap<String, Object>(2);
   		try {
   			FileManageService.EditFileData(file);
			result.put("success", true);
			result.put("message", "修改档案文件成功！");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "修改档案文件失败！");
		}
   		System.out.println("返回结果"+result);
   		return result;	
	}
	
	*/
	@RequestMapping("/EditFileData.ajax") 
	 public  @ResponseBody Map<String, Object> EditFileData(FileInfo info,HttpServletRequest request,MultipartHttpServletRequest fileRequest) throws
		 UnsupportedEncodingException, ParseException {
		 
		 Map<String, Object> result = new HashMap<String, Object>(2);
		 Map<String, MultipartFile> fileMap 	= fileRequest.getFileMap();
		/* FileInfo file = new FileInfo();
		 file.setFileId(Integer.parseInt(request.getParameter("fileId")));
		 file.setFileName(URLDecoder.decode(request.getParameter("fileName"),
		 "UTF-8"));
		 file.setFileContentIntroduction(URLDecoder.decode(request.getParameter("fileContentIntroduction"),
		 "UTF-8"));
		 file.setReleaseOrganization(URLDecoder.decode(request.getParameter("releaseOrganization"),
		 "UTF-8"));
		 
		 String myDate = URLDecoder.decode(request.getParameter("validDate"),
		 "UTF-8");
		 DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		 java.util.Date date = f.parse(myDate);
		 // Date date=new Date();
		 file.setValidDate(date);
		 
		 String myDate2 = URLDecoder.decode(request.getParameter("releaseDate"),
				 "UTF-8");
				 DateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
				 java.util.Date date2 = f2.parse(myDate2);
				 // Date date=new Date();
				 file.setReleaseDate(date2);*/
		
		 try {
	   			FileManageService.EditFileData(info,fileMap,request);
	   			int Id = info.getFileId();
	   			result.put("fileId", Id);
				result.put("success", true);
				result.put("message", "修改档案文件成功！");
			} catch (Exception e) {
				result.put("success", false);
				result.put("message", "修改档案文件失败！");
			}
	   		System.out.println("返回结果"+result);
	   		return result;	
		 }
	
	@RequestMapping("getFileByFileId.ajax")
	public @ResponseBody FileInfo getFileByFileId(int fileId) {
		
		FileInfo file = new FileInfo();
		file = FileManageService.selectFileByFileId(fileId);
		return file;
	}
	
	@RequestMapping("/selectByProId.ajax")
	public @ResponseBody Map<String,Object> selectByProId(int proId) {
		Map<String,Object> result = new HashMap<String,Object>(2);
		List<TFileForm> lists = fileService.selectByProId(proId);
		result.put("tFileForm", lists);
		result.put("length", lists.size());
		return result;
	}
	
	/*@RequestMapping("/selectByProId.ajax")*/
	 @RequestMapping(value="/Removefile.ajax", method = { RequestMethod.POST })
		public  @ResponseBody Map<String, Object> RemovePeopleData(@RequestParam("fileId") String fileId) {
			Map<String, Object> result = new HashMap<String, Object>(2);
	   		try {
	   			FileManageService.RemoveFileData(fileId);
				result.put("success", true);
				result.put("message", "删除文件成功！");
			} catch (Exception e) {
				result.put("success", false);
				result.put("message", "删除文件失败！");
			}
	   		System.out.println("返回结果"+result);
	   		return result;
			
		}
	
	//审核中重新上传文件
	@RequestMapping("/updateFileForm.ajax")
	public @ResponseBody Map<String,Object> updateFileForm(int exaLinkId,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		String path = fileService.updateFileForm(exaLinkId,fileMap,req);
		if(path.isEmpty()) {
			result.put("SUCCESS", false);
		}else {
			result.put("SUCCESS", true);
			result.put("path", path);
		}
		
		return result;
	}
	
	/**
	 * @param type :分类别，1是在t_file_form的文件，2是在日报里面（t_journal）的文件
	 * 3表示在生产厂设备仪器检定审查记录里面的文件（t_quality_check_recoder）
	 * 4表示在生产厂质量体系文件审核记录里面的文件（t_quality_file_recoder）
	 * 5表示在生产厂人员资质审查记录里面的文件（t_quality_people_recoder）
	 */
	@RequestMapping("/download.ajax")
	public void downLoad(HttpServletResponse response, HttpServletRequest request,int type,int fileId) {
		fileDownAndPrewService.download(response, request, type, fileId);
	}
	
	@RequestMapping("/preview.ajax")
	public @ResponseBody Map<String,Object>  previewFile(HttpServletResponse response, HttpServletRequest request,int type,int fileId) throws Exception {
		Map<String,Object> result = new HashMap<String,Object>(2);
		String realPath = "";
		if(type == 2) {
			realPath = fileDownAndPrewService.previewFileJournal(response, request, type, fileId);
		}else {
			realPath = fileDownAndPrewService.previewFile(response, request, type, fileId);
		}
		boolean isPdf = DecideFileType.isPDF(realPath);
		boolean isPicture = DecideFileType.isPicture(realPath);
		if(isPdf) {
			result.put("path", realPath);
			result.put("type", "pdf");
		}else if(isPicture) {
			result.put("path", realPath);
			result.put("type", "pic");
		}else {
			//result.put("path", realPath);
			result.put("type", "error");
		}
		/*request.setAttribute("path", realPath);
		
		response.sendRedirect(request.getContextPath() + PREVIEW_URL);*/
		return result;
	}
}
