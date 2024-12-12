package hw01_01_Hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;characterset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write("""
		<html>
			<body>
				<h1>과제 1. Hello, World!</h1>
				<hr>
				<h2>Hello, World!</h2>
				<h3>Let's play JAVA!</h3>
			</body>
		</html>
				""");
	}


}
