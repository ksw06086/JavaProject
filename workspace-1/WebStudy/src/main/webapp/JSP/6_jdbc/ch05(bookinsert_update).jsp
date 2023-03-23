<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
		request.setCharacterEncoding("UTF-8");
%>

<%
	Connection conn = null; // 오라클 연결
	PreparedStatement pstmt = null; // 실행 객체생성
	ResultSet selectRS = null; // 실행결과
	int DML_YN = 0;
	
	/*
		jdbc(Java Database Connectivity)
		- 자바에서 데이터베이스와 관련된 작업을 하는 API
		- DBMS와의 통신을 담당하는 자바 클래스
		- ojdbc11.jar
		- thin 드라이버는 자바언어로만 구현된 JDBC 드라이버로서, JDK만 설치되어 있으면 어디서든 사용할 수 있다.
	*/
	String driver = "oracle.jdbc.driver.OracleDriver"; // ojdbc11.jar 추가되어있어야 함
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // @HOST:PROT:SID
	String userid = "scott";
	String userpw = "tiger";	
%>
<h3>책목록</h3>

<%
	if(request.getParameter("upda") != null){
		try{
			// 1. jdbc 드라이버 로딩
			Class.forName(driver);
			// 2. 데이터베이스 커넥션 생성
			conn = DriverManager.getConnection(url, userid, userpw);
			
			// 3. Preparedstatement 객체 생성
			/*
				- SQL 쿼리의 틀을 미리 생성해 놓고, 값을 나중에 지정
				- 값 변동을 자동으로 하기 위함
				- 간결한 코드를 위해 사용
				- set 계열의 메소드를 사용해서 물음표를 대체할 값을 지정해주어야 한다.
				- 첫번째 물음표의 인덱스는 1이며, 이후 물음표의 인덱스는 나오는 순서대로 인덱스 값이 1씩 증가한다.
			*/
			
			// 4. 쿼리문 작성
			String sql = "update book set b_name = ?, b_author = ?, b_price = ?, b_count = ? where b_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("b_name"));
			pstmt.setString(2, request.getParameter("b_author"));
			pstmt.setString(3, request.getParameter("b_price"));
			pstmt.setString(4, request.getParameter("b_count"));
			pstmt.setString(5, request.getParameter("b_id"));
			
			// 5. 쿼리문 실행
			/*
				- ResultSet executeQuery()
				- Select 문의 실행 결과값을 ResultSet 객체에 담아서 리턴한다.
				- 따라서 ResultSet이 제공하는 메소드를 사용해서 결과값을 읽어올 수 있다.
				- next() 메소드를 사용해서 SELECT 결과의 존재여부를 확인할 수 잇다.
				
				int executeUpdate()
				- insert, update, delete 쿼리를 실행할 때 사용하며, 실행결과로 변경된 레코드의 건수를 리턴한다.
				- SQL문 실행 후 테이블의 내용만 변경되는 경우 사용하며, 변경건수를 int형으로 리턴한다.
			*/
			DML_YN = pstmt.executeUpdate();
			
			out.print(DML_YN + "건 update되었습니다.<br>");
			pstmt.close();
			
			sql = "select * from book";
			pstmt = conn.prepareStatement(sql);
			selectRS = pstmt.executeQuery();
			
			// 5. 쿼리 실행 결과 출력
			while(selectRS.next()){
				out.print("책 아이디 : " + selectRS.getString("b_id") + "<br>");
				out.print("책 이름 : " + selectRS.getString("b_name") + "<br>");
				out.print("책 저자 : " + selectRS.getString("b_author") + "<br>");
				out.print("책 가격 : " + selectRS.getString("b_price") + "<br>");
				out.print("책 수량 : " + selectRS.getString("b_count") + "<br>");
			}
		} catch (SQLException e) {
			out.print("해당 아이디가 없어 update되지 못했습니다.<br>");
			e.printStackTrace();
			out.print(e.getMessage());
		} finally {
			// 6. 사용한 자원 해제
			// finally는 try catch문에서 반드시 실행하는 부분으로, 생성한 객체의 반대 순서로 close();
			try{
				if(selectRS != null){
					selectRS.close();
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
	} else {
		try{
			// 1. jdbc 드라이버 로딩
			Class.forName(driver);
			// 2. 데이터베이스 커넥션 생성
			conn = DriverManager.getConnection(url, userid, userpw);
			
			// 3. Preparedstatement 객체 생성
			// 4. 쿼리문 작성
			String sql = "insert into book values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("b_id"));
			pstmt.setString(2, request.getParameter("b_name"));
			pstmt.setString(3, request.getParameter("b_author"));
			pstmt.setString(4, request.getParameter("b_price"));
			pstmt.setString(5, request.getParameter("b_count"));
			
			// 5. 쿼리문 실행
			DML_YN = pstmt.executeUpdate();
			
			out.print(DML_YN + "건 insert되었습니다.<br>");
			pstmt.close();
			
			sql = "select * from book";
			pstmt = conn.prepareStatement(sql);
			selectRS = pstmt.executeQuery();
			
			// 5. 쿼리 실행 결과 출력
			while(selectRS.next()){
				out.print("책 아이디 : " + selectRS.getString("b_id") + "<br>");
				out.print("책 이름 : " + selectRS.getString("b_name") + "<br>");
				out.print("책 저자 : " + selectRS.getString("b_author") + "<br>");
				out.print("책 가격 : " + selectRS.getString("b_price") + "<br>");
				out.print("책 수량 : " + selectRS.getString("b_count") + "<br>");
			}
		} catch (SQLException e) {
			out.print("insert되지 못했습니다.<br>");
			e.printStackTrace();
			out.print(e.getMessage());
		} finally {
			// 6. 사용한 자원 해제
			// finally는 try catch문에서 반드시 실행하는 부분으로, 생성한 객체의 반대 순서로 close();
			try{
				if(selectRS != null){
					selectRS.close();
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
	}
%>
</body>
</html>