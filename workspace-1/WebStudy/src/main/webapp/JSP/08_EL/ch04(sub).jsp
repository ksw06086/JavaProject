<%@page import="com.jsp.usebean.BookInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 방법 1. 표현식 사용 </h3>
<%
	BookInfo book = (BookInfo)request.getAttribute("bookInfo");
%>

bookno: <%= book.getBookNo() %><br>
booktitle: <%= book.getBookTitle() %><br>
bookauthor: <%= book.getAuthor() %><br>
bookprice: <%= book.getPrice() %><br>

<!-- 키, 멤버변수 -->
${bookInfo.bookNo}<br>
${bookInfo.bookTitle}<br>
${bookInfo.author}<br>
${bookInfo.price}<br>

<!-- 키, 멤버메소드 -->
${bookInfo.getBookNo()}<br>
${bookInfo.getBookTitle()}<br>
${bookInfo.getAuthor()}<br>
${bookInfo.getPrice()}<br>
</body>
</html>