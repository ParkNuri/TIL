package jdbc.board.exam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Locale;

public class BoardDAOImpl implements BoardDAO {
	
	@Override
	public int insert (BoardDTO board) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		int result = 0;
			
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();
			stmt=con.prepareStatement(sql);
			stmt.setString(1, board.getId());
			stmt.setString(2, board.getTitle());
			stmt.setString(3, board.getContent());
			
			result = stmt.executeUpdate();
			System.out.println("1 개 행 삽입 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			try { // null check 필수!!!!
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
			
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();
			stmt=con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			
			result = stmt.executeUpdate();
			System.out.println("1 개 행 삽입 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		
		return result;
	}

	@Override
	public int update(int boardNum, String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		String sql = "Update tb_board set ID =? where boardnum=?";
		
	
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
			DBUtil.close(null, stmt, con);
		}
		return result;
	}

	@Override
	public int delete(int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;

		int result = 0;
		
		StringBuffer sql = new StringBuffer("delete tb_board ");
		sql.append("where boardnum=?");
		
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
			DBUtil.close(null, stmt, con);
		}
			
		return result;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	} 
}
