package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBMS�� �����ϴ� �ߺ��� �۾��� ������ Ŭ����
public class DBUtil {
	// ����̹� �ε��� Ŭ������ �ε��ɶ� ���� �ε��ǵ��� ó�� (Static)
	// -> static{}���� ���ɹ��� Ŭ������ �ε��ɶ� �� ���� ����Ǵ� �ڵ�
	static {

		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����..");
		} 
	
	}
	//2. Ŀ�ؼ��ϱ� - DBMS�� ���� �Ŀ� ���� ������ �����ϰ� �ִ� Connection�� ����
	public static Connection getConnect() throws SQLException {	//��� ��ü���� ���� ������ �ϱ⶧���� static���� ����
		Connection con=null;
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("���Ἲ��!!");
		
		
		return con;
	}
	public static void close(ResultSet rs, Statement stmt, Connection con) {
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
	}
}