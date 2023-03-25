<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 출력</title>
</head>
<body>
	<h3> 개인 정보 출력 </h3>
	<form action="../MemberEx" method = "post">
		<table border = "1" cellpadding = "0" cellspacing = "0">
			<tr>
				<td>이름</td>
				<td>
					<input type = "text" name = "username" size = "10">
				</td>
			</tr>
			<tr>
				<td>나이</td>
				<td>
					<input type = "text" name = "userage" size = "10">
				</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input type = "radio" name = "gender" size = "1">남자
					<input type = "radio" name = "gender" size = "2">여자
				</td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
					<input type = "checkbox" name = "hobby" value = "1">영화
					<input type = "checkbox" name = "hobby" value = "2">잠자기
					<input type = "checkbox" name = "hobby" value = "3">먹기
					<input type = "checkbox" name = "hobby" value = "4">놀기
				</td>
			</tr>
			<tr>
				<td>
					<input type = "submit" value = "전송">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>