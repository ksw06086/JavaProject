<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ch03(jstl_if).jsp">
	<table border = "1">
		<tr>
			<td>이름</td>
			<td><input type = "text" name = "name"></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type = "text" name = "age"></td>
		</tr>
		<tr>
			<td>구매할 물건</td>
			<td>
				<input type = "radio" name = "buy" value = "담배">담배
				<input type = "radio" name = "buy" value = "술">술
				<input type = "radio" name = "buy" value = "성인용품">성인용품
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