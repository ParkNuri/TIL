<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- layout에서만 해도 됨 
페이지별로 버전이 다르면 에러나서 페이지가 안 뜰수 잇음 -->
  <link rel="stylesheet" href="/erp/resources/common/css/main.css" />
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
	<div>
		<!-- 여기에 top을 연결하세요 -->
		<tiles:insertAttribute name="top"></tiles:insertAttribute>
	</div>
	<div style="background-color: #edeef1;padding: 20px;height: 800px" id="main">
		<!-- 여기에 mainContent를 연결하세요 -->
		<tiles:insertAttribute name="content"></tiles:insertAttribute>
	</div>
</body>
</html>