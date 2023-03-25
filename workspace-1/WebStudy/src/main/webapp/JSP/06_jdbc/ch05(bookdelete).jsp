<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
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
		String sql = "delete book where b_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("b_id"));
		
		DML_YN = pstmt.executeUpdate();
		
		out.print(DML_YN + "건 delete되었습니다.<br>");
		pstmt.close();
		
		sql = "select * from book";
		pstmt = conn.prepareStatement(sql);
		selectRS = pstmt.executeQuery();
		
		while(selectRS.next()){
			out.print("책 아이디 : " + selectRS.getString("b_id") + "<br>");
			out.print("책 이름 : " + selectRS.getString("b_name") + "<br>");
			out.print("책 저자 : " + selectRS.getString("b_author") + "<br>");
			out.print("책 가격 : " + selectRS.getInt("b_price") + "<br>");
			out.print("책 수량 : " + selectRS.getInt("b_count") + "<br><br>");
			
		}
	} catch(SQLException e) {
		out.print("해당 아이디가 존재하지 않습니다.<br>");
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
</body>
</html>