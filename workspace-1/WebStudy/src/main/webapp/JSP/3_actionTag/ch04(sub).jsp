<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sub 페이지</title>
</head>
<body>
	<%
		String username = request.getParameter("name");
		String age = request.getParameter("age");
		String hp = request.getParameter("hp");
	%>
	<fieldset>
		<legend> ch04(sub).jsp </legend>
		<%= username %>님 반갑습니다.<br>
		당신의 나이는 <%= age %>세 입니다.<br>
		HP : <%= hp %>
	</fieldset>
</body>
</html>