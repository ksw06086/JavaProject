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
	String[] food = {"스테이크", "콩국수", "피자", "돈가스", "샐러드", "아이스크림", "돼지", "소", "양"};

	request.setAttribute("menu", food);
	String viewPage = "ch06(sub).jsp";
	
	RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
	dispatcher.forward(request, response);
%>
</body>
</html>