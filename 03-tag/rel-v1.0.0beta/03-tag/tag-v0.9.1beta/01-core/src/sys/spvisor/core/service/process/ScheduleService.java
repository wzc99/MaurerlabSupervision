package sys.spvisor.core.service.process;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sys.spvisor.core.criteria.project.ProcessCriteria;
import sys.spvisor.core.dao.process.ProcessCriteriaMapper;
import sys.spvisor.core.dao.process.TDeliveryPipeProcessMapper;
import sys.spvisor.core.dao.process.TFangfuProcessMapper;
import sys.spvisor.core.dao.process.TGuanjianProcessMapper;
import sys.spvisor.core.dao.process.TJueyuanjietouProcessMapper;
import sys.spvisor.core.dao.process.TScheduleNodeMapper;
import sys.spvisor.core.dao.process.TShebeiBengProcessMapper;
import sys.spvisor.core.dao.process.TShebeiProcessMapper;
import sys.spvisor.core.dao.process.TShiyouProcessMapper;
import sys.spvisor.core.dao.process.TValveProcessMapper;
import sys.spvisor.core.dao.process.TWanguanProcessMapper;
import sys.spvisor.core.dao.process.TZuanjuProcessMapper;
import sys.spvisor.core.dao.project.TGoodsListsMapper;
import sys.spvisor.core.dao.work.TProTypeMapper;
import sys.spvisor.core.dao.work.TProductTypeMappingMapper;
import sys.spvisor.core.entity.process.TDeliveryPipeProcess;
import sys.spvisor.core.entity.process.TDeliveryPipeProcessExample;
import sys.spvisor.core.entity.process.TFangfuProcess;
import sys.spvisor.core.entity.process.TFangfuProcessExample;
import sys.spvisor.core.entity.process.TGuanjianProcess;
import sys.spvisor.core.entity.process.TGuanjianProcessExample;
import sys.spvisor.core.entity.process.TJueyuanjietouProcess;
import sys.spvisor.core.entity.process.TJueyuanjietouProcessExample;
import sys.spvisor.core.entity.process.TScheduleNode;
import sys.spvisor.core.entity.process.TScheduleNodeExample;
import sys.spvisor.core.entity.process.TShebeiBengProcess;
import sys.spvisor.core.entity.process.TShebeiBengProcessExample;
import sys.spvisor.core.entity.process.TShebeiProcess;
import sys.spvisor.core.entity.process.TShebeiProcessExample;
import sys.spvisor.core.entity.process.TShiyouProcess;
import sys.spvisor.core.entity.process.TShiyouProcessExample;
import sys.spvisor.core.entity.process.TValveProcess;
import sys.spvisor.core.entity.process.TValveProcessExample;
import sys.spvisor.core.entity.process.TWanguanProcess;
import sys.spvisor.core.entity.process.TWanguanProcessExample;
import sys.spvisor.core.entity.process.TZuanjuProcess;
import sys.spvisor.core.entity.process.TZuanjuProcessExample;
import sys.spvisor.core.entity.project.TGoodsLists;
import sys.spvisor.core.entity.project.TGoodsListsExample;
import sys.spvisor.core.entity.work.TProType;
import sys.spvisor.core.entity.work.TProTypeExample;
import sys.spvisor.core.entity.work.TProductTypeMapping;
import sys.spvisor.core.entity.work.TProductTypeMappingExample;
import sys.spvisor.core.entity.work.TProductTypeMappingExample.Criteria;
import sys.spvisor.core.result.process.ProductTypeModel;

@Service
public class ScheduleService {
	@Autowired
	TProductTypeMappingMapper productTypeMappingMapper;
	@Autowired
	TScheduleNodeMapper scheduleNodeMapper;
	@Autowired
	TGoodsListsMapper goodsListsMapper;
	@Autowired
	TProTypeMapper proTypeMapper;
	
	@Autowired
	TDeliveryPipeProcessMapper deliveryPipeProcessMapper;
	@Autowired
	TWanguanProcessMapper wanguanProcessMapper;
	@Autowired
	TFangfuProcessMapper fangfuProcessMapper;
	@Autowired
	TShiyouProcessMapper shiyouProcessMapper;
	@Autowired
	TGuanjianProcessMapper guanjianProcessMapper;
	@Autowired
	TValveProcessMapper valveProcessMapper;
	@Autowired
	TShebeiProcessMapper shebeiProcessMapper;
	@Autowired
	TShebeiBengProcessMapper shebeiBengProcessMapper;
	@Autowired
	TZuanjuProcessMapper zuanjuProcessMapper;
	@Autowired
	TJueyuanjietouProcessMapper jueyuanjietouProcessMapper;
	
