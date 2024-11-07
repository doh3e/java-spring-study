<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- JSP 페이지 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02-1_my_name_is.jsp</title>
</head>
<body>
	<h2>이름 입출력 페이지</h2>

    <% // 스크립트립 JSP 태그 : JAVA 코드 작성 
        String name = request.getParameter("name"); // 폼에서 name 파라미터 받아서 새 name 변수에 저장
        if (name == null || name.isEmpty()) { // null이거나(파라미터가 전달되지 않거나) 비었다면, 입력 폼 표시 
    %> <!-- 도중에 연결 끊어서 HTML 효과 -->
    
        <!-- 입력 폼 -->
        <form action="02-1_my_name_is.jsp" method="get">
            <label>이름: <input type="text" name="name" required></label>
            <button type="submit">제출</button>
        </form>
    <%
        } else {
        	// 출력 부분
    		out.print("이름 : " + name);
        }
    %>
    	<br>
        <a href="index.jsp">메인으로 이동</a>

</body>
</html>