package sys.spvisor.console.interceptor;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import sys.spvisor.core.entity.ana.Permission;



public class PermissionCheckInterceptor implements HandlerInterceptor {

	
	/*（1 ）preHandle (HttpServletRequest request, HttpServletResponse response, Object handle) 方法，
	顾名思义，该方法将在请求处理之前进行调用。SpringMVC 中的Interceptor 是链式的调用的，在一个应用中或者说是在一个请求中
	可以同时存在多个Interceptor 。
	每个Interceptor 的调用会依据它的声明顺序依次执行，而且最先执行的都是Interceptor 中的preHandle 方法，所以可以在这个
	方法中进行一些前置初始化操作或者是对当前请求的一个预处理，也可以在这个方法中进行一些判断来决定请求是否要继续进行下去。该方法的
	返回值是布尔值Boolean 类型的，当它返回为false 时，表示请求结束，后续的Interceptor 和Controller 都不会再执行；
	当返回值为true 时就会继续调用下一个Interceptor 的preHandle 方法，如果已经是最后一个Interceptor 的时候就会是调
	用当前请求的Controller 方法。

	（2 ）postHandle (HttpServletRequest request, HttpServletResponse response, Object handle, ModelAndView modelAndView) 方法，
	由preHandle 方法的解释我们知道这个方法包括后面要说到的afterCompletion 方法都只能是在当前所属的Interceptor 的preHandle 方法的返回值为true 时
	才能被调用。postHandle 方法，顾名思义就是在当前请求进行处理之后，也就是Controller 方法调用之后执行，但是它会在DispatcherServlet 进行视图返回渲染
	之前被调用，所以我们可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作。postHandle 方法被调用的方向跟preHandle 是相反的，也就是
	说先声明的Interceptor 的postHandle 方法反而会后执行，这和Struts2 里面的Interceptor 的执行过程有点类型。Struts2 里面的Interceptor 的执行过
	程也是链式的，只是在Struts2 里面需要手动调用ActionInvocation 的invoke 方法来触发对下一个Interceptor 或者是Action 的调用，然后每一个
	Interceptor 中在invoke 方法调用之前的内容都是按照声明顺序执行的，而invoke 方法之后的内容就是反向的。

	（3 ）afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handle, Exception ex) 方法，
	该方法也是需要当前对应的Interceptor 的preHandle 方法的返回值为true 时才会执行。顾名思义，该方法将在整个请求结束之后，也就是在DispatcherServlet 
	渲染了对应的视图之后执行。这个方法的主要作用是用于进行资源清理工作的。*/
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
	}

	//该方法将在请求处理之前进行调用
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object handler) throws Exception {
		HttpSession session = req.getSession(false);
		if (session == null) {
			res.sendError(HttpServletResponse.SC_FORBIDDEN);
			return false;
		}

		boolean find = false;
		String curPath = req.getServletPath();
		List<Permission> permissions = (List<Permission>) session.getAttribute("USER_PERMISSIONS");
		
		outer:
		for (Permission p : permissions) {
			String urlFilter = p.getUrlFilter().trim();
			if ((urlFilter == "") || (urlFilter == null)) {
				continue;
			}
			
			String[] subFilters = urlFilter.split(";|,");
			for (String subFilter : subFilters) {
				Pattern pat = Pattern.compile(subFilter, Pattern.CASE_INSENSITIVE);
				Matcher mat = pat.matcher(curPath);
				if (mat.find()) {
					find = true;
					break outer;
				}
			}			
		}
		
		if (find) {
			return true;
		} else {
//			res.sendError(HttpServletResponse.SC_FORBIDDEN);
//			res.sendError(HttpServletResponse.SC_FORBIDDEN, new String("没有操作权限，请于管理员联系")); 
			System.out.println("缺少权限:"+curPath);
			res.getWriter().print("403——没有操作权限，请于管理员联系");
			return false;
		}
	}

}