	@Autowired
	ProcessCriteriaMapper processCriteriaMapper;
	
	public List<TProductTypeMapping> getTypeList(List<Integer> idsint){
		TProductTypeMappingExample productTypeMappingExample = new TProductTypeMappingExample();
		Criteria cri = productTypeMappingExample.createCriteria();
		cri.andTypeMappingIdIn(idsint);
		return productTypeMappingMapper.selectByExample(productTypeMappingExample);

	}
	
	public List<TScheduleNode> getNodesByProId(int projectId){
		TScheduleNodeExample scheduleNodeExample = new TScheduleNodeExample();
		sys.spvisor.core.entity.process.TScheduleNodeExample.Criteria cri = scheduleNodeExample.createCriteria();
		cri.andProIdEqualTo(projectId);
		return scheduleNodeMapper.selectByExample(scheduleNodeExample);
	}
	
	public TScheduleNode getNode(int projectId,int typeMappingId){
		TScheduleNodeExample scheduleNodeExample = new TScheduleNodeExample();
		sys.spvisor.core.entity.process.TScheduleNodeExample.Criteria cri = scheduleNodeExample.createCriteria();
		cri.andProIdEqualTo(projectId);
		cri.andTypeIdEqualTo(typeMappingId);
		List<TScheduleNode> node = scheduleNodeMapper.selectByExample(scheduleNodeExample);
		if(node.size() > 0)
			return node.get(0);
		else
			return null;
	}

	public void saveNode(TScheduleNode node){
		scheduleNodeMapper.insert(node);
	}
	
	public void deleteNodeByProjectId(Integer projectId){
		TScheduleNodeExample scheduleNodeExample = new TScheduleNodeExample();
		sys.spvisor.core.entity.process.TScheduleNodeExample.Criteria cri = scheduleNodeExample.createCriteria();
		cri.andProIdEqualTo(projectId);
		scheduleNodeMapper.deleteByExample(scheduleNodeExample);
	}
	
	public List<TGoodsLists> selectGoodsListsByProjectId(Integer projectId){
		TGoodsListsExample e = new TGoodsListsExample();
		sys.spvisor.core.entity.project.TGoodsListsExample.Criteria c = e.createCriteria();
		c.andProIdEqualTo(projectId);
	
		return goodsListsMapper.selectByExample(e);
	}
	
	public int getBigTypeIdByGoodId(Integer goodId){
		return productTypeMappingMapper.selectByPrimaryKey(goodId).getBigTypeId();
	}
	
