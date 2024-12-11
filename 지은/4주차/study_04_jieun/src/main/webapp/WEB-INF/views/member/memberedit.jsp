<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>${ member.id }번 회원 정보 수정</h3>

<form action="editsave" method="POST" enctype="multipart/form-data">
  <table border="1">
    <tr>
      <th>이름</th>
      <td>
      	<input type="hidden" name="id" value="${member.id}">
        <input type="text" name="name" required value="${ member.name }">
      </td>
    </tr>
    <tr>
      <th>주민번호</th>
      <td>
        <input type="text" name="jumin" placeholder="${ member.jumin }" required value="${ member.jumin }">
      </td>
    </tr>
    <tr>
      <th>휴대폰번호</th>
      <td>
        <input type="text" name="phone" placeholder="${ member.phone }" required value="${ member.phone }">
      </td>
    </tr>
    <tr>
      <th>주소</th>
      <td>
        <input type="text" name="address" placeholder="${ member.address }" required value="${ member.address }">
      </td>
    </tr>
    <tr>
      <th>프로필사진</th>
      <td>
        <input type="file" name="profile_image" accept="image/*">
        <input type="hidden" name="currentProfileImage" value="${member.profileImage}">
      </td>
    </tr>
  </table>
  <br>
  <button type="submit">수정하기</button>
</form>
<br>
<hr>
<a href="memberlist"><button>회원목록</button></a>
<a href="/"><button>메인으로</button></a>
</body>
</html>