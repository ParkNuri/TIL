package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.NetworkChannel;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
    	PrintWriter pw = response.getWriter();
		
    	
    	String deptno = request.getParameter("deptno");
    	String info = request.getParameter("info");
    	
    	System.out.println("deptno:"+deptno);
    	
    	System.out.println("info:"+info);
    	
    	
    	DeptDAO dao = new DeptDAO();
    	
    	dao.deleteLine(deptno);
    	
    	ArrayList<DeptDTO> deptlist= new ArrayList<DeptDTO>();
    	deptlist = dao.getDeptList();
    	
    	pw.print("<h1>부서 목록 조회</h1>");
    	pw.print("<table><tr><th>부서번호</th><th>부서이름</th><th>부서위치</th><th>부서매니저</th><th>부서전화번호</th>");
    	for (DeptDTO items : deptlist) {			
    		pw.print("<tr><td>"+items.getDeptno()+"</td>");
    		pw.print("<td>"+items.getDeptname()+"</td>");
    		pw.print("<td>"+items.getLoc()+"</td>");
    		pw.print("<td>"+items.getMgr()+"</td>");
    		pw.print("<td>"+items.getTel()+"</td>");
    		pw.print("<td>"+"<a href='/serverweb/dept/delete.do?deptno="+items.getDeptno()+"&info=test'>삭제</a></td></tr>");
		}
    	
	}


}
