<%@page import="java.util.ArrayList"%>
<%@page import="multi.erp.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<%-- 	 category="<%= request.getAttribute("category")%>; 와 같음  	--%>
 <script type="text/javascript">
	//자바스크립트에서 자바에서 발생한 데이터를 사용 - EL
	//${category} => request.getAttribute("category")
	category="${category}";//controller 요청하고 response될때 값을 받아서 셋팅

	$(document).ready(function() {
		//최초실행인 경우는 category값이 없으니
		if(category==""){
			category="all";
		}
		$("#category").val(category).attr("selected", "selected");
		$("#category").change(function () {
			location.href="/erp/board/list.do?category="+encodeURI($(this).val());
		})
	})
</script>
</head>
<body>
	<% ArrayList<BoardVO> list= (ArrayList<BoardVO>)request.getAttribute("boardlist"); 
	%>
	<h3>JSTL게시판</h3>
	<div style="padding-top: 30px">
		<div class="col-md-3" style="padding-bottom: 10px">
		    구분:
			<form >
				<select name="category"  id="category">
					<option value="all">전체게시물</option>
					<option value="경조사">경조사</option>
					<option value="사내소식">사내소식</option>
					<option value="게시판">게시판</option>
				</select>
			</form>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일</th>
				</tr>
			</thead>
			<tbody>
				<% for(int i =0; i<list.size(); i++){
					BoardVO row = list.get(i);	
				 %>
					<tr>
						<td><%=row.getBoard_no() %></td>
						<td><%=row.getTitle() %></td>
						<td><%=row.getId() %></td>
						<td><%=row.getWrite_date() %></td>
					</tr>
				<%
				} %>
			</tbody>
		</table>
	</div>
	<form action="/erp/board/search.do">
		<select name="tag">
			<option value="id">작성자</option>
			<option value="title">제목</option>
			<option value="content">본문</option>
			<option value="write_date">작성일</option>
		</select> <input type="text" name="search" /> <input type="submit" value="검색">
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/erp/board/write.do" style="text-align: right;">글쓰기</a></li>
		</ul>
	</form>

</body>
</html>
