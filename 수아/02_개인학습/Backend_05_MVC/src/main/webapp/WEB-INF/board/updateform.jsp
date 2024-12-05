<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<h2>게시글 수정</h2>
	<form action="board" method="POST">
		<input type="hidden" name="action" value="update">
		<input type="hidden" name="id" value="${board.id}">
		<div>
			글제목 : <input type="text" name="title" value="${board.title}">
		</div>
		<div>
			글쓰니 : <input type="text" name="writer" value="${board.writer}">
		</div>
		<div>
			글내용 : <textarea type="text" name="content">${board.content}</textarea>
		</div>
		<div>
			버튼 : <input type="submit" name="게시글 수정">
		</div>
	</form>
</body>
</html>