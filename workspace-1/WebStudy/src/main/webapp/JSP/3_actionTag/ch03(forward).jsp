<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>
<form action="ch03(sub).jsp" method = "post">
	<table>
		<tr>
			<td>이름</td>
			<td><input type = "text" name = "username"></td>
		</tr>
		
		<tr>
			<td>배경색</td>
			<td><input type = "color" name = "userBackColor"></td>
		</tr>
		
		<tr>
			<td>글자색</td>
			<td><input type = "color" name = "userColor"></td>
		</tr>
		
		<tr>
			<td>그림자색</td>
			<td>
			<input type = "radio" name = "userShadow" value = "pink">핑크
			<input type = "radio" name = "userShadow" value = "skyblue">하늘색
			<input type = "radio" name = "userShadow" value = "gray">회색
			</td>
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