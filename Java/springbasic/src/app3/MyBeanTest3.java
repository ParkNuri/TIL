package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest3 {
	public static void main(String[] args) {
		ApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		if(obj1==obj2) {
			System.out.println("°°´Ù.");
		}else {
			System.out.println("´Ù¸£´Ù.");
		}
		run(obj1);
		show(obj1);
		run(obj2);
		show(obj2);
		
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*************************");
		obj.hello("Çöºó");
		obj.hello("Çöºó");
		System.out.println("*************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("===========================");
		obj.hello("Çöºó");
		obj.hello("Çöºó");
		System.out.println("===========================");
	}
}
