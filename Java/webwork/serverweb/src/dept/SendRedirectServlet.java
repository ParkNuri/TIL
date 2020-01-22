package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import basic.CalcLogic;

@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 입출력
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>sendRedirect화면</h1>");
		
		//1. 데이터 공유 - request 공유
		DeptDTO dept = new DeptDTO("001", "전산실", "","","");	//sendRedirect로는 안넘어옴
		request.setAttribute("mydata",dept);
		System.out.println("sendRedirectServlet실행완료");
		
		
		//2. 요청재지정 - sendRedirect
		response.sendRedirect("/serverweb/jspbasic/subPage.jsp");
	}

}
