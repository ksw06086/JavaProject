<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> JSTL(JSP Standard Tag Library) - core 태그 - 변수 지원 태그</h3>
	<c:set var = "p_code" value = "P001" scope="request"/>
	<c:set var = "p_name" value = "AI" scope="request"/>
	<c:set var = "p_price" value = "500000" scope="request"/>
	
	<!-- jsp:forward는 지정한 페이지를 실행하되, URL은 그대로 -->
	<jsp:forward page="ch02(sub).jsp"/>
</body>
</html>