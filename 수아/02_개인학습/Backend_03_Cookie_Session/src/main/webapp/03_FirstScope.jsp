<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본객체</title>
</head>
<body>
	<%
		pageContext.setAttribute("name", "page soo");
		request.setAttribute("name", "request soo");
		session.setAttribute("name", "session soo");
		application.setAttribute("name", "application soo");
		
		System.out.println("페이지 속성 " + pageContext.getAttributesScope("name"));
		System.out.println("요청 속성 " + request.getAttribute("name"));
		System.out.println("세션 속성 " + session.getAttribute("name"));
		System.out.println("어플리케이션 속성 " + application.getAttribute("name"));
		
		request.getRequestDispatcher("04_SecondScope.jsp").forward(request, response); // 04_SecondScope페이지로 
	%>

</body>
</html>