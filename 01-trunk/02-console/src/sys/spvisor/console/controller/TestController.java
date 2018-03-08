package sys.spvisor.console.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mongodb.client.MongoCursor;

import net.sf.json.JSONArray;
import sys.spvisor.core.dao.MongodbDao;
import sys.spvisor.core.service.work.GoodTypeService;
import sys.spvisor.core.entity.quality.QualityData;
import sys.spvisor.core.entity.quality.QualityInfo;


@Controller
@RequestMapping("/test")
//质量控制报告后台接收与数据存储
public class TestController {
	@Autowired
	GoodTypeService typeService;
	private static Map<String,List<String>> index1;
	private static Map<String,List<String>> index2;
	private static Map<String,List<String>> index3;
	//项目类型与表名映射
	static {
		index1 = new HashMap<String,List<String>>();	   
	   List<String> valve = Arrays.asList("faMenQiTa_", "faMenHanJie_",   "faMenSheXianGuoCheng_",   "faMenSheXianDiPian_",    
	   "faMenChaoShengBo_",  "faMenCiFenJianCe_", "faMenShenTouJianCe_",  "faMenZuZhuang_",   
	   "faMenChuXiuYouQi_",  "faMenBaoZhuangFaYun_",  "faMenYaLiShiYan_",  "faMenHuaXue_",   
	   "faMenLaShenXingNeng_",  "faMenChongJi_",   "faMenWanQu_",  "faMenJinXiang_");
	   index1.put("valve", valve);
	   List<String> equipment = Arrays.asList("shebeiQiTa_",  "sheBeiQuDong_",   "sheBeiXiaLiao_",   "sheBeiTongTi_",  
	   "sheBeiHanJie_",  "sheBeiSheXianGuoCheng_",   "sheBeiChaoShengBo_",  
	   "sheBeiCiFenJianCe_",  "sheBeiShenTouJianCe_",  "sheBeiSheXianDiPian_",  
	   "sheBeiHuaXian_",   "sheBeiReChuLi_",  "sheBeiShuiYa_",  "sheBeiChuXiu_",   
	   "sheBeiBaoZhuang_",  "sheBeiHuaXue_",   "sheBeiLaShen_",  "sheBeiChongJi_",    
	   "sheBeiWanQu_",   "sheBeiJinXiang_");
	   index1.put("equipment", equipment);
	   List<String> fittings = Arrays.asList("guanJianQiTa_",  "guanJianYuZhiChengXing_",   "guanJianReChuLi_",    "guanJianHanJie_",   
	   "guanJianSheXianGuoCheng_",   "guanJianChaoShengBo_",  "guanJianCiFenJianCe_",  
	   "guanJianShenTouJianCe_",   "guanJianSheXianDiPian_",  "guanJianShuiYaShiYan_",   
	   "guanJianChuXiu_",   "guanJianFaYun_",   "guanJianHuaXue_",  "guanJianLaShenXingNeng_",  
	   "guanJianChongJi_",    "guanJianWanQu_",  "guanJianJinXiang_");
	   index1.put("fittings", fittings);
	   List<String> bend = Arrays.asList("bendQiTa_",   "wanGuanMuGuan_",  "wanGuanWeiZhi_",   "wanGuanReChuLi_",  
	   "wanGuanSheXianGuoCheng_",   "wanGuanChaoShengBo_",   "wanGuanCiFenJianCe_",   "wanGuanSheXianDiPian_",
	   "wanGuanShenTouJianCe_",  "wanGuanShuiYaShiYan_",    "wanGuanFang_",  
	   "wanGuanQingJie_",   "wanGuanTuFu_",   "wanGuanXingNeng_",  "wanGuanWaiGuan_",  
	   "wanGuanDui_",   "wanGuanBaoZhuang_",   "wanGuanHuaXue_",  "wanGuanLaShen_",  
	   "wanGuanJinXiang_",   "wanGuanHuaXue1_",  "wanGuanLaShenXingNeng_",  
	   "wanGuanChongJi1_", "wanGuanChongJi_",  "wanGuanWanQu_",   "wanGuanLuochui_",   "wanGuanJinXiang1_");
	   index1.put("bend", bend);
	   List<String> delivery = Arrays.asList("deliveryQiTa_", "deliveryReZha_", "deliveryReChuLi_", "deliveryWuFengChaoShengBo_",
	   "deliveryWuFengCiFen_", "deliveryWoLiu_", "deliveryLouCi_", "deliveryShuiYa_",
	   "deliveryFaYun_", "deliveryHuaXue_", "deliveryLaShen_", "deliveryChongJi_",
	   "deliveryJinXiang_", "deliveryYaBian_", "deliveryQiTa2_", "deliveryTouLiao_",
	   "deliveryChengXing_", "deliverySheXian_", "deliveryChaoShengBo_",
	   "deliveryCiFen_", "deliveryShuiYaShiYan2_", "deliveryGuangGuan_", "deliveryHuaXue1_",
	   "deliveryLaShenXingNeng_", "deliveryChongJi1_", "deliveryWanQu_",
	   "deliveryLuochui_", "deliveryJinXiang1_");
	   index1.put("delivery", delivery);
	   List<String> drillingTools = Arrays.asList("drillQiTa_", "drillGuanDuan_", "drillMoCaHan_", "drillHanQu_",
	   "drillReChuLi_", "drillFaMenChongJi_", "drillBiaoMian_",
	   "drillCiFenJianCe_", "drillNeiTuCeng_", "drillNeiTuCengHouDu_",
	   "drillBaoZhuang_", "drillBeiLiao_", "drillZuanKong_", "drillChaoShengBo_",
	   "drillChaoShengBo2_", "drillCiFenJianCe2_", "drillReChuLi2_", "drillHuaXue_",
	   "drillLaShenXingNeng_", "drillChongJi_", "drillYingDu_", "drillJiJiaGong_",
	   "drillNaiMo_", "drillNaiMo1_", "drillNeiTuCeng2_", "drillNeiTuCengHouDu2_", "drillBaoZhuang2_");
	   index1.put("drillingTools", drillingTools);
	   List<String> oilPipe = Arrays.asList("oilPipeQiTa_", "oilPipeTouLiao_", "oilPipeChengXing_", "oilPipeReZha_",
	   "oilPipeGuanDuan_", "oilPipeReChuLi_", "oilPipeChaoShengBo_", "oilPipeCiFenJianCe_",
	   "oilPipeShenTouJianCe_", "oilPipeNingJie_", "oilPipeTongJing_", "oilPipeShuiYa_",
	   "oilPipeBaoZhuang_", "oilPipeHuaXue_", "oilPipeLaShenXingNeng_", "oilPipeChongJi_",
	   "oilPipeWanQu_", "oilPipeJinXiang_", "oilPipeHuaXue1_", "oilPipeLaShenXingNeng1_",
	   "oilPipeJinXiang_", "oilPipeChongJi1_", "oilPipeWanQu1_", "oilPipeLuochui_", "oilPipeJinXiang1_");
	   index1.put("oilPipe", oilPipe);
	   List<String> delbend = Arrays.asList("fangFuQiTa_", "fangFuFang_", "fangFuQingJie_", "fangFuNeiTuCeng_",
	   "fangFuXingNeng_", "fangFuWaiGuan_", "fangFuDui_", "fangFuFa_",
	   "delbendJu_", "delbendFangShi_", "delbendWaiHu_", "delbendBaoYuan_",
	   "delbendBaoWen_", "delbendFangMao_", "delbendBaoDui_", "delbendBaoFa_",
	   "delbendFangXing_", "delbendWaiXing_", "delbendBao_", "delbendFang_",
	   "delbendQingJie_", "delbendNeiTuCeng_", "delbendHouDu_", "delbendBaoDui1_");
	   index1.put("delbend", delbend);
	   List<String> falan = Arrays.asList();
	   index1.put("falan", falan);
	   
	   index2 = new HashMap<String,List<String>>();
	   List<String> deliveryCicun = Arrays.asList("gangBanWaiGuan_","hanGuanJiHe_","wuFengGangGuan_");
	   index2.put("delivery", deliveryCicun);
	   List<String> bendCicun = Arrays.asList("hanGuanJiHe_","wuFengGangGuan_","wanGuanJiHe_","lengWanGuan_");
	   index2.put("bend", bendCicun);
	   List<String> valveCicun = Arrays.asList("faMenFaLan_","faMenHanJie_");
	   index2.put("valve",valveCicun );
	   List<String> drillingToolsCicun = Arrays.asList("zuanJuLuoWen_");
	   index2.put("drillingTools", drillingToolsCicun);
	   List<String> delbendCicun = Arrays.asList("hanGuanJiHe_","wuFengGangGuan_","wanGuanJiHe_","fangFuGuan_");
	   index2.put("delbend", delbendCicun);
	   List<String> fittingsCicun = Arrays.asList("jueYuanJieTou_");
	   index2.put("fittings", fittingsCicun);
	   List<String> oilPipeCicun = Arrays.asList("hanGuanJiHe_","youTaoGuan_","youTaoGuanGuanTi_","youTaoGuanJieGu_","luoWenGuanTi_","luoWenJieGu_");
	   index2.put("oilPipe", oilPipeCicun);
	   List<String> equipmentCicun = Arrays.asList("fengTouJiHe_","gangBanWaiGuan_","hanGuanJiHe_","wuFengGangGuan_","jiuShiTou_","siShiWuTou_",
			   "dengJingSanTong_","yiJingSanTong_","tongXinYiJing_","pianXinYiJing_","zhiGuanZuo_","guanMao_",
			   "dengJingLuoWen_","faMenFaLan_","faMenHanJie_","faLanJiHe_","faLanGai_","yaLiRongQi_");
	   index2.put("equipment", equipmentCicun);	   
	   List<String> falanCicun = Arrays.asList("jiuShiTou_","siShiWuTou_","dengJingSanTong_","yiJingSanTong_","tongXinYiJing_","pianXinYiJing_",
			   "zhiGuanZuo_","jiuShiLuoWen_","shuangSiTou_","danSiTou_","luoWenHuo_","guanMao_","dengJingLuoWen_","xiaoLuoWen_",
			   "faLanJiHe_","baZiMangBan_","faLanGai_");
	   index2.put("falan", falanCicun);
//	   List<String> jihecicun = Arrays.asList("chouYouGanTi_","chouYouJieGu_");
//	   index2.put("jihecicun", jihecicun);
	   
	   index3 = new HashMap<String,List<String>>();
	   List<String> shenHeJiLu = Arrays.asList("shenHeJiLu_");
	   index3.put("shenHeJiLu", shenHeJiLu);
	}
	
