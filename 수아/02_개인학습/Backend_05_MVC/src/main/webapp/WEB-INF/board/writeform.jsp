<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<h2>게시글 등록</h2>
	<form action="board" method="POST">
		<input type="hidden" name="action" value="write">
		<div>
			글제목 : <input type="text" name="title">
		</div>
		<div>
			글쓰니 : <input type="text" name="writer" value="익명">
		</div>
		<div>
			글내용 : <textarea type="text" name="content"></textarea>
		</div>
		<div>
			버튼 : <input type="submit" name="게시글 등록">
		</div>
	</form>
</body>
</html>