

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScoreServlet
 */
@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreServlet() {
        super();
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
		// TODO Auto-generated method stub
		int lang = Integer.parseInt(request.getParameter("lang"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int total1 = lang + eng + math;
		int avg1 = total1 / 3;
		String score;
		if (avg1 >= 90) {
			score = "A";
		} else if (avg1 >= 80) {
			score = "B";
		} else if (avg1 >= 70) {
			score = "C";
		} else if (avg1 >= 60) {
			score = "D";
		} else {
			score = "F";
		}
		String total = Integer.toString(total1);
		String avg = Integer.toString(avg1);
		// 쿼리 파라미터로 데이터를 포함해 리다이렉트
		response.sendRedirect("/index.jsp?score=" + URLEncoder.encode(score, "UTF-8") + "&total=" + URLEncoder.encode(total, "UTF-8") + "&avg=" + URLEncoder.encode(avg, "UTF-8"));
		
	}

}
