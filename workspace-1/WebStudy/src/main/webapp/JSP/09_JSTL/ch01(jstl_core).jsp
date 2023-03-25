<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> JSTL(JSP Standard Tag Library) - core 태그 - 변수 지원 태그</h3>
	<pre>
	JSP의 경우 HTML 태그와 같이 사용하므로, 전체적인 코드의 가독성이 떨어지므로,
	이 단점을 보완하기 위해 태그 라이브러리인 JSTL을 사용
	jstl.jar, standard.jar를 WEB-INF/lib폴더에 추가해야한다.
	taglib를 선언해야 한다.
	</pre>
	
	<br>
	<br>
	
	<%--
		변수 지원태그 - <c:set> 태그 -- 여기 <c:set>안지우면 에러남
		var : 값을 지정할 EL 변수의 이름을 지정한다.
		value : 변수의 값을 지정한다.
			표현식(<%= %>), EL(${key.value}), 정적인 텍스트("문자열"); -- 여기 표현식 에러남
	 --%>
	 <c:set var = "num1" value = "8"/>
	 <c:set var = "num2" value = "4"/>
	 <c:set var = "sum" value = "${num1 + num2}"/>
	 <c:set var = "sub" value = "${num1 - num2}"/>
	 <c:set var = "mul" value = "${num1 / num2}"/>
	 <c:set var = "div1" value = "${num1 * num2}"/>
	 ${num1} + ${num2} = ${sum}<br>
	 ${num1} - ${num2} = ${sub}<br>
	 ${num1} * ${num2} = ${mul}<br>
	 ${num1} / ${num2} = ${div1}<br>
	 
</body>
</html>