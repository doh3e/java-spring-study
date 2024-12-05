<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 화면을 보여주지 않을 것 -> HTML코드 불필요
	
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
	// id, pw를 이용해서 실제 유저인지 확인 필요
	
	// 1. DB 활용
	
	// 2. Manager를 이용해서 유저 목록을 관리
	
	// 3. (임시) 조건문으로 확인 
	if("soo".equals(id) && "1234".equals(pw)){
		// 로그인 성공 (session에 저장)
		
		// a. JSP에서는
		// session이라는 기본객체가 있음 
		session.setAttribute("userid", id);
		
		// b. Servlet에서는 
		// 1. 쿠키목록을 전부 가져와서 
		// 2. JSESSIONID 이름을 가진 쿠키가 있는 지 확인하고
		// 3. 해당 쿠키를 이용하여 세션ID를 확보
		// 4. 가지고
		HttpSession mySession = request.getSession();
		
		// Main.jsp로 페이지 이동 (리다이렉트가 더 적합한 상황임.)
		// i. 리다이렉트
		// - request영역에 데이터를 넣어둠 -> 리다이렉트 하는 순간 데이터 소실 
		// - request보다 큰 영역인 session에 데이터를 넣어둠 -> 리다이렉트해도 쿠키 데이터 소실 없음, pw는 전달안됨(요청객체에 포함되어 있기 때문) 
		response.sendRedirect("08_Main.jsp");
		// ii. 포워딩
		// - request에는 id, pw같은 민감한 정보들이 포함되어 있음 -> request.getParameter() 로 조회 가능해지는 문제 
/* 		request.getRequestDispatcher("08_Main.jsp").forward(request, response);
 */		
		
	}else {
		// 로그인 실패 
		response.sendRedirect("07_LoginForm.jsp");
	}
%>