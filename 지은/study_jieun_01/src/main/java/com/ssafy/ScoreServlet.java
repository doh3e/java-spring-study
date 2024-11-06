package com.ssafy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/score")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ScoreServlet() {
        super();
        
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
		request.getRequestDispatcher("03scoreinput.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		int tot = kor+eng+mat;
		float avg = Math.round((tot / 3.0f) * 10) / 10.0f;
		String hak = "";
		if(avg >= 90) {
			hak = "A";
		}
		else if(avg >= 80) {
			hak = "B";
		}
		else if(avg >= 70) {
			hak = "C";
		}
		else if(avg >= 60) {
			hak = "D";
		}
		else {
			hak = "F";
		}
		
		request.setAttribute("name", name);
		request.setAttribute("kor", kor);
		request.setAttribute("eng", eng);
		request.setAttribute("mat", mat);
		request.setAttribute("tot", tot);
		request.setAttribute("avg", avg);
		request.setAttribute("hak", hak);
		request.getRequestDispatcher("03scoreoutput.jsp").forward(request, response);
	}


}
 