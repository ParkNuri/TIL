package factorypattern;
public class OracleConnection extends Connection {
	public OracleConnection(String url) {
		super(url);
	}

	public void connect() {
		System.out.println(url + "위치의 오라클 서버로 연결을 시도합니다.");
	}
}
