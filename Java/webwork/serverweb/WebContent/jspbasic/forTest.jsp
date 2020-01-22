<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- <style type="text/css">
	table {
		border : black 2px;
	}
</style> -->
<title>Insert title here</title>
</head>
<body>
	<table border =  "solid black 2px;">
		<% for(int i=0;i<10;i++){ %>
		
		<tr><td><h1><%= i+1 %></h1></td></tr>
		<%} %>
	</table>
</body>
</html>