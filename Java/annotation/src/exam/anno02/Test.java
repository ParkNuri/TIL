package exam.anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory =
				new GenericXmlApplicationContext("config/bean.xml");
		MyService myservice = 
				factory.getBean("serviceImpl", MyService.class);
		myservice.test();
	}
}
