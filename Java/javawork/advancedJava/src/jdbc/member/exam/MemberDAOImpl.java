package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.basic.PreparedDeleteTest;

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
			System.out.println(result+" �� �� ���Լ���");
			
		} catch (SQLException e) {
			System.out.println("���� ����");
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
			System.out.println(result+"�� �� ���� ����");
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
			System.out.println(result+"�� �� ���� ����");
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
				System.out.println("����� �������� �ʽ��ϴ�.");
			}else {
				while(rs.next()) {
					member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
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
				System.out.println("�ش� �ּҸ� ���� ����� �������� �ʽ��ϴ�");
			}else {
				while(rs.next()) {
					member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
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
				System.out.println("�α��� ����");
			}else {
				rs.next();
				System.out.println("�α��� ����");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return member;
	}


	
}