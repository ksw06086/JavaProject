<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ch08(usebean_book).jsp">
	<table border = "1">
		<tr>
			<td align = "right">번호</td>
			<td><input type = "text" name = "bookNo"></td>
		</tr>
		
		<tr>
			<td align = "right">제목</td>
			<td><input type = "text" name = "bookTitle"></td>
		</tr>
		
		<tr>
			<td align = "right">저자</td>
			<td><input type = "text" name = "author"></td>
		</tr>
		
		<tr>
			<td align = "right">가격</td>
			<td><input type = "text" name = "price"></td>
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