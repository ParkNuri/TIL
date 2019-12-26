package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 직접 코딩해서 작업하기
// 2번 boardnum 의 id를 kang으로 수정

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		String sql = "Update tb_board set ID ='kang' where boardnum=2";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!");
			Statement stmt = con.createStatement();
			stmt.executeQuery(sql);
			System.out.println("1개 행 수정 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패..");
			e.printStackTrace();//오류추적
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패..");
			e.printStackTrace();
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
