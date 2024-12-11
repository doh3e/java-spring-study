<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>사용자 정보 입력</h3>

<form action="inputsave" method="POST" enctype="multipart/form-data">
  <table border="1">
    <tr>
      <th>이름</th>
      <td>
        <input type="text" name="name" required>
      </td>
    </tr>
    <tr>
      <th>주민번호</th>
      <td>
        <input type="text" name="jumin" placeholder="예: 000101-1234567" required>
      </td>
    </tr>
    <tr>
      <th>휴대폰번호</th>
      <td>
        <input type="text" name="phone" placeholder="예: 010-1234-5678" required>
      </td>
    </tr>
    <tr>
      <th>주소</th>
      <td>
        <input type="text" name="address" required>
      </td>
    </tr>
    <tr>
      <th>프로필사진</th>
      <td>
        <input type="file" name="profile_image" accept="image/*">
      </td>
    </tr>
  </table>
  <br>
  <button type="submit">제출하기</button>
</form>
<a href="/"><button>메인으로</button></a>
</body>
</html>