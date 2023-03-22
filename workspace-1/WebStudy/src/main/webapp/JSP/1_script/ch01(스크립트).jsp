<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 스크립트 요소</title>
</head>
<body>
	<h3> 스크립트 요소 </h3>
	<b> 1. 스크립트릿 </b>
	- JSP 문서안에 JAVA 코드 삽입 <br>
	<%-- 문법
		<%
			자바코드1;
			...
		%>
	 --%>
	<%
		String name = "박예찬";
		int age = 100;
		double a = 3.12345678;
		String email = "park@naver.com";
		String address = "서울시 강남구";
		out.print("이름 : " + name + "<br>");
		out.print("나이 : " + age + "<br>");
		out.print(Math.round(a));
		out.print("이메일 : " + email + "<br>");
		out.print("주소 : " + address + "<br>");
	%>
	
	<br>
	<br>
	
	<b> 2. 표현식(Expresstion) </b><br>
	- 값을 출력한다.<br>
	- 문장의 끝에 ';'을 붙이면 안된다.<br>
	- 스크립트 안에서는 'out.print();' 사용가능<br>
	
	<%-- 문법 : <%= 값 %>
		 값은 변수나 메소드가 올 수 있다. 
	--%>
	이름 : <%= name %><br>
	나이 : <%= age %><br>
	이메일 : <%= email %><br>
	주소 : <%= address %><br>
	<br>
	
	<b> 3. 선언부(Declaration) </b>
	- 변수, 자바메소드(함수)를 만든다. <br>
	
	<%-- 문법
	<%!
		public 리턴타입 메소드명(파라미터) {
			자바코드1;
			자바코드2; ...
		}
	%>--%>
	
	<%! 
		public int divide(int a, int b){
			return a / b;
		}
	%>
	
	4 / 2 = <%= divide(4,2) %>
</body>
</html>