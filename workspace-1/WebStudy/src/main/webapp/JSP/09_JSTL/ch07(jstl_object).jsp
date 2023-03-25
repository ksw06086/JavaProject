<%@page import="com.jsp.usebean.BookInfo"%>
<%@page import="com.jsp.usebean.MemberInfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> jstl - forEach 태그 </h3>
	
	<%
		ArrayList<MemberInfo> members = new ArrayList<>();
		MemberInfo member = new MemberInfo();
		member.setId("p001");
		member.setPassword("1234");
		member.setName("박민지");
		member.setEmail("park1234@naver.com");
		member.setAddress("서울");
		members.add(member);
		MemberInfo member1 = new MemberInfo();
		member1.setId("p002");
		member1.setPassword("1234");
		member1.setName("김지영");
		member1.setEmail("kim1234@naver.com");
		member1.setAddress("서울");
		members.add(member1);
		
		ArrayList<BookInfo> books = new ArrayList<>();
		books.add(new BookInfo());
		books.get(0).setBookNo("1001");
		books.get(0).setBookTitle("어린왕자");
		books.get(0).setAuthor("생텍쥐페리");
		books.get(0).setPrice(15000);
		
		books.add(new BookInfo());
		books.get(1).setBookNo("1002");
		books.get(1).setBookTitle("박미진의 사생활 침해");
		books.get(1).setAuthor("김선우");
		books.get(1).setPrice(100000);
		
		books.add(new BookInfo());
		books.get(2).setBookNo("1003");
		books.get(2).setBookTitle("연애 고수의 생활");
		books.get(2).setAuthor("이수민");
		books.get(2).setPrice(15000);
		
		books.add(new BookInfo());
		books.get(3).setBookNo("1004");
		books.get(3).setBookTitle("연애의 정석");
		books.get(3).setAuthor("연애플레이리스트");
		books.get(3).setPrice(15000);
		
		request.setAttribute("member", members);
		request.setAttribute("book", books);
		String viewPage = "ch07(sub).jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	%>
</body>
</html>