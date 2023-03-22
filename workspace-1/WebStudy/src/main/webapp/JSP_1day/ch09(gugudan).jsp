<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력</title>
</head>
<body>
	<table border = "1">
<%
	for(int i = 2; i<= 9; i++){
%>	
		<tr>
			<td>***** <%= i %>단 *****</td>
		</tr>
<%
		for(int j = 1; j<=9; j++){
%>
			<tr>
				<td><%= i %> * <%= j %> = <%= i*j %></td>
			</tr>
<%
		}
	}
%>			
	</table>
</body>
</html>