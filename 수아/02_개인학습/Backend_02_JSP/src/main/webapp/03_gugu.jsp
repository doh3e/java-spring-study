<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_gugu.jsp</title>
</head>
<body>
	<h2>구구단</h2>
	<!-- 줄 바꾸기 방식1 ) -->
	<%
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <= 9; j++) {
				out.print(i + "*" + j + "=" + (i * j)); //한 줄로 출력됨 (줄바꿈 안됨)
				out.print("<br/>"); // 줄바꿈 
			}
		}
	%>
	<!-- 줄 바꾸기 방식2 ) -->
	<!-- servlet으로 변환된 결과는 동일 -->
	<%
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <= 9; j++) {
				out.print(i + "*" + j + "=" + (i * j)); //한 줄로 출력됨 (줄바꿈 안됨)
				%> <!-- 중간에 끊어줌 -->
				<br>
				
				<%
			}
		}
	%>
	<a href="index.html">홈으로</a>
	
</body>
</html>