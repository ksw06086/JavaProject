<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
	<h3>jstl - forEach 태그</h3>
	
	<%-- 
		forEach태그는 배열, Collection, 또는 Map에 저장되어 있는 값들을 순차적으로 처리할 때 사용한다.
		자바의 for, do-while 등을 대신해서 사용할 수 있다.
		
		<c:forEach var = "변수명" items = "${객체명(=키값)}" begin = "시작인덱스" 
						end = "끝인덱스 step = "증감식" [varStatus = "상태변수"]>
				${변수명} 또는 ${변수명.멤버변수/멤버메소드}
		</c:forEach>
		
		step = "1"인 경우 생략가능					
	 --%>
	 
	 <c:forEach var = "i" begin="1"  end="10" step="1">
	 	${i}
	 </c:forEach>
	 <c:forEach var = "j" begin="2"  end="10" step="2">
	 	${j}
	 </c:forEach>
</body>
</html>