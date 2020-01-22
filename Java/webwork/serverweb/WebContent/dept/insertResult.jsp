<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		int result = (int)request.getAttribute("result");
	%>
	<h1>insertResult.jsp 실행</h1>
	<h1>응답화면 분리</h1>
	<hr/>
	<h2><%=result%>개 행 삽입성공!!</h2>
</body>
</html>