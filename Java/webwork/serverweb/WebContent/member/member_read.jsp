<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
<% 
	MemberDTO member = (MemberDTO)request.getAttribute("member");	
%>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="" method="POST" 
				name="myform">
				<fieldset>
					<div id="legend">
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					<div class="form-group">
						<!-- 부서코드 -->
						<label class="control-label col-sm-2" for="orgcode">부서코드</label>
						<div class="col-sm-3">
							<%=member.getDeptno()%>
						</div>
					</div>
				
					
					<div class="form-group">
						<!-- 성명-->
						<label class="control-label col-sm-2" for="orgname">성명</label>
						<div class="col-sm-3">
							<%=member.getName()%>

						</div>
					</div>
					<div class="form-group">
						<!-- 사번-->
						<label class="control-label col-sm-2" for="id">사번</label>
						<div class="col-sm-3">
							<%=member.getId()%>
							
						</div>
						<span id="checkVal"></span>
					</div>



				


					
					<div class="form-group">
						<!-- 패스워드-->
						<label class="control-label col-sm-2" for="pass">패스워드</label>
						<div class="col-sm-3">
							<%=member.getPass()%>

						</div>
					</div>
					<div class="form-group">
						<!-- 주소-->
						<label class="control-label col-sm-2" for="addr">주소</label>
						<div class="col-sm-3">
						<%=member.getAddr()%>

						</div>
					</div>
					<div class="form-group">
						<!-- 포인트-->
						<label class="control-label col-sm-2" for="point">포인트</label>
						<div class="col-sm-3">
						<%=member.getPoint()%>

						</div>
					</div>
					<div class="form-group">
						<!-- 등급-->
						<label class="control-label col-sm-2" for="grade">등급</label>
						<div class="col-sm-3">
							<%=member.getGrade()%>

						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="button" value="목록으로 돌아가기" class="btn btn-success" onclick="history.go(-1)"/>
						</div>
					</div>
				</fieldset>
			</form>
			<input type="button" name="btn1" value="btn1">
			<input type="button" name="btn2" value="btn2" disabled>
			<hr>
			<input type="button" name="btn3" value="close btn1" onClick="btn1.disabled=true">
			<input type="button" name="btn4" value="open btn1" onClick="btn1.disabled=false">
			<canvas></canvas>		
	</div>
</body>
</html>