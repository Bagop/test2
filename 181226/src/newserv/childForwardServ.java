package newserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/childForwardServ")
public class childForwardServ extends HttpServlet {

	private static final long serialVersionUID = 3627021424077246526L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		int age = Integer.parseInt(req.getParameter("age"));
		out.print("<html><body bgcolor=yellow>");
		out.print("for child!");
		out.print("your " +age);
		out.print("</body></html>");
		
		out.close();
	}

	
}
