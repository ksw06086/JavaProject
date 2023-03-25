<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.PreparedStatement" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "java.sql.SQLException" %>
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
	int rs = 0;
	ResultSet rs2 = null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String userpw = "tiger";
	Class.forName(driver);
%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<h3>제품목록</h3>
<%
	
	try{
		conn = DriverManager.getConnection(url, userid, userpw);
		String sql = "update product set p_name = ?, p_brand = ?, p_price = ? where p_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("p_name"));
		pstmt.setString(2, request.getParameter("p_brand"));
		pstmt.setString(3, request.getParameter("p_price"));
		pstmt.setString(4, request.getParameter("p_id"));
		
		rs = pstmt.executeUpdate();
		
		out.print(request.getParameter("p_id") + rs + "건 update되었습니다.<br>");
		
		sql = "select * from product";
		pstmt = conn.prepareStatement(sql);
		rs2 = pstmt.executeQuery();
		
		while(rs2.next()){
			out.print("제품 아이디 : " + rs2.getString("p_id") + "<br>");
			out.print("제품 명 : " + rs2.getString("p_name") + "<br>");
			out.print("제품 브랜드 : " + rs2.getString("p_brand") + "<br>");
			out.print("제품 가격 : " + rs2.getInt("p_price") + "<br><br>");
			
		}
	} catch(SQLException e) {
		out.print("insert되지 못했습니다.<br>");
		e.printStackTrace();
		out.print(e.getMessage());
	} finally {
		try{
			if(rs2 != null){
				rs2.close();
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