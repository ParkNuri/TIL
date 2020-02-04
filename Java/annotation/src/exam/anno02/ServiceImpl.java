package exam.anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements MyService {
	@Autowired
	@Qualifier("mylogic")
	Logic mylogic;
	String name;
	String msg;
	
	public ServiceImpl() {
		
	}
	
	public ServiceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl의 매개변수3개 생성자");
	}

	@Override
	public void test() {
		//Logic의 메소드를 호출하는 메소드
		//System.out.println(msg+","+name);
		mylogic.testLogic();
	}

}
