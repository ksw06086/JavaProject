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
	String username = request.getParameter("username");
	String backcolor = request.getParameter("userBackColor");
	String color = request.getParameter("userColor");
	String shadow = request.getParameter("userShadow");
%>

<jsp:forward page="ch03(result).jsp">
	<jsp:param value="<%= username %>" name="name"/>
	<jsp:param value="<%= backcolor %>" name="backcolor"/>
	<jsp:param value="<%= color %>" name="color"/>
	<jsp:param value="<%= shadow %>" name="shadow"/>
</jsp:forward>
</body>
</html>