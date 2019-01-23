package setCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookieServ")
public class getCookieServ extends HttpServlet {

	private static final long serialVersionUID = 6446633669103819799L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		
		Cookie[] ca = req.getCookies();
		
		if(ca!=null) {
			for (Cookie c : ca) {
				if(c.getName().equals("time")) {
					
					out.print("Cookie save at : " +c.getValue());
				}
			}
		} else {
			out.print("cookie time out");
		}
		out.close();
	}
	
	

}
