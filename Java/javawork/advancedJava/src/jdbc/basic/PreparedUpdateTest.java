package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 직접 코딩해서 작업하기
// 2번 boardnum 의 id를 kang으로 수정

public class PreparedUpdateTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedUpdateTest obj = new PreparedUpdateTest();
		
		System.out.print("변경할 id:");
		String id = key.next();
		System.out.print("변경할 boardnum: ");
		int boardNum = key.nextInt();
		
		obj.update(id, boardNum);
	}
	public void update(String id, int boardNum) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		String sql = "Update tb_board set ID =? where boardnum=?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);
			
			stmt.executeQuery();
			System.out.println("1개 행 수정 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패..");
			e.printStackTrace();//오류추적
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패..");
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
			
			
		 /*catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패..");
		} catch (SQLException e) {
		}
		*/
		
		// TODO Auto-generated method stub
	
	}

}
