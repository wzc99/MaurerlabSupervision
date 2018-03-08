package sys.spvisor.core.service.work;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.work.TProTypeMapper;
import sys.spvisor.core.dao.work.TProductTypeMappingMapper;
import sys.spvisor.core.entity.work.TProType;
import sys.spvisor.core.entity.work.TProTypeExample;
import sys.spvisor.core.entity.work.TProductTypeMapping;
import sys.spvisor.core.entity.work.TProductTypeMappingExample;
import sys.spvisor.core.entity.work.TProductTypeMappingExample.Criteria;
import sys.spvisor.core.result.work.CriteriaType;
import sys.spvisor.core.result.work.TypeIdResult;
import sys.spvisor.core.result.work.TypeModel;
import sys.spvisor.core.result.work.TypeResult;

@Service
public class GoodTypeService {
	
	@Autowired
	TProductTypeMappingMapper tProductTypeMappingMapper;
	@Autowired
	TProTypeMapper tProTypeMapper;
	
	@Transactional
	public List<TProductTypeMapping> getAllType(int bigType) {
		sys.spvisor.core.entity.work.TProductTypeMappingExample example = new TProductTypeMappingExample();
		Criteria  criteria= example.createCriteria();
		criteria.andBigTypeIdEqualTo(bigType);
		List<TProductTypeMapping> lists = tProductTypeMappingMapper.selectByExample(example);
		return lists;
	}
	
	@Transactional
	public List<TypeResult> getLevelOneName() {
		List<TypeResult> lists = tProductTypeMappingMapper.getLevelOneName();
		return lists;
	}
	
	@Transactional
	public List<TypeResult> getLevelTwoName(String name) {
		List<TypeResult> lists = tProductTypeMappingMapper.getLevelTwoName(name);
		return lists;
	}
	
	@Transactional
	public List<TProductTypeMapping> decideHaveThree(String name,String bigName) {
		
		sys.spvisor.core.entity.work.TProductTypeMappingExample example = new TProductTypeMappingExample();
		Criteria  criteria= example.createCriteria();
		criteria.andBigTypeNameEqualTo(bigName);
		criteria.andSmallTypeNameEqualTo(name);
		List<TProductTypeMapping> lists = tProductTypeMappingMapper.selectByExample(example);
		return lists;
	}
	
	/**
	 * 修改或者添加项目对应的子类
	 * @param type
	 * @param projectId
	 * @return
	 */
	@Transactional
	public int addTypeLevel(TypeModel type,int projectId) {
		
		List<TProductTypeMapping> newLists = type.getList(); 
		int influence = 0;
		TProTypeExample tProTypeExample = new TProTypeExample();
		sys.spvisor.core.entity.work.TProTypeExample.Criteria criteria = tProTypeExample.createCriteria();
		criteria.andProIdEqualTo(projectId);
		List<TProType> originalList = tProTypeMapper.selectByExample(tProTypeExample);
		tProTypeExample.clear();
		
		
		//判断是否是第一次添加
		if(originalList.size() == 0) {
			for (int i = 0; i < newLists.size(); i++) {
				if(newLists.get(i).getBigTypeName() != null && !newLists.get(i).getBigTypeName().trim().isEmpty()) {
					TProType proType = new TProType();
					proType.setProId(projectId);
					proType.setTypeId(getTypeId(newLists.get(i)));
					tProTypeMapper.insert(proType);
					influence = proType.getId();
				}

			}
		}else {
			//不是第一次添加
			//从数据库删除那些没有的
			//从新增的里面删除已经存在数据库里面的
			for (int i = 0; i < newLists.size(); i++) {
				int typeId = getTypeId(newLists.get(i));
				/*if(typeId == 0) {
					continue;
				}*/
				for (int j = 0; j < originalList.size(); j++) {
					if(typeId == originalList.get(j).getTypeId()) {
						originalList.remove(j);
						newLists.remove(i);
						i--;
						break;
					}
				}
			}
			
			
			//删除
			for (int i = 0; i < originalList.size(); i++) {
				tProTypeMapper.deleteByPrimaryKey(originalList.get(i).getId());
			}
			
			//因为前面已经删除数据库里面存在的，所以这里只是插入就可以了
			for (int i = 0; i < newLists.size(); i++) {
				if(newLists.get(i).getBigTypeName() != null && !newLists.get(i).getBigTypeName().trim().isEmpty()) {
					TProType proType = new TProType();
					proType.setProId(projectId);
					proType.setTypeId(getTypeId(newLists.get(i)));
					tProTypeMapper.insert(proType);
					influence = proType.getId();
				}
			}
			
		}
		return influence;
	}
	
