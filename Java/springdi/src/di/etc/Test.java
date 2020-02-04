package di.etc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// Bean.xml 내의 모든 객체들이 생성됨
		ApplicationContext factory = new GenericXmlApplicationContext("config/etc.xml");
		CollectionTest etc1 = factory.getBean("collection", CollectionTest.class);
		
		etc1.getList();
		etc1.getMap();
		
		ConstructorTest etc2 = factory.getBean("con1", ConstructorTest.class);
		System.out.println(etc2);

		ConstructorTest etc3 = factory.getBean("con2", ConstructorTest.class);
		System.out.println(etc3);
		
		ConstructorTest etc4 = factory.getBean("con3", ConstructorTest.class);
		System.out.println(etc4);
	}

}
