package Member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.m")
public class MemberController extends HttpServlet implements javax.servlet.Servlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9097735787744601282L;
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length()); // 부로는 경로
		ActionForward forward = null;
		Action action = null;
		
		//여기서 경로가 나뉘어 집니다.
		
		if(command.equals("/singUp.m"))
		{
			System.out.println("singUp 들어갔습니다.");
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/view/member/signUp.jsp");
		}
		else if(command.equals("/signUp_submit.m"))
		{
			System.out.println("signUp submit!");
			action = new MemberSignUpAction();
			try
			{
				forward = action.execute(request, response);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		//Redirect OR dispatcher
		
		if(forward.isRedirect())
		{
			response.sendRedirect(forward.getPath());
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}
		
		//get으로 가든 post로 가든 doProcess로 간다요
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doProcess(request, response);
	}

}
