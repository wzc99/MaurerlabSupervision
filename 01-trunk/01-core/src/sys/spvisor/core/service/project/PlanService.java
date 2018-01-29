package sys.spvisor.core.service.project;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import sys.file.common.AutoCreateFileName;
import sys.spvisor.core.common.PermissionException;
import sys.spvisor.core.common.PlanChoosePeopleException;
import sys.spvisor.core.dao.ana.TRoleMapper;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.ana.TUserRoleMapper;
import sys.spvisor.core.dao.project.TFileCheckProcessMapper;
import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.dao.project.TProjectMapper;
import sys.spvisor.core.dao.project.TProjectPeopleMapper;
import sys.spvisor.core.entity.ana.TRole;
import sys.spvisor.core.entity.ana.TRoleExample;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserExample;
import sys.spvisor.core.entity.ana.TUserExample.Criteria;
import sys.spvisor.core.entity.ana.TUserRole;
import sys.spvisor.core.entity.ana.TUserRoleExample;
import sys.spvisor.core.entity.project.PeopleProjectBigClass;
import sys.spvisor.core.entity.project.ProjectPlanCustom;
import sys.spvisor.core.entity.project.TFileCheckProcess;
import sys.spvisor.core.entity.project.TFileCheckProcessExample;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TFileFormExample;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectExample;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;
import sys.spvisor.core.service.ana.RoleService;

@Service
public class PlanService {
	/*@Autowired
	TPeopleMapper tPeopleMapper;*/
	@Autowired 
	TProjectMapper tProjectMapper;
	@Autowired
	TFileFormMapper fileFormMapper;
	@Autowired
	TProjectPeopleMapper projectPeopleMapper;
	@Autowired
	TFileCheckProcessMapper tFileCheckProcessMapper;
	@Autowired
	TUserMapper tUserMapper;
	@Autowired
	TRoleMapper tRoleMapper;
	@Autowired
	TUserRoleMapper tUserRoleMapper;
	@Autowired
	RoleService roleService;
	
