package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//deleteTest.java
//updatetestjava를 rename해서 작업 sql문만 delete문으로 변경해서 실행해 보기
	//	3 boardnum 게시물 삭제
//[출력형태]
//1개행 삭제
public class DeleteTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		
		StringBuffer sql = new StringBuffer("delete tb_board ");
		sql.append("where boardnum=3");	// 다수의 동시접근시 메모리 관리를 위해 StringBuffer사용
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!");
			Statement stmt = con.createStatement();
			stmt.executeQuery(sql.toString());	// or (sql+"") // StringBuffer -> String
			System.out.println("1개 행 제거 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패..");
			e.printStackTrace();//오류추적
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패..");
			e.printStackTrace();
		}
			
	}

}
