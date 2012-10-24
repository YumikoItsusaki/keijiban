package keijiban;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.itacademy.samples.web.mvc.counter.Counter;

/**
 * Servlet implementation class KeijibanServlet
 */
@WebServlet("/KeijibanServlet")
public class KeijibanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KeijibanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>keijiban</title>");
		
		String toukou = req.getParameter("comment");
		
		ServletContext context = getServletContext();
		String s = (String)context.getAttribute("comments");
		
		
		if (s == null){
			s = ""; // âΩÇë„ì¸Ç∑ÇÈÇÃÅH
			context.setAttribute("comments" , s);
		}
		
		
		out.println(toukou);
	}

}
