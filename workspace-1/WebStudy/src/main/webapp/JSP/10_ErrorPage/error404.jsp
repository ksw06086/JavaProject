<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 에러페이지</title>
</head>
<body>

	<%-- 
		1. jsp 디렉티브에 에러페이지 적용(속성 : errorpage, isErrorPage)
		
		1) error를 발생시킬'error_page.jsp'를 생성한 후 디렉티브 영역에 'errorPage="/에러페이지"를 작성한다.
		<%@ page language="java" contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8" errorPage="/isErrorPage.jsp"%>
		2) 에러페이지인 'isErrorPage.jsp'를 생성한 후 디렉티브 영역에 'isErrorPage'를 'true'로 
		   설정한다. 만약 isErrorPage가 false인 경우, 에러페이지의 역할을 할 수 없다.
		<%@ page language="java" contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8" isErrorPage="true"%>
		<%@ page trimDirectiveWhitespaces="true" %>
		
		2. web.xml에 설정 -> 가장 많이 사용
		1) web.xml
		<?xml version="1.0" encoding="UTF-8"?>
		<web-app>
			<error-page>
				<error-code>500</error-code>
				<location>/error/500.jsp</location>
			</error-page>
			
			<error-page>
				<error-code>404</error-code>
				<location>/error/404.jsp</location>
			</error-page>
		</web-app>
		2) 404.jsp
		<%@ page language="java" contentType="text/html; charset=UTF-8"
		    pageEncoding="UTF-8"%>
		<%@ page trimDirectiveWhitespaces="true" %>
		3) 505.jsp
		<%@ page language="java" contentType="text/html; charset=UTF-8"
		    pageEncoding="UTF-8"%>
		<%@ page trimDirectiveWhitespaces="true" %>
	 --%>
	<img src = "../../img/people1.png">
	<br>
	<br>
	요청한 페이지는 존재하지 않습니다<br>
</body>
</html>