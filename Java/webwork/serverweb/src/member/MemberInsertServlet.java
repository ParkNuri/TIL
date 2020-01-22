package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="memInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		int point = Integer.parseInt(request.getParameter("point"));
		String grade = request.getParameter("grade");
		
		System.out.println("부서번호: "+deptno);
		System.out.println("성명: "+name);
		System.out.println("사번: "+id);
		System.out.println("패스워드: "+pass);
		System.out.println("주소: "+addr);
		System.out.println("포인트: "+point);
		System.out.println("등급: "+grade);
		
		MemberDTO dto = new MemberDTO(id, pass, name, addr, deptno, point, grade);
		MemberDAO dao = new MemberDAOImpl();
		
		int result = dao.insert(dto);
		
		request.setAttribute("result", result);
		request.setAttribute("name", name);
		
		RequestDispatcher rd =request.getRequestDispatcher("/member/insertResult.jsp");
		
		rd.forward(request, response);
	}

}
