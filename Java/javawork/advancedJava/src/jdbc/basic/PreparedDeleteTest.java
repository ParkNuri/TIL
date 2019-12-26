package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//deleteTest.java
//updatetestjava를 rename해서 작업 sql문만 delete문으로 변경해서 실행해 보기
	//	3 boardnum 게시물 삭제
//[출력형태]
//1개행 삭제
public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		PreparedDeleteTest obj = new PreparedDeleteTest();
		
		System.out.print("삭제할 게시물 번호 : ");
		int boardNum = key.nextInt();
		
		obj.delete(boardNum);
	}
		public void delete(int boardNum) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		
		StringBuffer sql = new StringBuffer("delete tb_board ");
		sql.append("where boardnum=?");	// 다수의 동시접근시 메모리 관리를 위해 StringBuffer사용
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!");
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
			stmt.executeQuery();	// or (sql+"") // StringBuffer -> String
			System.out.println("1개 행 제거 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패..");
			e.printStackTrace();//오류추적
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패..");
			e.printStackTrace();
		}finally {
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

}
