package newserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/childServ")
public class childServ extends HttpServlet {

	private static final long serialVersionUID = 7775843588981155834L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		out.print("<html><body bgcolor=yellow>");
		out.print("child!");
		out.print("</body></html>");
		
		out.close();
	}

	
}
