<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WAS에서 제공하는 Connection Pool 이용하기</h1>
	<hr/>
	<h2>WAS마다 각각의 고유한 자원으로 Connection Pool을 만들고 관리한다.
		JAVA에서 이를 사용하기 위해 표준 API인 javax.sql.DataSource를 이용
		1. WAS에 등록된 자원을 lookup한다.
			- InitialContext의 lookup 메소드 이용
			
		2. WAS에서 lookup한 DataSource로부터 커Connection을 가져온다.
			- DriverManager와 동일하게 getConnection을 이용
	</h2>
	
	<% 
		//1. WAS에 등록된 자원을 찾아올 수 있는 기능을 제공하는 객체를 생성
		InitialContext context = new InitialContext();
	
		//2. InitialContext객체를 이용해서 lookup
		//	 META-INF/context.xml 에서 등록한 datasource 객체명-> lookup 함수의 매개변수 
		DataSource ds= (DataSource) context.lookup("java:comp/env/jdbc/myspring");
		
		Connection con = ds.getConnection();
	%>
	
	<!-- 
	javax.naming.NameNotFoundException: Name [jdbc/myspring]은(는) 이 컨텍스트에 바인딩되지 않았습니다. [jdbc]을(를) 찾을 수 없습니다.
		- 이름이 틀렸거나
		- 바인딩이 안되어있거나
		- 경로가 잘못되었을때 
		(java:comp/env/ 자원 찾는 주소)
	서버 실행이 되지않을때 
		- repository 삭제 후 실행해서 Spring에서 다시 다운로드
		- 실행되는 repository를 붙여넣기
		- pom.xml의 dependency 삭제 - 저장 - 붙여넣기 -저장 
	=>
	-->
	<h3><%= con %></h3>
</body>
</html>