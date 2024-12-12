<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 수정</title>
<style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin-bottom: 10px;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
</style>
</head>
<body>
	<h1>멤버 수정</h1>
	<form action="/update" method="POST">
	    <input type="hidden" name="id" value="${member.id}">
	    
		<table>
	        <tr>
	            <th>이름</th>
	            <td><input type="text" name="name" value="${member.name}" required></td>
	        </tr>
	        <tr>
	            <th>주민등록번호</th>
	            <td><input type="text" name="jumin" value="${member.jumin}" required></td>
	        </tr>
	        <tr>
	            <th>전화번호</th>
	            <td><input type="text" name="phone" value="${member.phone}" required></td>
	        </tr>
	        <tr>
	            <th>주소</th>
	            <td><input type="text" name="address" value="${member.address}"></td>
	        </tr>
	        <tr>
	            <th>프로필 사진</th>
	            <td><input type="text" name="profileImage" value="${member.profileImage}"></td>
	        </tr>
	    </table>
	    
	    <div>
	        <button type="submit">수정</button>
	        <a href="/memberList">취소</a>
	    </div>
	</form>
</body>
</html>