package daily.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import daily.dao.JDBCConnector;
import daily.vo.DailyDefaultVO;
import daily.vo.DailyEmotionVO;
import daily.vo.DailyTodoVO;

public class DailyDAO {
	DailyDefaultVO defaultVO = null;
	ArrayList<DailyEmotionVO> emotionList = new ArrayList<DailyEmotionVO>();
	ArrayList<DailyTodoVO> todoList = new ArrayList<DailyTodoVO>();
	
	public DailyDefaultVO defaultSelect(Date date){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from default_daily where date = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, date);
			rs = pstmt.executeQuery();
			defaultVO = null;
			if(rs.next()) {
				defaultVO = new DailyDefaultVO();
				defaultVO.setDate(rs.getDate("date"));
				defaultVO.setContent(rs.getString("content"));
			}
			
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
		
		return defaultVO;
	}
	
	// �Ϲ� �ϱ� �߰�
	public void defaultInsert(DailyDefaultVO vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into default_daily values(?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, vo.getDate());
			pstmt.setString(2, vo.getContent());
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("�� �߰��� �Ǿ����ϴ�.");
			} else {
				System.out.println("�߰��� �Ǵ� ���� ������ �߻��Ͽ����ϴ�.");
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
	
	// �Ϲ� �ϱ� ����
	public void defaultUpdate(DailyDefaultVO vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "update default_daily set content=? where date = ?;";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getContent());
			pstmt.setDate(2, vo.getDate());
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("�� ���� �Ǿ����ϴ�.");
			} else {
				System.out.println("�����Ǵ� ���� ������ �߻��Ͽ����ϴ�.");
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
	
	// �Ϲ� �ϱ� ����
/*public void defaultDelete(DailyDefaultVO vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "delete from default_daily where date = ?;";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, vo.getDate());
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("�� ������ �Ǿ����ϴ�.");
			} else {
				System.out.println("������ �Ǵ� ���� ������ �߻��Ͽ����ϴ�.");
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
		
	}*/
	
	
	public ArrayList<DailyEmotionVO> emotionSelect(Date date){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from emotion_daily where date = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, date);
			rs = pstmt.executeQuery();
			emotionList.clear();
			while(rs.next()) {
				DailyEmotionVO vo = new DailyEmotionVO();
				vo.setDate(rs.getDate("date"));
				vo.setIsbn(rs.getInt("isbn"));
				vo.setEmotion(rs.getString("emotion"));
				vo.setContent(rs.getString("content"));
				emotionList.add(vo);
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
		
		return emotionList;
	}
	
	// ���� �ϱ� �߰�
	public void emotionInsert(ArrayList<DailyEmotionVO> vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into emotion_daily values(?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			for (int i = 0; i < vo.size(); i++) {
				pstmt.setDate(1, vo.get(i).getDate());
				pstmt.setInt(2, vo.get(i).getIsbn());
				pstmt.setString(3, vo.get(i).getEmotion());
				pstmt.setString(4, vo.get(i).getContent());
				int res = pstmt.executeUpdate();
				if(res > 0) {
					System.out.println("�� �߰��� �Ǿ����ϴ�.");
				} else {
					System.out.println("�߰��� �Ǵ� ���� ������ �߻��Ͽ����ϴ�.");
				}
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
	
	// ���� �ϱ� ����
	public void emotionUpdate(ArrayList<DailyEmotionVO> vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "update emotion_daily set emotion=?, content=? where date = ? and isbn = ?;";
		try {
			pstmt = con.prepareStatement(sql);
			for (int i = 0; i < vo.size(); i++) {
				pstmt.setString(1, vo.get(i).getEmotion());
				pstmt.setString(2, vo.get(i).getContent());
				pstmt.setDate(3, vo.get(i).getDate());
				pstmt.setInt(4, vo.get(i).getIsbn());
				int res = pstmt.executeUpdate();
				if(res > 0) {
					System.out.println("�� ���� �Ǿ����ϴ�.");
				} else {
					System.out.println("�����Ǵ� ���� ������ �߻��Ͽ����ϴ�.");
				}
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
	
	public ArrayList<DailyTodoVO> todolistSelect(Date date){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from todo_daily where date = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, date);
			rs = pstmt.executeQuery();
			todoList.clear();
			while(rs.next()) {
				DailyTodoVO vo = new DailyTodoVO();
				vo.setIsbn(rs.getInt("isbn"));
				vo.setDate(rs.getDate("date"));
				vo.setTodo(rs.getString("todo"));
				vo.setChecked(rs.getInt("checked"));
				todoList.add(vo);
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
		
		return todoList;
	}
	
	// Todo ����Ʈ �߰�
	public void todolistInsert(ArrayList<DailyTodoVO> vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into todo_daily values(?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			for (int i = 0; i < vo.size(); i++) {
				pstmt.setInt(1, vo.get(i).getIsbn());
				pstmt.setDate(2, vo.get(i).getDate());
				pstmt.setString(3, vo.get(i).getTodo());
				pstmt.setInt(4, vo.get(i).getChecked());
				int res = pstmt.executeUpdate();
				if(res > 0) {
					System.out.println("�� �߰��� �Ǿ����ϴ�.");
				} else {
					System.out.println("�߰��� �Ǵ� ���� ������ �߻��Ͽ����ϴ�.");
				}
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
	
	// Todo ����Ʈ ����
	public void todolistUpdate(ArrayList<DailyTodoVO> vo){
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		String sql = "update todo_daily set todo=?, checked=? where date = ? and isbn = ?;";
		try {
			pstmt = con.prepareStatement(sql);
			for (int i = 0; i < vo.size(); i++) {
				pstmt.setString(1, vo.get(i).getTodo());
				pstmt.setInt(2, vo.get(i).getChecked());
				pstmt.setDate(3, vo.get(i).getDate());
				pstmt.setInt(4, vo.get(i).getIsbn());
				int res = pstmt.executeUpdate();
				if(res > 0) {
					System.out.println("�� ���� �Ǿ����ϴ�.");
				} else {
					System.out.println("�����Ǵ� ���� ������ �߻��Ͽ����ϴ�.");
				}
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
