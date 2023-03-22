package book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import book.vo.BookVO;

public class BookDAO {
	ArrayList<BookVO> bookList;
	String[] colName = {"name","publish","author"};
	
	public ArrayList<BookVO> select(String searchWord, int comboSearchIndex){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		bookList = new ArrayList<BookVO>();
		String sql = "select * from book, category where book.category = category.category_id and " + colName[comboSearchIndex] + " like ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + searchWord + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVO book = new BookVO();
				book.setIsbn(rs.getInt("isbn"));
				book.setName(rs.getString("name"));
				book.setPublish(rs.getString("publish"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				book.setCategory(rs.getString("category_name"));
				bookList.add(book);
			}
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return bookList;
	}
	
	public void insert(BookVO vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into book values(?, ?, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getIsbn());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPublish());
			pstmt.setString(4, vo.getAuthor());
			pstmt.setInt(5, vo.getPrice());
			int categoryId = 0;
			switch (vo.getCategory()) {
				case "IT도서":
					categoryId = 10;
					break;
				case "개발도서":
					categoryId = 20;
					break;
				case "웹툰":
					categoryId = 30;
					break;
				case "에세이":
					categoryId = 40;
					break;
				case "경제":
					categoryId = 50;
					break;
			}
			pstmt.setInt(6, categoryId);
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("잘 추가가 되었습니다.");
			} else {
				System.out.println("추가가 되는 도중 에러가 발생하였습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void update(BookVO vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "update book set name=?, publish=?, author=?, price=?, category=? where isbn = ?;";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPublish());
			pstmt.setString(3, vo.getAuthor());
			pstmt.setInt(4, vo.getPrice());
			int categoryId = 0;
			switch (vo.getCategory()) {
				case "IT도서":
					categoryId = 10;
					break;
				case "개발도서":
					categoryId = 20;
					break;
				case "웹툰":
					categoryId = 30;
					break;
				case "에세이":
					categoryId = 40;
					break;
				case "경제":
					categoryId = 50;
					break;
			}
			pstmt.setInt(5, categoryId);
			pstmt.setInt(6, vo.getIsbn());
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("잘 수정 되었습니다.");
			} else {
				System.out.println("수정되는 도중 에러가 발생하였습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void delete(BookVO vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "delete from book where isbn = ?;";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getIsbn());
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("잘 삭제가 되었습니다.");
			} else {
				System.out.println("삭제가 되는 도중 에러가 발생하였습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}