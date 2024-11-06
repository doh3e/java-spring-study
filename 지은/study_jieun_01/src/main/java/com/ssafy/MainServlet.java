package com.ssafy;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("*.do")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MainServlet() {
        super();
        
    }


	public void init(ServletConfig config) throws ServletException {
		
	}


	public void destroy() {
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String method = request.getMethod();
		
	if ("GET".equalsIgnoreCase(method)) {
		doGet(request, response);
	} else if ("POST".equalsIgnoreCase(method)) {
		doPost(request, response);
	} else if ("PUT".equalsIgnoreCase(method)) {
	    doPut(request, response);
	} else if ("DELETE".equalsIgnoreCase(method)) {
	    doDelete(request, response);
	}
	
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    String requestURI = request.getRequestURI();
	    String contextPath = request.getContextPath();
	    String command = requestURI.substring(contextPath.length());

	    if (command.equals("/input.do")) {
	      request.getRequestDispatcher("02input.jsp").forward(request, response);
	    }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    String requestURI = request.getRequestURI();
	    String contextPath = request.getContextPath();
	    String command = requestURI.substring(contextPath.length());

	    if (command.equals("/output.do")) {
	      String name = request.getParameter("name");
	      request.setAttribute("name", name);
	      request.getRequestDispatcher("02output.jsp").forward(request, response);
	    }
	}

}
