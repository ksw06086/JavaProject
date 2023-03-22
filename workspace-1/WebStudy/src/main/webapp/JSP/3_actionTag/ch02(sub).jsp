<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sub 페이지</title>
</head>
<body>
<%
	String kind = request.getParameter("kind");
	if(kind == null){
		return ;
	}
%>

<table border = "1" cellspacting = "0">
	<tr>
		<td>영화장르코드</td>
		<td><%= kind %></td>
	</tr>
	
	<tr>
		<td>영화장르</td>
		<td>
<%
		if(kind.equals("R")){
			out.print("로맨스");
		} else if(kind.equals("A")){
			out.print("액션");
		} else if(kind.equals("C")){
			out.print("코미디");
		} else if(kind.equals("H")){
			out.print("호러");
		} else if(kind.equals("B")){
			out.print("블록");
		} else if(kind.equals("D")){
			out.print("드라마");
		} else if(kind.equals("SF")){
			out.print("공상과학");
		} else {
			out.print("입력하신 코드는 장르에 존재하지 않습니다.");
		}
%>
		</td>
	</tr>
</table>
</body>
</html>