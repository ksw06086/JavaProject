<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>약관동의 화면을 제공하는 JSP</title>
</head>
<body>
<%
	/* 한글 안깨지게 처리 */
	request.setCharacterEncoding("UTF-8");

	String strId = request.getParameter("userid");
	String strPwd = request.getParameter("userpwd");
	String strName = request.getParameter("username");
	
	/* 세션에 값 설정
		session.setAttribute("속성", "값");
	*/
	
	session.setAttribute("id", strId);
	session.setAttribute("pwd", strPwd);
	session.setAttribute("name", strName);
%>

<form action="ch05(signIn).jsp" method = "post">
	<fieldset>
		<legend>회원약관</legend>
		=====================================<br>
		1. 회원정보는 웹사이트의 운영정보를 위해서만 사용됩니다.<br>
		2. 웹사이트의 정상운영을 방해하는 회원은 회원탈퇴 처리됩니다.<br>
		=====================================<br>
		위의 약관에 동의하시겠습니까?<br>
		<input type = "radio" name = "agree" value = "yes">동의함
		<input type = "radio" name = "agree" value = "no">동의안함
		<input type = "submit" value = "전송">
	</fieldset>
</form>
</body>
</html>