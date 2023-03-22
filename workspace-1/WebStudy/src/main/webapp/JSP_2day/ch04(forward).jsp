<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>
<form action="ch04(include2).jsp" method = "post">
	<table>
		<tr>
			<td>이름</td>
			<td><input type = "text" name = "userName"></td>
		</tr>
		
		<tr>
			<td>나이</td>
			<td><input type = "number" name = "userAge"></td>
		</tr>
		
		<tr>
			<td>핸드폰</td>
			<td><input type = "text" name = "userHp"></td>
		</tr>
		
		<tr>
			<td colspan = "2" align = "center">
				<input type = "submit" value = "전송">
				<input type = "reset" value = "취소">
			</td>
		</tr>
	</table>
</form>
</body>
</html>