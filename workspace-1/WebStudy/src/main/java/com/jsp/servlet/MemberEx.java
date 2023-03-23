package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberEx
 */
@WebServlet("/MemberEx")
public class MemberEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public MemberEx() {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글 안깨지게 함
		req.setCharacterEncoding("UTF-8");
		
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("성별 : ");
		if(req.getParameter("gender").equals(1)) {
			out.println("남이신");
		} else {
			out.println("여이신");
		}
		out.println(req.getParameter("username") + "님 반갑습니다.<br>");
		out.println("나이는" + req.getParameter("userage") + "세 이시고 <br>");
		out.println("좋아하는 취미는");
		String[] hobby = req.getParameterValues("hobby");
		for(int i = 0; i < hobby.length; i++) {
			if(hobby[i].equals("1")) {
				out.print(" 영화");
			}
			if(hobby[i].equals("2")) {
				out.print(" 잠자기");
			}
			if(hobby[i].equals("3")) {
				out.print(" 먹기");
			}
			if(hobby[i].equals("4")) {
				out.print(" 놀기");
			}
		}
		out.println("입니다.");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
