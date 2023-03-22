<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식 활용(배열)</title>
</head>
<body>
<!-- 아파트, 차, 급여, -->
<%!
	String dream[] = {"언적위의 하얀 집", "유럽여행", "비평지", "포켓몬스터", "장원영"};
%>

<table border = "1">
<%
	application.log("로그메시지 출력 - dream");
	for(int i = 0; i<dream.length; i++){
%>
		<tr>
			<td><%= i+1 %></td> <td><%= dream[i] %></td>
		</tr>
<%
	}
%>
</table>
</body>
</html>