	public List<TProType> getTypeByProId(Integer projectId){
		TProTypeExample e = new TProTypeExample();
		sys.spvisor.core.entity.work.TProTypeExample.Criteria c = e.createCriteria();
		c.andProIdEqualTo(projectId);
		return proTypeMapper.selectByExample(e);
	}
	/**
	 * 查找项目中某一大类的进度表中是否有相关记录
	 * @param projectId
	 * @param bigTypeId 大类id
	 * @param whichDay  进度日期
	 * @param wuZiId    物资清单id
	 * @return   某种类型的进度记录
	 */
	public Object selectSchedule(Integer projectId,int n,Date whichDay,Integer wuZiId){
		if(n == 1){//输送管
			TDeliveryPipeProcessExample  dele = new TDeliveryPipeProcessExample();
			sys.spvisor.core.entity.process.TDeliveryPipeProcessExample.Criteria delc = dele.createCriteria();
			delc.andProIdEqualTo(projectId);
			delc.andWhichDayEqualTo(whichDay);
			delc.andTypeIdEqualTo(wuZiId);
			List<TDeliveryPipeProcess> dell = deliveryPipeProcessMapper.selectByExample(dele);
			if(dell.size() > 0)
				return dell.get(0);
			else
				return null;
		}
		else if(n == 2){//弯管
			TWanguanProcessExample  wane = new TWanguanProcessExample();
			sys.spvisor.core.entity.process.TWanguanProcessExample.Criteria wanc = wane.createCriteria();
			wanc.andProIdEqualTo(projectId);
			wanc.andWhichDayEqualTo(whichDay);
			wanc.andTypeIdEqualTo(wuZiId);
			List<TWanguanProcess> wanl = wanguanProcessMapper.selectByExample(wane);
			if(wanl.size() > 0)
				return wanl.get(0);
			else
				return null;
		}
		else if(n == 3){//输送管或弯管防腐
			TFangfuProcessExample  fane = new TFangfuProcessExample();
			sys.spvisor.core.entity.process.TFangfuProcessExample.Criteria fanc = fane.createCriteria();
			fanc.andProIdEqualTo(projectId);
			fanc.andWhichDayEqualTo(whichDay);
			fanc.andTypeIdEqualTo(wuZiId);
			List<TFangfuProcess> fanl = fangfuProcessMapper.selectByExample(fane);
			if(fanl.size() > 0)
				return fanl.get(0);
			else
				return null;
		}
		else if(n == 4){//石油专用管
			TShiyouProcessExample  shie = new TShiyouProcessExample();
			sys.spvisor.core.entity.process.TShiyouProcessExample.Criteria shic = shie.createCriteria();
			shic.andProIdEqualTo(projectId);
			shic.andWhichDayEqualTo(whichDay);
			shic.andTypeIdEqualTo(wuZiId);
			List<TShiyouProcess> shil = shiyouProcessMapper.selectByExample(shie);
			if(shil.size() > 0)
				return shil.get(0);
			else
				return null;
		}
		else if(n == 5){//管件、法兰
			TGuanjianProcessExample  guae = new TGuanjianProcessExample();
			sys.spvisor.core.entity.process.TGuanjianProcessExample.Criteria guac = guae.createCriteria();
			guac.andProIdEqualTo(projectId);
			guac.andWhichDayEqualTo(whichDay);
			guac.andTypeIdEqualTo(wuZiId);
			List<TGuanjianProcess> gual = guanjianProcessMapper.selectByExample(guae);
			if(gual.size() > 0)
				return gual.get(0);
			else
				return null;
		}
		else if(n == 6){//阀门
			TValveProcessExample  vale = new TValveProcessExample();
			sys.spvisor.core.entity.process.TValveProcessExample.Criteria valc = vale.createCriteria();
			valc.andProIdEqualTo(projectId);
			valc.andWhichDayEqualTo(whichDay);
			valc.andTypeIdEqualTo(wuZiId);
			List<TValveProcess> vall = valveProcessMapper.selectByExample(vale);
			if(vall.size() > 0)
				return vall.get(0);
			else
				return null;
		}
		else if(n == 7){//设备
			TShebeiProcessExample  shee = new TShebeiProcessExample();
			sys.spvisor.core.entity.process.TShebeiProcessExample.Criteria shec = shee.createCriteria();
			shec.andProIdEqualTo(projectId);
			shec.andWhichDayEqualTo(whichDay);
			shec.andTypeIdEqualTo(wuZiId);
			List<TShebeiProcess> shel = shebeiProcessMapper.selectByExample(shee);
			if(shel.size() > 0)
				return shel.get(0);
			else
				return null;
		}
		else if(n == 8){//设备（泵）
			TShebeiBengProcessExample  bene = new TShebeiBengProcessExample();
			sys.spvisor.core.entity.process.TShebeiBengProcessExample.Criteria benc = bene.createCriteria();
			benc.andProIdEqualTo(projectId);
			benc.andWhichDayEqualTo(whichDay);
			benc.andTypeIdEqualTo(wuZiId);
			List<TShebeiBengProcess> benl = shebeiBengProcessMapper.selectByExample(bene);
			if(benl.size() > 0)
				return benl.get(0);
			else
				return null;
		}
		else if(n == 9){//钻具
			TZuanjuProcessExample  zuae = new TZuanjuProcessExample();
			sys.spvisor.core.entity.process.TZuanjuProcessExample.Criteria zuac = zuae.createCriteria();
			zuac.andProIdEqualTo(projectId);
			zuac.andWhichDayEqualTo(whichDay);
			zuac.andTypeIdEqualTo(wuZiId);
			List<TZuanjuProcess> zual = zuanjuProcessMapper.selectByExample(zuae);
			if(zual.size() > 0)
				return zual.get(0);
			else
				return null;
		}
		else if(n == 10){//绝缘接头
			TJueyuanjietouProcessExample  juee = new TJueyuanjietouProcessExample();
			sys.spvisor.core.entity.process.TJueyuanjietouProcessExample.Criteria juec = juee.createCriteria();
			juec.andProIdEqualTo(projectId);
			juec.andWhichDayEqualTo(whichDay);
			juec.andTypeIdEqualTo(wuZiId);
			List<TJueyuanjietouProcess> juel = jueyuanjietouProcessMapper.selectByExample(juee);
			if(juel.size() > 0)
				return juel.get(0);
			else
				return null;
		}
		return null;
	}
	public void insertSchedule(int n,Object e){
		if(n == 1){
			deliveryPipeProcessMapper.insert((TDeliveryPipeProcess)e);
		}
		if(n == 2){
			wanguanProcessMapper.insert((TWanguanProcess)e);
		}
		if(n == 3){
			fangfuProcessMapper.insert((TFangfuProcess)e);
		}
		if(n == 4){
			shiyouProcessMapper.insert((TShiyouProcess)e);
		}
		if(n == 5){
			guanjianProcessMapper.insert((TGuanjianProcess)e);
		}
		if(n == 6){
			valveProcessMapper.insert((TValveProcess)e);
		}
		if(n == 7){
			shebeiProcessMapper.insert((TShebeiProcess)e);
		}
		if(n == 8){
			shebeiBengProcessMapper.insert((TShebeiBengProcess)e);
		}
		if(n == 9){
			zuanjuProcessMapper.insert((TZuanjuProcess)e);
		}
		if(n == 10){
			jueyuanjietouProcessMapper.insert((TJueyuanjietouProcess)e);
		}
	}
	public void updateSchedule(int n,Object e){
		if(n == 1){
			deliveryPipeProcessMapper.updateByPrimaryKey((TDeliveryPipeProcess)e);
		}
		if(n == 2){
			wanguanProcessMapper.updateByPrimaryKey((TWanguanProcess)e);
		}
		if(n == 3){
			fangfuProcessMapper.updateByPrimaryKey((TFangfuProcess)e);
		}
		if(n == 4){
			shiyouProcessMapper.updateByPrimaryKey((TShiyouProcess)e);
		}
		if(n == 5){
			guanjianProcessMapper.updateByPrimaryKey((TGuanjianProcess)e);
		}
		if(n == 6){
			valveProcessMapper.updateByPrimaryKey((TValveProcess)e);
		}
		if(n == 7){
			shebeiProcessMapper.updateByPrimaryKey((TShebeiProcess)e);
		}
		if(n == 8){
			shebeiBengProcessMapper.updateByPrimaryKey((TShebeiBengProcess)e);
		}
		if(n == 9){
			zuanjuProcessMapper.updateByPrimaryKey((TZuanjuProcess)e);
		}
		if(n == 10){
			jueyuanjietouProcessMapper.updateByPrimaryKey((TJueyuanjietouProcess)e);
		}
	}
	
	
	public String selectNodesByWuZiIdAndProId(Integer WuZiId,Integer projectId){
		int typeId = goodsListsMapper.selectByPrimaryKey(WuZiId).getGoodId();
		TScheduleNodeExample e = new TScheduleNodeExample();
		sys.spvisor.core.entity.process.TScheduleNodeExample.Criteria c = e.createCriteria();
		c.andProIdEqualTo(projectId);
		c.andTypeIdEqualTo(typeId);
		List<TScheduleNode> node = scheduleNodeMapper.selectByExample(e);
		if(node.size() > 0)
			return node.get(0).getNodeidstr();
		else
			return null;
		
	}
	
