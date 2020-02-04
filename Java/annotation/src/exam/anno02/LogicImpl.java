package exam.anno02;

import org.springframework.stereotype.Service;

@Service("mylogic")
public class LogicImpl implements Logic {
	public LogicImpl() {
		System.out.println("LogicImpl생성");
	}
	@Override
	public void testLogic() {
		System.out.println("db연동, xml파싱, json파싱,기타 비지니스 로직 구현");
	}
}
