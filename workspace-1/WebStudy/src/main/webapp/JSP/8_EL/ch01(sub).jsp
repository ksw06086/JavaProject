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
	request.setCharacterEncoding("UTF-8");
%>

<!-- 방법1. 표현식 적용 -->
아이디 <%= request.getParameter("id") %><br>
비밀번호 <%= request.getParameter("pwd") %><br>

==============================================<br>
<!-- 방법2. EL 적용 -->
아이디 ${param.id}<br>
비밀번호 ${param.pwd}<br>

<!-- 방법3. EL 적용 -->
아이디 ${param["id"]}<br>
비밀번호 ${param["pwd"]}<br>

</body>
</html>