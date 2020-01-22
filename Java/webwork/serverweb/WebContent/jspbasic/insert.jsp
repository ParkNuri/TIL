<%-- <%@page import="dept.DeptDAO"%>
<%@page import="dept.DeptDTO"%>
 --%><%@page import="dept.*"%>	<%-- 한번에 import --%>
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
	request.setCharacterEncoding("euc-kr");
	//response.setContentType("text/html;charset=euc-kr");		// jsp페이지 상단에서 했기때문에 안해도된다.
	
	//1. 요청정보 추출
	//web->server 데이터 받기
	String deptno = request.getParameter("deptNo");
	String deptname = request.getParameter("deptName");
	String deptloc = request.getParameter("loc");
	String deptphone = request.getParameter("tel");
	String deptadmin = request.getParameter("mgr");
		
	//2. 비지니스 메소드 call
	DeptDTO dto = new DeptDTO(deptno, deptname, deptloc, deptphone, deptadmin);
	DeptDAO dao = new DeptDAO();
	int result=dao.insert(dto);
	%>
	<h1><%=result %>개의 행 삽입성공!~.~</h1>
</body>
</html>