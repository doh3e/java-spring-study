<!-- NOTE 1) HTML 관련 
	-. label 클릭 시, input 선택되게 하려면
		i. input태그를 label 태그로 감싸기
		ii. label, input 태그를 각각 작성하고 for속성 부여하기  
 -->
<!-- NOTE 2) HTTP Method
	-. 소문자로 작성 
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_my_name_is.jsp</title>
</head>
<body>
	<h2>이름 입력 페이지</h2>
	
	<!-- 입력 폼 -->
	
	<form action="02_my_name_is_output.jsp" method="get">
		<label for="name">이름 : </label>
		
		<!-- 사용자 입력 -->
		<input type="text" id="name" name="name" required>  
		
		<button type="submit">제출</button>
	</form>
</body>
</html>