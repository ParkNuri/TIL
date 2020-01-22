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

@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class IncludeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 입출력
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>include화면</h1>");
		pw.println("<hr/><hr/><hr/><hr/>");
		
		//1. 데이터 공유 - request 공유
		DeptDTO dept = new DeptDTO("001", "전산실", "","","");	//sendRedirect로는 안넘어옴
		request.setAttribute("mydata",dept);
		System.out.println("IncludeServlet실행완료");
		
		
		//2. 요청재지정 - sendRedirect
		RequestDispatcher rd =request.getRequestDispatcher("/jspbasic/subPage.jsp");	//공유됨
		//RequestDispatcher rd =request.getRequestDispatcher("/serverweb/jspbasic/subPage.jsp");	// HTTP Status 404 ? Not Found 에러 발생 
		//filepath:/serverweb/serverweb/jspbasic/subPage.jsp -> 시작점이  servlet.java 파일 내이기 때문에 serverweb/serverweb이 됨
		rd.include(request, response);
	}

}
