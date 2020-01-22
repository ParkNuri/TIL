package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptread", urlPatterns = { "/dept/read.do" })
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String deptno = request.getParameter("deptno");
			
		
		DeptDAO dao = new DeptDAO();
	
		DeptDTO dto = dao.read(deptno);
		
		request.setAttribute("dept",dto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		
		rd.forward(request, response);

	}

}
