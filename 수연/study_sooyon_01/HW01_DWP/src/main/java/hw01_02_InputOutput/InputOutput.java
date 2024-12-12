package hw01_02_InputOutput;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InputOutput
 */
@WebServlet("/InputOutput")
public class InputOutput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;characterset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write("""
		<html>
			<body>
				<form action="InputOutput" method="POST">
					<input type="hidden" name="action" value="regist">
					<label>이름 : </label>
					<input type="text" placeholder="이름을 입력하세요." name="name"><br>
				</form>
			</body>
		</html>
				""");
		doProcess(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
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

		}
        out.println("</body></html>");
// 왜 얘를 적으면 출력이 안되는??
//        out.close();
	}

}
