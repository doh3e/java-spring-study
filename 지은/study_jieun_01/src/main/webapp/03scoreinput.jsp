<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>성적 입력하기</h1>
<form action="score" method="POST">
<table>
<tr>
	<th>이름</th>
	<th>국어</th>
	<th>영어</th>
	<th>수학</th>
</tr>
<tr>
	<td><input type="text" name="name"></td>
	<td><input type="number" name="kor"></td>
	<td><input type="number" name="eng"></td>
	<td><input type="number" name="mat"></td>
</tr>
</table>
<input type="submit" value="입력하기">
</form>
</body>
</html>