package newserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bserv")
public class contextServB extends HttpServlet {

	private static final long serialVersionUID = -6103960475911508638L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		ServletContext context = this.getServletContext();
		String str = (String)context.getAttribute("product");
		out.print(str);
		out.print("<hr>");
		out.print("<a href='Bservlet'> B serv에서 확인");
		System.out.println("");
	}
}
