<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>상품 정보</h3>
	
	<%
		// 한글 처리
		request.setCharacterEncoding("UTF-8");
	%>
	
	<!-- EL 태그 사용 -->
	상품코드 : ${p_code}<br>
	상품명 : ${p_name}<br>
	상품가격 : ${p_price}<br>
	
	================================================<br>
	
	<!-- scope 태그 사용 -->
	상품코드 : ${requestScope.p_code}<br>
	상품명 : ${requestScope.p_name}<br>
	상품가격 : ${requestScope.p_price}<br>
	
</body>
</html>