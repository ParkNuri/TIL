package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "memRead", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		System.out.println(id);	
		
		MemberDAO dao = new MemberDAOImpl();
	
		MemberDTO dto = dao.findById(id);
		
		request.setAttribute("member",dto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/member_read.jsp");
		
		rd.forward(request, response);

	}

}
