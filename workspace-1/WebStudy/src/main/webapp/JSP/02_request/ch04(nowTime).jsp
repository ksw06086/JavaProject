<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재시간 출력</title>
</head>
<body>
<%
	/* 속성 가져오기
		request.getAttribute("속성명"); 의 리턴타입은 Object형이므로 형변환해야 함
	*/
	Calendar cal = (Calendar)request.getAttribute("time");
%>

현재 날짜는 <%= cal.get(Calendar.YEAR) %> 년
		<%= cal.get(Calendar.MONTH) + 1 %> 월
		<%= cal.get(Calendar.DATE) %> 일

현재 시간은 <%= cal.get(Calendar.HOUR) %> 시
		<%= cal.get(Calendar.MINUTE) %> 분
		<%= cal.get(Calendar.SECOND) %> 초
</body>
</html>