<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Input</title>
</head>
<body>
	<h1>Product Input</h1>
	<form action="/productInput" method="POST" enctype="multipart/form-data">
	<label for="name">상품명</label>
	<input type="text" id="name" name="name"><br>
	<label for="price">가격</label>
	<input type="number" id="price" name="price"><br>
	<label for="category">카테고리</label>
	<select id="category" name="category">
		<option value="landscape">풍경</option>
	    <option value="portrait">인물</option>
    	<option value="animal">동물</option>
	    <option value="astro">천체</option>
	    <option value="etc" selected="selected">기타</option>
	</select><br>
	<label for="files">파일</label>
	<input type="file" id="files" name="files" multiple="multiple"><br>
	<button>제출</button>
	</form>
</body>
</html>