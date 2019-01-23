package newserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/life")
public class lifecycle extends HttpServlet {


	private static final long serialVersionUID = -6161869148601323653L;
	
	private int count;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service()");
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		out.print("<font size=6>"+count++);
		out.print("</font>");
		out.print("doGet Test!");
		out.close();
		System.out.println("");
	}

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		out.print("doGet Test!");
		out.close();
		System.out.println("");
	}
	
	
}
