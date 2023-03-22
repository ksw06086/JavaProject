<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 입력화면을 제공하는 JSP 페이지</title>
<style type="text/css">
	fieldset {
		width: 300px;
	}
</style>
</head>
<body>

<!-- 세션 
	 쿠키가 클라이언트(=웹브라우저)측의 데이터 보관소라면, 세션은 서버측의 ㄷ이터 보관소이다.
	 쿠키와 마찬가지로 세션도 생성을 해야만 정보를 저장할 수 있다.
	 일단 세션을 생성하면 session 기본객체를 통해서만 세션을 사용할 수 있다.
	 한번 세션을 생성하면 이후로는 이미 생성한 세션을 사용한다.
	 서버는 세션을 사용해서 클라이언트 상태를 유지할 수 있기 때문에,
	 로그인한 사용자의 정보를 유지하기 위한 목적으로 사용한다.
	 
	 세션저장 : session.setAttribute("속성", "값");
	 세션 읽기 : session.getAttribute("속성");
	 세션 종료 : session.invalidate; // 세션에 저장된 값 전부 삭제
	 		  session.removeAttribute("속성");	// 해당 속성으로 지정된 세션값 삭제
 -->
 <form action="ch05(agreement).jsp" method = "post">
 	<fieldset>
 		<legend>회원가입</legend>
 		<table>
 			<tr>
 				<td>아이디 : 
 				<input type = "text" name = "userid" size = "10" autofocus>
 				</td>
 			</tr>
 			<tr>
 				<td>패스워드 : 
 				<input type = "password" name = "userpwd" size = "10">
 				</td>
 			</tr>
 			<tr>
 				<td>이름 : 
 				<input type = "text" name = "username" size = "20">
 				</td>
 			</tr>
 			<tr>
 				<td>
 				<input type = "submit" value = "전송">
 				<input type = "reset" value = "취소">
 				</td>
 			</tr>
 		</table>
 	</fieldset>
 </form>
</body>
</html>