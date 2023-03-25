<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - choose</title>
</head>
<body>
	<h3> jstl - choose </h3>
	<%-- 
		c:choose
			c:when test = "${조건식}"
			..
			/c:when
			c:when test = "${조건식}"
			..
			/c:when
			c:otherwise
			..
			/c:otherwise
		/c:choose
	 --%>
	 <c:choose>
	 	<c:when test="${param.num == 1}">
	 		처음뵙겠습니다.
	 	</c:when>
	 	<c:when test="${param.num == 2}">
	 		만나서 반갑습니다.
	 	</c:when>
	 	<c:when test="${param.num == 3}">
	 		또 뵙네요.
	 	</c:when>
	 	<c:otherwise>
	 		이제 그만~~
	 	</c:otherwise>
	 </c:choose>
	 
</body>
</html>