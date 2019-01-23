package setCookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookieServ")
public class setCookieServ extends HttpServlet {

	private static final long serialVersionUID = 7651301666923928581L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		Date d = new Date();
		Cookie cookie = new Cookie("time", d.toString());
//		cookie.setMaxAge(60*3);
		cookie.setMaxAge(20);
		res.addCookie(cookie);
		out.print("cookie를 클라이언트에 저장." + d.toString());
		out.print("<hr><a href='getCookieServ'>쿠키값 확인</a>");
		out.close();
		
	}

	
}
