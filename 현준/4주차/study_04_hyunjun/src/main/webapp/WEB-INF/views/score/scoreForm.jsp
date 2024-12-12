<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ScoreForm</title>
</head>
<body>
	<h1>입력</h1>
	<form action="/scoreinput" method="POST">
		이름 : <input type="text" name="name">
		국어 : <input type="text" name="lang">
		영어 : <input type="text" name="eng">
		수학 : <input type="text" name="math">
		<button>등록</button>
	
	</form>
</body>
</html>