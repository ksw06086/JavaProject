<%@page import="java.util.Arrays"%>
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
	String strid = request.getParameter("userid");
	String strpwd = request.getParameter("userpwd");
	String strname = request.getParameter("username");
	String stremail = request.getParameter("userEmail");
	String strmajor = request.getParameter("userMajor");
	String strjob = request.getParameter("userjob");
	String[] strhobby = request.getParameterValues("userHobby");

	out.print("id : " + strid + "<br>");
	out.print("패스워드 : " + strpwd + "<br>");
	out.print("이름 : " + strname + "<br>");
	out.print("이메일 : " + stremail + "<br>");
	out.print("전공 : " + strmajor + "<br>");
	out.print("취미 : ");
	for(int i = 0; i<strhobby.length; i++){
		out.print(strhobby[i] + " ");
	}
	out.print("<br>");
	out.print("취미2 : " + Arrays.toString(strhobby) + "<br>");
	out.print("직업 : " + strjob + "<br>");
%>
<br><br>
-------------------- 표현식 이용 -------------------
<br><br>
id : <%= strid %><br>
패스워드 : <%= strpwd %><br>
이름 : <%= strname %><br>
이메일 : <%= stremail %><br>
전공 : <%= strmajor %><br>
취미 : <%= Arrays.toString(strhobby) %><br>
직업 : <%= strjob %><br>

</body>
</html>