	public int getGoodsTotalByWuZiId(Integer id){
		return goodsListsMapper.selectByPrimaryKey(id).getGoodOrderNum();
	}
	
	public List<ProductTypeModel> getProductTypeByProjectId(Integer projectId){
		List<ProductTypeModel> list = new ArrayList<ProductTypeModel>();
		TProTypeExample e = new TProTypeExample();
		sys.spvisor.core.entity.work.TProTypeExample.Criteria c = e.createCriteria();
		c.andProIdEqualTo(projectId);
		List<TProType> types= proTypeMapper.selectByExample(e);
		
		for(TProType t: types){
			ProductTypeModel m = new ProductTypeModel();
			m.setTypeId(t.getTypeId());
			TProductTypeMapping mapping = productTypeMappingMapper.selectByPrimaryKey(t.getTypeId());
			if(mapping.getThreeLevelName()!=null && mapping.getThreeLevelName().length()>0)
				m.setProductName(mapping.getThreeLevelName());
			else
				m.setProductName(mapping.getSmallTypeName());
			list.add(m);
		}
		return list;
	}
	
	public List<ProcessCriteria> selectByExample(ProcessCriteria params){
		return processCriteriaMapper.getSearchProcess(params);
	}
	
	public int selectAllCount(ProcessCriteria params){
		return processCriteriaMapper.getSearchCount(params);
	}
	
