<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성인인 경우</title>
</head>
<body>
<!--  
	나이를 받아온 후에 메시지를 뿌린다.
	당신은 ~세이므로 성인입니다. 주류 구매가 가능합니다.
	<a href = "ch05(인증form).jsp">처음으로 이동</a>
-->
<% 
	int age = Integer.parseInt(request.getParameter("age"));
%>
	당신은 <%= age %>세이므로 성인입니다. 주류 구매가 가능합니다. <br>
	<a href = "ch03(인증form).jsp">처음으로 이동</a>
</body>
</html>