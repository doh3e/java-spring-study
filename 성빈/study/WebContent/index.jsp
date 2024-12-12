<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello World!
	<p>조성빈</p>
	
	<form method="post" action="/Servlet1">
		<span>
			당신의 이름을 입력하세요 :
		</span>
		<input type="text" name="name">
		<input type="submit" value="제출" name="sbm">
	</form>
	
	<br>
	<form method="post" action="/ScoreServlet">
		<span>
			당신의 성적을 입력하세요 :
		</span>
		<br>
		<span>국어 :</span>
		<input type="text" name="lang">
		<br>
		<span>영어 :</span>
		<input type="text" name="eng">
		<br>
		<span>수학 :</span>
		<input type="text" name="math">
		<input type="submit" value="제출" name="score">
	</form>
	
	<!-- 입력값 출력 -->
	<% 
	    String name = request.getParameter("name");
	    if (name != null && !name.isEmpty()) {
	%>
	    <h2>입력한 이름: <%= name %></h2>
	<% } %>
	
	<% 
		String total = request.getParameter("total");
		String avg = request.getParameter("avg");
		String score = request.getParameter("score");
	    if (score != null && !score.isEmpty()) {
	%>
	    <p>합계 : <%= total %></p>
	    <p>평균 : <%= avg %></p>
	    <p>학점 : <%= score %></p>
	<% } %>
</body>
</html>