package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//tb_board테이블을 엑세스하는 기능이 정의된 클래스
public interface BoardDAO {
	
	
		
		int insert(BoardDTO board);
		int insert(String id, String title, String content);
		int update(int boardNum, String id);
		int delete(int boardNum);
		void select();
	
		
		
/*
	public void insert(String id, String title, String content) {
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		PreparedStatement ptmt = null;

		Connection con = null;
			
		try {
			con = DBUtil.getConnect();
			ptmt=con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			
			int result = ptmt.executeUpdate();
			System.out.println("1 개 행 삽입 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			try { // null check 필수!!!!
				if (ptmt != null)
					ptmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void update(String id, int boardNum) {
		
		String sql = "Update tb_board set ID =? where boardnum=?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);
			
			stmt.executeQuery();
			System.out.println("1개 행 수정 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { 
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
			
	}
	
	
	public void delete(int boardNum) {
		
		
		StringBuffer sql = new StringBuffer("delete tb_board ");
		sql.append("where boardnum=?");
		
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
			stmt.executeQuery();	
			System.out.println("1개 행 제거 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { 
				 
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
			
	}
	
	public void select() {

		String sql = "select * from tb_board";

		ResultSet rs = null;
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString("content") + "\t");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}*/
	


}
