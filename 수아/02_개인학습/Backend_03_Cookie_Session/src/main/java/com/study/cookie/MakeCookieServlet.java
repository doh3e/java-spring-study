package com.study.cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/make")
public class MakeCookieServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		String value = req.getParameter("value");
		System.out.println(key);
		
		// 쿠키 생성 
	    Cookie cookie = new Cookie(key, value);

		
		// 유효시간 결정 : [단위 : 초]
		cookie.setMaxAge(60);  // 1분
		
		resp.addCookie(cookie);
		resp.sendRedirect(req.getContextPath()+"/02_CookieResult.jsp"); // 쿠키 싣고 지정한 jsp파일로 반환 
	}
	
	// 쿠키 삭제 예시  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		
		for(Cookie c: req.getCookies())
			if(c.getName().equals(name)) {
				c.setMaxAge(0); // 유효기간 지움
			}
	}
}
