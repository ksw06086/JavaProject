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
	<h3>좋아하는 과일</h3>
<%
	ArrayList<String> items = new ArrayList<>();
	items.add("방울토마토");
	items.add("망고");
	items.add("체리");
	items.add("포도");
	items.add("딸기");
	
	request.setAttribute("item", items);
	
	String viewPage = "ch03(sub).jsp";
	
	RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
	dispatcher.forward(request, response);
%>
</body>
</html>