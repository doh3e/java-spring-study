package hw01_03_Score;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Score")
public class Score extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;characterset=UTF-8");
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
		int total = 0;
		String score1 = req.getParameter("score1");
		int total1 = add(total, score1);
		
		String score2 = req.getParameter("score2");
		int total2 = add(total1, score2);
		
		String score3 = req.getParameter("score3");
		int total3 = add(total2, score3);
//		out.println(total3/3);
		
		int mean = total3/3;
		String result = score(mean);
		
		out.println("""
				<table>
					<tr>
						<td>국어</td>
						<td>영어</td>
						<td>수학</td>
					</tr>
					""");
		out.println("<tr><td>"+score1+"</td><td>"+score2+"</td><td>"+score3+"</td></tr></table>");
		out.println("<br>");
		
		out.println("평균 성적 : "+result);
		out.println("</body></html>");
		
		

		}
	

	public static String score(int num) {
		if (num>=90) {
			String result = "A";
			return result;
		} else if (num>=80) {
			String result = "B";
			return result;
		} else if (num>=70) {
			String result = "C";
			return result;
		} else if (num>=60) {
			String result = "D";
			return result;
		} else {
			String result = "F";
			return result;
		}
	}
	public static int add(int num1, String num2) {
		int num = Integer.parseInt(num2);
		int result = num1 + num;
		return result;
	}
	
}
