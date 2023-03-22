<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식 활용</title>
</head>
<body>
<% 
	/* 현재 시간 */
	Date date = new Date();
	int hour = date.getHours();
	String a = "";
	if(date.getHours() < 12){
		out.print("오전");
	} else {
		out.print("오후");
	}
	
	a = hour < 12 ? "오전" : "오후";
%>

	1) 지금은 오전일까요? 오후일까요? <%= a %><br>

<%!
	public int operation(int i, int j){
		return Math.max(i,j);
	}
%>

	2) 두 개의 숫자 중에 큰 숫자는? <%= operation(10, 10) %>
</body>
</html>