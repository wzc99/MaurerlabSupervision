package sys.spvisor.console.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TGoodsLists;
import sys.spvisor.core.entity.work.TProductTypeMapping;
import sys.spvisor.core.entity.work.TQualityCheckRecoder;
import sys.spvisor.core.entity.work.TQualityFileRecoder;
import sys.spvisor.core.entity.work.TQualityPeopleRecoder;
import sys.spvisor.core.result.work.TGoodListModel;
import sys.spvisor.core.result.work.TQualityCheckRecoderModel;
import sys.spvisor.core.result.work.TQualityFileRecoderModel;
import sys.spvisor.core.result.work.TQualityPeopleRecoderModel;
import sys.spvisor.core.result.work.TypeIdResult;
import sys.spvisor.core.result.work.TypeModel;
import sys.spvisor.core.result.work.TypeResult;
import sys.spvisor.core.service.file.FileDownAndPrewService;
import sys.spvisor.core.service.project.FileService;
import sys.spvisor.core.service.work.GoodListService;
import sys.spvisor.core.service.work.GoodTypeService;
import sys.spvisor.core.service.work.WorkService;
import sys.spvisor.core.util.OfficeUtils;

@Controller
@RequestMapping("/work")
public class WorkController {
	
	@Autowired
	GoodTypeService goodTypeService;
	@Autowired
	WorkService workService;
	@Autowired
	GoodListService goodListService;
	@Autowired
	TFileFormMapper tFileFormMapper;
	@Autowired
	FileDownAndPrewService fileDownAndPrewService;
	@Autowired
	FileService fileService;
	
	@ResponseBody
	@RequestMapping(value="/getLevelOneName.ajax",method={RequestMethod.POST,RequestMethod.GET})
	public List<TypeResult> getLevelOneName(HttpSession session, HttpServletRequest request) {
		return goodTypeService.getLevelOneName();
	}
	
	@ResponseBody
	@RequestMapping("/getLevelTwoName.ajax")
	public List<TypeResult> getLevelTwoName(HttpServletRequest request) throws UnsupportedEncodingException {
		String name = java.net.URLDecoder.decode(request.getParameter("name"),"UTF-8");
		return goodTypeService.getLevelTwoName(name);
	}
	
	@RequestMapping("/decideHaveThree.ajax")
	public @ResponseBody Map<String, Object> decideHaveThree(String name,String bigName) {
		Map<String, Object> result = new HashMap<String, Object>(1);
		boolean b = false;
		List<TProductTypeMapping> lists = goodTypeService.decideHaveThree(name, bigName);
		if(lists.size()>0) {
			if(lists.get(0).getThreeLevelName()=="" || lists.get(0).getThreeLevelName()==null) {
				b = false;
			}else {
				b=true;
			}
		}
		result.put("have", b);
		return result;
	}
	
	@ResponseBody
	@RequestMapping("/getLevelThreeName.ajax")
	public List<TypeResult> getLevelThreeName(HttpServletRequest request) throws UnsupportedEncodingException {
		String name = java.net.URLDecoder.decode(request.getParameter("name"),"UTF-8");
		String bigName = java.net.URLDecoder.decode(request.getParameter("bigName"),"UTF-8");
		List<TProductTypeMapping> lists = goodTypeService.decideHaveThree(name, bigName);
		List<TypeResult> result = new ArrayList<TypeResult>();
		for (int i = 0; i < lists.size(); i++) {
			TypeResult typeResult = new TypeResult();
			typeResult.setType(lists.get(i).getThreeLevelName());
			result.add(typeResult);
		}
		return result;
	}
	

	@RequestMapping(value="/getTypeName.ajax", method = { RequestMethod.POST })
	public @ResponseBody Map<String, Object> getTypeName(int proId) {
		Map<String, Object> result =  new HashMap<String, Object>(1);
		result.put("subclass", goodTypeService.getTypeName(proId));
		return result;
	}
	
