<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - core 태그 - if</title>
</head>
<body>
	<h3> jstl - core 태그 - if </h3>
	<%--
	c:if test = "조건" var = "조건처리 변수명" [scope = "범위"]
	..
	..
	/c:if
	 --%>
	 
	 <c:if test="true">
	 	true이므로 항상 실행
	 </c:if>
	 
	 <c:if test="false">
	 	false이므로 항상 실행 X
	 </c:if>
	 
	 <c:if test="${param.name == 'hong'}">
	 	name 파라미터 값이 ${param.name}입니다.
	 </c:if>
	 
	 <c:if test="${param.name.equals('hong')}">
	 	name 파라미터 값이 ${param.name}입니다.
	 </c:if>
	 
	 <c:if test="${param.age > 19}">
	 	${param.name}님은 ${param.age}세 이므로 ${param.buy}를 살 수 있습니다.
	 </c:if>
	 
	 <c:if test="${param.age <= 19}">
	 	${param.name}님은 ${param.age}세 이므로 ${param.buy}를 살 수 없습니다.
	 </c:if>
</body>
</html>