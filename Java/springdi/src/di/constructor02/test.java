package di.constructor02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// Bean.xml ���� ��� ��ü���� ������
		ApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		Service myservice = factory.getBean("service", Service.class);
		myservice.test();
	}

}