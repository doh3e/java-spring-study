<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
int count1 = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_count.jsp</title>
</head>
<body>
<%
	int count2 = 0;
	out.print("count1: "+(count1++)+"<br>"); // 새로고침 할 때마다 올라
	out.print("count2: "+(count2++)+"<br>"); // 새로고침 해도 올라가지 않음 
	// => servlet의 lifecycle과 연
%>
	<a href="index.html">홈으로</a>

</body>
</html>