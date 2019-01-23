package newserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.personVO;

@WebServlet("/CafeServ")
public class CafeServ extends HttpServlet {

	private static final long serialVersionUID = -7994269122493369680L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		String nick = req.getParameter("nick"); // 이전 페이지에서 주는거만 받을수잇음. ( String nick )
		out.print(nick + "님 입장 환영합니다.<br>");
		out.print("현재 접속 명단보기<br>");
		ArrayList<personVO> list = (ArrayList<personVO>)this.getServletContext().getAttribute("list");
		out.print("<table border=3>");
		
		for (personVO vo : list) {
			out.print("<tr>");
			out.print("<td>"+vo.getNick()+"</td>");
			out.print("<td>"+vo.getName()+"</td>");
			out.print("<td>"+vo.getAddress()+"</td>");
			out.print("</tr>");			
		}
		out.print("");
		out.print("");
		
		out.close();
	}

	
}
