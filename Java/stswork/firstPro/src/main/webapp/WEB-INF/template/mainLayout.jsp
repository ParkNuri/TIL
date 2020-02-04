<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
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
		<div id="top" class="row">
			<!-- tiles설정 파일에 등록한 영역을 연결
			   name속성에 설정 파일에서 등록한 영역의 이름을 설정 -->
			<tiles:insertAttribute name="top"></tiles:insertAttribute>
	
		</div>
		<div style="background-color: #edeef1;padding: 20px;height: 800px">
		
			<div class="row" style="margin-left: auto;margin-right: auto;">
			 	<div class="col-sm-3" 
			 	style="background-color: white;margin-right:10px;padding: 0px ">
			 		 <div
			 		 style="border-color:white;height: 800px;">
				        <div style="background-color:#63cde7;padding: 20px;
				        font-family:HY-견고딕;font-size: 16pt;color: white;
				         font-weight: bolder;"></div>
						<tiles:insertAttribute name="menu"></tiles:insertAttribute>
      				 </div>
			 	</div>
			 	<div class="col-sm-8" style="background-color: white;height: 800px;">
					<tiles:insertAttribute name="content"></tiles:insertAttribute>
			 	</div>
			</div>
	</div>
</body>
</html>









