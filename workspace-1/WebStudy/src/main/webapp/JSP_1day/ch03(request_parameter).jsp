<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request - parameter 메소드</title>
</head>
<body>
	<h3>request - parameter 메소드</h3>
	parameter 메소드는 JSP 페이지의 데이터값을 전송하기 위해 사용
	
	<form action = "ch03(subPage).jsp" method = "get">
		<table border = 1>
			<tr>
				<td>아이디</td>
				<td><input type = "text" name = "userid" size = "10"></td>
			</tr>
			
			<tr>
				<td>패스워드</td>
				<td><input type = "password" name = "userpwd" size = "10"></td>
			</tr>
			
			<tr>
				<td>이름</td>
				<td><input type = "text" name = "username" size = "10"></td>
			</tr>
			
			<tr>
				<td>이메일</td>
				<td><input type = "email" name = "userEmail" size = "10"></td>
			</tr>
			
			<tr>
				<td>전공</td>
				<td>
				<input type = "radio" name = "userMajor" value = "kor" size = "20">국문과
				<input type = "radio" name = "userMajor" value = "eng" size = "20">영문과
				<input type = "radio" name = "userMajor" value = "com" size = "20">컴공과
				</td>
			</tr>
			
			<tr>
				<td>취미</td>
				<td>
					<input type = "checkbox" name = "userHobby" value = "cook">요리
					<input type = "checkbox" name = "userHobby" value = "swimming">수영
					<input type = "checkbox" name = "userHobby" value = "reading">독서
					<input type = "checkbox" name = "userHobby" value = "coding">코딩
				</td>
			</tr>
			
			<tr>
				<td>직업</td>
				<td>
					<select name = "userjob">
						<option value = "programmer">프로그래머</option>
						<option value = "chef">요리사</option>
						<option value = "ceo">대표</option>
						<option value = "barista">바리스타</option>
					</select>
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