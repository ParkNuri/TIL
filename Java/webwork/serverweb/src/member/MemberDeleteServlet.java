package member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDAO;
import dept.DeptDTO;


@WebServlet(name = "memDel", urlPatterns = { "/member/delete.do" })
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
    	
    	String id = request.getParameter("id");
    	String info = request.getParameter("info");
    	
    	System.out.println("id:"+id);
    	
    	System.out.println("info:"+info);
    	
    	
    	MemberDAO dao = new MemberDAOImpl();
    	
    	dao.delete(id);
    	
    	ArrayList<MemberDTO> memlist = new ArrayList<MemberDTO>();
		memlist = dao.memberList();
		
		request.setAttribute("memlist", memlist);
		
		RequestDispatcher rd =request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
	}

}
