<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02input</title>
</head>
<body>
<h1><b>이름을 입력해주세요.</b></h1>
<form action="02output.jsp" method="POST">
<label for="name">당신의 이름은?</label>
<input type="text" id="name" name="name">
<br>
<input type="submit" value="제출">
</form>
</body>
</html>