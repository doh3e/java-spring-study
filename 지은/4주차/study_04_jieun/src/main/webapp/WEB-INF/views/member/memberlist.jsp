<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberlist</title>
<style>
  table {
    width: 100%;
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
</style>
</head>
<body>
<h3>회원 목록</h3>

<table>
  <thead>
    <tr>
      <th>ID</th>
      <th>이름</th>
      <th>나이</th>
      <th>전화번호</th>
      <th>주소</th>
      <th>기능</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="member" items="${ members }">
      <tr>
        <td>${ member.id }</td>
        <td><a href="memberdetail?id=${ member.id }">${ member.name }</a></td>
        <td>${ member.age }</td>
        <td>${ member.phone }</td>
        <td>${ member.address }</td>
        <td>
        <a href="memberedit?id=${ member.id }"><button>수정</button></a>
        <form action="memberdelete?id=${ member.id }" method="POST">
        	<button>삭제</button>
        </form>
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>
<a href="/"><button>메인으로</button></a>
<a href="memberinput"><button>회원추가</button></a>
</body>
</html>