	@ResponseBody  
	@RequestMapping("/testResult.ajax")  
	 public Map<String, Object> testResult( HttpServletRequest req){
		MongodbDao mongo = MongodbDao.getDatabase();
		
	    Map<String, Object> map = new HashMap<String, Object>();  
  
	    //建立项目大类与其所包含table前缀名的索引	    
	   
//	   for(Map.Entry<String, List<String>> entry:index.entrySet()){
//		   List<String> val = entry.getValue();
//		   for(int i=0;i<val.size();++i){
//			   if(!val.get(i).contains("_")){
//				   System.out.println(val.get(i));
//			   }
//		   }
//	   }

	   
	   //获取req的所有参数集合	   
	   Map<String,String[]>  param =  req.getParameterMap();
	   List<String> typeNames = new ArrayList<String>();
	   Map<String,List<String>> index = new HashMap<String,List<String>>();
	   List<String> Prefix2 = new ArrayList<String>();
	   String collectionName = "";
	   System.out.println("msg recv id:"+req.getParameter("proId"));
	   System.out.println("msg recv qid:"+req.getParameter("QId"));
	   System.out.println("msg recv proType:"+req.getParameter("proType"));
	   //质控控制文件类型判断
	   String projectType = req.getParameter("proType");
	   if(projectType.equals("quality")){
		   //质量控制
		   //获取接受到的数据的项目所属大类	  
		   typeNames = typeService.getBigTypeByProId(Integer.parseInt(req.getParameter("proId")));
		   index = index1;
		   collectionName = "data";
		   Prefix2 = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k");
	   }else if(projectType.equals("jiHeChiCun")){
		   //几何尺寸
		   typeNames = typeService.getBigTypeByProId(Integer.parseInt(req.getParameter("proId")));
		   index = index2;
		   collectionName = "dataCicun";
		   Prefix2 = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","ff",
				   "m","n","o","p","q","r","s","t","u","v","w","x","y","z","aa","bb","cc","dd","ee");
	   }else if(projectType.equals("wenJian")){
		   //文件报告审核
		   typeNames = Arrays.asList("shenHeJiLu");
		   index = index3;
		   collectionName = "dataShenhe";
		   Prefix2 = Arrays.asList("a","b","c","d");
	   }else{
		   System.out.println("testResult.ajax:项目类型不匹配");
	   }
	   	   
//	   System.out.println("receive test.html msg\n");
	   Map<String,String> data = new HashMap<String,String>(); 
	   data.put("proId", req.getParameter("proId"));

