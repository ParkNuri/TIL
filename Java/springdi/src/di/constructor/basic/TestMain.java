package di.constructor.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		//Insa insa = new InsaImpl();
		Insa insa = factory.getBean("insa", Insa.class);
		MemberDTO user = new MemberDTO("jang","1234","¿Âµø∞«");
		insa.addUser(user);

	}

}
