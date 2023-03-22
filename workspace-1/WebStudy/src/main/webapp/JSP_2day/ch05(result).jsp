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
	String result = request.getParameter("name");

	if(result.equals("FAIL")){
		out.print("가입실패ㅜㅜ");
	} else {
		out.print("가입성공!");
	}
%>
</body>
</html>