	   Map<String,String> indexContain = new HashMap<String,String>();   //处理过的数据所包含的table前缀名
	   if(param.containsKey("date")){
		   data.put("date", req.getParameter("date"));
	   }
	   if(param.containsKey("people")){
		   data.put("people", req.getParameter("people"));
	   }
	   for(int i = 0; i < typeNames.size(); ++i){
		   List<String> table_prefix = index.get(typeNames.get(i));
		   for(int tp = 0; tp < table_prefix.size(); ++tp){
			   if(indexContain.containsKey(table_prefix.get(tp))){
				   continue;
			   }
			   indexContain.put(table_prefix.get(tp), "");
			   for(int j = 0; j < Prefix2.size(); ++j){
				   for(int k = 1; k < 30; ++k){
					   if(param.containsKey(table_prefix.get(tp)+Prefix2.get(j)+k)){
//						   if(req.getParameter(table_prefix.get(tp)+Prefix2.get(j)+k).equals("")){
//							   continue;
//						   }
						   data.put(table_prefix.get(tp)+Prefix2.get(j)+k, req.getParameter(table_prefix.get(tp)+Prefix2.get(j)+k));
						   System.out.println(table_prefix.get(tp)+Prefix2.get(j)+k+":"+req.getParameter(table_prefix.get(tp)+Prefix2.get(j)+k));
					   }
					   else{
//						   data.put(Prefix1.get(i)+Prefix2.get(j)+k, "");
						   System.out.println("pramter not found:"+table_prefix.get(tp)+Prefix2.get(j)+k);
						   break;
					   }
				   }
			   }
			   int lk = 1;
			   //获取table中动态增加的数据			   
			   while(param.containsKey(table_prefix.get(tp)+"l"+lk)){
				   String[] ln = req.getParameterValues(table_prefix.get(tp)+"l"+lk);
				   for(int t = 0; t < ln.length; ++t){
//					   if(ln[t].equals("")){
//						   continue;
//					   }
					   System.out.println(table_prefix.get(tp)+"l"+lk+":"+ln[t]);
					   data.put(table_prefix.get(tp)+"l"+lk+"_"+t, ln[t]);
				   }				   
				lk += 1;
			   }
			   lk = 1;
			 //获取table中动态增加的数据			   
 			   while(param.containsKey(table_prefix.get(tp)+"ll"+lk)){
 				   String[] ln = req.getParameterValues(table_prefix.get(tp)+"ll"+lk);
 				   for(int t = 0; t < ln.length; ++t){
// 					   if(ln[t].equals("")){
// 						   continue;
// 					   }
 					   System.out.println(table_prefix.get(tp)+"ll"+lk+":"+ln[t]);
 					   data.put(table_prefix.get(tp)+"ll"+lk+"_"+t, ln[t]);
 				   }				   
 				   lk += 1;
			   }
 			  lk = 1;
 			 //获取table中动态增加的数据			   
  			   while(param.containsKey(table_prefix.get(tp)+"lll"+lk)){
  				   String[] ln = req.getParameterValues(table_prefix.get(tp)+"lll"+lk);
  				   for(int t = 0; t < ln.length; ++t){
//  					   if(ln[t].equals("")){
//  						   continue;
//  					   }
  					   System.out.println(table_prefix.get(tp)+"lll"+lk+":"+ln[t]);
  					   data.put(table_prefix.get(tp)+"lll"+lk+"_"+t, ln[t]);
  				   }				   
  				   lk += 1;
 			   }
		   }

	   }
	   //添加项目质量控制ID(自增形式)数据写入mongodb	   
	   try{
		   if(data.isEmpty()){
			   System.out.println("Empty data");
			   map.put("success", false);
			   map.put("message", "你填的信息为空，请填写好再次提交！");
			   return map;
		   }
		   ObjectMapper mapper = new ObjectMapper();
		   String json = mapper.writeValueAsString(data);  
		   String QId = req.getParameter("QId");
		   mongo.insert(collectionName,json,QId);
		   map.put("success", true);
		   map.put("message", "插入成功");
		   return map;
		   
		   //         System.out.println(json);  
	   }catch(Exception e){  
            e.printStackTrace();  
       }  
		   
