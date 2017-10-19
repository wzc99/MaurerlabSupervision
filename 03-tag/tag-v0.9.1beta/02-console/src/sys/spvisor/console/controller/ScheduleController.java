package sys.spvisor.console.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sys.spvisor.core.criteria.project.ProcessCriteria;
import sys.spvisor.core.entity.process.TDeliveryPipeProcess;
import sys.spvisor.core.entity.process.TFangfuProcess;
import sys.spvisor.core.entity.process.TGuanjianProcess;
import sys.spvisor.core.entity.process.TJueyuanjietouProcess;
import sys.spvisor.core.entity.process.TScheduleNode;
import sys.spvisor.core.entity.process.TShebeiBengProcess;
import sys.spvisor.core.entity.process.TShebeiProcess;
import sys.spvisor.core.entity.process.TShiyouProcess;
import sys.spvisor.core.entity.process.TValveProcess;
import sys.spvisor.core.entity.process.TWanguanProcess;
import sys.spvisor.core.entity.process.TZuanjuProcess;
import sys.spvisor.core.entity.project.TGoodsLists;
import sys.spvisor.core.entity.work.TProType;
import sys.spvisor.core.entity.work.TProductTypeMapping;
import sys.spvisor.core.result.process.GoodsListsModel;
import sys.spvisor.core.result.process.ProductTypeModel;
import sys.spvisor.core.result.process.ScheduleNodeModel;
import sys.spvisor.core.result.process.ScheduleTableModel;
import sys.spvisor.core.result.process.TScheduleNodeModel;
import sys.spvisor.core.result.process.Table1;
import sys.spvisor.core.result.process.Table2;
import sys.spvisor.core.result.process.Table22;
import sys.spvisor.core.result.process.Table222;
import sys.spvisor.core.result.process.Table3;
import sys.spvisor.core.result.process.Table33;
import sys.spvisor.core.service.process.ScheduleService;
import sys.spvisor.core.service.project.ProjectService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
	@Autowired
	ScheduleService scheduleService;
	@Autowired
	ProjectService projectService;


	//10个数组，数组元素为一个节点的相应信息
	private static ScheduleNodeModel[] shuSongGuan = new ScheduleNodeModel[11];
	
	private static ScheduleNodeModel[] wanGuan = new ScheduleNodeModel[9];
	
	private static ScheduleNodeModel[] fangFu = new ScheduleNodeModel[6];
	
	private static ScheduleNodeModel[] shiYou = new ScheduleNodeModel[7];
	
	private static ScheduleNodeModel[] guanJian = new ScheduleNodeModel[7];
	
	private static ScheduleNodeModel[] faMen = new ScheduleNodeModel[9];
	
	private static ScheduleNodeModel[] sheBei = new ScheduleNodeModel[19];
	
	private static ScheduleNodeModel[] sheBeiBeng = new ScheduleNodeModel[8];
	
	private static ScheduleNodeModel[] zuanJu = new ScheduleNodeModel[10];
	
	private static ScheduleNodeModel[] jueYuan = new ScheduleNodeModel[12];
	/**
	 * 获取节点信息，初始化前端进度节点表和进度表
	 * @param projectId
	 * @return
	 */
	@Transactional
	@RequestMapping("/getNodeAndTable.ajax")	
	public @ResponseBody Map<String,Object> getNodeAndTableByProjectId(Integer projectId) {
		Map<String, Object> result = new HashMap<String, Object>();
		//TProject project = projectService.selectByPrimaryKey(projectId);
		//String idss = project.getProSmallProductType();
		List<TProType> proTypes = scheduleService.getTypeByProId(projectId);
		if(proTypes.size() == 0){//还没选择子类
			result.put("type", null);//所选子类list
			result.put("node", null);//node为所选子类的所选节点信息
			result.put("list", null);//显示哪些进度表，跟物资清单每条记录对应
			return result;
		}
		else{
			//String[] ids = idss.split(",");
			List<Integer> idsint = new ArrayList<Integer>();
			for(TProType t : proTypes)
				idsint.add(t.getTypeId());
			List<TProductTypeMapping> type = scheduleService.getTypeList(idsint);
			result.put("type", type);
			
			List<TScheduleNode> nodes = scheduleService.getNodesByProId(projectId);
			//如果还没有选节点
			if(nodes.size() == 0){
				result.put("node", null);
				result.put("list", null);
			}
			//如果选了节点
			else{
				List<TScheduleNode> node = new ArrayList<TScheduleNode>();
				for(TProductTypeMapping t : type){
					TScheduleNode n = scheduleService.getNode(projectId,t.getTypeMappingId());
					if(n != null)//如果此子类选了节点
						node.add(n);
					else//如果此子类没有选节点，因为有可能出现后期增加了子类却没有选节点
						node.add(null);
				}
				result.put("node", node);
				
				List<GoodsListsModel> list = new ArrayList<GoodsListsModel>();//往前端送的list
				List<TGoodsLists> goodsList = scheduleService.selectGoodsListsByProjectId(projectId);//获得物资列表
				for(TGoodsLists t : goodsList){
					GoodsListsModel e = new GoodsListsModel();//往前端送的list中的元素
					TScheduleNode n = scheduleService.getNode(projectId,t.getGoodId());
					e.setGoodsLists(t);
					int bigTypeId = scheduleService.getBigTypeIdByGoodId(t.getGoodId());
					e.setBigTypeId(bigTypeId);
					if(n != null){//如果此子类选了节点
						List<ScheduleNodeModel> scheduleTableList = new ArrayList<ScheduleNodeModel>();//保存此产品选了哪些节点的相关信息
						String[] nodesIdArr = n.getNodeidstr().split(",");
						if(bigTypeId == 1){//输送管
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(shuSongGuan[id-1]);
							}
						}
						else if(bigTypeId == 2){//弯管
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(wanGuan[id-1]);
							}
						}
						else if(bigTypeId == 3){//输送管或弯管
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(fangFu[id-1]);
							}
						}
						else if(bigTypeId == 4){//石油专用管
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(shiYou[id-1]);
							}
						}
						else if(bigTypeId == 5){//管件、法兰
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(guanJian[id-1]);
							}
						}
						else if(bigTypeId == 6){//阀门
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(faMen[id-1]);
							}
						}
						else if(bigTypeId == 7){//设备
							if(t.getGoodId() == 96){//设备（泵）
								for(String idStr : nodesIdArr){
									int id = Integer.parseInt(idStr);
									scheduleTableList.add(sheBeiBeng[id-1]);
								}
							}
							else {//（炉类等）
								for(String idStr : nodesIdArr){
									int id = Integer.parseInt(idStr);
									scheduleTableList.add(sheBei[id-1]);
								}
							}
						}
						else if(bigTypeId == 8){//钻具
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(zuanJu[id-1]);
							}
						}
						else if(bigTypeId == 9){//绝缘接头
							for(String idStr : nodesIdArr){
								int id = Integer.parseInt(idStr);
								scheduleTableList.add(jueYuan[id-1]);
							}
						}
						e.setScheduleTableList(scheduleTableList);
						
					}
					else{
						e.setScheduleTableList(null);
					}
					list.add(e);
				}
				result.put("list", list);
					
			}
			return result;
		}
			
			
	}
	
	@Transactional
	@RequestMapping("/saveNode.ajax")
	public @ResponseBody Map<String,Object> saveNode(Integer projectId, TScheduleNodeModel model) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			scheduleService.deleteNodeByProjectId(projectId);
			for(TScheduleNode n : model.getList()){
				n.setProId(projectId);
				scheduleService.saveNode(n);
			}
			result.put("success", true);
			result.put("message", "保存成功！");
		}catch (Exception e) {
			result.put("success", false);
			result.put("message", "保存失败！");
		}
		return result;
	}
	
	/**
	 * 保存进度表
	 * @param projectId
	 * @param model
	 * @param whichDay
	 * @param session
	 * @return
	 */
	@Transactional
	@RequestMapping("/addScheduleTable.ajax")
	public @ResponseBody Map<String,Object> addScheduleTable(Integer projectId,ScheduleTableModel model, Date whichDay, HttpSession session) {// ScheduleTableModel model, 
		 //ScheduleTableModel model = new  ScheduleTableModel();
		int userId =  (int) (long)session.getAttribute("USER_ID");
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			if(model == null)
				throw new Exception();
			//输送管
			if(model.getShuSongGuan() != null && model.getShuSongGuan().size() > 0){
				for(TDeliveryPipeProcess e : model.getShuSongGuan()){
					TDeliveryPipeProcess delivery = (TDeliveryPipeProcess) scheduleService.selectSchedule(projectId,1,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSubmitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					e.setFinishingWarehousingDun(e.getFinishingWarehousingDun()==null?0:e.getFinishingWarehousingDun());
					e.setPipeFalaingDun(e.getPipeFalaingDun()==null?0:e.getPipeFalaingDun());
					//看有没有选防腐管入库结点
					String nodesStr = scheduleService.selectNodesByWuZiIdAndProId(e.getTypeId(),projectId);//e.getTypeId()为物资清单id
					if(nodesStr == null)
						throw new Exception();
					else if(nodesStr.indexOf("9") != -1){//选了
						e.setPipeRukuDun(e.getPipeRukuDun()==null?0:e.getPipeRukuDun());
						Double  completeRate= ((0.8*e.getFinishingWarehousingDun()+0.1*e.getPipeRukuDun()+0.1*e.getPipeFalaingDun())/total)*100; 
						e.setCompleteRate(completeRate);
					}
					else{//没选
						Double  completeRate= ((0.9*e.getFinishingWarehousingDun()+0.1*e.getPipeFalaingDun())/total)*100; 
						e.setCompleteRate(completeRate);
					}
						
					if(delivery == null)//没有记录
						scheduleService.insertSchedule(1,e);
					
					else{
						e.setId(delivery.getId());
						scheduleService.updateSchedule(1,e);
					}
				}
				
			}
			//弯管
			if(model.getWanGuan() != null && model.getWanGuan().size() > 0){
				for(TWanguanProcess e : model.getWanGuan()){
					TWanguanProcess wanguan = (TWanguanProcess) scheduleService.selectSchedule(projectId,2,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSumbitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					e.setChengpinrukuDun(e.getChengpinrukuDun()==null?0:e.getChengpinrukuDun());
					e.setFayunDun(e.getFayunDun()==null?0:e.getFayunDun());
					//看有没有选防腐管入库结点
					String nodesStr = scheduleService.selectNodesByWuZiIdAndProId(e.getTypeId(),projectId);
					if(nodesStr == null)
						throw new Exception();
					else if(nodesStr.indexOf("7") != -1){//选了
						e.setFangfuguanrukuDun(e.getFangfuguanrukuDun()==null?0:e.getFangfuguanrukuDun());
						Double  completeRate= ((0.8*e.getChengpinrukuDun()+0.1*e.getFangfuguanrukuDun()+0.1*e.getFayunDun())/total)*100; 
						e.setCompleteRateToday(completeRate);
					}
					else{//没选
						Double  completeRate= ((0.9*e.getChengpinrukuDun()+0.1*e.getFayunDun())/total)*100; 
						e.setCompleteRateToday(completeRate);
					}
						
					if(wanguan == null)//没有记录
						scheduleService.insertSchedule(2,e);
					
					else{
						e.setWanguanId(wanguan.getWanguanId());
						scheduleService.updateSchedule(2,e);
					}
				}
				
			}
			//输送管或弯管防腐
			if(model.getFangFu() != null && model.getFangFu().size() > 0){
				for(TFangfuProcess e : model.getFangFu()){
					TFangfuProcess fangfu = (TFangfuProcess) scheduleService.selectSchedule(projectId,3,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSumbitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					e.setFangfuguanrukuDun(e.getFangfuguanrukuDun()==null?0:e.getFangfuguanrukuDun());
					e.setFayunDun(e.getFayunDun()==null?0:e.getFayunDun());
					Double  completeRate= ((0.9*e.getFangfuguanrukuDun()+0.1*e.getFayunDun())/total)*100; 
					e.setCompleteRateToday(completeRate);
						
					if(fangfu == null)//没有记录
						scheduleService.insertSchedule(3,e);
					else{
						e.setFangfuId(fangfu.getFangfuId());
						scheduleService.updateSchedule(3,e);
					}
				}
				
			}
			//石油专用管
			if(model.getShiYou() != null && model.getShiYou().size() > 0){
				for(TShiyouProcess e : model.getShiYou()){
					TShiyouProcess shiyou = (TShiyouProcess) scheduleService.selectSchedule(projectId,4,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSubmitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					e.setChengpinrukuDun(e.getChengpinrukuDun()==null?0:e.getChengpinrukuDun());
					e.setFayunDun(e.getFayunDun()==null?0:e.getFayunDun());
					Double  completeRate= ((0.9*e.getChengpinrukuDun()+0.1*e.getFayunDun())/total)*100; 
					e.setCompleteRateToday(completeRate);
						
					if(shiyou == null)//没有记录
						scheduleService.insertSchedule(4,e);
					else{
						e.setShiyouId(shiyou.getShiyouId());
						scheduleService.updateSchedule(4,e);
					}
				}
			}
			//管件、法兰
			if(model.getGuanJian() != null && model.getGuanJian().size() > 0){
				for(TGuanjianProcess e : model.getGuanJian()){
					TGuanjianProcess guanjian = (TGuanjianProcess) scheduleService.selectSchedule(projectId,5,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSubmitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					e.setChengpinruku(e.getChengpinruku()==null?0:e.getChengpinruku());
					e.setFayun(e.getFayun()==null?0:e.getFayun());
					Double  completeRate= ((0.9*e.getChengpinruku()+0.1*e.getFayun())/total)*100; 
					e.setCompleteRateToday(completeRate);
						
					if(guanjian == null)//没有记录
						scheduleService.insertSchedule(5,e);
					else{
						e.setGuanjianId(guanjian.getGuanjianId());
						scheduleService.updateSchedule(5,e);
					}
				}
			}
			//阀门
			if(model.getFaMen() != null && model.getFaMen().size() > 0){
				for(TValveProcess e : model.getFaMen()){
					TValveProcess famen = (TValveProcess) scheduleService.selectSchedule(projectId,6,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setValveSumbitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					e.setValveBodyProcess(e.getValveBodyProcess()==null?0:e.getValveBodyProcess());
					e.setValveFinalAssembly(e.getValveFinalAssembly()==null?0:e.getValveFinalAssembly());
					e.setStrengthExperiment(e.getStrengthExperiment()==null?0:e.getStrengthExperiment());
					e.setFinishingWarehousing(e.getFinishingWarehousing()==null?0:e.getFinishingWarehousing());
					e.setValveSend(e.getValveSend()==null?0:e.getValveSend());
					
					Double  completeRate= ((0.2*e.getValveBodyProcess()+0.2*e.getValveFinalAssembly()+0.2*e.getStrengthExperiment()+0.3*e.getFinishingWarehousing()+0.1*e.getValveSend())/total)*100; 
					e.setCompleteRate(completeRate);
						
					if(famen == null)//没有记录
						scheduleService.insertSchedule(6,e);
					else{
						e.setId(famen.getId());
						scheduleService.updateSchedule(6,e);
					}
				}
			}
			//设备
			if(model.getSheBei() != null && model.getSheBei().size() > 0){
				for(TShebeiProcess e : model.getSheBei()){
					TShebeiProcess shebei = (TShebeiProcess) scheduleService.selectSchedule(projectId,7,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSumbitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					String nodesStr = scheduleService.selectNodesByWuZiIdAndProId(e.getTypeId(),projectId);
					String[] nodesArray = nodesStr.split(",");
					//double[] values = new double[nodesArray.length];
					double weight = 1.0/nodesArray.length;
					double sum = 0;
					for(String idstr : nodesArray){
						if(Integer.valueOf(idstr)==1)
							sum += weight*(e.getZhucaidaoliao()==null?0:e.getZhucaidaoliao());
						else if(Integer.valueOf(idstr)==2){
							sum += weight*(e.getQiaotixialiao()==null?0:e.getQiaotixialiao());
						}
						else if(Integer.valueOf(idstr)==3){
							sum += weight*(e.getFengtou()==null?0:e.getFengtou());
						}
						else if(Integer.valueOf(idstr)==4){
							sum += weight*(e.getQiaozhuangdizuo()==null?0:e.getQiaozhuangdizuo());
						}
						else if(Integer.valueOf(idstr)==5){
							sum += weight*(e.getJieguabfalan()==null?0:e.getJieguabfalan());
						}
						else if(Integer.valueOf(idstr)==6){
							sum += weight*(e.getQiaotizuzhuang()==null?0:e.getQiaotizuzhuang());
						}
						else if(Integer.valueOf(idstr)==7){
							sum += weight*(e.getJieguanzuzhuang()==null?0:e.getJieguanzuzhuang());
						}
						else if(Integer.valueOf(idstr)==8){
							sum += weight*(e.getNeijianzuzhuang()==null?0:e.getNeijianzuzhuang());
						}
						else if(Integer.valueOf(idstr)==9){
							sum += weight*(e.getYuhanjian()==null?0:e.getYuhanjian());
						}
						else if(Integer.valueOf(idstr)==10){
							sum += weight*(e.getGuanxianzuzhuang()==null?0:e.getGuanxianzuzhuang());
						}
						else if(Integer.valueOf(idstr)==11){
							sum += weight*(e.getWusunjiance()==null?0:e.getWusunjiance());
						}
						else if(Integer.valueOf(idstr)==12){
							sum += weight*(e.getRechuli()==null?0:e.getRechuli());
						}
						else if(Integer.valueOf(idstr)==13){
							sum += weight*(e.getShuiyashiyan()==null?0:e.getShuiyashiyan());
						}
						else if(Integer.valueOf(idstr)==14){
							sum += weight*(e.getQiyashiyan()==null?0:e.getQiyashiyan());
						}
						else if(Integer.valueOf(idstr)==15){
							sum += weight*(e.getZhulu()==null?0:e.getZhulu());
						}
						else if(Integer.valueOf(idstr)==16){
							sum += weight*(e.getBaowen()==null?0:e.getBaowen());
						}
						else if(Integer.valueOf(idstr)==17){
							sum += weight*(e.getTiaoshishiyan()==null?0:e.getTiaoshishiyan());
						}
						else if(Integer.valueOf(idstr)==18){
							sum += weight*(e.getYouqibiaoshi()==null?0:e.getYouqibiaoshi());
						}
						else if(Integer.valueOf(idstr)==19){
							sum += weight*(e.getFayun()==null?0:e.getFayun());
						}
					}
					
					Double  completeRate= (sum/total)*100; 
					e.setCompleteRateToday(completeRate);
						
					if(shebei == null)//没有记录
						scheduleService.insertSchedule(7,e);
					else{
						e.setShebeiId(shebei.getShebeiId());
						scheduleService.updateSchedule(7,e);
					}
				}
			}
			//设备（泵）
			if(model.getSheBeiBeng() != null && model.getSheBeiBeng().size() > 0){
				for(TShebeiBengProcess e : model.getSheBeiBeng()){
					TShebeiBengProcess shebeibeng = (TShebeiBengProcess) scheduleService.selectSchedule(projectId,8,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSumbitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					String nodesStr = scheduleService.selectNodesByWuZiIdAndProId(e.getTypeId(),projectId);
					String[] nodesArray = nodesStr.split(",");
					//double[] values = new double[nodesArray.length];
					double weight = 1.0/nodesArray.length;
					double sum = 0;
					for(String idstr : nodesArray){
						if(Integer.valueOf(idstr)==1)
							sum += weight*(e.getBengBodyProcessCheck()==null?0:e.getBengBodyProcessCheck());
						else if(Integer.valueOf(idstr)==2){
							sum += weight*(e.getBengSpindleProcessCheck()==null?0:e.getBengSpindleProcessCheck());
						}
						else if(Integer.valueOf(idstr)==3){
							sum += weight*(e.getBengImpellerProcessCheck()==null?0:e.getBengImpellerProcessCheck());
						}
						else if(Integer.valueOf(idstr)==4){
							sum += weight*(e.getBengFinalAssembly()==null?0:e.getBengFinalAssembly());
						}
						else if(Integer.valueOf(idstr)==5){
							sum += weight*(e.getBengPerformanceTest()==null?0:e.getBengPerformanceTest());
						}
						else if(Integer.valueOf(idstr)==6){
							sum += weight*(e.getBengPaint()==null?0:e.getBengPaint());
						}
						else if(Integer.valueOf(idstr)==7){
							sum += weight*(e.getChengpinruku()==null?0:e.getChengpinruku());
						}
						else if(Integer.valueOf(idstr)==8){
							sum += weight*(e.getFayun()==null?0:e.getFayun());
						}
					}
					
					Double  completeRate= (sum/total)*100; 
					e.setCompleteRateToday(completeRate);
						
					if(shebeibeng == null)//没有记录
						scheduleService.insertSchedule(8,e);
					else{
						e.setId(shebeibeng.getId());
						scheduleService.updateSchedule(8,e);
					}
				}
			}
			//钻具
			if(model.getZuanJu() != null && model.getZuanJu().size() > 0){
				for(TZuanjuProcess e : model.getZuanJu()){
					TZuanjuProcess zuanju = (TZuanjuProcess) scheduleService.selectSchedule(projectId,9,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSumbitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					
					e.setWusunjiance(e.getWusunjiance()==null?0:e.getWusunjiance());
					e.setLuowenjiagong(e.getLuowenjiagong()==null?0:e.getLuowenjiagong());
					e.setTufu(e.getTufu()==null?0:e.getTufu());
					e.setChengpinruku(e.getChengpinruku()==null?0:e.getChengpinruku());
					e.setFayun(e.getFayun()==null?0:e.getFayun());
					
					Double  completeRate= ((0.1*e.getWusunjiance()+0.2*e.getLuowenjiagong()+0.1*e.getTufu()+0.5*e.getChengpinruku()+0.1*e.getFayun())/total)*100; 
					e.setCompleteRateToday(completeRate);
						
					if(zuanju == null)//没有记录
						scheduleService.insertSchedule(9,e);
					else{
						e.setZuanjuId(zuanju.getZuanjuId());
						scheduleService.updateSchedule(9,e);
					}
				}
			}
			//绝缘接头
			if(model.getJueYuan() != null && model.getJueYuan().size() > 0){
				for(TJueyuanjietouProcess e : model.getJueYuan()){
					TJueyuanjietouProcess jueyuan = (TJueyuanjietouProcess) scheduleService.selectSchedule(projectId,10,whichDay,e.getTypeId());
					e.setProId(projectId);
					e.setWhichDay(whichDay);
					e.setUserId(userId);
					e.setSumbitDate(new Date(new java.util.Date().getTime()));
					int total = scheduleService.getGoodsTotalByWuZiId(e.getTypeId());
					
					e.setZuzhuanghanjie(e.getZuzhuanghanjie()==null?0:e.getZuzhuanghanjie());
					e.setHanfengjiance(e.getHanfengjiance()==null?0:e.getHanfengjiance());
					e.setShuiyashiyan(e.getShuiyashiyan()==null?0:e.getShuiyashiyan());
					e.setShuiyajiawanju(e.getShuiyajiawanju()==null?0:e.getShuiyajiawanju());
					e.setFangfutuceng(e.getFangfutuceng()==null?0:e.getFangfutuceng());
					e.setChengpinruku(e.getChengpinruku()==null?0:e.getChengpinruku());
					e.setFayun(e.getFayun()==null?0:e.getFayun());
					double wZuZhuang = 0.2,wHanFeng = 0.1,wShuiYa = 0.1,wShuiYaJia = 0.1,wFangFu = 0.1,wChengPin = 0.3,wFaYun = 0.1;

					String nodesStr = scheduleService.selectNodesByWuZiIdAndProId(e.getTypeId(),projectId);//e.getTypeId()为物资清单id
					if(nodesStr == null)
						throw new Exception();
					else{
						if(nodesStr.indexOf("4") == -1){//没选组装焊接
							wChengPin=wChengPin+wZuZhuang;
							wZuZhuang = 0;
							e.setZuzhuanghanjie(null);
						}
						if(nodesStr.indexOf("5") == -1){//没选焊缝检测
							wChengPin=wChengPin+wHanFeng;
							wHanFeng = 0;
							e.setHanfengjiance(null);
						}
						if(nodesStr.indexOf("10") == -1){//没选防腐涂层
							wChengPin=wChengPin+wFangFu;
							wFangFu = 0;
							e.setFangfutuceng(null);
						}
					}
					
					Double  completeRate= ((wZuZhuang*e.getZuzhuanghanjie()+wHanFeng*e.getHanfengjiance()+wShuiYa*e.getShuiyashiyan()+wShuiYaJia*e.getShuiyajiawanju()+wFangFu*e.getFangfutuceng()+wFaYun*e.getFayun())/total)*100; 
					e.setCompleteRateToday(completeRate);
						
					if(jueyuan == null)//没有记录
						scheduleService.insertSchedule(10,e);
					else{
						e.setJueyuanId(jueyuan.getJueyuanId());
						scheduleService.updateSchedule(10,e);
					}
				}
			}
			result.put("success", true);
			result.put("message", "保存成功！");
		}catch (Exception e) {
			result.put("success", false);
			result.put("message", "保存失败！");
		}
		return result;
	}
	
	@Transactional
	@RequestMapping("/getProductType.ajax")
	public @ResponseBody List<ProductTypeModel> getProductType(Integer projectId) {
		
		return scheduleService.getProductTypeByProjectId(projectId);
		
	}
	
	@Transactional
	//根据条件查询进度
	@RequestMapping("/queryProcess.ajax")
	public @ResponseBody Map<String, Object> queryProcess(ProcessCriteria params) {
		Map<String, Object> result = new HashMap<String, Object>(3);
		List<ProcessCriteria> lists = null;
		try {
			lists = scheduleService.selectByExample(params);
			int count = scheduleService.selectAllCount(params);
			result.put("total", count);
			result.put("rows", lists);
			result.put("success", true);
			result.put("message", "查询成功");
		} catch (Exception e) {
			result.put("rows", null);
			result.put("success", false);
			result.put("message", "没有查到相关项目，请重新输入");
		}
		return result;
		
	}
	@Transactional
	@RequestMapping("/selectOneProcess.ajax")
	public @ResponseBody List<ScheduleNodeModel> selectOneProcess(Integer bigTypeId,Integer id) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		List<ScheduleNodeModel> result = new ArrayList<ScheduleNodeModel>();
		if(bigTypeId == 1){//输送管
			TDeliveryPipeProcess p = (TDeliveryPipeProcess)scheduleService.selectProcessByTwoId(1,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr,shuSongGuan);
		}
		else if(bigTypeId == 2){//弯管
			TWanguanProcess p = (TWanguanProcess)scheduleService.selectProcessByTwoId(2,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, wanGuan);
		}
		else if(bigTypeId == 3){//输送管或弯管
			TFangfuProcess p = (TFangfuProcess)scheduleService.selectProcessByTwoId(3,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, fangFu);
		}
		else if(bigTypeId == 4){//石油专用管
			TShiyouProcess p = (TShiyouProcess)scheduleService.selectProcessByTwoId(4,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, shiYou);
		}
		else if(bigTypeId == 5){//管件、法兰
			TGuanjianProcess p = (TGuanjianProcess)scheduleService.selectProcessByTwoId(5,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, guanJian);
		}
		else if(bigTypeId == 6){//阀门
			TValveProcess p = (TValveProcess)scheduleService.selectProcessByTwoId(6,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, faMen);
		}
		else if(bigTypeId == 7){//设备
			TShebeiProcess p = (TShebeiProcess)scheduleService.selectProcessByTwoId(7,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, sheBei);
		}
		else if(bigTypeId == 8){//设备beng
			TShebeiBengProcess p = (TShebeiBengProcess)scheduleService.selectProcessByTwoId(8,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, sheBeiBeng);
		}
		else if(bigTypeId == 9){//钻具
			TZuanjuProcess p = (TZuanjuProcess)scheduleService.selectProcessByTwoId(9,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, zuanJu);
		}
		else if(bigTypeId == 10){//绝缘接头
			TJueyuanjietouProcess p = (TJueyuanjietouProcess)scheduleService.selectProcessByTwoId(10,id);
			TGoodsLists g = scheduleService.getGoodsByPK(p.getTypeId());
			TScheduleNode n = scheduleService.getNode(p.getProId(),g.getGoodId());
			String[] nodesIdArr = n.getNodeidstr().split(",");
			
			setValue(result, p, nodesIdArr, jueYuan);

		}
		return result;
	}

	private void setValue(List<ScheduleNodeModel> result,
			Object p, String[] nodesIdArr, ScheduleNodeModel[] type)
			throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException {
		for(String idStr : nodesIdArr){
			int index = Integer.parseInt(idStr);
			ScheduleNodeModel type_ = new ScheduleNodeModel(type[index-1]);
			String[] value = new String[type_.getName().length];
			int i = 0;
			for(String attr : type_.getName()){
				if(attr != null && attr.length() > 0){
					String firstLetter = attr.substring(0, 1).toUpperCase();
					String methodName = "get"+firstLetter+attr.substring(1);
					//System.out.println(methodName);
					Method method = p.getClass().getMethod(methodName);
					value[i++] = method.invoke(p)==null?"":method.invoke(p).toString();
				}
			}
			type_.setValue(value);
			result.add(type_);
		}
	}
	
	@Transactional
	@RequestMapping("/deleteSchedule.ajax")
	public @ResponseBody Map<String, Object> deleteSchedule(@Param("parm")String parm) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		try {
			int rows = scheduleService.delete(parm);
			result.put("success", true);
			result.put("message", "删除进度信息成功！影响行数:" + rows);
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "删除进度信息失败！");
		}
		return result;
	}
	
	@Transactional
	@RequestMapping("/accumulateSchedule.ajax")
	public @ResponseBody List<GoodsListsModel> accumulateSchedule(Integer projectId) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> result = new ArrayList<GoodsListsModel>();
		List<TDeliveryPipeProcess> deli = scheduleService.accumulateDeliByproId(projectId);
		for(TDeliveryPipeProcess e : deli){
			addAGoodsListModel(projectId, result, e, e.getCompleteRate(), e.getTypeId(), shuSongGuan, 1);
		}
		List<TWanguanProcess> wang = scheduleService.accumulateWangByproId(projectId);
		for(TWanguanProcess e : wang){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), wanGuan, 2);
		}
		List<TFangfuProcess> fang = scheduleService.accumulatefangByproId(projectId);
		for(TFangfuProcess e : fang){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), fangFu, 3);
		}
		List<TShiyouProcess> shiy = scheduleService.accumulateShiyByproId(projectId);
		for(TShiyouProcess e : shiy){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), shiYou, 4);
		}
		List<TGuanjianProcess> guan = scheduleService.accumulateGuanByproId(projectId);
		for(TGuanjianProcess e : guan){
			TGuanjianProcess e_ = scheduleService.selectLatestByGoodsIdAndProId(e.getTypeId(),projectId);//选择最近的记录填充非数字的节点，因为未开始、正进行、已完成不能累计
			e.setXialiao(e_.getXialiao());
			e.setChengxing(e_.getChengxing());
			e.setHanjie(e_.getHanjie());
			e.setRechuli(e_.getRechuli());
			e.setWusunjiance(e_.getWusunjiance());
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), guanJian, 5);
		}
		List<TValveProcess> valv = scheduleService.accumulateValvByproId(projectId);
		for(TValveProcess e : valv){
			addAGoodsListModel(projectId, result, e, e.getCompleteRate(), e.getTypeId(), faMen, 6);
		}
		List<TShebeiProcess> sheb = scheduleService.accumulateShebByproId(projectId);
		for(TShebeiProcess e : sheb){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), sheBei, 7);
		}
		List<TShebeiBengProcess> beng = scheduleService.accumulateBengByproId(projectId);
		for(TShebeiBengProcess e : beng){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), sheBeiBeng, 8);
		}
		List<TZuanjuProcess> zuan = scheduleService.accumulateZuanByproId(projectId);
		for(TZuanjuProcess e : zuan){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), zuanJu, 9);
		}
		
		List<TJueyuanjietouProcess> juey = scheduleService.accumulateJueyByproId(projectId);
		for(TJueyuanjietouProcess e : juey){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), jueYuan, 10);
		}
		return result;
	}
	
	public List<GoodsListsModel> weeklySchedule(Integer projectId,Date d0,Date d1) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> result = new ArrayList<GoodsListsModel>();
		List<TDeliveryPipeProcess> deli = scheduleService.weeklyDeliByproId(projectId,d0,d1);
		for(TDeliveryPipeProcess e : deli){
			addAGoodsListModel(projectId, result, e, e.getCompleteRate(), e.getTypeId(), shuSongGuan, 1);
		}
		List<TWanguanProcess> wang = scheduleService.weeklyWangByproId(projectId,d0,d1);
		for(TWanguanProcess e : wang){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), wanGuan, 2);
		}
		List<TFangfuProcess> fang = scheduleService.weeklyfangByproId(projectId,d0,d1);
		for(TFangfuProcess e : fang){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), fangFu, 3);
		}
		List<TShiyouProcess> shiy = scheduleService.weeklyShiyByproId(projectId,d0,d1);
		for(TShiyouProcess e : shiy){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), shiYou, 4);
		}
		List<TGuanjianProcess> guan = scheduleService.weeklyGuanByproId(projectId,d0,d1);
		for(TGuanjianProcess e : guan){
			TGuanjianProcess e_ = scheduleService.selectLatestByGoodsIdAndProId(e.getTypeId(),projectId,d0,d1);//选择最近的记录填充非数字的节点，因为未开始、正进行、已完成不能累计
			e.setXialiao(e_.getXialiao());
			e.setChengxing(e_.getChengxing());
			e.setHanjie(e_.getHanjie());
			e.setRechuli(e_.getRechuli());
			e.setWusunjiance(e_.getWusunjiance());
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), guanJian, 5);
		}
		List<TValveProcess> valv = scheduleService.weeklyValvByproId(projectId,d0,d1);
		for(TValveProcess e : valv){
			addAGoodsListModel(projectId, result, e, e.getCompleteRate(), e.getTypeId(), faMen, 6);
		}
		List<TShebeiProcess> sheb = scheduleService.weeklyShebByproId(projectId,d0,d1);
		for(TShebeiProcess e : sheb){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), sheBei, 7);
		}
		List<TShebeiBengProcess> beng = scheduleService.weeklyBengByproId(projectId,d0,d1);
		for(TShebeiBengProcess e : beng){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), sheBeiBeng, 8);
		}
		List<TZuanjuProcess> zuan = scheduleService.weeklyZuanByproId(projectId,d0,d1);
		for(TZuanjuProcess e : zuan){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), zuanJu, 9);
		}
		
		List<TJueyuanjietouProcess> juey = scheduleService.weeklyJueyByproId(projectId,d0,d1);
		for(TJueyuanjietouProcess e : juey){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), jueYuan, 10);
		}
		return result;
	}
	
	

	private void addAGoodsListModel(Integer projectId,List<GoodsListsModel> result, Object e, double rate, int typeId, ScheduleNodeModel[] sms, int bigType)
			throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException {
		GoodsListsModel gm = new GoodsListsModel();
		TGoodsLists gg = scheduleService.getGoodsByPK(typeId);
		gm.setGoodsLists(gg);
		gm.setBigTypeId(bigType);
		//设置累计完成比例
		BigDecimal b = new BigDecimal(rate);  
		double resultRate =   b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
		gm.setCompleteRate(resultRate);
		
		TScheduleNode n = scheduleService.getNode(projectId,gg.getGoodId());
		String[] nodesIdArr = n.getNodeidstr().split(",");
		
		List<ScheduleNodeModel> sm = new ArrayList<ScheduleNodeModel>();
		setValue(sm, e, nodesIdArr, sms);
		gm.setScheduleTableList(sm);
		result.add(gm);
	}
	
	public List<GoodsListsModel> whichDaySchedule(Integer projectId, Date whichDay) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> result = new ArrayList<GoodsListsModel>();
		List<TDeliveryPipeProcess> deli = scheduleService.whichDayDeliByproId(projectId,whichDay);
		for(TDeliveryPipeProcess e : deli){
			addAGoodsListModel(projectId, result, e, e.getCompleteRate(), e.getTypeId(), shuSongGuan, 1);
		}
		List<TWanguanProcess> wang = scheduleService.whichDayWangByproId(projectId,whichDay);
		for(TWanguanProcess e : wang){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), wanGuan, 2);
		}
		List<TFangfuProcess> fang = scheduleService.whichDayfangByproId(projectId,whichDay);
		for(TFangfuProcess e : fang){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), fangFu, 3);
		}
		List<TShiyouProcess> shiy = scheduleService.whichDayShiyByproId(projectId,whichDay);
		for(TShiyouProcess e : shiy){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), shiYou, 4);
		}
		List<TGuanjianProcess> guan = scheduleService.whichDayGuanByproId(projectId,whichDay);
		for(TGuanjianProcess e : guan){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), guanJian, 5);
		}
		List<TValveProcess> valv = scheduleService.whichDayValvByproId(projectId,whichDay);
		for(TValveProcess e : valv){
			addAGoodsListModel(projectId, result, e, e.getCompleteRate(), e.getTypeId(), faMen, 6);
		}
		List<TShebeiProcess> sheb = scheduleService.whichDayShebByproId(projectId,whichDay);
		for(TShebeiProcess e : sheb){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), sheBei, 7);
		}
		List<TShebeiBengProcess> beng = scheduleService.whichDayBengByproId(projectId,whichDay);
		for(TShebeiBengProcess e : beng){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), sheBeiBeng, 8);
		}
		List<TZuanjuProcess> zuan = scheduleService.whichDayZuanByproId(projectId,whichDay);
		for(TZuanjuProcess e : zuan){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), zuanJu, 9);
		}
		
		List<TJueyuanjietouProcess> juey = scheduleService.whichDayJueyByproId(projectId,whichDay);
		for(TJueyuanjietouProcess e : juey){
			addAGoodsListModel(projectId, result, e, e.getCompleteRateToday(), e.getTypeId(), jueYuan, 10);
		}
		return result;
	}
	
	public List<Table1> dailyTable1(Integer projectId, Date whichDay) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> model = whichDaySchedule(projectId, whichDay);
		return table1(projectId,model);
	}
	
	public List<Table1> weeklyTable1(Integer projectId, Date d0, Date d1) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> model = weeklySchedule(projectId, d0, d1);
		return table1(projectId,model);
	}
	
	public List<Table1> table1(Integer projectId, List<GoodsListsModel> model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<Table1> result = new ArrayList<Table1>();
//		List<GoodsListsModel> model = whichDaySchedule(projectId, whichDay);
		List<GoodsListsModel> accumulateModel = accumulateSchedule(projectId);
		for(GoodsListsModel e0 : model){
			for(GoodsListsModel e1 : accumulateModel){
				if(e0.getGoodsLists().getId()==e1.getGoodsLists().getId()){
					Table1 table = new Table1();
					table.setProductName(e0.getGoodsLists().getGoodName());
					table.setProductNorm(e0.getGoodsLists().getGoodSpecifications());
					table.setOrderTotal(e0.getGoodsLists().getGoodOrderNum());
					table.setUnit(e0.getGoodsLists().getGoodUnit());
					table.setCompleteRateToday(e0.getCompleteRate());
					table.setCompleteRateTotal(e1.getCompleteRate());
					table.setPromiseDate(e0.getGoodsLists().getPromiseDate());
					table.setPlanDate(e0.getGoodsLists().getPlanDate());
					result.add(table);
				}
			}
		}
		return result;
	}
	
	public List<Table2> dailyTable2(Integer projectId, Date whichDay) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> model = whichDaySchedule(projectId, whichDay);
		return table2(projectId,model);
	}
	
	public List<Table2> weeklyTable2(Integer projectId, Date d0, Date d1) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> model = weeklySchedule(projectId, d0, d1);
		return table2(projectId,model);
	}
	
	public List<Table2> table2(Integer projectId, List<GoodsListsModel> model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<Table2> result = new ArrayList<Table2>();
//		List<GoodsListsModel> whichDayModel = whichDaySchedule(projectId, whichDay);
		List<GoodsListsModel> accumulateModel = accumulateSchedule(projectId);
		Map<Integer,List<GoodsListsModel>> maps = new HashMap<>();
		
		for(GoodsListsModel e0 : model){
			if(e0.getBigTypeId()!=1&&e0.getBigTypeId()!=3&&e0.getBigTypeId()!=4){
				if(maps.containsKey(e0.getGoodsLists().getGoodId())){
					List<GoodsListsModel> l = maps.get(e0.getGoodsLists().getGoodId());
					l.add(e0);
					maps.put(e0.getGoodsLists().getGoodId(), l);
				}
				else{
					List<GoodsListsModel> l = new ArrayList<>();
					l.add(e0);
					maps.put(e0.getGoodsLists().getGoodId(), l);
				}
			}
		}
		for(Entry<Integer, List<GoodsListsModel>> e:maps.entrySet()){
			Table2 table2 = new Table2();
			List<String> procedureName = new ArrayList<String>();
			GoodsListsModel gm = e.getValue().get(0);
			for(ScheduleNodeModel sm : gm.getScheduleTableList()){
				procedureName.add(sm.getNodeName());
			}
			table2.setProcedureName(procedureName);
			List<Table22> rows = new ArrayList<Table22>();
			List<GoodsListsModel> gms = e.getValue();
			for(GoodsListsModel e0 : gms){
				for(GoodsListsModel e1 : accumulateModel){
					if(e0.getGoodsLists().getId()==e1.getGoodsLists().getId()){
						Table22 table22 = new Table22();
						table22.setProductName(e0.getGoodsLists().getGoodName());
						table22.setProductNorm(e0.getGoodsLists().getGoodSpecifications());
						table22.setOrderTotal(e0.getGoodsLists().getGoodOrderNum());
						table22.setUnit(e0.getGoodsLists().getGoodUnit());
						List<Table222> table222s = new ArrayList<Table222>();
						for(int i = 0;i < e0.getScheduleTableList().size(); i++){
							Table222 table222 = new Table222();
							table222.setDay(e0.getScheduleTableList().get(i).getValue()[0]);
							table222.setSumUp(e1.getScheduleTableList().get(i).getValue()[0]);
							table222.setUnit(e0.getScheduleTableList().get(i).getUnit()[0].length()>3?"":e0.getScheduleTableList().get(i).getUnit()[0]);
							table222s.add(table222);
						}
						table22.setProcedureValue(table222s);
						rows.add(table22);
						
					}
				}
			}
			table2.setRows(rows);
			result.add(table2);
		}
		return result;
	}
	
	
	public List<Table3> dailyTable3(Integer projectId, Date whichDay) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> model = whichDaySchedule(projectId, whichDay);
		return table3(projectId,model);
	}
	
	public List<Table3> weeklyTable3(Integer projectId, Date d0, Date d1) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<GoodsListsModel> model = weeklySchedule(projectId, d0, d1);
		return table3(projectId,model);
	}
	public List<Table3> table3(Integer projectId,List<GoodsListsModel> model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		List<Table3> result = new ArrayList<Table3>();
//		List<GoodsListsModel> whichDayModel = whichDaySchedule(projectId, whichDay);
		List<GoodsListsModel> accumulateModel = accumulateSchedule(projectId);
		for(GoodsListsModel e0 : model){
			if(e0.getBigTypeId()==1||e0.getBigTypeId()==3||e0.getBigTypeId()==4){
				for(GoodsListsModel e1 : accumulateModel){
					if(e0.getGoodsLists().getId()==e1.getGoodsLists().getId()){
						Table3 table = new Table3();
						table.setProductName(e0.getGoodsLists().getGoodName());
						table.setProductNorm(e0.getGoodsLists().getGoodSpecifications());
						table.setOrderTotal(e0.getGoodsLists().getGoodOrderNum());
						table.setUnit(e0.getGoodsLists().getGoodUnit());
						List<Table33> table33s = new ArrayList<Table33>();
						for(int i = 0;i < e0.getScheduleTableList().size(); i++){
							Table33 table33 = new Table33();
							if(e0.getScheduleTableList().get(i).getNodeName().equals("到料")){
								table.setDaoliaoJuan(e0.getScheduleTableList().get(i).getValue()[0]);
								table.setDaoliaoDun(e0.getScheduleTableList().get(i).getValue()[1]);
								continue;
							}
							table33.setProcedureName(e0.getScheduleTableList().get(i).getNodeName());
							
							for(int j = 0; j < e0.getScheduleTableList().get(i).getUnit().length;j++){
								if(e0.getScheduleTableList().get(i).getUnit()[j].equals("支")){
									table33.setZhiDay(e0.getScheduleTableList().get(i).getValue()[j]);
									table33.setZhiSumUp(e1.getScheduleTableList().get(i).getValue()[j]);
								}
								else if(e0.getScheduleTableList().get(i).getUnit()[j].equals("米")){
									table33.setMiDay(e0.getScheduleTableList().get(i).getValue()[j]);
									table33.setMiSumUp(e1.getScheduleTableList().get(i).getValue()[j]);
								}
								else if(e0.getScheduleTableList().get(i).getUnit()[j].equals("吨")){
									table33.setDunDay(e0.getScheduleTableList().get(i).getValue()[j]);
									table33.setDunSumUp(e1.getScheduleTableList().get(i).getValue()[j]);
								}
								
							}
							table33s.add(table33);
						}
						table.setProcedure(table33s);
						result.add(table);
					}
				}
				
			}
		}
		return result;
	}
	
	
	
	static{
		shuSongGuan[0] = new ScheduleNodeModel("到料",new String[]{"pipeArriveJuan","pipeArriveDun"},new String[]{"卷","吨"});
		shuSongGuan[1] = new ScheduleNodeModel("轧/拔制",new String[]{"pipeRollingDrawing"},new String[]{"支"});
		shuSongGuan[2] = new ScheduleNodeModel("成型焊接",new String[]{"formingWelding"},new String[]{"支"});
		shuSongGuan[3] = new ScheduleNodeModel("无损检测",new String[]{"nonDesCheck"},new String[]{"支"});
		shuSongGuan[4] = new ScheduleNodeModel("水压试验",new String[]{"waterPressExperoment"},new String[]{"支"});
		shuSongGuan[5] = new ScheduleNodeModel("降级",new String[]{"demotion"},new String[]{"支"});
		shuSongGuan[6] = new ScheduleNodeModel("成品入库",new String[]{"finishingWarehousingZhi","finishingWarehousingMi","finishingWarehousingDun"},new String[]{"支","米","吨"});
		shuSongGuan[7] = new ScheduleNodeModel("涂覆",new String[]{"tufuZhi","tufuMi","tufuDun"},new String[]{"支","米","吨"});
		shuSongGuan[8] = new ScheduleNodeModel("防腐管入库",new String[]{"pipeRukuZhi","pipeRukuMi","pipeRukuDun"},new String[]{"支","米","吨"});
		shuSongGuan[9] = new ScheduleNodeModel("防腐管留放",new String[]{"pipeLiufang"},new String[]{"支"});
		shuSongGuan[10] = new ScheduleNodeModel("发运",new String[]{"pipeFalaingZhi","pipeFalaingMi","pipeFalaingDun"},new String[]{"支","米","吨"});
		
		wanGuan[0] = new ScheduleNodeModel("母管到料",new String[]{"muguandaoliaoZhi","muguandaoliaoMi","muguandaoliaoDun"},new String[]{"支","米","吨"});
		wanGuan[1] = new ScheduleNodeModel("成型",new String[]{"chengxing"},new String[]{"支"});
		wanGuan[2] = new ScheduleNodeModel("热处理",new String[]{"rechuli"},new String[]{"支"});
		wanGuan[3] = new ScheduleNodeModel("无损检测",new String[]{"wusunjiance"},new String[]{"支"});
		wanGuan[4] = new ScheduleNodeModel("成品入库",new String[]{"chengpinrukuZhi","chengpinrukuMi","chengpinrukuDun"},new String[]{"支","米","吨"});
		wanGuan[5] = new ScheduleNodeModel("涂覆",new String[]{"tufuZhi","tufuMi","tufuDun"},new String[]{"支","米","吨"});
		wanGuan[6] = new ScheduleNodeModel("防腐管入库",new String[]{"fangfuguanrukuZhi","fangfuguanrukuMi","fangfuguanrukuDun"},new String[]{"支","米","吨"});
		wanGuan[7] = new ScheduleNodeModel("防腐管留放",new String[]{"fangfuguanliufang"},new String[]{"支"});	
		wanGuan[8] = new ScheduleNodeModel("发运",new String[]{"fayunZhi","fayunMi","fayunDun"},new String[]{"支","米","吨"});
		
		fangFu[0] = new ScheduleNodeModel("钢管接收",new String[]{"gangguanjieshouZhi","gangguanjieshouMi","gangguanjieshouDun"},new String[]{"支","米","吨"});
		fangFu[1] = new ScheduleNodeModel("弯管接收",new String[]{"wanguanjieshouZhi","wanguanjieshouMi","wanguanjieshouDun"},new String[]{"支","米","吨"});
		fangFu[2] = new ScheduleNodeModel("涂覆",new String[]{"tufuZhi","tufuMi","tufuDun"},new String[]{"支","米","吨"});
		fangFu[3] = new ScheduleNodeModel("防腐管入库",new String[]{"fangfuguanrukuZhi","fangfuguanrukuMi","fangfuguanrukuDun"},new String[]{"支","米","吨"});
		fangFu[4] = new ScheduleNodeModel("防腐管留放",new String[]{"fangfuguanliufang"},new String[]{"支"});
		fangFu[5] = new ScheduleNodeModel("发运",new String[]{"fayunZhi","fayunMi","fayunDun"},new String[]{"支","米","吨"});
		
		shiYou[0] = new ScheduleNodeModel("钢管成型数量",new String[]{"gangguanchengxingshuliang"},new String[]{"支"});
		shiYou[1] = new ScheduleNodeModel("无损检测",new String[]{"wusunjiance"},new String[]{"支"});
		shiYou[2] = new ScheduleNodeModel("钢管尺寸检验",new String[]{"gangguanchicunjianyan"},new String[]{"支"});
		shiYou[3] = new ScheduleNodeModel("螺纹加工",new String[]{"luowenjiagong"},new String[]{"支"});
		shiYou[4] = new ScheduleNodeModel("水压、拧接、通径",new String[]{"shuiya"},new String[]{"支"});
		shiYou[5] = new ScheduleNodeModel("成品入库",new String[]{"chengpinrukuZhi","chengpinrukuMi","chengpinrukuDun"},new String[]{"支","米","吨"});
		shiYou[6] = new ScheduleNodeModel("发运",new String[]{"fayunZhi","fayunMi","fayunDun"},new String[]{"支","米","吨"});
		
		guanJian[0] = new ScheduleNodeModel("下料",new String[]{"xialiao"},new String[]{"未开始 正在进行 已完成"});
		guanJian[1] = new ScheduleNodeModel("成型",new String[]{"chengxing"},new String[]{"未开始 正在进行 已完成"});
		guanJian[2] = new ScheduleNodeModel("焊接",new String[]{"hanjie"},new String[]{"未开始 正在进行 已完成"});
		guanJian[3] = new ScheduleNodeModel("热处理",new String[]{"rechuli"},new String[]{"未开始 正在进行 已完成"});
		guanJian[4] = new ScheduleNodeModel("无损检测",new String[]{"wusunjiance"},new String[]{"未开始 正在进行 已完成"});
		guanJian[5] = new ScheduleNodeModel("成品入库",new String[]{"chengpinruku"},new String[]{"件"});
		guanJian[6] = new ScheduleNodeModel("发运",new String[]{"fayun"},new String[]{"件"});
		
		faMen[0] = new ScheduleNodeModel("阀体到料",new String[]{"valveBodyArrive"},new String[]{"台"});
		faMen[1] = new ScheduleNodeModel("阀体加工",new String[]{"valveBodyProcess"},new String[]{"台"});
		faMen[2] = new ScheduleNodeModel("阀体焊接",new String[]{"valveBodyWeld"},new String[]{"台"});
		faMen[3] = new ScheduleNodeModel("无损检测",new String[]{"nonDesCheck"},new String[]{"台"});
		faMen[4] = new ScheduleNodeModel("总装",new String[]{"valveFinalAssembly"},new String[]{"台"});
		faMen[5] = new ScheduleNodeModel("强度/密封试验",new String[]{"strengthExperiment"},new String[]{"台"});
		faMen[6] = new ScheduleNodeModel("油漆标识",new String[]{"valveOilPaint"},new String[]{"台"});
		faMen[7] = new ScheduleNodeModel("成品入库",new String[]{"finishingWarehousing"},new String[]{"台"});
		faMen[8] = new ScheduleNodeModel("发运",new String[]{"valveSend"},new String[]{"台"});
		
		sheBei[0] = new ScheduleNodeModel("主材到料及复验",new String[]{"zhucaidaoliao"},new String[]{"%"});
		sheBei[1] = new ScheduleNodeModel("壳体下料",new String[]{"qiaotixialiao"},new String[]{"%"});
		sheBei[2] = new ScheduleNodeModel("封头、盲板",new String[]{"fengtou"},new String[]{"%"});
		sheBei[3] = new ScheduleNodeModel("撬装底座组装焊接",new String[]{"qiaozhuangdizuo"},new String[]{"%"});
		sheBei[4] = new ScheduleNodeModel("接管法兰等锻件",new String[]{"jieguabfalan"},new String[]{"%"});
		sheBei[5] = new ScheduleNodeModel("壳体组装焊接",new String[]{"qiaotizuzhuang"},new String[]{"%"});
		sheBei[6] = new ScheduleNodeModel("接管组装焊接",new String[]{"jieguanzuzhuang"},new String[]{"%"});
		sheBei[7] = new ScheduleNodeModel("内件组装焊接",new String[]{"neijianzuzhuang"},new String[]{"%"});
		sheBei[8] = new ScheduleNodeModel("预焊件、附件装焊",new String[]{"yuhanjian"},new String[]{"%"});
		sheBei[9] = new ScheduleNodeModel("管线组装",new String[]{"guanxianzuzhuang"},new String[]{"%"});
		sheBei[10] = new ScheduleNodeModel("无损检测",new String[]{"wusunjiance"},new String[]{"%"});
		sheBei[11] = new ScheduleNodeModel("热处理",new String[]{"rechuli"},new String[]{"%"});
		sheBei[12] = new ScheduleNodeModel("水压试验",new String[]{"shuiyashiyan"},new String[]{"%"});
		sheBei[13] = new ScheduleNodeModel("气压试验",new String[]{"qiyashiyan"},new String[]{"%"});
		sheBei[14] = new ScheduleNodeModel("筑炉",new String[]{"zhulu"},new String[]{"%"});
		sheBei[15] = new ScheduleNodeModel("保温",new String[]{"baowen"},new String[]{"%"});
		sheBei[16] = new ScheduleNodeModel("调试试验",new String[]{"tiaoshishiyan"},new String[]{"%"});
		sheBei[17] = new ScheduleNodeModel("油漆标识",new String[]{"youqibiaoshi"},new String[]{"%"});
		sheBei[18] = new ScheduleNodeModel("发运",new String[]{"fayun"},new String[]{"%"});
		
		sheBeiBeng[0] = new ScheduleNodeModel("泵体加工检验",new String[]{"bengBodyProcessCheck"},new String[]{"件"});
		sheBeiBeng[1] = new ScheduleNodeModel("主轴加工检验",new String[]{"bengSpindleProcessCheck"},new String[]{"件"});
		sheBeiBeng[2] = new ScheduleNodeModel("叶轮加工检验",new String[]{"bengImpellerProcessCheck"},new String[]{"件"});
		sheBeiBeng[3] = new ScheduleNodeModel("总装",new String[]{"bengFinalAssembly"},new String[]{"台"});
		sheBeiBeng[4] = new ScheduleNodeModel("性能测试",new String[]{"bengPerformanceTest"},new String[]{"台"});
		sheBeiBeng[5] = new ScheduleNodeModel("油漆标识",new String[]{"bengPaint"},new String[]{"台"});
		sheBeiBeng[6] = new ScheduleNodeModel("成品入库",new String[]{"chengpinruku"},new String[]{"台"});
		sheBeiBeng[7] = new ScheduleNodeModel("发运",new String[]{"fayun"},new String[]{"台"});
		
		zuanJu[0] = new ScheduleNodeModel("到料",new String[]{"daoliao"},new String[]{"支"});
		zuanJu[1] = new ScheduleNodeModel("管体调质",new String[]{"guantitiaozhi"},new String[]{"支"});
		zuanJu[2] = new ScheduleNodeModel("钻孔车圆",new String[]{"zuankongcheyuan"},new String[]{"支"});
		zuanJu[3] = new ScheduleNodeModel("摩擦焊接",new String[]{"mocahanjie"},new String[]{"支"});
		zuanJu[4] = new ScheduleNodeModel("无损检测",new String[]{"wusunjiance"},new String[]{"支"});
		zuanJu[5] = new ScheduleNodeModel("螺纹加工",new String[]{"luowenjiagong"},new String[]{"支"});
		zuanJu[6] = new ScheduleNodeModel("钻铤螺旋加工",new String[]{"zuantingluoxuan"},new String[]{"支"});
		zuanJu[7] = new ScheduleNodeModel("涂覆",new String[]{"tufu"},new String[]{"支"});
		zuanJu[8] = new ScheduleNodeModel("成品入库",new String[]{"chengpinruku"},new String[]{"支"});
		zuanJu[9] = new ScheduleNodeModel("发运",new String[]{"fayun"},new String[]{"支"});
		
		jueYuan[0] = new ScheduleNodeModel("原材料到料及复验",new String[]{"yuancailiao"},new String[]{"%"});
		jueYuan[1] = new ScheduleNodeModel("左右法兰加工检验",new String[]{"zuoyou"},new String[]{"件"});
		jueYuan[2] = new ScheduleNodeModel("上下短管加工检验",new String[]{"shangxia"},new String[]{"件"});
		jueYuan[3] = new ScheduleNodeModel("组装焊接",new String[]{"zuzhuanghanjie"},new String[]{"台"});
		jueYuan[4] = new ScheduleNodeModel("焊缝检测",new String[]{"hanfengjiance"},new String[]{"台"});
		jueYuan[5] = new ScheduleNodeModel("水压试验",new String[]{"shuiyashiyan"},new String[]{"台"});
		jueYuan[6] = new ScheduleNodeModel("水压加弯矩试验",new String[]{"shuiyajiawanju"},new String[]{"台"});
		jueYuan[7] = new ScheduleNodeModel("气密性试验",new String[]{"qimixing"},new String[]{"台"});
		jueYuan[8] = new ScheduleNodeModel("绝缘电阻及电绝缘强度试验",new String[]{"jueyuan"},new String[]{"台"});
		jueYuan[9] = new ScheduleNodeModel("防腐涂层",new String[]{"fangfutuceng"},new String[]{"台"});
		jueYuan[10] = new ScheduleNodeModel("成品入库",new String[]{"chengpinruku"},new String[]{"台"});
		jueYuan[11] = new ScheduleNodeModel("发运",new String[]{"fayun"},new String[]{"台"});
		
		
	}

}
