package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//ApplicationContext啊 按眉甫 包府窍绰 规过
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("*********ApplicationContext积己傈*********");
		ApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		
		System.out.println("*********getBean龋免傈*********");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		run(obj);
		show(obj);
		
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*************************");
		obj.hello("泅后");
		obj.hello("泅后");
		System.out.println("*************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("===========================");
		obj.hello("泅后");
		obj.hello("泅后");
		System.out.println("===========================");
	}
}
