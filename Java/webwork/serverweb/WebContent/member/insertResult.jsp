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
		String name = (String)request.getAttribute("name");
		if(result==1){
	%>
	<h2>반갑습니다 <%=name %>고객님!! 회원가입이 완료되었습니다.</h2>
	<%}else{%> 
		<h2>회원가입에 실패하였습니다. 다시 시도해주세요.</h2>
	<%}  %>
</body>
</html>