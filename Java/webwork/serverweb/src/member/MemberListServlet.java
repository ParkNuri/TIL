package member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memlist", urlPatterns = { "/member/list.do" })
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");						// POST 방식에서만
		response.setContentType("text/html;charset=euc-kr");		// 적용됨 (GET x)
		
		MemberDAO dao = new MemberDAOImpl();
		ArrayList<MemberDTO> memlist = new ArrayList<MemberDTO>();
		memlist = dao.memberList();
		
		request.setAttribute("memlist", memlist);
		
		RequestDispatcher rd =request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
	}

}