	public Object selectProcessByTwoId(Integer n,Integer id){
		if(n == 1)
			return deliveryPipeProcessMapper.selectByPrimaryKey(id);
		else if(n == 2)
			return wanguanProcessMapper.selectByPrimaryKey(id);
		else if(n == 3)
			return fangfuProcessMapper.selectByPrimaryKey(id);
		else if(n == 4)
			return shiyouProcessMapper.selectByPrimaryKey(id);
		else if(n == 5)
			return guanjianProcessMapper.selectByPrimaryKey(id);
		else if(n == 6)
			return valveProcessMapper.selectByPrimaryKey(id);
		else if(n == 7)
			return shebeiProcessMapper.selectByPrimaryKey(id);
		else if(n == 8)
			return shebeiBengProcessMapper.selectByPrimaryKey(id);
		else if(n == 9)
			return zuanjuProcessMapper.selectByPrimaryKey(id);
		else
			return jueyuanjietouProcessMapper.selectByPrimaryKey(id);
	}
	
	public TGoodsLists getGoodsByPK(int id){
		return goodsListsMapper.selectByPrimaryKey(id);
	}
	
	public int delete(String params) {
		String[] ids = params.split(",");
		int fluenceRows = 0;
		
		for (int i = 0; i < ids.length; i++) {
			String[] twoIds = ids[i].split("&"); 
			if(Integer.parseInt(twoIds[0])==1)
				deliveryPipeProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==2)
				wanguanProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==3)
				fangfuProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==4)
				shiyouProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==5)
				guanjianProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==6)
				valveProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==7)
				shebeiProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==8)
				shebeiBengProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==9)
				zuanjuProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			if(Integer.parseInt(twoIds[0])==10)
				jueyuanjietouProcessMapper.deleteByPrimaryKey(Integer.parseInt(twoIds[1]));
			
			fluenceRows++;
		}
		return fluenceRows;
	}
	
	public List<TDeliveryPipeProcess> accumulateDeliByproId(Integer projectId){
		return deliveryPipeProcessMapper.accumulateScheduleByproId(projectId);
	}
	
	public List<TWanguanProcess> accumulateWangByproId(Integer projectId){
		return wanguanProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TFangfuProcess> accumulatefangByproId(Integer projectId){
		return fangfuProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TShiyouProcess> accumulateShiyByproId(Integer projectId){
		return shiyouProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TGuanjianProcess> accumulateGuanByproId(Integer projectId){
		return guanjianProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TValveProcess> accumulateValvByproId(Integer projectId){
		return valveProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TShebeiProcess> accumulateShebByproId(Integer projectId){
		return shebeiProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TShebeiBengProcess> accumulateBengByproId(Integer projectId){
		return shebeiBengProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TZuanjuProcess> accumulateZuanByproId(Integer projectId){
		return zuanjuProcessMapper.accumulateScheduleByproId(projectId);
	}
	public List<TJueyuanjietouProcess> accumulateJueyByproId(Integer projectId){
		return jueyuanjietouProcessMapper.accumulateScheduleByproId(projectId);
	}
	public TGuanjianProcess selectLatestByGoodsIdAndProId(Integer typeId, Integer projectId){
		TGuanjianProcessExample ex = new TGuanjianProcessExample();
		sys.spvisor.core.entity.process.TGuanjianProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andTypeIdEqualTo(typeId);
		ex.setOrderByClause("which_day");
		List<TGuanjianProcess> guanjian = guanjianProcessMapper.selectByExample(ex);
		return guanjian.get(guanjian.size()-1);
	}
	
	public List<TDeliveryPipeProcess> weeklyDeliByproId(Integer projectId,Date d0,Date d1){
		return deliveryPipeProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	
	public List<TWanguanProcess> weeklyWangByproId(Integer projectId,Date d0,Date d1){
		return wanguanProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TFangfuProcess> weeklyfangByproId(Integer projectId, Date d0,Date d1){
		return fangfuProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TShiyouProcess> weeklyShiyByproId(Integer projectId,Date d0,Date d1){
		return shiyouProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TGuanjianProcess> weeklyGuanByproId(Integer projectId,Date d0,Date d1){
		return guanjianProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TValveProcess> weeklyValvByproId(Integer projectId,Date d0,Date d1){
		return valveProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TShebeiProcess> weeklyShebByproId(Integer projectId,Date d0,Date d1){
		return shebeiProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TShebeiBengProcess> weeklyBengByproId(Integer projectId,Date d0,Date d1){
		return shebeiBengProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TZuanjuProcess> weeklyZuanByproId(Integer projectId,Date d0,Date d1){
		return zuanjuProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public List<TJueyuanjietouProcess> weeklyJueyByproId(Integer projectId,Date d0,Date d1){
		return jueyuanjietouProcessMapper.weeklyScheduleByproId(projectId,d0,d1);
	}
	public TGuanjianProcess selectLatestByGoodsIdAndProId(Integer typeId, Integer projectId,Date d0,Date d1){
		TGuanjianProcessExample ex = new TGuanjianProcessExample();
		sys.spvisor.core.entity.process.TGuanjianProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andTypeIdEqualTo(typeId);
		cr.andWhichDayBetween(d0, d1);
		ex.setOrderByClause("which_day");
		List<TGuanjianProcess> guanjian = guanjianProcessMapper.selectByExample(ex);
		return guanjian.get(guanjian.size()-1);
	}
	
	
	public List<TDeliveryPipeProcess> whichDayDeliByproId(Integer projectId,Date whichDay){
		TDeliveryPipeProcessExample ex = new TDeliveryPipeProcessExample();
		sys.spvisor.core.entity.process.TDeliveryPipeProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return deliveryPipeProcessMapper.selectByExample(ex);
	}
	
	public List<TWanguanProcess> whichDayWangByproId(Integer projectId,Date whichDay){
		TWanguanProcessExample ex = new TWanguanProcessExample();
		sys.spvisor.core.entity.process.TWanguanProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return wanguanProcessMapper.selectByExample(ex);
	}
	public List<TFangfuProcess> whichDayfangByproId(Integer projectId,Date whichDay){
		TFangfuProcessExample ex = new TFangfuProcessExample();
		sys.spvisor.core.entity.process.TFangfuProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return fangfuProcessMapper.selectByExample(ex);
	}
	public List<TShiyouProcess> whichDayShiyByproId(Integer projectId,Date whichDay){
		TShiyouProcessExample ex = new TShiyouProcessExample();
		sys.spvisor.core.entity.process.TShiyouProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return shiyouProcessMapper.selectByExample(ex);
	}
	public List<TGuanjianProcess> whichDayGuanByproId(Integer projectId,Date whichDay){
		TGuanjianProcessExample ex = new TGuanjianProcessExample();
		sys.spvisor.core.entity.process.TGuanjianProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return guanjianProcessMapper.selectByExample(ex);
	}
	public List<TValveProcess> whichDayValvByproId(Integer projectId,Date whichDay){
		TValveProcessExample ex = new TValveProcessExample();
		sys.spvisor.core.entity.process.TValveProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return valveProcessMapper.selectByExample(ex);
	}
	public List<TShebeiProcess> whichDayShebByproId(Integer projectId,Date whichDay){
		TShebeiProcessExample ex = new TShebeiProcessExample();
		sys.spvisor.core.entity.process.TShebeiProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return shebeiProcessMapper.selectByExample(ex);
	}
	public List<TShebeiBengProcess> whichDayBengByproId(Integer projectId,Date whichDay){
		TShebeiBengProcessExample ex = new TShebeiBengProcessExample();
		sys.spvisor.core.entity.process.TShebeiBengProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return shebeiBengProcessMapper.selectByExample(ex);
	}
	public List<TZuanjuProcess> whichDayZuanByproId(Integer projectId,Date whichDay){
		TZuanjuProcessExample ex = new TZuanjuProcessExample();
		sys.spvisor.core.entity.process.TZuanjuProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return zuanjuProcessMapper.selectByExample(ex);
	}
	public List<TJueyuanjietouProcess> whichDayJueyByproId(Integer projectId,Date whichDay){
		TJueyuanjietouProcessExample ex = new TJueyuanjietouProcessExample();
		sys.spvisor.core.entity.process.TJueyuanjietouProcessExample.Criteria cr = ex.createCriteria();
		cr.andProIdEqualTo(projectId);
		cr.andWhichDayEqualTo(whichDay);
		return jueyuanjietouProcessMapper.selectByExample(ex);
	}
}