	@RequestMapping("/getTypeIdAndName.ajax")
	public @ResponseBody Map<String, Object> getTypeIdAndName(int proId) {
		Map<String, Object> result =  new HashMap<String, Object>(1);
		List<TypeIdResult> lists = goodTypeService.getTypeIdAndName(proId);
		result.put("data", lists);
		return result;
	}
	
	
	@RequestMapping("/addTypeLevel.ajax")
	public @ResponseBody Map<String, Object> addTypeLevel(TypeModel type,int projectId) {
		Map<String, Object> result =  new HashMap<String, Object>(2);
		int influence = goodTypeService.addTypeLevel(type, projectId);
		if(influence>0) {
			result.put("success", true);
			result.put("message", "添加成功");
		}else {
			result.put("success", false);
			result.put("message", "添加失败");
		}
		return result;
		
	}
	
	@RequestMapping("/getTypeLevel.ajax")
	public @ResponseBody Map<String, Object> getTypeLevel(int proId) {
		Map<String, Object> result =  new HashMap<String, Object>(3);
		List<TProductTypeMapping> list = goodTypeService.getTypeLevel(proId);
		if(list.size() == 0) {
			result.put("first", true);
		}else {
			result.put("first", false);
			result.put("length", list.size());
			result.put("list", list);
		}
		return result;
	}
	
	@RequestMapping("/addType.ajax")
	public @ResponseBody Map<String, Object> addType(TypeModel type) {
		Map<String, Object> result =  new HashMap<String, Object>(2);
		int influence = goodTypeService.addType(type);
		if(influence>0) {
			result.put("success", true);
			result.put("message", "添加成功");
		}else {
			result.put("success", false);
			result.put("message", "添加失败");
		}
		return result;
	}
	
