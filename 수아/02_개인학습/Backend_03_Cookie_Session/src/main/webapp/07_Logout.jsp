<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<!-- 로그아웃하기 -->
	<%session.removeAttribute("userid"); %> <!-- 방식1. 세션 내 속성 지우기 -->
	<%-- <%session.invalidate(); %> --%><!-- 방식2. 세션 자체를 없애기 -->
	
	<script>
		alert("로그아웃");
		location.href="index.html";
	</script>
</body>
</html>