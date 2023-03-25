<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어</title>
</head>
<body>
	<h2>표현언어</h2>
	
	<form action="ch01(sub).jsp" method = "post">
		<table border = "1">
			<tr>
				<td>아이디</td>
				<td>
					<input type = "text" name = "id", maxlength="10">
				</td>
			</tr>
			
			<tr>
				<td>비밀번호</td>
				<td>
					<input type = "password" name = "pwd", maxlength="10">
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type = "submit" value = "전송">
					<input type = "reset" value = "취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>