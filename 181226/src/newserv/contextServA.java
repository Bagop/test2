package newserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Aserv")
public class contextServA extends HttpServlet {
	
 	private static final long serialVersionUID = -4585988580149176595L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		ServletContext context = this.getServletContext();
		context.setAttribute("product", "Pro Info");
		out.print("A Serv info를 서블린 컨텍스트에 저장");
		out.print("<hr>");
		out.print("<a href='Bserv'> B serv에서 확인");
		System.out.println("");
		
	}
}