	@Transactional
	public int getTypeId(TProductTypeMapping map) {
		//如果待查的类型字段为空，直接返回0
		if(map.getBigTypeName().trim() == "" || map.getBigTypeName().trim() == null) {
			return 0;
		}
		sys.spvisor.core.entity.work.TProductTypeMappingExample example = new TProductTypeMappingExample();
		Criteria  criteria= example.createCriteria();
		criteria.andBigTypeNameEqualTo(map.getBigTypeName());
		criteria.andSmallTypeNameEqualTo(map.getSmallTypeName());
		if(!map.getThreeLevelName().trim().isEmpty()) {
			criteria.andThreeLevelNameEqualTo(map.getThreeLevelName());
		}
		List<TProductTypeMapping> lists = tProductTypeMappingMapper.selectByExample(example);
		if(lists.size() == 0) {
			return 0;
		}
		return lists.get(0).getTypeMappingId();
	}

	@Transactional
	public int addType(TypeModel type) {
		int influence = 0;
		for (int i = 0; i < type.getList().size(); i++) {
			TProductTypeMapping map = type.getList().get(i);
			if(!map.getBigTypeName().trim().isEmpty()) {
				int bigTypeId = 0;
				List<TypeIdResult> lists = tProductTypeMappingMapper.getLevelOneId(map.getBigTypeName());
				//如果一级不存在
				if(lists.size() == 0) {
					List<TypeIdResult> lists1 = tProductTypeMappingMapper.getLevelOneId("");
					bigTypeId = lists1.get(lists1.size()-1).getId() + 1; 
					map.setBigTypeId(bigTypeId);
					//大类不存在，那么小类肯定也不存在
					if(!map.getSmallTypeName().trim().isEmpty()) {
						map.setSmallTypeId(1);
						//如果二级不存在，那么三级就不存在
						if(!map.getThreeLevelName().trim().isEmpty()) {
							map.setThreeLevelId(1);
						}
					}
					influence = tProductTypeMappingMapper.insert(map);
				}else {
					//如果一级存在
					bigTypeId = lists.get(0).getId();
					map.setBigTypeId(bigTypeId);
					
					sys.spvisor.core.entity.work.TProductTypeMappingExample example = new TProductTypeMappingExample();
					Criteria  criteria= example.createCriteria();
					criteria.andBigTypeNameEqualTo(map.getBigTypeName());
					criteria.andSmallTypeNameEqualTo(map.getSmallTypeName());
					List<TProductTypeMapping> resultMapping = tProductTypeMappingMapper.selectByExample(example);
					example.clear();
					
					//如果二级不存在，
					if(resultMapping.size()==0) {
						
						List<TypeIdResult> listsTwoId = tProductTypeMappingMapper.getLevelTwoId(map.getBigTypeName());
						map.setSmallTypeId(listsTwoId.get(listsTwoId.size()-1).getId()+1);
						//如果二级不存在，那么三级就不存在
						if(!map.getThreeLevelName().trim().isEmpty()) {
							map.setThreeLevelId(1);
						}
						influence = tProductTypeMappingMapper.insert(map);
						
					}else {
						//如果二级存在，
						map.setSmallTypeId(resultMapping.get(0).getSmallTypeId());
						//如果没有三级就不更新了，因为有了，如果有三级就判断是否存在，如果存在也不更新。
						if(!map.getThreeLevelName().trim().isEmpty()) {
							sys.spvisor.core.entity.work.TProductTypeMappingExample example1 = new TProductTypeMappingExample();
							Criteria  criteria1= example1.createCriteria();
							criteria1.andBigTypeNameEqualTo(map.getBigTypeName());
							criteria1.andSmallTypeNameEqualTo(map.getSmallTypeName());
							criteria1.andThreeLevelNameEqualTo(map.getThreeLevelName());
							List<TProductTypeMapping> resultMapping1 = tProductTypeMappingMapper.selectByExample(example1);
							example1.clear();
							//没有就插入，有就不插入
							if(resultMapping1.size()==0) {
								CriteriaType criteriaType = new CriteriaType();
								criteriaType.setBigTypeName(map.getBigTypeName());
								criteriaType.setSmallTypeName(map.getSmallTypeName());
								List<TypeIdResult> listsThreeId = tProductTypeMappingMapper.getLevelThreeId(criteriaType);
								if(listsThreeId.get(listsThreeId.size()-1).getId()!=0) {
									map.setThreeLevelId(listsThreeId.get(listsThreeId.size()-1).getId()+1);
								}else {
									map.setThreeLevelId(1);
								}
								
								influence = tProductTypeMappingMapper.insert(map);
							}
							
						}
						
					}
				}
			}
		}
		return influence;
	}
	
	@Transactional
	public String getTypeName(int proId) {
		sys.spvisor.core.entity.work.TProTypeExample typeExample = new TProTypeExample();
		sys.spvisor.core.entity.work.TProTypeExample.Criteria criteria = typeExample.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TProType> lists = tProTypeMapper.selectByExample(typeExample);
		String typeName = "";
		for (int i = 0; i < lists.size(); i++) {
			TProductTypeMapping recoder= tProductTypeMappingMapper.selectByPrimaryKey(lists.get(i).getTypeId());
			//如果有三级就显示三级的名字，否则显示二级的名字。。。
			if(recoder.getThreeLevelName()!=null ) {
				typeName += recoder.getThreeLevelName() + ",   ";
			}else {
				typeName += recoder.getSmallTypeName()  + ",   ";
			}
			
		}
		if(typeName.length()>0)
			typeName = typeName.substring(0, typeName.length()-2);
		return typeName;
		
	}
	
