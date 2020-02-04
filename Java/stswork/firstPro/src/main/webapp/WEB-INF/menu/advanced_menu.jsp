<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="list-group"> 
		<a href="/annotation/view/ajaxtest"	class="list-group-item">ajax테스트</a> 
		<a href="/annotation/view/ajaxboard"	class="list-group-item">ajax게시판목록</a> 
		<a href="/annotation/view/upload" class="list-group-item">파일업로드</a>
		<a href="/annotation/view/i18ntest" class="list-group-item">다국어지원</a>
		<a href="/annotation/view/transinsertView.do" class="list-group-item">트랜잭션처리</a>
		<a href="/annotation/advanced/testCookie.do?id=jang" 
							class="list-group-item">쿠키테스트</a>

		<a href="/annotation/advanced/i18ntest.do?lang=ko">한국어</a>&nbsp;&nbsp;&nbsp;
		<a href="/annotation/advanced/i18ntest.do?lang=en">영어</a>&nbsp;&nbsp;&nbsp;
		<a href="/annotation/advanced/i18ntest.do?lang=jp">일본어</a>&nbsp;&nbsp;&nbsp;
	</div>
</body>
</html>