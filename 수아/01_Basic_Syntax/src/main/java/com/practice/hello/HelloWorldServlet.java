package com.practice.hello; // 패키지 선언: com.practice.hello라는 패키지에 HelloWorldServlet 클래스를 포함

import jakarta.servlet.ServletException; 		 // 서블릿에서 발생하는 예외를 처리하기 위한 클래스
import jakarta.servlet.http.HttpServlet; 	 	 // HttpServlet을 상속받아 HTTP 요청을 처리
import jakarta.servlet.http.HttpServletRequest;  // HTTP 요청 정보를 담은 객체로, 클라이언트가 보낸 데이터를 서블릿이 처리할 수 있게 함 
import jakarta.servlet.http.HttpServletResponse; // HTTP 응답 정보를 담은 객체로, 서블릿이 클라이언트에게 보낼 데이터를 설정할 수 있음 
import java.io.IOException;						 // 입출력 오류가 발생할 때 던져지는 예외
import java.io.PrintWriter;	 					 // 텍스트 데이터를 출력하기 위한 클래스입니다. response 객체에서 가져와 클라이언트에게 데이터를 보낼 수 있음 

public class HelloWorldServlet extends HttpServlet { // 서블릿 클래스 선언: HelloWorldServlet이라는 서블릿 클래스를 선언하며, HttpServlet 클래스를 상속받아 HTTP 요청과 응답을 처리
	private static final long serialVersionUID = 1L; // 직렬화 ID 선언
	// 서블릿 클래스는 직렬화 가능해야 함 
	// serialVersionUID는 직렬화된 객체의 버전을 표시하는 값
	// 1L은 이 서블릿의 고유 버전
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doGet 메서드 : 클라이언트가 GET 요청을 보냈을 때 호출
		// HttpServletRequest 객체 : 요청 정보
		// HttpServletResponse 객체 : 응답 정보
		// 예외 처리 : ServletException, IOException을 던질 수 있음
		
		response.setContentType("text/html; charset=UTF-8"); // 응답 타입 설정
		// 클라이언트에게 보낼 응답의 MIME 타입, 문자 인코딩을 설정
		// text/html : HTML 형식의 응답
		// charset=UTF-8 : UTF-8 인코딩 사용
		//// MIME 타입 (Multipurpose Internet Mail Extensions Type)
		//// -. 파일 or 네트워크를 통해 전송되는 데이터의 형식을 지정하기 위한 표준 형식
		//// -. 브라우저가 응답 데이터를 어떻게 처리해야 할지 결정
		//// -. 구분 : 타입(text, image, application, ...) / 서브타입(html, jpeg, json, ...)
        
		// 방식1 ) 간단한 문자열 응답 
		response.getWriter().println("Hello, World!");
        // response.getWriter() : 클라이언트로 데이터를 전송할 수 있는 PrintWriter 객체를 가져옴 
		//// PrintWriter 객체 
		//// -. Java에서 텍스트 데이터를 출력할 때 사용하는 객체
		//// -. HttpServletResponse 객체에서 제공
		
		// ----------------------------------------------------------------
		
        // 방식2 ) PrintWriter 객체 사용 
		PrintWriter writer = response.getWriter();
		writer.write("""
			<html>
				<head><title>Hello!</title></head>
				<body>
					<h1>Hello, World!</h1>
				</body>
			</html>
			""");
		// write 메서드 : HTML 형식의 문자열을 작성,  출력
		// """ : Java 13부터 사용 가능한 텍스트 블록 
		
		writer.close(); // 출력 스트림 닫기 
		// PrintWriter 객체를 닫아 출력 스트림을 종료
		// 출력이 완료된 후에는 스트림을 닫는 것 권장
		//// 출력스트림 (Output Stream)
		//// -. 프로그램에서 외부로 데이터를 출력하기 위한 통로
		//// -. 다양한 대상(파일, 네트워크 소켓, 클라이언트 응답 등)으로 데이터를 보낼 수 있음 
    	}
	}