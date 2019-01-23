package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionTwo")
public class sessionTwo extends HttpServlet {

	private static final long serialVersionUID = 7736913508396852820L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		//기존 세션이 있으면 세션 반환, 없으면 null반환
		HttpSession session = req.getSession();
		if(session==null) {
			out.print("no session");
		} else {
			String user = (String)session.getAttribute("user");
			out.print("user:"+user);
			out.print("<hr>");
			out.print("<a href=sessionThree> 세션해제</a>");
		}
		out.close();
	}
}
