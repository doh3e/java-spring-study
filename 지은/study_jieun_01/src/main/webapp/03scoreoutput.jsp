<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>당신의 성적은</h1>
<table>
<tr>
<th>이름</th>
<td>${name}</td>
</tr>
<tr>
<th>국어</th>
<td>${kor}</td>
</tr>
<tr>
<th>영어</th>
<td>${eng}</td>
</tr>
<tr>
<th>수학</th>
<td>${mat}</td>
</tr>
<tr>
<th>총점</th>
<td>${tot}</td>
</tr>
<tr>
<th>평균</th>
<td>${avg}</td>
</tr>
<tr>
<th>학점</th>
<td>${hak}</td>
</tr>
</table>

</body>
</html>