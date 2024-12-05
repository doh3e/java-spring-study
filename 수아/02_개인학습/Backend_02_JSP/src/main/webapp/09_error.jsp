<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> <!-- 에러 페이지로 지정  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>09_error.jsp</title>
</head>
<body>
	<h2>오류가 났을 때 오는 페이지</h2>
	<%=exception.getMessage() %>
	<a href="index.html">홈으로</a>
</body>
</html>