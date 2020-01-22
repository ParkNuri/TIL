<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
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
	ArrayList<MemberDTO> memlist =(ArrayList<MemberDTO>)request.getAttribute("memlist");
	%>
	<input type="button" value="회원가입 페이지로 돌아가기" class="btn btn-success" onclick="history.go(-1)"/>
	<h1>부서 목록 조회</h1>
    	<table><tr><th>부서번호</th><th>사번</th><th>성명</th><th>주소</th><th>포인트</th><th>등급</th>
    	<% for (MemberDTO items : memlist) {	%>		
    		<tr><td><%=items.getDeptno()%></td>
    			<td><%=items.getId()%></td>
    			<td><a href="/serverweb/member/read.do?id=<%=items.getId()%>"><%=items.getName()%></a></td>
    			<td><%=items.getAddr()%></td>
    			<td><%=items.getPoint()%></td>
    			<td><%=items.getGrade()%></td>
    			<td><a href="/serverweb/member/delete.do?id=<%=items.getId()%>&info=test">삭제</a></td></tr>
		<%}%>
		</table>

</body>
</html>