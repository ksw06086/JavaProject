<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 = request 객체</title>
</head>
<body>
	<h3> 내장객체 - request </h3>
	request란 내장객체로서, 브라우저를 통해 서버에 어떤 정보를 요청하는 것을 말하며,<br>
	이러한 정보를 request 객체가 관리한다.<br>
	
<%
	out.print("서버 : " + request.getServerName() + "<br>");
	out.print("서버포트 : " + request.getServerPort() + "<br>");
	out.print("요청방식 : " + request.getMethod() + "<br>");
	out.print("프로토콜 : " + request.getProtocol() + "<br>");
	
	/*	URL : 전체 경로
		URL : http://localhost:8089/WebStudy/JSP_1day/ch01(request%20%EA%B0%9D%EC%B2%B4).jsp
	*/
	out.print("URL : " + request.getRequestURL() + "<br>");
	
	/*	URI : 앞의 도메인 주소를 제외한 나머지 값, 즉 컨텍스트 패스(포함) 이하의 값
		URI : /WebStudy/JSP_1day/ch01(request%20%EA%B0%9D%EC%B2%B4).jsp
	*/
	out.print("URI : " + request.getRequestURI() + "<br>");
	
	/*	컨텍스트 경로 : 프로젝트명
		컨텍스트 경로 : /WebStudy
	*/
	out.print("컨텍스트 경로 : " + request.getContextPath() + "<br>");
	out.print("contentType : " + request.getContentType() + "<br>");
%>	
</body>
</html>