	   map.put("success", false);
	   map.put("message", "填写失败，请重试或联系管理员！");
	     return map;  
	 } 

	
	@ResponseBody  
	@RequestMapping("/viewResult.ajax")  
	//数据库中获取指定项目id的项目基础数据返回给相应查看页面
	public Map<String, Object> viewResult( int proId,HttpServletRequest req){
		Map<String,Object> result = new HashMap<String,Object>();
		MongodbDao mongo = MongodbDao.getDatabase();
		String projectType = req.getParameter("proType");
		String collectionName = "";
		//质控控制文件类型判断
		if(projectType.equals("quality")){
			   collectionName = "data";
		}else if(projectType.equals("jiHeChiCun")){
			   collectionName = "dataCicun";
		}else if(projectType.equals("wenJian")){
			   collectionName = "dataShenhe";
		}else{
			System.out.println("viewResult.ajax:项目类型不匹配");
		}
		//mongodb中查询指定项目id的"data","people","QId","proId"信息
		String proid = req.getParameter("proId");
		List<String> projection_list = Arrays.asList("date","people","proId","_id");
		MongoCursor<Document> result_cursor = mongo.query(collectionName,"proId",proid,projection_list,false);
		List<QualityInfo> data_list = new ArrayList<QualityInfo>();
		while(result_cursor.hasNext()){
			Document doc = result_cursor.next();
			QualityInfo info = new QualityInfo();
			info.setDate(doc.getString("date"));
			info.setPeople(doc.getString("people"));
			info.setProId(doc.getString("proId"));
			info.setQId(doc.get("_id").toString());
			
			data_list.add(info);
		}
		result.put("size", data_list.size());
		result.put("lists", data_list);
		return result;
		
	}
	@ResponseBody  
	@RequestMapping("/editResult.ajax")  
	//数据库中获取指定项目id的项目基础数据返回给相应修改页面
	public Map<String, Object> editResult( String qid,HttpServletRequest req){
		Map<String,Object> result = new HashMap<String,Object>();
		MongodbDao mongo = MongodbDao.getDatabase();

		//mongodb中查询指定项目id的"data","people","QId","proId"信息
		String QId = req.getParameter("qid");
		String proid = req.getParameter("proId");
		String projectType = req.getParameter("proType");
		String collectionName = "";
		List<String> typeNames = new ArrayList<String>();
		Map<String,List<String>> indx = new HashMap<String,List<String>>();
		//质控控制文件类型判断
	   if(projectType.equals("quality")){
		 //获取接受到的数据的项目所属大类	  
		   typeNames = typeService.getBigTypeByProId(Integer.parseInt(proid));
		   indx = index1;
		   collectionName = "data";
	   }else if(projectType.equals("jiHeChiCun")){
		   typeNames = typeService.getBigTypeByProId(Integer.parseInt(proid));
		   indx = index2;
		   collectionName = "dataCicun";
	   }else if(projectType.equals("wenJian")){
		   typeNames = Arrays.asList("shenHeJiLu");
		   indx = index3;
		   collectionName = "dataShenhe";
		   //文件报告审核处理
	   }else{
		   System.out.println("editResult.ajax:项目类型不匹配");
	   }
		System.out.println(QId);

		List<String> projection_list = new ArrayList<String>();
		//建立正则表达式
		//([a-zA-Z]+)_([a-z]{1,3})[0-9]{1,2}_?[0-9]?[0-9]?
		String pattern = "([a-zA-Z]+[0-9]*)_([a-z]{1,3})[0-9]{1,2}_?([0-9]{0,2})";
		Pattern r = Pattern.compile(pattern);
		MongoCursor<Document> result_cursor = mongo.query_byId(collectionName,QId, projection_list,true);
		//建立数据结构保存数据
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		List<QualityInfo> info_list = new ArrayList<QualityInfo>();
//		Map<String,Object> data_list = new HashMap<String,Object>();
		QualityInfo info = new QualityInfo();
		while(result_cursor.hasNext()){
			Document doc = result_cursor.next();
			Set<Map.Entry<String, Object>> entry = doc.entrySet();
			//data.list[i].name：第i个表格的名称，也就是前缀名
			int table_num = 0;
			List<String> indexContain = new ArrayList<String>();   //处理过的数据所包含的table前缀名
		   for(int i = 0; i < typeNames.size(); ++i){
			   List<String> table_prefix = indx.get(typeNames.get(i));
			   for(int tp = 0; tp < table_prefix.size(); ++tp){
				   if(indexContain.contains(table_prefix.get(tp))){
					   continue;
				   }
				   indexContain.add(table_prefix.get(tp));
					list.add(new HashMap<String,Object>());
					list.get(table_num).put("name", table_prefix.get(tp).substring(0, table_prefix.get(tp).length()-1));
					//data.list[i].change[0] initialize
					Map<String,Object> changeData = new HashMap<String,Object>();
					
					List<Map<String,Object>> changeList = new ArrayList<Map<String,Object>>();
					changeList.add(changeData);
					list.get(table_num).put("change", changeList);
					list.get(table_num).put("change2", changeList);
					list.get(table_num).put("change3", changeList);
					table_num += 1;
			   }
			   
		   }
			
			for(Iterator it=entry.iterator();it.hasNext();){
				Map.Entry<String, Object> obj = (Map.Entry<String, Object>)it.next();
				String key = obj.getKey();
				if(key.equals("date")){
//					info.setDate(obj.getValue().toString());
					list.get(0).put("date", obj.getValue());
				}
				else if(key.equals("people")){
//					info.setPeople(obj.getValue().toString());
					list.get(0).put("people", obj.getValue());
				}
				else if(key.equals("_id")){
//					info.setQId(obj.getValue().toString());
					list.get(0).put("_id", obj.getValue());
				}
				else if(key.equals("proId")){
//					info.setProId(obj.getValue().toString());
					list.get(0).put("proId", obj.getValue());
				}
				else{
					Matcher m = r.matcher(key);
					if(m.find()){
						String[] name = key.split("_");
						if(!obj.getValue().toString().equals("")){
							System.out.println(key+":"+obj.getValue().toString());
						}
						System.out.println("m.group(1) is :"+m.group(1));
						int index = indexContain.indexOf(m.group(1)+"_");
						if(m.group(2).equals("l")){
							int li = Integer.parseInt(m.group(3));
							while(((List<Map<String,Object>>)list.get(index).get("change")).size()<=li){
								((List<Map<String,Object>>)list.get(index).get("change")).add(new HashMap<String,Object>());
							}
//							System.out.println(name[0]+"   "+name[1]+"  "+m.group(2)+"  "+m.group(3)+"   "+((List<Map<String,Object>>)list.get(index).get("change")).size());
							((List<Map<String,Object>>)list.get(index).get("change")).get(li).put(name[0]+"_"+name[1],obj.getValue());
						}
						else if(m.group(2).equals("ll")){
							int li = Integer.parseInt(m.group(3));
							while(((List<Map<String,Object>>)list.get(index).get("change2")).size()<=li){
								((List<Map<String,Object>>)list.get(index).get("change2")).add(new HashMap<String,Object>());
							}
							((List<Map<String,Object>>)list.get(index).get("change2")).get(li).put(name[0]+"_"+name[1],obj.getValue());
						}
						else if(m.group(2).equals("lll")){
							int li = Integer.parseInt(m.group(3));
							while(((List<Map<String,Object>>)list.get(index).get("change3")).size()<=li){
								((List<Map<String,Object>>)list.get(index).get("change3")).add(new HashMap<String,Object>());
							}
							((List<Map<String,Object>>)list.get(index).get("change3")).get(li).put(name[0]+"_"+name[1],obj.getValue());
						}
						//data.list[i].XXX_a1:非可变部分
						else{
							list.get(index).put(name[0]+"_"+name[1], obj.getValue());
						}
						//data.list[i].XXX_[^l]非l  数据存放到list[i].change[0]
//						else{
//							((List<Map<String,Object>>)list.get(index).get("change")).get(0).put(name[0]+"_"+name[1],obj.getValue());
//						}
						
					}
					else {
				         System.out.println("项目名前缀   NO MATCH");
				    }
				}
				
			}
		}
		for(int i=0;i<list.size();++i){
			int length = ((List<Map<String,Object>>)list.get(i).get("change")).size();
			((List<Map<String,Object>>)list.get(i).get("change")).get(0).put("length",length);
		}
		result.put("size", list.size());
		result.put("length", list.size());
		result.put("list", list);
		return result;
		
	}
}
