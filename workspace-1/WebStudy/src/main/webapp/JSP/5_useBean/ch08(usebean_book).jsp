<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="book" class="com.jsp.usebean.BookInfo"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>

<%
	book.setPrice(Integer.parseInt(request.getParameter("price")));
%>
<!-- 주의사항 : input태그 name = 멤버변수명 = property명 -->
<!-- 방법1. set을 이용해서 각각 값 설정 -->
<%-- <jsp:setProperty property = "dnddn" name = "book"/>
	 <jsp:setProperty property = "dnddn" name = "book"/>
 --%>

<!-- 방법2. set을 이요애서 한번에 값 설정 -->
<!-- setter를 이용해서 값 설정 -->
<jsp:setProperty property="*" name = "book"/>

<table border = "1">
	<tr>
		<td align = "right">번호</td>
		<td>
		<jsp:getProperty property="bookNo" name="book"/>
		</td>
	</tr>
	
	<tr>
		<td align = "right">제목</td>
		<td>
		<jsp:getProperty property="bookTitle" name="book"/>
		</td>
	</tr>
	
	<tr>
		<td align = "right">저자</td>
		<td>
		<jsp:getProperty property="author" name="book"/>
		</td>
	</tr>
	
	<tr>
		<td align = "right">가격</td>
		<td>
		<jsp:getProperty property="price" name="book"/>
		</td>
	</tr>
</table>
</body>
</html>