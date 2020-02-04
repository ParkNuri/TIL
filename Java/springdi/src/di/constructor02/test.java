package di.constructor02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// Bean.xml 내의 모든 객체들이 생성됨
		ApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		Service myservice = factory.getBean("service", Service.class);
		myservice.test();
	}

}
