<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
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
	Connection conn = null;
	PreparedStatement pstmt = null;
	int DML_YN = 0;
	ResultSet selectRS = null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String userpw = "tiger";
	Class.forName(driver);
%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<h3>책목록</h3>

<%	
	try{
		conn = DriverManager.getConnection(url, userid, userpw);		
		String sql = "select * from book";
		pstmt = conn.prepareStatement(sql);
		selectRS = pstmt.executeQuery();
		
		while(selectRS.next()){
			out.print("책 아이디 : " + selectRS.getString("b_id") + "<br>");
			
		}
	} catch(SQLException e) {
		e.printStackTrace();
		out.print(e.getMessage());
	} finally {
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
%>

	<!-- 컬럼명과 input name이 일치해야한다. -->
	<form action = "ch05(bookinsert_update).jsp" method = "post">
		<table border = "1">
			<tr>
				<td>책 ID</td>
				<td>
				<input type = "text" name = "b_id" size = "10">
				</td>
			</tr>
			<tr>
				<td>책 이름</td>
				<td>
				<input type = "text" name = "b_name" size = "20">
				</td>
			</tr>
			<tr>
				<td>책 저자</td>
				<td>
				<input type = "text" name = "b_author" size = "20">
				</td>
			</tr>
			<tr>
				<td>책 가격</td>
				<td>
				<input type = "text" name = "b_price" size = "10">
				</td>
			</tr>
			<tr>
				<td>책 수량</td>
				<td>
				<input type = "text" name = "b_count" size = "10">
				</td>
			</tr>
			
			<tr>
				<td colspan = "2"><input type= "submit" value = "전송" name = "ins">
				<input type= "submit" value = "수정" name = "upda"></td>
			</tr>
		</table>
	</form>
	
	<form action = "ch05(bookdelete).jsp" method = "post">
		<table border = "1">
			<tr>
				<td>책 ID</td>
				<td>
				<input type = "text" name = "b_id" size = "10">
				</td>
			</tr>
			
			<tr>
				<td colspan = "2"><input type= "submit" value = "삭제"></td>
			</tr>
		</table>
	</form>
</body>
</html>