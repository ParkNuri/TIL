<%@page import="java.util.Date"%>
<%@page import="dept.DeptDTO"%> <!-- 지원하지 않는 버전도 있음ㅠㅠ -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.Random, java.util.ArrayList" %> <!-- page 지시자 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- HTML주석문(클라이언트에 전송된다!!) -->
	<%-- JSP주석문(클라이언트에 전송되지 않는다.) --%>
	<h2>1. 스크립트릿 - 자바 코드를 정의할 수 있다.</h2>
	<% 
		// 자바 주석 사용 가능! 클라이언트에 전송되지 않는다~
		
		/* 
			자바 주석문
			- 클라이언트에 전송되지 않는다!		
		*/
		String str = new String("java");
		out.print("<h3>문자열의 길이:"+str.length()+"</h3>");
		out.print("<h3>여긴 클라이언트에서 보임!!!</h3>");		
		Random rand = null;
		ArrayList list = null;	
		DeptDTO dto = null;	
	%>
	<h2>중간작업</h2>
	<% int num = 100; %>
	<h2>2. 선언문</h2>
	<%! int num = 200; %>
	<%! public void test(){ System.out.println("");} 
	// 실행하기 전에는 .class.java 생기지 않는다.
	%>
	<h2>3. 표현식</h2>
	<h4><%= 10000 %></h4>
	<h4><%= 10.5 %></h4>
	<h4><%= "문자열의 길이: " + str.length() %></h4>
	<h4><%= new Date().toString() %></h4>
	<h4><%= 100/3 %></h4>
	<h4><%= str.charAt(0) %></h4>
	
	
</body>
</html>