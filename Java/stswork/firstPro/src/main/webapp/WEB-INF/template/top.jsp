<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="/annotation/resources/common/css/main.css" />
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
	
	<div style="height:90px" style="padding:10px">
		<div id="toparea"  class="navbar navbar-inverse">
			<a href="#" style="position:absolute;top:30px;font-size: 18pt; font-weight: bolder;text-decoration: none;padding-left: 10px">Spring연습</a>
			<ul class="nav navbar-nav navbar-right" 
			 style="position:relative ;top:20px" >
					<li style="margin-right: 20px;height: 70px">
						<a href="/annotation/view/emp/loginView.do"><span class="glyphicon glyphicon-log-in">
							</span>Login</a></li>
					<li style="margin-right: 20px;height: 70px"><a href="/annotation/emp/logout.do"><span class="glyphicon glyphicon-log-out"></span>
								Logout</a></li>
			</ul>
					
			
				
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
					<li class="active"><a href="/firstPro/exam/index.do">Home</a></li>
					<li><a href="/firstPro/menu/jdbc.do">스프링JDBC</a></li>
					<li><a href="/firstPro/menu/mybatis.do">myBatis</a></li>
					<li><a href="/firstPro/menu/advanced.do">고급기능</a></li>
					
				</ul>

			</div>
		</div>
	</nav>
</body>
</html>