<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 입력</title>
</head>
<body>
	<h1>멤버 입력하기</h1>
	<form action="/register" method="POST">
		<label for="name">이름: </label>
		<input type="text" id="name" name="name"><br>
		
		<label for="jumin">주민등록번호: </label>
		<input type="text" id="jumin" name="jumin" placeholder="012345-0123456"><br>
		
		<label for="phone">연락처: </label>
		<input type="text" id="phone" name="phone" placeholder="010-1234-5678"><br>
		
		<label for="address">주소: </label>
		<input type="text" id="address" name="address"><br>
		
		<label for="profileImage">프로필사진: </label>
		<input type="text" id="profileImage" name="profileImage"><br>
	
		<button>등록</button>
	</form>
</body>
</html>