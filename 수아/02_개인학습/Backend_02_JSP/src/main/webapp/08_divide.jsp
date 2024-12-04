<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page errorPage="09_error.jsp" %> <!-- 오류났을 때 09 페이지를 렌더링 함 (이동x)  -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>08_divide.jsp</title>
</head>
<body>
	
	<h2>정수를 0으로 나누어 보자</h2>
	<%= 2 / 0 %>
	<a href="index.html">홈으로</a>


</body>
</html>