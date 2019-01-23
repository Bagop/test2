package newserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ageServ")
public class ageServ extends HttpServlet {

	private static final long serialVersionUID = -4888705524663103470L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		int age = Integer.parseInt(req.getParameter("age"));
		if(age>20) {
			out.print("성인입니다.");
		} else {
//			out.print("미성년 입니다.");
//			이전페이지로 돌아가기.
			res.sendRedirect("childServ");
		}
		
		out.close();
	}

	
}
