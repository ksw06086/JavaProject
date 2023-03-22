<%@page import="com.jsp.usebean.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 자바빈을 이용한 객체생성 </title>
</head>
<body>
	<h3> 자바빈을 이용한 객체 생성 </h3>
	
<%
	// 클래스를 가져와서 객체생성
	MemberInfo member = new MemberInfo();
	// setter로 값 설정
	member.setAddress("오늘도 부천시 여러모로123");
	member.setEmail("park@name");
	member.setId("sfds12345");
	member.setName("park");
	member.setPassword("park1234");
	
	// getter로 값 가져와서 출력
	out.print("주소 : " + member.getAddress()
			+ ", 이메일 : " + member.getEmail()
			+ ", 아이디 : " + member.getId()
			+ ", 이름 : " + member.getName()
			+ ", 패스워드 : " + member.getPassword() + "<br>");
%>
	주소 : <%= member.getAddress() %><br>
	이메일 : <%= member.getEmail() %><br>
	아이디 : <%= member.getId() %><br>
	이름 : <%= member.getName() %><br>
	패스워드 : <%= member.getPassword() %><br>
</body>
</html>