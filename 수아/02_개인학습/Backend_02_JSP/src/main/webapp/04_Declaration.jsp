<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 아무곳에나 써도 상관 없음  -->
<%!
	int A = 10; 
	int B = 20; 
	
	String name = "SSAFY";
	
	public int add(int A, int B){
		return A + B;
	}
	
	public int abs(int A){
		return A > 0 ? A : -A;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_Declaration.jsp</title>
</head>
<body>
	<%
		int C = 10; 
		out.print(add(A, B));
		out.print("<br>");
		
		int D = -10;
		out.print(abs(C));
		out.print("<br>");
	%>
	<a href="index.html">홈으로</a>

</body>
</html>