	/**
	 * 根据项目前面的id获取小类名称
	 * @param typeId
	 * @return
	 */
	@Transactional
	public String getTypeNameByTypeId(int typeId) {
		TProductTypeMapping recoder = tProductTypeMappingMapper.selectByPrimaryKey(typeId);
		String typeName = "";
		//如果有三级就显示三级的名字，否则显示二级的名字。。。
		if(recoder.getThreeLevelName()!=null && recoder.getThreeLevelName().length()!=0) {
			typeName = recoder.getThreeLevelName() ;
		}else {
			typeName = recoder.getSmallTypeName() ;
		}
		return typeName;
		
	}
	
	//获取项目中对应的物资类型的id，和类型名的拼接（大类+小类+三类）
	@Transactional
	public List<TypeIdResult> getTypeIdAndName(int proId) {
		sys.spvisor.core.entity.work.TProTypeExample typeExample = new TProTypeExample();
		sys.spvisor.core.entity.work.TProTypeExample.Criteria criteria = typeExample.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TProType> lists = tProTypeMapper.selectByExample(typeExample);
		List<TypeIdResult> result = new ArrayList<TypeIdResult>();
		for (int i = 0; i < lists.size(); i++) {
			String typeName = "";
			TypeIdResult idResult = new TypeIdResult();
			TProductTypeMapping recoder= tProductTypeMappingMapper.selectByPrimaryKey(lists.get(i).getTypeId());
			idResult.setId(lists.get(i).getTypeId());
			typeName += recoder.getBigTypeName() +","+recoder.getSmallTypeName()+",";
			//如果有三级就显示三级的名字，否则显示二级的名字。。。
			if(recoder.getThreeLevelName()!=null && recoder.getThreeLevelName().length()!=0) {
				typeName += recoder.getThreeLevelName() + ",";
			}
			typeName = typeName.substring(0, typeName.length()-1);
			idResult.setType(typeName);
			result.add(idResult);
		}
		return result;
	}
	
	//获取项目中对应的物资类型
		@Transactional
		public List<TProductTypeMapping> getTypeLevel(int proId) {
			sys.spvisor.core.entity.work.TProTypeExample typeExample = new TProTypeExample();
			sys.spvisor.core.entity.work.TProTypeExample.Criteria criteria = typeExample.createCriteria();
			criteria.andProIdEqualTo(proId);
			List<TProType> lists = tProTypeMapper.selectByExample(typeExample);
			List<TProductTypeMapping> result = new ArrayList<TProductTypeMapping>();
			for (int i = 0; i < lists.size(); i++) {
				TProductTypeMapping recoder= tProductTypeMappingMapper.selectByPrimaryKey(lists.get(i).getTypeId());
				result.add(recoder);
			}
			return result;
		}
		
		
		public String getBigTypeNameByProId(int proId) {
			List<TProductTypeMapping> lists =  getTypeLevel(proId);
			String name = "";
			for(int i= 0 ; i<lists.size();i++) {
				String bigName = lists.get(i).getBigTypeName();
				if(bigName.equals("输送管")) {
					name+="delivery,";
				}else if(bigName.equals("弯管")) {
					name+="bend,";
				}else if(bigName.equals("输送管或弯管防腐保温")) {
					name+="delbend,";
				}else if(bigName.equals("石油专用管")) {
					name+="oilPipe,";
				}else if(bigName.equals("管件法兰")) {
					name+="falan";
				}else if(bigName.equals("阀门")) {
					name+="valve,";
				}else if(bigName.equals("设备")) {
					name+="equipment,";
				}else if(bigName.equals("钻具")) {
					name+="drillingTools,";
				}else if(bigName.equals("绝缘接头")) {
					name+="fittings,";
				}
			}
			if(name.length() == 0) {
				return name;
			}
			name = name.substring(0, name.length()-1);
			return name;
		}
		
		public List<String> getBigTypeByProId(int proId) {
			List<TProductTypeMapping> lists =  getTypeLevel(proId);
			List<String> result = new ArrayList<String>() ;
			for(int i= 0 ; i<lists.size();i++) {
				String bigName = lists.get(i).getBigTypeName();
				if(bigName.equals("输送管")) {
					result.add("delivery");
				}else if(bigName.equals("弯管")) {
					result.add("bend");
				}else if(bigName.equals("输送管或弯管防腐保温")) {
					result.add("delbend");
				}else if(bigName.equals("石油专用管")) {
					result.add("oilPipe");
				}else if(bigName.equals("管件法兰")) {
					result.add("falan");
				}else if(bigName.equals("阀门")) {
					result.add("valve");
				}else if(bigName.equals("设备")) {
					result.add("equipment");
				}else if(bigName.equals("钻具")) {
					result.add("drillingTools");
				}else if(bigName.equals("绝缘接头")) {
					result.add("fittings");
				}
			}
			return result;
		}

}
