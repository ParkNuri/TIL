package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTest extends HttpServlet {
	public LifeCycleTest() {
		System.out.println("서블릿객체생성..."); 
	}
	public void init() {
		System.out.println("서블릿객체의 초기화 init()...");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("클라이언트의 요청 처리 service()^~^..."+req.getMethod());
		//요청방식이 GET이면 doGet 호출, POST면 doPost 호출
		if(req.getMethod().equals("GET")) {
			doGet(req, res);
		}else {
			doPost(req, res);
		}
		
	}
	public void destroy() {
		System.out.println("서블릿 객체 소멸... destroy()...");
	}	//reloadable = true 이기때문에 파일을 수정-저장하면 수정된 데이터를 자동으로 loading하며 재실행한다
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()...");
		//super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost()...");
//		super.doPost(req, resp);
	}
	

	
}
