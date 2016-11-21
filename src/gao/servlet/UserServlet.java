package gao.servlet;

import gao.bean.UserTable;
import gao.factory.FactoryImpl;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		select(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
	protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String action = request.getParameter("action");
		 if("add".equals(action))
			add(request,response);
		else if("find".equals(action))
			find(request,response);
		else if("update".equals(action))
			update(request,response);
		else if("login".equals(action))
			login(request,response);
		
	}
	protected void FinishNewTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username =request.getParameter("username");
		String userpassword=request.getParameter("userpassword");
		if((FactoryImpl.createUserDaoInstance().login(username, userpassword))==true){
			response.sendRedirect("releasetask.jsp");
		}
		else{
		    response.sendRedirect("Login.jsp");
		};
	}
	protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		UserTable user=new UserTable();
		user.setUser_id(request.getParameter("user_id"));
		user.setUser_name(request.getParameter("user_name"));
		user.setUser_sex(request.getParameter("user_sex"));
		user.setUser_job(request.getParameter("user_job"));
		user.setUser_password(request.getParameter("user_password"));
		user.setUser_type(request.getParameter("user_type"));
		user.setUser_dept(request.getParameter("user_dept"));
		if (FactoryImpl.createUserDaoInstance().add(user) > 0) {
			response.sendRedirect("note2.jsp");
		}
		else
		{
			response.sendRedirect("register.jsp");
		}
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String user_id=request.getParameter("user_id");
		UserTable user = new UserTable();
		user.setUser_id(request.getParameter("user_id"));
		user.setUser_name(request.getParameter("user_name"));
		user.setUser_sex(request.getParameter("user_sex"));
		user.setUser_job(request.getParameter("user_job"));
		user.setUser_password(request.getParameter("user_password"));
		user.setUser_type(request.getParameter("user_type"));
		user.setUser_dept(request.getParameter("user_dept"));
		
		if (FactoryImpl.createUserDaoInstance().update(user, user_id) > 0) {
			response.sendRedirect("note.jsp");
			
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("error", "ÐÞ¸ÄÊ§°Ü£¡");
			response.sendRedirect("error.jsp");
		}
	}
	protected void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("user_id");
		UserTable user=FactoryImpl.createUserDaoInstance().findByUserId(username);
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		response.sendRedirect("userupdate.jsp");
		
	}
}
