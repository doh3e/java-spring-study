package com.ssafy.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 구구단
		resp.setContentType("text/html;characterset=URF-8");
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 이름 입력
		doGet(req, resp);
	}
	
	public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String action = req.getParameter("action");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		
		switch (action) {
		case "regist":
			String name = req.getParameter("name");
			out.println("<h3>입력한 이릅</h3>");
			out.println("<p>"+name+"</p>");
			break;
		case "gugu":
			break;
		}
        out.println("</body></html>");
// 왜 얘를 적으면 출력이 안되는??
//        out.close();
	}
	
}
