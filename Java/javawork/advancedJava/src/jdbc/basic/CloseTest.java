package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.115.55:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		String sql = "select id, title, content from tb_board";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			
			//select문을 실행
			rs = stmt.executeQuery(sql);
			System.out.println("rs: "+rs);	// oracle에서 제공하는 resultset : oracle.jdbc.driver.OracleResultSetImpl@2173f6d9
			//ResultSet에 레코드가 존재하는 동안 반복문 실행
			while(rs.next()) {	// 레코드를 조회하기 위해서는 레코드가 한개라도 반드시 커서를 이동시켜야한다.
				//System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString("content")+"\t");
				//System.out.print(rs.getDate(5)+"\t");
				//System.out.println(rs.getInt(6));
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {	// exception이 발생하지 않거나 발생하거 나 무조건 실행할 명령문을 정의
					//자원 반납
			try { 	//	null check 필수!!!!
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
