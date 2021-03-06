package sys.spvisor.console.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class SessionCheckInterceptor implements HandlerInterceptor {

	private static final String LOGIN_URL = "/htm/login.htm";
	private int customSessionExpiredErrorCode = 901;
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		HttpSession session = req.getSession(false);
		
		if (session == null) {
			res.sendRedirect(req.getContextPath()+LOGIN_URL);
			return false;
		}
		
		Object obj = session.getAttribute("USER_NAME");
		if (obj == null || "".equals(obj.toString())) {
			String ajaxHeader = req.getHeader("X-Requested-With");
			if ("XMLHttpRequest".equals(ajaxHeader)) {
				res.sendError(customSessionExpiredErrorCode);
			}else{
				res.sendRedirect(req.getContextPath()+LOGIN_URL);
			}
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object arg2, ModelAndView arg3) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object arg2, Exception arg3) throws Exception {
	}

}
