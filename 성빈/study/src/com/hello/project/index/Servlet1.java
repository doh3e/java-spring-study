package com.hello.project.index;

import java.io.*;
import java.net.URLEncoder;

//import javax.servlet.*;
//import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청과 응답의 인코딩 설정
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		// 클라이언트로부터 전달받은 값 처리
		String name = request.getParameter("name");

//		// HTML 응답 출력
//		PrintWriter out = response.getWriter();
//		out.print("<h1>" + name + "</h1>");
		
//		request.setAttribute("name", name);
//		// 원래 페이지(index.jsp)로 포워딩
//		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		// 쿼리 파라미터로 데이터를 포함해 리다이렉트
		response.sendRedirect("/index.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
	}

}
