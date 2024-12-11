<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>상품입력</h3>

<form action="productoutput" method="POST" enctype="multipart/form-data">

<table>

<tr>
	<th>상품명</th>
	<td>
	<input type="text" name="pname">
	</td>
</tr>
<tr>
	<th>가격</th>
	<td>
	<input type="number" name="price">
	</td>
</tr>
<tr>
	<th>카테고리</th>
	<td>
	<select name="category">
		<option value="book">책</option>
		<option value="stationery">문구</option>
		<option value="music">음반</option>
	</select>
	</td>
</tr>
<tr>
	<th>상품사진</th>
	<td>
	<input type="file" name="pfile">
	</td>
</tr>

</table>

<button>입력하기</button>

</form>
<a href="/"><button>메인으로</button></a>
</body>
</html>