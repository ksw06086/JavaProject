<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Connection conn = null; // 오라클 연결
	PreparedStatement pstmt = null; // 실행 객체 생성
	ResultSet result = null; // 실행결과
	
	/*
		jdbc(Java Database Connectivity)
		- 자바에서 데이터베이스와 관련된 작업을 하는 API
		- DBMS와의 통신을 담당하는 자바 클래스
		- ojdbc6.jar
		- thin 드라이버는 자바언어로만 구현된 JDBC 드라이버로서, 
		  JDK만 설치되어 있으면 어디서든 사용할 수 있다. 
	*/
	String driver = "oracle.jdbc.driver.OracleDriver"; // ojdbc11.jar 추가되어있어야함
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // @HOST:PROT:SID
	String userid = "scott";
	String userpw = "tiger";
%>

<h3>사원목록</h3>
<%
	try{
		//DML문장(I, U, D)를 sql developer에서 실행한 후 commit;을 안한 경우 결과값이 자바에서 출력되지 않음
		
		// 1. jdbc 드라이버 로딩
		Class.forName(driver);
		// 2. 데이터베이스 커넥션 생성
		conn = DriverManager.getConnection(url, userid, userpw);
		
		// 3. Preparedstatement 객체 생성
		/*
			- SQL 쿼리의 틀을 미리 생성해놓고, 값을 나중에 지정
			- 값 변동을 자동으로 하기 위함
			- 간결한 코드를 위해 사용
			- set 계열의 메소드를 사용해서 물음표를 대체할 값을 지정해주어야한다.
			- 첫번째 물음표의 인덱스는 1이며, 이후 물음표의 인덱스는 나온느 순서대로 인덱스 값이 1씩 증가한다.
		*/
		String sql = "select * from emp where ename IN(?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "SMITH");
		pstmt.setString(2, "SCOTT");
		
		result = pstmt.executeQuery();
		
		while(result.next()){
			String no = result.getString("empno");
			String name = result.getString("ename");
			String job = result.getString("job");
			int sal = result.getInt("sal");
			
			out.print("아이디 : " + no + "<br>");
			out.print("이름 : " + name + "<br>");
			out.print("직업 : " + job+ "<br>");
			out.print("급여 : " + sal + "<br>");
		}
	} catch(SQLException e) {
		e.printStackTrace();
		out.print(e.getMessage());
	} finally {
		try{
			if(result != null){
				result.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
%>
</body>
</html>