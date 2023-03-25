<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${item}<br>
	
	${item[0]}<br>
	${item[1]}<br>
	${item[2]}<br>
	${item[3]}<br>
	${item[4]}<br>
	
	<!-- 요청 URI : /WebStudy/JSP/8_EL/ch03(sub).jsp -->
	요청 URI ㅣ ${pageContext.request.requestURI}
	<h3>request의 items 속성</h3>
	
	${requestScope.item[0]}
	${requestScope.item[1]}
	${requestScope.item[2]}
	${requestScope.item[3]}
	${requestScope.item[4]}
</body>
</html>