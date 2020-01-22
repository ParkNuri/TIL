package factorypattern;
//container 역할
//문제점
//: 새 콘텐츠가 추가될 때 마다 ConnectionFactory 파일을 수정해야한다.
public class ConnectionFactory {
	public Connection getConnection(String str) {
		
		String url = str.toLowerCase();	// 사용자의 입력 값 전처리
		
		if (url.indexOf("oracle") >= 0) {
			return new OracleConnection(url);
		} else if (url.indexOf("mysql") >= 0) {
			return new MySQLConnection(url);
		} else if (url.indexOf("mongo") >= 0) {
			return new MongoConnection(url);
		} else {
			return null;
		}
	} 	
}
