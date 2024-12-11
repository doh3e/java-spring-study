<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
<style>
  table {
    width: 50%;
    border-collapse: collapse;
    margin-top: 20px;
  }
  th, td {
    border: 1px solid #ccc;
    padding: 10px;
    text-align: center;
  }
  th {
    background-color: #f2f2f2;
  }
  img {
  	object-fit: cover;
  }
</style>
</head>
<body>
<h3> ${ member.id }번 회원 정보</h3>
<table>
	<tr>
		<th colspan="2">이름</th>
	</tr>
	<tr>
		<td colspan="2">${ member.name }</td>
	</tr>
	<tr>
		<th colspan="2">프로필사진</th>
	</tr>
	<tr>
		<td colspan="2"><img src="${pageContext.request.contextPath}/user_image/${ member.profileImage }" alt="업로드된 이미지" width="100%"></td>
	</tr>
	<tr>
		<th>주민번호</th><th>나이</th>
	</tr>
	<tr>
		<td>${ member.jumin }</td><td>${ member.age }세</td>
	</tr>
	<tr>
		<th colspan="2">전화번호</th>
	</tr>
	<tr>
		<td colspan="2">${ member.phone }</td>
	</tr>
	<tr>
		<th colspan="2">주소</th>
	</tr>
	<tr>
		<td colspan="2">${ member.address }</td>
	</tr>
</table>
<a href="memberedit?id=${ member.id }"><button>회원수정</button></a>
<a href="memberdelete?id=${ member.id }"><button>회원삭제</button></a>
<a href="memberlist"><button>목록보기</button></a>
<a href="/"><button>메인으로</button></a>
</body>
</html>