<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션태그 - include</title>
</head>
<body>
	<h3>액션태그 155p</h3>
	
	action 태그란 JSP 페이지내에서 어떤 동작을 하도록 지시하는 태그이다.
	<br>
	
	문법 : <%-- <jsp:액션태그 /> --%>
	종류 : include, forward, param, ... <br>
	<br>
	<table width = "400" border = "2">
		<!-- top -->
		<tr>
			<td colspan = "2">
				<jsp:include page = "ch01(top).jsp" flush = "false"/>
			</td>
		</tr>
		
		<tr>
			<!-- left -->
			<td width = "100" valign = "top">
				<jsp:include page = "ch01(left).jsp"/>
			</td>
			<!-- main -->
			<td width = "300" height = "200" valign = "top">
				메인 레이아웃<br>
				게시판<br>
				상품정보<br>
				메인 레이아웃<br>
				게시판<br>
				상품정보<br>
				메인 레이아웃<br>
				게시판<br>
				상품정보<br>
			</td>
		</tr>
		<!-- bottom -->
		<tr>
			<td colspan = "2">
				<jsp:include page = "ch01(bottom).jsp"/>
			</td>
		</tr>
	</table>
</body>
</html>