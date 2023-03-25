<%@page import="com.jsp.usebean.BookInfo"%>
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
<%
	BookInfo book = new BookInfo();
	book.setBookNo("b001");
	book.setBookTitle("어린왕자");
	book.setAuthor("생텍쥐베리");
	book.setPrice(30000);
	
	request.setAttribute("bookInfo", book);
	
	String viewPage = "ch04(sub).jsp";
	
	RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
	dispatcher.forward(request, response);
%>
</body>
</html>