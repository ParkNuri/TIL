package factorypattern;
public class MySQLConnection extends Connection {
	public MySQLConnection(String url) {
		super(url);
	}

	public void connect() {
		System.out.println(url + "위치의 MySQL 서버로 연결을 시도합니다.");
	}
}
