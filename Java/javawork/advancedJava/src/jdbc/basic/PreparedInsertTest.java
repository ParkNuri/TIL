package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("==========게시글 등록==========");
		System.out.print("아이디: ");
		String id = s.next();
		System.out.print("제목: ");
		String title = s.next();
		System.out.print("내용: ");
		String content = s.next();
		
		obj.insert(id, title, content);
	}

	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";

		Connection con = null;
		PreparedStatement ptmt = null;
		// ResultSet rs = null;

//		String sql = "insert into tb_board values(1,'"+id+"','"+title+"','"+content+"',sysdate,0)";	// statement 방식 
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)"; // 동적 sql	preparedStatement 방식 외부에서 입력받을 값을 ? 로 표시
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!!");
			
			//1. PreparedStatement 생성
			ptmt=con.prepareStatement(sql);
			//2. ?에 값 전달하기
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			//3. 실행하기
			int result = ptmt.executeUpdate();
			//System.out.println(result + "개 행 삽입성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패..");
		} catch (SQLException e) {
			System.out.println("연결실패:" + e.getMessage());
		} finally { // exception이 발생하지 않거나 발생하거 나 무조건 실행할 명령문을 정의
			// 자원 반납
			try { // null check 필수!!!!
				// if(rs!=null)rs.close();
				if (ptmt != null)
					ptmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
