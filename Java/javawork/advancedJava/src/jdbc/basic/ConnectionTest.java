package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	//127.0.0.1 = localhost = 현재 작업 중인 내 pc
	public static void main(String[] args) {
		//연결 문자열 - 어떤 DBMS를 쓰느냐에 따라 형식이 달라진다.
		//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.55:1521:xe";	//짝 아이피
		String url = "jdbc:oracle:thin:@70.12.115.89:1521:xe";
		//원격에 있는 실제 DB서버 IP 접속 가능
		//접속계정
		String user = "scott";
		//접속할 계정의 패스워드
		String password = "tiger";
		try {
			//1. 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); //forname 메소드를 통해 클래스를 static영역에 올려줌
			System.out.println("드라이버로딩 성공!!");
			//2. DBMS에 연결하기 - 연결정보를 정의
			// ==> DBMS에 연결하고 연결정보를 Connection타입으로 반환
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!:"+conn); //oracle.jdbc.driver.T4CConnection 리턴 오라클에 연결되는 객체 생성  .. 사용하는 DB의 객체를 리턴
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
		}
	}

}
