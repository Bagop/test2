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

@WebServlet("/enterServ")
public class enterServ extends HttpServlet {

	private static final long serialVersionUID = -2797713128431386899L;
	private ArrayList<personVO> list;
	@Override
	public void init() throws ServletException {
		list = new ArrayList<personVO>();
		getServletContext().setAttribute("list", list);
		System.out.println("init()... servletContext - list setting");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		String nick = req.getParameter("nickName");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		if(isExist(nick)) {
			out.print("<script>");
			out.print("alert('기존 닉네임이 존재합니다.');");
			out.print("location.href='enter.html';");
			out.print("");
			out.print("</script>");
		} else {
			list.add(new personVO(nick, name, address));
//			out.print("<script>");
			out.print(nick + "님 입장 환영합니다.<br>");
			out.print("<a href='CafeServ?nick="+nick+"'>");
			out.print("카페 입장하기</a>");
//			out.print("</script>");
		}
		out.close();
	}
	
	private boolean isExist(String nick) {
		boolean flag = false;
		for (personVO p : list) {
			if(nick.equals(p.getNick())) {
				flag=true;
				break;
			}
		}
		return flag;
	}
}
