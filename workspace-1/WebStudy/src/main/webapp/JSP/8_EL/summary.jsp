<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어(Expression Language)</title>
</head>
<body>
	<h2> 표현언어(Expression Language) </h2>
	
	<pre>
		lib 폴더에 jstl.jar standard.jar를 붙여 넣는다.
		표현언어랑 표현식(Expressionn) 또는 액션태그를 대신해서, 값을 간결하고 편리하게 표현하는 언어이다.
		
		1. 표현식 <%= "변수명 || value || 메소드" %>
			산술연산 	: +,-,*,/
			관계형 	: ==, !=, <. >, <=, >=
			조건		: a>b?a:b
			논리		: &&, ||
			
		2. EL 언어의 내장객체
		- param : 웹브라우저의 <form> 태그를 통해 입력된 데이터를 가져올 때 사용한느 내장객체이다.
					reqeust.getParameter(이름);의 결과와 동일함
				
				- 사용방법 1)번, 4)번 많이 사용
				1) param 뒤에 마침표를 찍고, 해당 데이터 이름을 쓰는 방법 
				- ex) ${param.email}
				<%
					String strEmail = request.getParameter("email");
				%>
				<%= strEmail %>
				
				==> ${param.email}
				
				<%
					String[] strhobby = request.getParameterValues("hobby");
				%>
				<%= strhobby %>
				
				==> ${paramValues.hobby}
				
				2) param 뒤에 대괄호를 하고, 그 안에 작은 따옴표나 큰 따옴표로 묶은 데이터 이름을 쓰는 방법
				- ex) ${param["color"]}
				
				3) paramValues : <from> 태그를 통해 똑같은 이름의 데이터가 여러개 입력되는 경우 ...
				- 예) 체크박스
				- ex) ${paramValues.color[인덱스]} .. 0부터 시작
				
				4) request.setAttribute("키값", value);
				   request.getAttribute("키값");
				   ==> ${키값.멤버변수} 또는 ${키값.get멤버메소드()}
				   ==> ${vo.getId()}	// ${key.메소드()}
				   ==> ${vo.id}			// ${key.멤버변수}
				   
				5) pageContext		: JSP의 page 기본객체와 동일
				   pageScopt 		: pageContext 기본 객체에 저장된 속성 <속성, 값> 매핑을 저장한 Map 객체
				   reqeustScopt		: request 기본 객체에 저장된 속성 <속성, 값> 매핑을 저장한 Map 객체
				   sessionScopt		: session 기본 객체에 저장된 속성 <속성, 값> 매핑을 저장한 Map 객체
				   applicationScope	: application 기본 객체에 저장된 속성 <속성, 값> 매핑을 저장한 Map 객체
				
	</pre>
</body>
</html>