<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Score Form</title>
</head>
<body>
	<form action="/score-result" method="POST">
	이름 : <input type="text", name="name"><br><br>
	국어 : <input type="number" name="korean"><br><br>
	영어 : <input type="number" name="english"><br><br>
	수학 : <input type="number" name="math"><br><br>
	<button>제출</button>
	</form>
</body>
</html>