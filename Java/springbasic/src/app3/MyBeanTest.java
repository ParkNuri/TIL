package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*  
	스프링을 이용해서 프로그램을 실행하기
	  - new연산자를 이용해서 객체생성하는 코드를 직접 정의하지 않는다.(API제외)
	  - 스프링 내부에서 제공하는 Factory클래스를 이용해서 객체를 전달받는다.
 */
public class MyBeanTest {
	public static void main(String[] args) {
		//스프링의 Factory클래스를 생성
		ApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		//필요한 객체를 factory로 부터 가져오다.
		//설정파일에 등록한 id명을 정의 - <bean>태그의 id속성을 정의
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean");
		//비지니스로직 호출
		run(obj);
		show(obj);
		
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*************************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("*************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("===========================");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("===========================");
	}
}
