<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>spring mvc테스트하기</h1>
	<hr/>
	<h3><a href="/firstPro/test.do">테스트 컨트롤러 요청하기</a></h3>
	<form method="post" action="/firstPro/search.do">
		<!--  -->
		검색어:<input type="text" name="search">
		<input type="submit" value="검색">
	</form>
	
</body>
</html>