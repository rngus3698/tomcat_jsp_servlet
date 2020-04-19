package Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberSignUpAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();//세션 받아옴
		
		session.setAttribute("now_user_name", request.getParameter("user_id"));
		session.setAttribute("now_user_id", request.getParameter("user_name"));
		
		forward.setRedirect(true);
		forward.setPath("./view/index.jsp");
		return forward;
	}

}
