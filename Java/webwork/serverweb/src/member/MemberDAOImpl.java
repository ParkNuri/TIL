package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

//import PreparedDeleteTest;

public class MemberDAOImpl implements MemberDAO {
	
	public MemberDAOImpl() {
		
	}

	@Override
	public int insert(MemberDTO user) {
		Connection con =null;
		PreparedStatement stmt = null;
		
		String sql ="insert into member values(?,?,?,?,?,sysdate,1000)";
		
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1,user.getId()); 
			stmt.setString(2,user.getPass()); 
			stmt.setString(3,user.getName()); 
			stmt.setString(4,user.getAddr()); 
			stmt.setString(5,user.getDeptno()); 

			System.out.println(sql);
			
			result = stmt.executeUpdate();
			System.out.println(result+" 개 행 삽입성공");
			
		} catch (SQLException e) {
			System.out.println("삽입 실패");
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		
		return result;
	}

	@Override
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		String sql="update member set addr = ? where id = ?";
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, addr);
			stmt.setString(2, id);
			
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 수정 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		
		
		return result;
	}

	@Override
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		int result = 0;
		
		String sql = "delete member where id = ?";
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, id);
			
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삭제 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		
		return result;
	}

	@Override
	public ArrayList<MemberDTO> memberList() {
		Connection con = null;
		PreparedStatement stmt = null;
		MemberDTO member = null;
		ArrayList<MemberDTO> memArr = new ArrayList<MemberDTO>();
		ResultSet rs = null;
		String sql="select * from member";
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			if(rs==null) {
				System.out.println("멤버가 존재하지 않습니다.");
			}else {
				while(rs.next()) {
					member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(7), rs.getString(6));
					memArr.add(member);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memArr;
	}

	@Override
	public ArrayList<MemberDTO> findByAddr(String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		MemberDTO member = null;
		ArrayList<MemberDTO> memArr = new ArrayList<MemberDTO>();
		
		ResultSet rs = null;
		String sql = "select * from member where addr like ?";
		
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "%"+addr+"%");
			rs = stmt.executeQuery();
			
			if(rs == null) {
				System.out.println("해당 주소를 가진 멤버가 존재하지 않습니다");
			}else {
				while(rs.next()) {
					member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(7), rs.getString(6));
					memArr.add(member);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memArr;
	}

	
	@Override
	public MemberDTO findById(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		MemberDTO member = null;
		
		ResultSet rs = null;
		String sql = "select * from member where id = ?";
		
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(7), rs.getString(6));
			}else {
				System.out.println("해당 아이디가 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public MemberDTO login(String id, String pass) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		MemberDTO member = null;
		
		ResultSet rs = null;
		
		String sql = "select * from member where id = ? and pass = ?";
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			
			if(rs.next()==false) {
				System.out.println("로그인 실패");
			}else {
				rs.next();
				System.out.println("로그인 성공");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return member;
	}


	
}
