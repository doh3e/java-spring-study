<!-- NOTE 1 ) JSP 태그
    -. 표현식 "< % = % >" 은 문자열 형태로 출력
-->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_my_name_is_output.jsp</title>
</head>
<body>
	<h2>이름 출력 페이지</h2>
	
	<!-- 출력 폼 -->
	
	<p>이름 : <%= request.getParameter("name") %></p> 
	
	<a href="index.jsp">메인으로 이동</a>
</body>
</html>