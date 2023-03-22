<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인증 페이지</title>
</head>
<body>
<!--  
	1. 입력받은 나이를 넘겨받는다.
	2. 나이가 20살 이상이면 ch05(pass).jsp로 이동(age도 같이)
	2. 나이가 20살 이하이면 ch05(ng).jsp로 이동(age도 같이)
-->

<!--  
	웹서버가 웹브라우저에게 다른 페이지로 이동하라고 응답하는 기능이다.
	response.sendRedirect("이동할 페이지");
-->

<% 
	int inputAge = Integer.parseInt(request.getParameter("age"));
	if(inputAge > 19){
		response.sendRedirect("ch05(pass).jsp?age="+inputAge);
	} else {
		response.sendRedirect("ch05(ng).jsp?age="+inputAge);
	}
%>
</body>
</html>