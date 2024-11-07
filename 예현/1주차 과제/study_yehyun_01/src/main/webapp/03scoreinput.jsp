<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>성적을 입력하세요.</h1>
<form action="03scoreoutput.jsp" method="POST">
<label for="Korean">국어 성적:</label>
<input type="number" id="국어" name="Korean">
<hr>
<label for="English">영어 성적:</label>
<input type="number" id="영어" name="English">
<hr>
<label for="Math">수학 성적:</label>
<input type="number" id="수학" name="Math">
<hr>
<input type="submit" value="제출">
</form>
</body>
</html>