<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
	이전페이지 가져와서 결과를 출력하라 <br>
	
<%
	String username = request.getParameter("name");
	String backcolor = request.getParameter("backcolor");
	String color = request.getParameter("color");
	String shadow = request.getParameter("shadow");
%>
	이름 : <span style = "background : <%=backcolor %>;
						color : <%= color%>;
						text-shadow: 2px 2px <%= shadow%>">
		  <%= username %></span> <br>
	배경색 : <%= backcolor %><br>
	글자색 : <%= color %><br>
	그림자색 : <%= shadow %><br>	
</body>
</html>