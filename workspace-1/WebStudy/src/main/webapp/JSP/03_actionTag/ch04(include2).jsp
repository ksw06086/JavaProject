<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- include 예제 -->
	<%
		// 한글 안깨지게
		request.setCharacterEncoding("UTF-8");
	%>
	
	<%@ include file = "ch04(variable).jsp" %>
	날짜 : <%= date %>
	
	<fieldset>
		<legend> include 예제 </legend>
		
		<%
			String s_name = request.getParameter("userName");
			String s_age = request.getParameter("userAge");
			String s_hp = request.getParameter("userHp");
		%>
		
		<!-- include page로 이동시 파라미터 값 설정(param 액션태그) -->
		<jsp:include page="ch04(sub).jsp">
			<jsp:param name = "name" value = "<%= s_name %>"/>
			<jsp:param name = "age" value = "<%= s_age %>"/>
			<jsp:param name = "hp" value = "<%= s_hp %>"/>
		</jsp:include>
		
		<%@ include file = "ch04(footer).jsp" %>
	</fieldset>
</body>
</html>