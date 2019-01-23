package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/setSessionServ")
public class setSessionServ extends HttpServlet {

	private static final long serialVersionUID = -7170807204568544293L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8;");
		PrintWriter out = res.getWriter();
		
		//없으면 세션 생성, 기존 세션이 있으면 새로 생성		
		HttpSession session = req.getSession();
		
		//세션에 데이터 저장
		session.setAttribute("user", "아이유");
		out.print("아이유님을 세션에 저장하였습니다.");
		out.print("<hr>");
		out.print("<a href=sessionTwo> 세션정보확인</a>");
		out.close();
	}
}
