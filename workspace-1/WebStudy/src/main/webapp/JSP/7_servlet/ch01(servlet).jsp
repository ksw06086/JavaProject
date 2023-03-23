<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 연동</title>
</head>
<body>
	<h3>서블릿 연동</h3>
	<form action="../postEx" method = "post">
		<table border = "1">
			<tr>
				<td>이름</td>
				<td><input type = "text" id = "user" name = "username"></td>
			</tr>
			<tr>
				<td colspan = "2"><input type = "submit" value = "전송"></td>
			</tr>
		</table>
	</form>
</body>
</html>