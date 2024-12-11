<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>상품확인</h3>
<table border="1">
  <tr>
    <th>상품명</th>
    <td>${ pname }</td>
  </tr>
  <tr>
    <th>카테고리</th>
    <td>${ pcategory }</td>
  </tr>
  <tr>
    <th>가격</th>
    <td>${ price }</td>
  </tr>
  <tr>
    <th>상품사진</th>
    <td>
      <img src="${pageContext.request.contextPath}/user_image/${filename}" alt="업로드된 이미지" width="200">
    </td>
  </tr>
</table>
<a href="/"><button>메인으로</button></a>
</body>
</html>