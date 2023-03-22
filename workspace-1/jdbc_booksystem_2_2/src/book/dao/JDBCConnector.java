package book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnector {
	private static final String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	// localhost의 ip주소 - 127.0.0.1
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/db2022_2_2?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
	private static final String ID = "root";
	private static final String PWD = "1234";	
	private static Connection con;
	
	public static Connection getCon() {
		try {
			Class.forName(DRIVER_PATH);
			System.out.println("정상적으로 JDBC Driver가 Load되었습니다.");
			con = DriverManager.getConnection(URL, ID, PWD);
			System.out.println("연결이 잘 되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void resultSetTest() {
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from book";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getString("author") + " " + rs.getInt("price"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getCon();
		resultSetTest();
	}
}