	//人员派遣选人
	@Transactional
	public List<PeopleProjectBigClass> selectPeople() {
		List<PeopleProjectBigClass> result = new ArrayList<PeopleProjectBigClass>();
		TUserExample tPeopleExample = new TUserExample();
		Criteria criteria1 = tPeopleExample.createCriteria();
		//只要岗位状态不是离职都可以选
		criteria1.andUserWorkStatusIdNotEqualTo(7);
		//只要是公司内部人员都可以选
		criteria1.andUserRoleFlagEqualTo(1);
		List<TUser> list1 = tUserMapper.selectByExample(tPeopleExample);
		/*Criteria criteria1 = tPeopleExample.createCriteria();
		criteria1.andPeoStationDescLike("%待岗");
		List<TPeople> list1 = tPeopleMapper.selectByExample(tPeopleExample);
		tPeopleExample.clear();
		
		Criteria criteria2 = tPeopleExample.createCriteria();
		criteria2.andPeoStationDescEqualTo("休假");
		List<TPeople> list2 = tPeopleMapper.selectByExample(tPeopleExample);
		tPeopleExample.clear();
		
		Criteria criteria3 = tPeopleExample.createCriteria();
		criteria3.andPeoStationDescNotLike("%待岗");
		criteria3.andPeoStationDescNotEqualTo("休假");
		criteria3.andPeoStationDescNotEqualTo("离职");
		List<TPeople> list3 = tPeopleMapper.selectByExample(tPeopleExample);
		tPeopleExample.clear();
		
		list1.addAll(list2);
		list1.addAll(list3);*/
		//与项目人员表连接找所在项目(只找了一个？)
		for(TUser tPeople : list1){
			PeopleProjectBigClass peoProBigCla = new PeopleProjectBigClass();
			peoProBigCla.setUser(tPeople);
			TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
			sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tProjectPeopleCriteria = tProjectPeopleExample.createCriteria();
			tProjectPeopleCriteria.andPpUserIdEqualTo(tPeople.getUserId());
			List<TProjectPeople> tProjectPeopleList = projectPeopleMapper.selectByExample(tProjectPeopleExample);
			tProjectPeopleExample.clear();
			if(tProjectPeopleList.size() == 0){
				result.add(peoProBigCla);
			}
			else{
				peoProBigCla.setProjectPeople(tProjectPeopleList.get(0));
				Integer proId = tProjectPeopleList.get(0).getPpProId();
				TProjectExample tProjectExample = new TProjectExample();
				sys.spvisor.core.entity.project.TProjectExample.Criteria tProjectCriteria = tProjectExample.createCriteria();
				tProjectCriteria.andProIdEqualTo(proId);
				List<TProject> tProjects = tProjectMapper.selectByExample(tProjectExample);
				tProjectExample.clear();
				if(tProjects.size() > 0){
					peoProBigCla.setProject(tProjects.get(0));
				}
				result.add(peoProBigCla);	
			}
		}
		return result;
	}
	
	
	public Map<String, String> getChiefAndManagerByMsgId(Integer projectId){
		Map<String, String> result = new HashMap<String, String>(2);
		TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria = tProjectPeopleExample.createCriteria();
		criteria.andPpProIdEqualTo(projectId);
		criteria.andPpProRoleIdEqualTo(10);//总监即经理
		criteria.andPpStatusEqualTo("O");
		List<TProjectPeople> projectChief = projectPeopleMapper.selectByExample(tProjectPeopleExample);
		tProjectPeopleExample.clear();
		if(projectChief.size() == 0) {
			result.put("projectChief", "");
		} else {
			int chiefId = projectChief.get(0).getPpUserId();
			TUserExample tUserExample = new TUserExample();
			sys.spvisor.core.entity.ana.TUserExample.Criteria tUserCriteria = tUserExample.createCriteria();
			tUserCriteria.andUserIdEqualTo(chiefId);
			TUser tUser = tUserMapper.selectByPrimaryKey(chiefId);
			result.put("projectChief", tUser.getUserName());
		}
		
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria2 = tProjectPeopleExample.createCriteria();
		criteria2.andPpProIdEqualTo(projectId);
		criteria2.andPpProRoleIdEqualTo(11);
		criteria2.andPpStatusEqualTo("O");
		List<TProjectPeople> projectManager = projectPeopleMapper.selectByExample(tProjectPeopleExample);
		tProjectPeopleExample.clear();
		if(projectManager.size() == 0) {
			result.put("projectManager", "");
		} else {
			int chiefId = projectManager.get(0).getPpUserId();
			TUser tUser = tUserMapper.selectByPrimaryKey(chiefId);
			result.put("projectManager", tUser.getUserName());
		}
			
		return result;
	}
	
	
	@Transactional
	public List<TFileForm> selectPlanFileByProjectId(Integer projectId) {
		List<TFileForm> TFileForms = new ArrayList<TFileForm>();
		if(projectId == null)
			return TFileForms;
		TFileFormExample example = new  TFileFormExample();
		sys.spvisor.core.entity.project.TFileFormExample.Criteria criteria = example.createCriteria();
		criteria.andFileFormProjectIdEqualTo(projectId);
		criteria.andFileFormTypeEqualTo("Plan");
		List<TFileForm> selectTFileForms = fileFormMapper.selectByExample(example);
		example.clear();
		addExistsFile("总监授权书",selectTFileForms,TFileForms);
		addExistsFile("助理授权书",selectTFileForms,TFileForms);
		addExistsFile("项目经理任命书",selectTFileForms,TFileForms);
		addExistsFile("监造服务策划表",selectTFileForms,TFileForms);
		addExistsFile("质量计划审批表",selectTFileForms,TFileForms);
		//addExistsFile("编制质量计划",selectTFileForms,TFileForms);
		addExistsFile("质量计划",selectTFileForms,TFileForms);
		addExistsFile("验收方案",selectTFileForms,TFileForms);
		addExistsFile("监理细则",selectTFileForms,TFileForms);
		//往TFileForms添加可有文件
		for(TFileForm tFileForm : selectTFileForms){
			TFileForms.add(tFileForm);
		}
		
		return TFileForms;
	}
	//往TFileForms添加必有文件
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
	
	
	/*
	 * 同一项目里的不同职位分行显示
	 * 只适用于人员派遣的时候,中途换人要保留被替换人在项目中的职务
	 */
/*	@Transactional
	public void dispatchPlanPeople(Integer projectId, String post, TPeople people) throws PlanChoosePeopleException{
		//超过项目开始日期则无法排遣
		//先获取项目开始时间
		TProject tProject = tProjectMapper.selectByPrimaryKey(projectId);
		Date date = tProject.getBegintime();
		if(new java.util.Date().getTime() > date.getTime())
			throw new PlanChoosePeopleException("项目已开始，无法派遣，请到人员变更模块进行人员变更！");
		//id为空则说明没选
		if(people.getPeoId() == null || people.getPeoId().equals(""))
			return;
		//查项目中职位是post的记录
		TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria1 = tProjectPeopleExample.createCriteria();
		criteria1.andPpMsgidEqualTo(projectId);
		criteria1.andPpProRoleDescLike("%"+post+"%");
		criteria1.andPpStatusEqualTo("O");
		List<TProjectPeople> tPPs1 = projectPeopleMapper.selectByExample(tProjectPeopleExample);
		tProjectPeopleExample.clear();
		
		//如果不是第一次派遣,处理被替换人
		if(tPPs1.size() > 0){
			TProjectPeople oldProjectPeople = tPPs1.get(0);
			//如果还是同一个人
			if(oldProjectPeople.getPpPeopleid().equals(people.getPeoId()))
				return;
			//如果不是同一个人,删除被替换人在项目中的职务
			else{
				projectPeopleMapper.deleteByPrimaryKey(oldProjectPeople.getProjectPeopleId());
				//看他是否已无其他职务
				//如果没有除监理人员之外的角色
				Integer peopleId = oldProjectPeople.getPpPeopleid();
				TPeople p = tPeopleMapper.selectByPrimaryKey(peopleId);
				TUser u = tUserMapper.selectByPrimaryKey(p.getUserId());
				TUserRoleExample userRoleExample = new TUserRoleExample();
				sys.spvisor.core.entity.ana.TUserRoleExample.Criteria userRoleCriteria = userRoleExample.createCriteria();
				userRoleCriteria.andUserIdEqualTo(u.getUserId());
				List<TUserRole> urs = tUserRoleMapper.selectByExample(userRoleExample);
				if(urs.size() == 0){
					throw new PlanChoosePeopleException("未给"+p.getPeoName()+"分配角色,请联系管理员");
				}
				if(urs.size() == 1 && urs.get(0).getRoleId() == 6){//6为监理人员的id,表明他只有监理人员的角色
					//再看他是否在其他项目里有职务
					sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria2 = tProjectPeopleExample.createCriteria();
					criteria2.andPpPeopleidEqualTo(peopleId);
					criteria2.andPpStatusEqualTo("O");
					List<TProjectPeople> tPPs2 = projectPeopleMapper.selectByExample(tProjectPeopleExample);
					tProjectPeopleExample.clear();
					if(tPPs2.size() == 0 || p.getPeoStationDesc().equals("在岗")){//其他项目里也没有职务
						p.setPeoStationDesc("待岗");
						tPeopleMapper.updateByPrimaryKey(p);
					}
				}
			}
		}
        //处理替换人
		TProjectPeople newProjectPeople = new TProjectPeople();
		newProjectPeople.setPpMsgid(projectId);
		newProjectPeople.setPpPeopleid(people.getPeoId());
		newProjectPeople.setPpUsername(people.getPeoName());
		newProjectPeople.setPpProRoleDesc(post);
		newProjectPeople.setPpStatus("O");
		newProjectPeople.setPpInProTime(tProject.getBegintime());
		newProjectPeople.setPpOutProTime(null);
		projectPeopleMapper.insert(newProjectPeople);
		//人员表设置在岗
		TPeople peo = tPeopleMapper.selectByPrimaryKey(people.getPeoId());
		if(peo.getPeoStationDesc().equals("离职"))
			throw new PlanChoosePeopleException(peo.getPeoName()+"已离职！");
		else{
			peo.setPeoStationDesc("在岗");
			tPeopleMapper.updateByPrimaryKey(peo);
		}
	}*/
	
