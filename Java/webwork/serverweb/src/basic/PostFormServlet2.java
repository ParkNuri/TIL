package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost2", urlPatterns = { "/mypost2.do" })	//@webServlet을 통해 xml형식으로 생성됨
public class PostFormServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		//response.setContentType("test/html;charset=euc-kr");	//응답 내용을 구분할 수 없어서 다운로드 파일로 전달
		PrintWriter pw = response.getWriter();
		//요청정보 추출
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String pass = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] favor = request.getParameterValues("item");
		
		//서버는 대개 영어권에서 개발되었기때문에 req, res 모두 한글 전환 처리를 해야한다.
		//입력할때 BufferedReader 출력할때 PrintWriter를 많이 씀
		//응답내용을 생성
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>고객정보</h1>");
		pw.print("<h3>아이디: "+id+"</h3>");
		pw.print("<h3>성명: "+name+"</h3>");
		pw.print("<h3>Favorites: </h3>");
		for (String data : favor) {
			pw.print(data+" ");
		}
		pw.print("</body>");
		pw.print("</html>");
	}

}
