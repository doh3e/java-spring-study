<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<%
		if(session.getAttribute("userid")==null){ /* getAttribute : 직접 속성 집어넣기 */
			response.sendRedirect("07_LoginForm.jsp");
			request.getParameter("password"); /* getParameter : 폼, 쿼리스트링 등 key-value형태로 넘어온 데이터 */
		}else{%>
			<%=session.getAttribute("userid") %>
			
			<!-- <a href="07_Logout.jsp"></a> -->
			<form action="07_Logout.jsp" method="POST">
				<input type="submit" value="로그아웃">
			</form>
			
			<%
		}
	%>			
</body>
</html>