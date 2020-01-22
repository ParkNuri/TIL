package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import basic.CalcLogic;

@WebServlet(name = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 입출력
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		//PrintWriter pw = response.getWriter();
		
		//1. 요청정보 추출
		//web->server 데이터 받기
		String deptno = request.getParameter("deptNo");
		String deptname = request.getParameter("deptName");
		String deptloc = request.getParameter("loc");
		String deptphone = request.getParameter("tel");
		String deptadmin = request.getParameter("mgr");
		
		System.out.println("부서번호: "+deptno);
		System.out.println("부서명: "+deptname);
		System.out.println("부서위치: "+deptloc);
		System.out.println("부서전화번호: "+deptphone);
		System.out.println("부서관리자: "+deptadmin);
		
		//2. 비지니스 메소드 call
		DeptDTO dto = new DeptDTO(deptno, deptname, deptloc, deptphone, deptadmin);
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(dto);
		/*CalcLogic logic = new CalcLogic();
		//int result = logic.calc(num1,method,num2);
		
		//3. 응답메시지 생성
		pw.print("<html>");
		pw.print("<body>");
		//pw.print("<h1>num1의 "+num1+"과 num2의 "+num2+"을 연산한 결과는 "+result+"입니다.</h1>");
		pw.print("</body>");
		pw.print("</html>");
		*/
		
		
		//3-1. 응답화면으로 요청 재지정 - sendRedirect
		//response.sendRedirect("/serverweb/dept/insertResult.html");
		
		
		
		//3-2. 응답화면으로 요청 재지정 - forward
		request.setAttribute("result", result);
		
		RequestDispatcher rd =request.getRequestDispatcher("/member/insertResult.jsp");

		rd.forward(request, response);
	}

}
