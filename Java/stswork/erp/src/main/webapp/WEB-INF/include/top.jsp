<%@page import="multi.erp.emp.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="/erp/common/css/main.css" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	/* Remove the navbar's default margin-bottom and rounded borders */
	.navbar {
		margin-bottom: 0;
		border-radius: 0;	
	}
	/*  #toparea{
		padding: 30px;
	}  */
	/* body{
		background-color: #edeef1
	} */
</style>
<title>Insert title here</title>
</head>
<body>
	<%
		MemberVO user = (MemberVO)session.getAttribute("user");
	%>
	<div style="height:120px" style="padding:10px">
		<div id="toparea"  class="navbar navbar-inverse">
			<a href="/erp/index.do" style="position:absolute;top:30px;font-size: 18pt; font-weight: bolder;text-decoration: none;padding-left: 10px">KimSaemERP</a>
			<ul class="nav navbar-nav navbar-right" 
			 style="position:relative ;top:20px" >
			
				<%
				//로그인 하기 전 사용자에게 보여줄 컨텐츠
				if(user==null){ %>
					<li style="margin-right: 20px;height: 70px">
					<a href="/erp/emp/login.do"><span class="glyphicon glyphicon-log-in">
							</span>Login</a></li>
					</ul>
				<% } 
				//로그인 성공한 사용자에게 보여줄 컨텐츠
				else { %>
				
			
						<li><a href="/erp/emp/logout.do"><span class="glyphicon glyphicon-log-out"></span>
								Logout</a></li>
					</ul>
					
					<span  class="navbar-form pull-right" >	
						<img  class="img-circle" style="width: 60px;height: 70px"
									src="/erp/images/<%=user.getProfile_photo() %>"/>
					</span>  
				<% } %>
			<form class="navbar-form pull-right" style="position:relative ;top:20px">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				
			</form>
			
		</div>
		
	</div>
	<nav>
	<div class="container-fluid">
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/erp/index.do">Home</a></li>
					<li><a href="/erp/menu/insa.do">업무관리</a></li>
					<li><a href="#">자원관리</a></li>
					<li><a href="/erp/board/list.do?category=all">커뮤니티</a></li>
					<li><a href="#">일정관리</a></li>
					<li><a href="#">휴가관리</a></li>
					<li><a href="#">결재</a></li>
				</ul>

			</div>
		</div>
	</nav>
</body>
</html>