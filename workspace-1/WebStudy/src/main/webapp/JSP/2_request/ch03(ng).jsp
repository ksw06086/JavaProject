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
	int age = Integer.parseInt(request.getParameter("age"));
%>
	당신은 <%= age %>세이므로 성인이 아닙니다. 주류 구매가 불가능합니다.<br>
	<a href = "ch03(인증form).jsp"> 처음으로 이동 </a>
</body>
</html>