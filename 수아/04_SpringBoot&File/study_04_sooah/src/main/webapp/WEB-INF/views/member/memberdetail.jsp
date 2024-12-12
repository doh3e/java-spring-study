<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 상세</title>
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
	<h1>멤버 상세 정보 조회하기</h1>
	<table>
        <tr>
            <th>이름</th>
            <td>${member.name}</td>
        </tr>
        <tr>
            <th>주민등록번호</th>
            <td>${member.jumin}</td>
        </tr>
        <tr>
            <th>나이</th>
            <td>${member.age}</td>
        </tr>
        <tr>
            <th>전화번호</th>
            <td>${member.phone}</td>
        </tr>
        <tr>
            <th>주소</th>
            <td>${member.address}</td>
        </tr>
        <tr>
            <th>프로필 사진</th>
            <td><img src="${member.profileImage}" alt="프로필 사진" style="max-width: 200px;"></td>
        </tr>
    </table>
    
    <div>
    	<form action="/delete?id=${member.id}" method="POST">
    		<button>삭제</button>
    	</form>
	    <a href="updatemember?id=${member.id}">수정</a><br>
	    <a href="/memberList">목록으로 돌아가기</a>
    </div>
</body>
</html>