<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>스프링 web MVC구축하기</h1>
	<hr/>
	<h3>jsp로 코드 출력하기:9단출력</h3>
	<%= request.getAttribute("msg") %>
	<h3>EL로 출력하기:9단출력</h3>
	${msg}
</body>
</html>