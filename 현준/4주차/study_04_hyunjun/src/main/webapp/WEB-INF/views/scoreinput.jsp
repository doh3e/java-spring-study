<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Score Input</title>
</head>
<body>
	<h2>점수를 입력하세요</h2>
	<form action="/scoreoutput" method="POST">
		이름 : <input type="text" name="name">
		국어 : <input type="text" name="lang">
		영어 : <input type="text" name="eng">
		수학 : <input type="text" name="math">
		<button type="submit">등록</button>
	
	</form>


</body>
</html>