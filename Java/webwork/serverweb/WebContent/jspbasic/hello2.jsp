<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		/* <%%'> 내부는 JSPService 메소드 내이기 때문에 JSPService에 선언되어있는 변수와 함수들을 선언없이 사용할 수 있다. */
		/* 여기서 자바코드 사용 가능 */
		out.print("<h2>안녕~</h2>");
		/* 객체 선언 없이 out을 사용할 수 있다..?  */
	%>
</body>
</html>