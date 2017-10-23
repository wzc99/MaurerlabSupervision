package sys.spvisor.console.test;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sys.spvisor.core.entity.examine.ExamineInit;
import sys.spvisor.core.service.ana.UserService;
import sys.spvisor.core.service.examine.ExamineService;

@RunWith(SpringJUnit4ClassRunner.class)
// 指明配置文件所在
@ContextConfiguration(locations = { "classpath*:/config/applicationContext-core.xml",
		"classpath*:/WEB-INF/config/mvc-dispatcher-servlet.xml" })



public class UnitTest {
	// spring依赖注入
	@Autowired
	private ExamineService service;

	@Autowired
	private UserService userService;

	// // JUnit注解 ，表明这是一个需要运行的测试方法
	@Test

	public void testInsert() throws Exception {
		 ExamineInit init = new ExamineInit();
		 init.setExaContent("ccc111");
		 init.setExaFileFlag(0);
		 init.setExaTitle("ttt111");
		 init.setProId(91);
		 init.setExaType(2);
		 init.setIsProType(1);
		 init.setExaLinkId(2);
		 init.setSubmitId(1);
//		 Date date = new Date(16, 5, 1);
//		 init.setSubmitTime(date);
		 System.out.println(service.insertExamine(init));
//		System.out.println(service.ToPullBackExamine(29, 1));

		// @Test
		// public void testGetExamine(){
		// List<TExamine> list = service.getMyExamineList(1, 3);
		// System.out.println(""+service.getMyExamineCount(1, 1));
		// }
		// @Test
		// public void testUserCenter(){
		//// TUser user = new TUser();
		//// user.setUserName("jiajia");
		//// user.setUserWorkStatusId(1);
		//// System.out.println(userService.updateUserById(user,
		// Long.valueOf(2))+"
		// aaa");
		// //service.insertExamine(init)
		// }

	}
}
