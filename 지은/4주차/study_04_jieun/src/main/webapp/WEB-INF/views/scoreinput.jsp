<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="scoreoutput" method="POST">
<table>
  <tr>
    <th>이름</th>
    <td>
      <input type="text" name="name">
    </td>
  </tr>
  <tr>
    <th>국어</th>
    <td>
      <input type="number" name="kor">
    </td>
  </tr>
  <tr>
    <th>영어</th>
    <td>
      <input type="number" name="eng">
    </td>
  </tr>
  <tr>
    <th>수학</th>
    <td>
      <input type="number" name="mat">
    </td>
  </tr>
</table>

<button>입력</button>
</form>
<a href="/"><button>메인으로</button></a>
</body>
</html>