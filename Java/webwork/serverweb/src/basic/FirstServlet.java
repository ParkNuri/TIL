package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		System.out.println("������ ��û...");
	}

}
