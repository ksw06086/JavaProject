<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- usebean을 이용해서 객체 생성 -->
<%-- <jsp:useBean id = "[빈이름]" class = "[패키지.자바빈클래스 이름]" /> --%>
	 <jsp:useBean id = "memberuse" class = "com.jsp.usebean.MemberInfo"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- setter -->
	<%-- <jsp:setProperty property="이름" 
	          name="[자바빈이름 = useBean의 id = 참조변수]" 
	          value = [값 또는 표현식]/> --%>
	<jsp:setProperty property="id" name="memberuse" value = "개미는"/>
	<jsp:setProperty property="password" name="memberuse" value = "오늘도"/>
	<jsp:setProperty property="name" name="memberuse" value = "열심히"/>
	<jsp:setProperty property="email" name="memberuse" value = "일을"/>
	<jsp:setProperty property="address" name="memberuse" value = "하네"/>
	
	<!-- getter -->
	<%-- <jsp:getProperty property="[속성명]" 
		      name="[자바빈이름 = useBean의 id = 참조변수]"/> --%>
	아이디 : <jsp:getProperty property="id" name="memberuse"/><br>
	패스워드 : <jsp:getProperty property="password" name="memberuse"/><br>
	이름 : <jsp:getProperty property="name" name="memberuse"/><br>
	이메일 : <jsp:getProperty property="email" name="memberuse"/><br>
	주소 : <jsp:getProperty property="address" name="memberuse"/><br>
</body>
</html>