	@Transactional
	public void pushPlanFile(Integer projectId,ProjectPlanCustom custom,Map<String, MultipartFile> fileMap,String userName,long userId,HttpServletRequest request) throws IOException, PermissionException{
		String[] name = custom.getFileNameTotal().split("&");
		//获取当前用户的角色或职务
  		/*String[] roles = getCurrentRoleAndDutyInProjectId(projectId, userId);
  		System.out.println(roles[0]);*/
		//文件上传
		int index = 0;
		/*boolean permission = false;//权限默认false
		//文件上传给档案管理员和过程管理员
		for(String role : roles){
			if(role.equals("管理员")){
				permission = true;
				break;
			}
			//TODO
			else if(role.equals("监理资料员")) {
				permission = true;
				break;
			}else if(role.equals("监理过程管理")) {
				permission = true;
				break;
			}
		}
		System.out.println(permission);*/
		//TFileCheckProcessExample tFileCheckProcessExample = new TFileCheckProcessExample();
		TFileFormExample tFileFormExample = new TFileFormExample();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf 	= entity.getValue();
			System.out.println(mf.getOriginalFilename());
			if(!mf.getOriginalFilename().equals("")){
				//判断权限是否可以操作name[index]
				/*sys.spvisor.core.entity.project.TFileCheckProcessExample.Criteria criteria = tFileCheckProcessExample.createCriteria();
				criteria.andFileBelongToEqualTo("Plan");
				criteria.andFileCurrentStatusEqualTo(0);
				criteria.andFileNameEqualTo(name[index]);
				List<TFileCheckProcess> tFileCheckProcess = tFileCheckProcessMapper.selectByExample(tFileCheckProcessExample);
				tFileCheckProcessExample.clear();
				
				if(tFileCheckProcess.size() > 0){
					String oprateRoles = tFileCheckProcess.get(0).getFileOperateRole();
					String[] oprateRoless = oprateRoles.split(",");
					System.out.println(oprateRoless[0]);
					loop : for(String role : roles){
							for(String oprateRole : oprateRoless){
								if(role.equals(oprateRole)){
									permission = true;
									break loop;
								}
							}
					}
				}
				if(!permission)
					throw new PermissionException("您没有权限操作"+name[index]);*/
					
				//判断上传文件里有没有此文件
				sys.spvisor.core.entity.project.TFileFormExample.Criteria ifExistCriteria = tFileFormExample.createCriteria();
				ifExistCriteria.andFileFormTypeEqualTo("Plan");
				ifExistCriteria.andFileFormNameEqualTo(name[index]);
				ifExistCriteria.andFileFormProjectIdEqualTo(projectId);
				List<TFileForm> fileForms = fileFormMapper.selectByExample(tFileFormExample);
				tFileFormExample.clear();
				//若没有
				if(fileForms.size() == 0){
					TFileForm tPlanForm = new TFileForm();
					tPlanForm.setFileFormFilename(mf.getOriginalFilename());
					//TODO
					//自动生成文件名称，在这里只保存文件路径，不保存文件流，把文件保存在服务器里面。
					/*tPlanForm.setFileFormContent(mf.getBytes());*/
					tPlanForm.setFileFormName(name[index]);
					tPlanForm.setFileFormPeople(userName);
					tPlanForm.setFileFormUserId((int)userId);
					tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
					tPlanForm.setFileFormType("Plan");
					tPlanForm.setFileFormProjectId(projectId);
					//tPlanForm.setFileFormCurrentStatus("W");
					tPlanForm.setFileFormCurrentStatus("D");
					tPlanForm.setFileFormCurrentStatusNum(0);
					tPlanForm.setFileFormNotpassTimes(0);
					File targetFile = AutoCreateFileName.createFileName(request, mf, projectId);
					//设置存放的服务器路径
					tPlanForm.setFileFormPath(targetFile.getName());
					fileFormMapper.insert(tPlanForm);
					//刚上传的文件状态默认待审核，后面判断是否需要审核，若不需要则改为已上传
					changeStatusIfNoNeedCheck("Plan",name[index],tPlanForm);
					
				}
				//若有
				//判断是否审核未通过或者已上传，若是则更新
				else {
					TFileForm tff = fileForms.get(0);
					if(tff.getFileFormCurrentStatus().equals("W")||tff.getFileFormCurrentStatus().equals("P"))
						throw new PermissionException(name[index]+"当前状态已无法操作！");
					else{
						tff.setFileFormFilename(mf.getOriginalFilename());
						AutoCreateFileName.updateFileName(request, mf, tff.getFileFormPath(),projectId);
						tff.setFileFormName(name[index]);
						//tff.setFileFormContent(mf.getBytes());
						tff.setFileFormName(name[index]);
						tff.setFileFormPeople(userName);
						tff.setFileFormUserId((int)userId);
						tff.setFileFormDate(new Date(new java.util.Date().getTime()));
						tff.setFileFormProjectId(projectId);
						//tff.setFileFormCurrentStatus("W");
						tff.setFileFormCurrentStatus("D");
						tff.setFileFormCurrentStatusNum(0);
						if(tff.getFileFormCurrentStatus().equals("D"))
							tff.setFileFormNotpassTimes(0);
						else{
							tff.setFileFormNotpassTimes(tff.getFileFormNotpassTimes()+1);
						}
						fileFormMapper.updateByPrimaryKey(tff);
						changeStatusIfNoNeedCheck("Plan",name[index],tff);
					}
						
				}
			}
			index++;
		}//文件上传结束
		System.out.println("完");
	}

	public String[] getCurrentRoleAndDutyInProjectId(Integer projectId, long userId) throws PermissionException{
		String temp = "";
		
		/*TUserRoleExample tUserRoleExample = new TUserRoleExample();
		sys.spvisor.core.entity.ana.TUserRoleExample.Criteria criteria = tUserRoleExample.createCriteria();
		criteria.andUserIdEqualTo((int)userId);
		List<TUserRole> userRoles = tUserRoleMapper.selectByExample(tUserRoleExample);
		tUserRoleExample.clear();
	    TUserExample tUserExample = new TUserExample();
		for(TUserRole userRole : userRoles){
			TRoleExample tRoleExample = new TRoleExample();
			sys.spvisor.core.entity.ana.TRoleExample.Criteria tRoleCriteria = tRoleExample.createCriteria();
			tRoleCriteria.andRoleIdEqualTo(userRole.getRoleId());
			List<TRole> roles = tRoleMapper.selectByExample(tRoleExample);
			tUserExample.clear();
			if(roles.size() > 0){
				//如果角色为监理人员
				if(roles.get(0).getRoleName().equals("supervisor")){
					//
					TUserExample tPeopleExample = new TUserExample();
					Criteria tPeopleCriteria = tPeopleExample.createCriteria();
					tPeopleCriteria.andUserIdEqualTo((int)userId);
					List<TUser> tPeoples = tUserMapper.selectByExample(tPeopleExample);
					tPeopleExample.clear();
					if(tPeoples.size() > 0){
						TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
						sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tProjectPeopleCriteria = tProjectPeopleExample.createCriteria();
						tProjectPeopleCriteria.andProjectPeopleIdEqualTo(tPeoples.get(0).getUserId());
						List<TProjectPeople>  tProjectPeoples = projectPeopleMapper.selectByExample(tProjectPeopleExample);
						for(TProjectPeople tProjectPeople : tProjectPeoples){
							temp += tProjectPeople.getPpProRoleDesc() + ",";
						}
						
					}
				}
				//如果角色为非监理人员
				else{
					temp += roles.get(0).getRoleDesc() + ",";
				}
			}
		}
		if(temp.length() == 0)
			throw new PermissionException("您没有被赋予角色，请联系管理员。");
		temp = temp.substring(0, temp.length() - 1);*/
		String[] roleNames = temp.split(",");
		return roleNames;
	}
	private void changeStatusIfNoNeedCheck(String belong, String filename, TFileForm fileForm){
		TFileCheckProcessExample tFileCheckProcessExample = new TFileCheckProcessExample();
  		sys.spvisor.core.entity.project.TFileCheckProcessExample.Criteria criteria = tFileCheckProcessExample.createCriteria();
  		criteria.andFileBelongToEqualTo(belong);
  		criteria.andFileNameEqualTo(filename);
  		criteria.andFileCurrentStatusEqualTo(1);
  		List<TFileCheckProcess> fcp = tFileCheckProcessMapper.selectByExample(tFileCheckProcessExample);
  		tFileCheckProcessExample.clear();
  		if(fcp == null || fcp.size() == 0){
  			fileForm.setFileFormCurrentStatus("D");
  			fileFormMapper.updateByPrimaryKey(fileForm);
  		}
  	}
	
	/*
	 * 同一项目里的职位在一行显示*/
	 @Transactional
	public void dispatchPlanPeople(Integer projectId, String post, TUser people) throws PlanChoosePeopleException{
		/*//id为空则说明没选
		if(people.getUserId() == null || people.getUserId().equals(""))
			return;
		//查项目中职位是post的记录
		TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria1 = tProjectPeopleExample.createCriteria();
		criteria1.andPpProIdEqualTo(projectId);
		criteria1.andPpProRoleDescLike("%"+post+"%");
		criteria1.andPpStatusEqualTo("O");
		List<TProjectPeople> tPPs1 = projectPeopleMapper.selectByExample(tProjectPeopleExample);
		tProjectPeopleExample.clear();
		//查people在项目中的职位
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria2 = tProjectPeopleExample.createCriteria();
		criteria2.andPpProIdEqualTo(projectId);
		criteria2.andPpUserIdEqualTo(people.getUserId());
		criteria2.andPpStatusEqualTo("O");
		List<TProjectPeople> tPPs2 = projectPeopleMapper.selectByExample(tProjectPeopleExample);
		tProjectPeopleExample.clear();
		
		//如果不是第一次派遣,处理被替换人
		if(tPPs1.size() > 0){
			TProjectPeople oldProjectPeople = tPPs1.get(0);
			//如果还是同一个人
			if(oldProjectPeople.getPpUserId().equals(people.getUserId()))
				return;
			//如果不是同一个人,删除被替换人在项目中的职务
			else{
				String oldPeoplePost = oldProjectPeople.getPpProRoleDesc();
				oldPeoplePost += ",";
				oldPeoplePost = oldPeoplePost.replace(post+",", "");
				//如果此人在项目中已无职务
				if(oldPeoplePost.equals("")){
					//设置在项目中的状态为离开
					oldProjectPeople.setPpStatus("S");
					oldProjectPeople.setPpOutProTime(new Date(new java.util.Date().getTime()));
					//设置职务为空
					oldProjectPeople.setPpProRoleDesc("");
					projectPeopleMapper.updateByPrimaryKey(oldProjectPeople);
					//看他是否已无其他职务
					//如果没有除监理人员之外的角色
					Integer peopleId = oldProjectPeople.getPpUserId();
					//TUser p = tPeopleMapper.selectByPrimaryKey(peopleId);
					TUser u = tUserMapper.selectByPrimaryKey(peopleId);
					//TODO
					//这个是否修改数据库，状态改为暂离，如果项目没有结束。
					//查找在其他项目中是否有职务
					TUserRoleExample userRoleExample = new TUserRoleExample();
					sys.spvisor.core.entity.ana.TUserRoleExample.Criteria userRoleCriteria = userRoleExample.createCriteria();
					userRoleCriteria.andUserIdEqualTo(u.getUserId());
					List<TUserRole> urs = tUserRoleMapper.selectByExample(userRoleExample);
					if(urs.size() == 0){
						throw new PlanChoosePeopleException("未给"+u.getUserName()+"分配角色,请联系管理员");
					}
					else if(urs.size() == 1 && urs.get(0).getRoleId() == 6){//6为监理人员的id,表明他只有监理人员的角色
						//再看他是否在其他项目里有职务
						sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria3 = tProjectPeopleExample.createCriteria();
						criteria3.andPpUserIdEqualTo(peopleId);
						criteria3.andPpStatusEqualTo("O");
						List<TProjectPeople> tPPs3 = projectPeopleMapper.selectByExample(tProjectPeopleExample);
						tProjectPeopleExample.clear();
						if(tPPs3.size() == 0){//其他项目里也没有职务
							//u.setPeoStationDesc(5);
							//没有其它职务改成本人待岗
							//TODO
							u.setUserWorkStatusId(5);
							tUserMapper.updateByPrimaryKey(u);
						}
							
					}
					
					
				}
				else{
					//TODO
					//前面已经把原来的职务信息给替换了。
					//String newPeoplePost = oldPeoplePost.substring(0, oldPeoplePost.length() - 1);
					//oldProjectPeople.setPpProRoleDesc(newPeoplePost);
					oldProjectPeople.setPpProRoleDesc(oldPeoplePost);
					projectPeopleMapper.updateByPrimaryKey(oldProjectPeople);
				}
					
			}
		}
        //处理替换人		
		//如果people没在项目中担当职位
		if(tPPs2.size() == 0){
			TProjectPeople newProjectPeople = new TProjectPeople();
			newProjectPeople.setPpProId(projectId);
			newProjectPeople.setPpUserId(people.getUserId());
			newProjectPeople.setPpProRoleDesc(post);
			newProjectPeople.setPpStatus("O");
			newProjectPeople.setPpInProTime(new Date((new java.util.Date()).getTime()));
			newProjectPeople.setPpOutProTime(null);
			projectPeopleMapper.insert(newProjectPeople);
			//人员表设置在岗
			TUser peo = tUserMapper.selectByPrimaryKey(people.getUserId());
			//peo.setPeoStationDesc("在岗");
			peo.setUserWorkStatusId(2);
			tUserMapper.updateByPrimaryKey(peo);
		}
		//如果people已在项目中担当某职位
		else{
			TProjectPeople alreadyProjectPeople = tPPs2.get(0);
			alreadyProjectPeople.setPpProRoleDesc(alreadyProjectPeople.getPpProRoleDesc()+","+post);
			projectPeopleMapper.updateByPrimaryKey(alreadyProjectPeople);
		}*/
	}
	
	
	
	
  /*	@Transactional
	public void insertProjectPlan(Integer msgId,ProjectPlanCustom custom,Map<String, MultipartFile> fileMap,String userName,long userId) throws PlanChoosePeopleException, IOException, PermissionException{
  		
  		TMsg msg = msgMapper.selectByPrimaryKey(msgId);
		List<TQualityPeople> peoples = custom.getPeoples();
		int flag = 0;
		String qualityProjectDuty = "";
		//前面要判断是否是过程管理员，若不是则要隐藏选人按钮,这个不是问题
		for (TQualityPeople tQualityPeople : peoples) {
			flag++;
			if(flag == 1) {
				qualityProjectDuty = "监理项目总监";
			} else if(flag == 2) {
				qualityProjectDuty = "监理项目经理";
			} 
			//id非空则说明选中
			if(tQualityPeople.getQualityId() != null && !tQualityPeople.getQualityId().equals("")){
				//若不一致说明id和姓名不对应(说明姓名是手动填的)
				TQualityPeople qualityPeople = peopleMapper.selectByPrimaryKey(tQualityPeople.getQualityId());
				if(!qualityPeople.getQualityName().equals(tQualityPeople.getQualityName())){
					throw new PlanChoosePeopleException("请从人员表选人");
				}
				//这里要判断第一次派遣还是更新派遣，若是更新还要处理被替换人角色和状态！！！！！！
				//先不管角色表，角色表应该要发生变化，总监、经理、组长、组员、待岗人应该合成一个质量室人员的角色！！！！！因为这几个角色跟项目关联
				//更新质量室人员表
				//如果是第一次派遣，则选出质量室人员表中项目id为msgId的职位包含经理或总监的list为空
				Criteria criteria = tQualityPeopleExample.createCriteria();
				criteria.andQualityProjectIdEqualTo(msgId);
				criteria.andQualityProjectDutyLike("%"+qualityProjectDuty+"%");
				List<TQualityPeople> tQ = peopleMapper.selectByExample(tQualityPeopleExample);
				tQualityPeopleExample.clear();
				//若是第一次派遣或者非第一次派遣且两次选人不一样
				if(tQ.size() == 0 || (tQ.size() > 0 && tQ.get(0).getQualityId() != tQualityPeople.getQualityId())){
					//非第一次派遣并且若两次选的人不一样，要处理被替换人　
					if(tQ.size() > 0 && tQ.get(0).getQualityId() != tQualityPeople.getQualityId()){
						//处理被替换人changedPeople
						TQualityPeople changedPeople = tQ.get(0);
						String changedPeopleDuty = changedPeople.getQualityProjectDuty();
						changedPeopleDuty  += ",";
						//删除子串
						changedPeopleDuty = changedPeopleDuty.replace(qualityProjectDuty+",", "");

						//判断替换人是否已无职务，若无职务则设为待岗
						if(changedPeopleDuty.length() < 1){
							changedPeople.setQualityProjectDuty(null);
							changedPeople.setQualityBeginTime(null);
							changedPeople.setQualityEndTime(null);
							changedPeople.setQualityEvectionDesc(null);
							changedPeople.setQualityEvectionLocation(null);
							changedPeople.setQualityFactory(null);
							changedPeople.setQualityProjectId(null);
							changedPeople.setQualityProjectName(null);
							changedPeople.setQualityProjectType(null);
							changedPeople.setQualityStationDesc("待岗");
							peopleMapper.updateByPrimaryKey(changedPeople);
						}
						else{
							changedPeopleDuty = changedPeopleDuty.substring(0, changedPeopleDuty.length() - 1);
							changedPeople.setQualityProjectDuty(changedPeopleDuty);
							peopleMapper.updateByPrimaryKey(changedPeople);
						}
						
						//更新项目人员表
						sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tppCriteria = tProjectPeopleExample.createCriteria();
						tppCriteria.andPpMsgidEqualTo(msgId);
						tppCriteria.andPpRoleDescEqualTo(qualityProjectDuty);
						List<TProjectPeople> tpps = projectPeopleMapper.selectByExample(tProjectPeopleExample);
						tProjectPeopleExample.clear();
						if(tpps.size() > 0){
							TProjectPeople tpp = tpps.get(0);
							tpp.setPpUserid(tQualityPeople.getQualityPeopleId());
							tpp.setPpUsername(tQualityPeople.getQualityName());
							projectPeopleMapper.updateByPrimaryKey(tpp);
						}
						
					}
					//若是第一次派遣
					if(tQ.size() == 0){
						//增加项目人员表
						TProjectPeople tProjectPeople = new TProjectPeople();
						tProjectPeople.setPpMsgid(msgId);
						tProjectPeople.setPpUserid(qualityPeople.getQualityPeopleId());
						tProjectPeople.setPpUsername(qualityPeople.getQualityName());
						tProjectPeople.setPpRoleDesc(qualityProjectDuty);
						tProjectPeople.setPpStatus("O");
						projectPeopleMapper.insert(tProjectPeople);
						
					}
					
					//更新替换人
					String tQProDuty = qualityPeople.getQualityProjectDuty();
					//派遣人已担任过角色
					if(tQProDuty != null && tQProDuty.length() > 1)
						qualityProjectDuty = tQProDuty + "," + qualityProjectDuty;
					qualityPeople.setQualityStationDesc("在岗");
					qualityPeople.setQualityProjectId(msgId);
					qualityPeople.setQualityProjectName(msg.getProjectName());
					qualityPeople.setQualityProjectType(msg.getPropType());
					qualityPeople.setQualityProjectDuty(qualityProjectDuty);
					qualityPeople.setQualityBeginTime(msg.getBegintime());
					qualityPeople.setQualityEndTime(msg.getPropEndtime());
					qualityPeople.setQualityFactory(msg.getPropFactory());
					peopleMapper.updateByPrimaryKey(qualityPeople);
					//----------------------------------------------------
					//更新项目人员表
					//updateProjectPeople(msgId, qualityProjectDuty,qualityPeople);
					
				}
			}//id非空是否重新选人if结束
		}//for循环结束
		
//--------------------------------------------------------------		
		String[] name = custom.getFileNameTotal().split("&");
		//获取当前用户的角色
  		String[] roles = getCurrentUserRoleInMsgId(msgId, userId);
		//文件上传
		int index = 0;
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf 	= entity.getValue();
//			System.out.println(mf.getOriginalFilename());
			if(!mf.getOriginalFilename().equals("")){
				//判断权限是否可以操作name[index]
				sys.spvisor.core.entity.project.TFileCheckProcessExample.Criteria criteria = tFileCheckProcessExample.createCriteria();
				criteria.andFileBelongToEqualTo("Plan");
				criteria.andFileCurrentStatusEqualTo(0);
				criteria.andFileNameEqualTo(name[index]);
				List<TFileCheckProcess> tFileCheckProcess = tFileCheckProcessMapper.selectByExample(tFileCheckProcessExample);
				tFileCheckProcessExample.clear();
				boolean permission = false;//权限默认false
				for(String role : roles){
					if(role.equals("管理员")){
						permission = true;
						break;
					}
				}
				if(tFileCheckProcess.size() != 0){
					String oprateRoles = tFileCheckProcess.get(0).getFileOperateRole();
					String[] oprateRoless = oprateRoles.split(",");
					loop : for(String role : roles){
							for(String oprateRole : oprateRoless){
								if(role.equals(oprateRole)){
									permission = true;
									break loop;
								}
							}
					}
				}
				if(!permission)
					throw new PermissionException("您没有权限操作"+name[index]);
					
				//判断上传文件里有没有此文件
				sys.spvisor.core.entity.project.TFileFormExample.Criteria ifExistCriteria = tFileFormExample.createCriteria();
				ifExistCriteria.andFileFormTypeEqualTo("项目策划");
				ifExistCriteria.andFileFormFilenameEqualTo(name[index]);
				ifExistCriteria.andFileFormProjectIdEqualTo(msgId);
				List<TFileForm> fileForms = fileFormMapper.selectByExample(tFileFormExample);
				tFileFormExample.clear();
				//若没有
				if(fileForms.size() == 0 && permission){
					TFileForm tPlanForm = new TFileForm();
					tPlanForm.setFileFormFilename(mf.getOriginalFilename());
					tPlanForm.setFileFormContent(mf.getBytes());
					tPlanForm.setFileFormName(name[index]);
					tPlanForm.setFileFormPeople(userName);
					tPlanForm.setFileFormPeopleId((int)userId);
					tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
					tPlanForm.setFileFormType("项目策划");
					tPlanForm.setFileFormProjectId(msgId);
					tPlanForm.setFileFormCurrentStatus("W");
					tPlanForm.setFileFormCurrentStatusNum(0);
					tPlanForm.setFileFormNotpassTimes(0);
					fileFormMapper.insert(tPlanForm);
					//刚上传的文件状态默认待审核，后面判断是否需要审核，若不需要则改为已上传
					changeStatusIfNoNeedCheck("Plan",name[index],tPlanForm);
					
				}
				//若有
				//判断是否审核未通过或者已上传，若是则更新
				else if(permission){
					TFileForm tff = fileForms.get(0);
					if(tff.getFileFormCurrentStatus().equals("W")||tff.getFileFormCurrentStatus().equals("P"))
						throw new PermissionException(name[index]+"当前状态无法操作！");
					else{
						tff.setFileFormFilename(mf.getOriginalFilename());
						tff.setFileFormContent(mf.getBytes());
						tff.setFileFormName(name[index]);
						tff.setFileFormPeople(userName);
						tff.setFileFormPeopleId((int)userId);
						tff.setFileFormDate(new Date(new java.util.Date().getTime()));
						tff.setFileFormProjectId(msgId);
						tff.setFileFormCurrentStatus("W");
						tff.setFileFormCurrentStatusNum(0);
						if(tff.getFileFormCurrentStatus().equals("D"))
							tff.setFileFormNotpassTimes(0);
						fileFormMapper.updateByPrimaryKey(tff);
					}
						
				}
			}
			index++;
		}//文件上传结束
		System.out.println("完");
	}*/


	/*private void updateProjectPeople(Integer msgId, String qualityProjectDuty,
			TQualityPeople qualityPeople) {
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tppCriteria = tProjectPeopleExample.createCriteria();
		tppCriteria.andPpMsgidEqualTo(msgId);
		tppCriteria.andPpRoleDescEqualTo(qualityProjectDuty);
		List<TProjectPeople> tpps = projectPeopleMapper.selectByExample(tProjectPeopleExample);
		tProjectPeopleExample.clear();
		if(tpps.size() > 0){
			TProjectPeople tpp = tpps.get(0);
			tpp.setPpUserid(qualityPeople.getQualityPeopleId());
			tpp.setPpUsername(qualityPeople.getQualityName());
			projectPeopleMapper.updateByPrimaryKey(tpp);
		}
		else{
			//增加项目人员表
			TProjectPeople tProjectPeople = new TProjectPeople();
			tProjectPeople.setPpMsgid(msgId);
			tProjectPeople.setPpUserid(qualityPeople.getQualityPeopleId());
			tProjectPeople.setPpUsername(qualityPeople.getQualityName());
			tProjectPeople.setPpRoleDesc(qualityProjectDuty);
			tProjectPeople.setPpStatus("O");
			projectPeopleMapper.insert(tProjectPeople);
		}
	}*/
	
 	
	/*@Transactional
	public List<TProjectPeople> selectTProjectPeopleByExample(int msgId) {
		TProjectPeopleExample example = new TProjectPeopleExample();
		sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria criteria = example.createCriteria();
		criteria.andProjectIdEqualTo(msgId);
		List<TProjectPeople> lists = projectPeopleMapper.selectByExample(example);
		return lists;
	}*/
	/*
	@Transactional
	public List<TFileForm> selectTPlanFormByProjectId(int projectId) {
		TFileFormExample example = new  TFileFormExample();
		sys.spvisor.core.entity.project.TFileFormExample.Criteria criteria = example.createCriteria();
		criteria.andFileFormProjectIdEqualTo(projectId);
		System.out.println(planFormMapper.selectByExample(example));;
		return planFormMapper.selectByExample(example);
	}*/
  	
}
