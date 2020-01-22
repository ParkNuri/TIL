<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% String str = "ja";
		int size = str.length();
		if(size>=4){
	%>
		<h1>like: <%= size %></h1>
	<% 
		}else{ 
	%>
	
		<h1>dislike: <%= size %></h1>
	
	<%		
		}
	%>
</body>
</html>