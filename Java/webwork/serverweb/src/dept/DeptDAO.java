package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;
import member.MemberDTO;

public class DeptDAO {
	public DeptDAO() {
		
	}
	//행 삭제
	public int deleteLine(String deptno) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		int result = 0;
		
		String sql = "delete mydept where deptno = ?";
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, deptno);
			
			result = stmt.executeUpdate();
			System.out.println(sql);
			System.out.println(result+"개 행 삭제 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		
		return result;
	}
	//전체 목록 출력
	public ArrayList<DeptDTO> getDeptList(){
		ArrayList<DeptDTO> deptArr = new ArrayList<DeptDTO>();
		DeptDTO dept = new DeptDTO();
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		String sql = "select * from mydept";
		
		ResultSet rs = null;
		
		int result=0;
		
		try {
			con = DBUtil.getConnection();
			
			stmt = con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			if(rs==null) {
				System.out.println("멤버가 존재하지 않습니다.");
			}else {
				while(rs.next()) {
					dept = new DeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
					deptArr.add(dept);
				}
			}
			System.out.println(sql);
			
			result = stmt.executeUpdate();
			//System.out.println(result+" 개 행 삽입성공");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, con);
		}
		
		
		
		return deptArr;
	}
	//부서번호로 부서정보 조회
	public DeptDTO read(String deptno){
		DeptDTO dept = new DeptDTO();
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		String sql = "select * from mydept where deptno = ?";
		
		ResultSet rs = null;
		
		int result=0;
		
		try {
			con = DBUtil.getConnection();
			
			stmt = con.prepareStatement(sql);
			stmt.setNString(1, deptno);
			rs = stmt.executeQuery();
			if(rs.next()) {
				dept = new DeptDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}else {
				System.out.println("해당 부서가 존재하지 않습니다.");
			}
			System.out.println(sql);
			
			result = stmt.executeUpdate();
			System.out.println(result+" 개 행 검색 성공");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, con);
		}	
		
		return dept;
	}

	//부서 등록
	public int insert(DeptDTO dept) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		String sql = "insert into mydept values(?,?,?,?,?)";
		
		int result=0;
		
		try {
			con = DBUtil.getConnection();
			
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, dept.getDeptno());
			stmt.setString(2, dept.getDeptname());
			stmt.setString(3, dept.getLoc());
			stmt.setString(4, dept.getTel());
			stmt.setString(5, dept.getMgr());
			
			System.out.println(sql);
			
			result = stmt.executeUpdate();
			System.out.println(result+" 개 행 삽입성공");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		
		return result;
	}
}
