<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>attribute 예제</title>
</head>
<body>
	<h3>Attribute 예제</h3>
	forward는 실행하면 웹브라우저의 주소는 ch07(attribute).jsp 그대로이다.
	하지만 실제 출력결과는 ch07(nowTime).jsp가 생성한 것이다.
	즉 response.sendRedirect()는 next페이지로 이동되나 forward는 이동되지 않는다.
<%
	Calendar cal = Calendar.getInstance();
	
	/* - 속성 설정 p135
		request.setAttribute("속성명", 속성값);
		request.setAttribute(String name, Object value)
		
	   - 속성 설정
	   Object 속성값 = request.getAttribute("속성명");
	   request.getAttribute(String name);
	*/
	
	request.setAttribute("time", cal);
%>

<%-- 
	<jsp:forward> 액션태그
	<jsp:forward page = "이동할 페이지" /> - 주의사항 /꼭 주어야한다.
--%>
	<jsp:forward page = "ch07(nowTime).jsp"/>

</body>
</html>