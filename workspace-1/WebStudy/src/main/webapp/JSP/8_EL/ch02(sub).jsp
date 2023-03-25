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
	request.setCharacterEncoding("UTF-8");
%>
아이디 : ${param.id}<br>
pet : ${paramValues.animal[0]}, ${paramValues.animal[1]},
	  ${paramValues.animal[2]}, ${paramValues.animal[3]},
	  ${paramValues.animal[4]}

</body>
</html>