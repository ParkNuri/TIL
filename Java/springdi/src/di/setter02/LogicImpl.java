package di.setter02;

public class LogicImpl implements Logic {
	public LogicImpl() {
		System.out.println("LogicImpl 생성");
	}
	@Override
	public void testLogic() {
		System.out.println("db연동, xml파싱, json파싱, 기타 비지니스 로직 구현");
	}
	
}
