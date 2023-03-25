<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>표현언어</h2>
<form action = "ch02(sub).jsp" method = "post">
	<table border = "1" cellspacing = "0" cellpadding = "0">
		<tr>
			<th> 아이디 </th>
			<td>
			<input type = "text" name = "id" maxlength = "10">
			</td>
		</tr>
		<tr>
			<th> 애완동물 </th>
			<td>
			<input type = "checkbox" name = "animal" value = "라쿤">라쿤
			<input type = "checkbox" name = "animal" value = "기니피그">기니피그
			<input type = "checkbox" name = "animal" value = "고슴도치">고슴도치
			<input type = "checkbox" name = "animal" value = "구피">구피
			<input type = "checkbox" name = "animal" value = "니모">니모
			</td>
		</tr>
		<tr>
			<td colspan = "2">
				<input type = "submit" value = "확인"> <input type = "reset" value = "취소">
			</td>
		</tr>
	</table>
</form>
</body>
</html>