	@RequestMapping("/addOrUpdateBeginWork.ajax")
	public @ResponseBody Map<String, Object> addOrUpdateBeginWork(@Param("proId") int proId,String fileNameTotal,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		try{
			int rows = workService.addOrUpdateBeginWork(fileNameTotal,fileMap,username,userId,req,proId);
			if(rows != 0) {
				result.put("message", "添加/修改开工报审文件成功");
				result.put("success", true);
			} else {
				result.put("message", "添加/修改开工报审文件失败");
				result.put("success", false);
			}
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "提交失败！");
		}
		return result;
		
	}
	
	@RequestMapping("/initBeginWorkByProId.ajax")
	public @ResponseBody Map<String, Object> initBeginWorkByProId(int proId) {
		Map<String,Object> result = new HashMap<String,Object>();
		List<TFileForm> lists = workService.initBeginWorkByProId(proId);
		result.put("tFileForm", lists);
		result.put("length", lists.size());
		return result;
	}
	
	@RequestMapping("/tQualityFileRecoder.ajax")
	public @ResponseBody Map<String, Object> tQualityFileRecoder(TQualityFileRecoderModel model,int proId,MultipartHttpServletRequest request, HttpSession session, HttpServletRequest req) {
		
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		int rows = workService.addTQualityFileRecoder(model,fileMap,username,userId,req,proId);
		if(rows != 0) {
			result.put("message", "添加/修改生产厂质量体系文件审核记录成功");
			result.put("success", true);
		} else {
			result.put("message", "添加/修改生产厂质量体系文件审核记录失败");
			result.put("success", false);
		}
		return result;
		
	}
	
	@RequestMapping("/initTQualityFileRecoder.ajax")
	public @ResponseBody Map<String, Object> initTQualityFileRecoder(int proId) {
		
		Map<String,Object> result = new HashMap<String,Object>();
		List<TQualityFileRecoder> lists = workService.initTQualityFileRecoder(proId);
		if(lists.size() > 0) {
			result.put("tFileForm", lists);
			result.put("have", true);
			result.put("length", lists.size());
		} else {
			/*result.put("tFileForm", lists);*/
			result.put("have", false);
			/*result.put("length", 0);*/
		}
		return result;
	}
	
	@RequestMapping("/initTQualityPeopleRecoder.ajax")
	public @ResponseBody Map<String, Object> initTQualityPeopleRecoder(int proId) {
		
		Map<String,Object> result = new HashMap<String,Object>();
		List<TQualityPeopleRecoder> lists = workService.initTQualityPeopleRecoder(proId);
		if(lists.size() > 0) {
			result.put("tFileForm", lists);
			result.put("have", true);
			result.put("length", lists.size());
		} else {
			result.put("have", false);
		}
		return result;
	}
	
	@RequestMapping("/addAndUpdateQualityPeopleRecoder.ajax")
	public @ResponseBody Map<String, Object> addAndUpdateQualityPeopleRecoder(TQualityPeopleRecoderModel model,int proId,
			MultipartHttpServletRequest request, 
			HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		int rows = workService.addTQualityPeopleRecoder(model,fileMap,username,userId,req,proId);
		if(rows != 0) {
			result.put("message", "添加/修改生产厂质量体系文件审核记录成功");
			result.put("success", true);
		} else {
			result.put("message", "添加/修改生产厂质量体系文件审核记录失败");
			result.put("success", false);
		}
		return result;
	}
	
	@RequestMapping("/initTQualityCheckRecoder.ajax")
	public @ResponseBody Map<String, Object> initTQualityCheckRecoder(int proId) {
		
		Map<String,Object> result = new HashMap<String,Object>();
		List<TQualityCheckRecoder> lists = workService.initTQualityCheckRecoder(proId);
		if(lists.size() > 0) {
			result.put("tFileForm", lists);
			result.put("have", true);
			result.put("length", lists.size());
		} else {
			result.put("have", false);
		}
		return result;
	}
	
	@RequestMapping("/addAndUpdateQualityCheckRecoder.ajax")
	public @ResponseBody Map<String, Object> addAndUpdateQualityCheckRecoder(TQualityCheckRecoderModel model,int proId,
			MultipartHttpServletRequest request, 
			HttpSession session, HttpServletRequest req) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String, MultipartFile> fileMap 	= request.getFileMap();
		System.out.println(fileMap.size());
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf 	= entity.getValue();
			System.out.println(mf.getOriginalFilename());
		}
		
		int rows = workService.addAndUpdateQualityCheckRecoder(model,fileMap,username,userId,req,proId);
		if(rows != 0) {
			result.put("message", "添加/修改生产厂质量体系文件审核记录成功");
			result.put("success", true);
		} else {
			result.put("message", "添加/修改生产厂质量体系文件审核记录失败");
			result.put("success", false);
		}
		return result;
	}
	
	@RequestMapping("/addOrUpdateGoodList.ajax")
	public @ResponseBody Map<String, Object> addOrUpdateGoodList(int proId,TGoodListModel model) {
		Map<String,Object> result = new HashMap<String,Object>(2);
		int rows = goodListService.addOrUpdateGoodList(proId,model);
		if(rows != 0) {
			result.put("message", "添加/修改物资清单成功");
			result.put("success", true);
		} else {
			result.put("message", "添加/修改物资清单失败");
			result.put("success", false);
		}
		return result;
	}
	
	@RequestMapping("/getAllGoodsByProId.ajax")
	public @ResponseBody Map<String, Object> getAllGoodsByProId(int proId) {
		
		
		
		Map<String,Object> result = new HashMap<String,Object>(3);
		List<TGoodsLists> lists = goodListService.getAllGoodsByProId(proId);
		/*OfficeUtils.createMaterialList(request, lists);*/
		if(lists.size() > 0) {
			result.put("list", lists);
			result.put("first", false);
			result.put("length", lists.size());
		} else {
			result.put("first", true);
		}
		return result;
	}
	
	@RequestMapping("/produceGoodsFile.ajax")
	public @ResponseBody Map<String, Object> produceGoodsFile(HttpServletResponse response,HttpServletRequest request,HttpSession session,int proId) {
		String username = (String) session.getAttribute("USER_NAME");
		Long userId =  (Long) session.getAttribute("USER_ID");
		Map<String,Object> result = new HashMap<String,Object>(2);
		
		//判断原来数据库里面是否有物资清单
		List<TFileForm> originLists = fileService.selectByMsgIdAndType(proId, "物资清单");
		if(originLists.size() > 0) {
			for (int i = 0; i < originLists.size(); i++) {
				fileService.deleteByPrimaryKey(originLists.get(i).getFileFormId());
			}
		}
		
		List<TGoodsLists> lists = goodListService.getAllGoodsByProId(proId);
		TFileForm form = OfficeUtils.createMaterialList(request,response, lists,proId,username,userId);
		tFileFormMapper.insert(form);
		if(form != null) {
			result.put("success",true);
			result.put("message", "先生成物资清单成功");
			result.put("fileId", form.getFileFormId());
		}else {
			result.put("success", false);
			result.put("message", "先生成物资清单失败");
		}
		return result;
	}
	
	@RequestMapping("/downProduceGoodsFile.ajax")
	public @ResponseBody Map<String, Object> downProduceGoodsFile(HttpServletResponse response,HttpServletRequest request,HttpSession session,int proId) {
		
		Map<String,Object> result = new HashMap<String,Object>(2);
		
		List<TFileForm> lists = fileService.selectByMsgIdAndType(proId, "物资清单");
		if(lists.size() == 0) {
			result.put("success", false);
			result.put("message", "请先生成物资清单");
		}else {
			fileDownAndPrewService.download(response, request, 7, lists.get(0).getFileFormId());
			result.put("success", true);
			result.put("message", "先生成物资清单完毕");
		}
		return result;
	}
	
	//获取项目中的生产厂设备仪器检定审查记录
	@RequestMapping("/getTQualityCheckRecoder.ajax")
	public @ResponseBody Map<String, Object> getTQualityCheckRecoder(int proId) {
		Map<String,Object> result = new HashMap<String,Object>(1);
		List<TQualityCheckRecoder> lists = workService.getTQualityCheckRecoder(proId);
		if(lists.size() == 0) {
			result.put("first", true);
		}else {
			result.put("first", false);
			result.put("length", lists.size());
			result.put("list", lists);
		}
		return result;
	}
	
	//获取项目中的生产厂质量体系文件审核记录
		@RequestMapping("/getTQualityFileRecoder.ajax")
		public @ResponseBody Map<String, Object> getTQualityFileRecoder(int proId) {
			Map<String,Object> result = new HashMap<String,Object>(1);
			List<TQualityFileRecoder> lists = workService.getTQualityFileRecoder(proId);
			if(lists.size() == 0) {
				result.put("first", true);
			}else {
				result.put("first", false);
				result.put("length", lists.size());
				result.put("list", lists);
			}
			return result;
		}
		
		//获取项目中的生产厂设备仪器检定审查记录
		@RequestMapping("/getTQualityPeopleRecoder.ajax")
		public @ResponseBody Map<String, Object> getTQualityPeopleRecoder(int proId) {
		
			Map<String,Object> result = new HashMap<String,Object>(1);
			List<TQualityPeopleRecoder> lists = workService.getTQualityPeopleRecoder(proId);
			if(lists.size() == 0) {
				result.put("first", true);
			}else {
				result.put("first", false);
				result.put("length", lists.size());
				result.put("list", lists);
			}
			return result;
		}
		
		@RequestMapping("/getBigTypeByProId.ajax")
		public String getBigTypeByProId(int proId) {
			String name = goodTypeService.getBigTypeNameByProId(proId);
			return name;
		}
		
}
