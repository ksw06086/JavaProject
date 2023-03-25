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
<%
	request.setCharacterEncoding("UTF-8");
%>
<c:forEach var = "dish" items="${menu}" varStatus="status">
	${dish}
</c:forEach>
<c:forEach var = "dish" items="${menu}" varStatus="status">
	<c:if test="${dish == '아이스크림' || dish == '샐러드'}">
		${dish}
	</c:if>
</c:forEach>

</body>
</html>