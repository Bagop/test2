package newserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ageForwardServ")
public class ageForwardServ extends HttpServlet {

	private static final long serialVersionUID = 9155644140392473737L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		int age = Integer.parseInt(req.getParameter("age"));
		if(age>20) {
			out.print("성인입니다.");
		} else {
//			
			RequestDispatcher rd = req.getRequestDispatcher("childForwardServ");
			rd.forward(req, res);
		}
		out.close();
	}

}
