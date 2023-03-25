<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
<c:forEach var = "books" items="${book}">
	${books.bookNo}
	${books.bookTitle}
	${books.author}
	${books.price}<br>
</c:forEach>

<c:forEach var = "members" items="${member}">
	${members.id}
	${members.password}
	${members.email}
	${members.name}
	${members.address}<br>
</c:forEach>
</body>
</html>