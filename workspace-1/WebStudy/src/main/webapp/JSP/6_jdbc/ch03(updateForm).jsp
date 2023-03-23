<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 컬럼명과 input name이 일치해야한다. -->
	<form action = "ch03(jdbc).jsp" method = "post">
		<table border = "1">
			<tr>
				<td>제품 ID</td>
				<td>
				<input type = "text" name = "p_id" size = "10" value = "P001" readonly>
				</td>
			</tr>
			<tr>
				<td>제품 명</td>
				<td>
				<input type = "text" name = "p_name" size = "20">
				</td>
			</tr>
			<tr>
				<td>제품 브랜드</td>
				<td>
				<input type = "text" name = "p_brand" size = "20">
				</td>
			</tr>
			<tr>
				<td>제품 가격</td>
				<td>
				<input type = "text" name = "p_price" size = "10">
				</td>
			</tr>
			
			<tr>
				<td colspan = "2"><input type= "submit" value = "수정"></td>
			</tr>
		</table>
	</form>
</body>
</html>