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
@WebServlet("/JSP/MemberEx")
public class MemberEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberEx() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글안깨지게 함
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.print("성별 : ");
		if(request.getParameter("gender").equals(1)) {
			out.println("남이신");
		} else {
			out.println("여이신");
		}
		out.println(request.getParameter("username") +"님 반갑습니다.<br>");
		out.println("나이는" + request.getParameter("userage") + "세 이시고<br>");
		out.println("좋아하는 취미는");
		String[] hobby = request.getParameterValues("hobby");
		for(int i = 0; i<hobby.length; i++) {
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
		out.println("</html");
		
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
