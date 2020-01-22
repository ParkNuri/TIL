package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory(컨테이너)가 객체를 관리하는 방법 - 언제 객체를 생성할까?

public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("********Resource생성전************");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("********BeanFactory생성전************");
		BeanFactory  factory = new XmlBeanFactory(res);
		
		System.out.println("********getBean호출전************");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		if(obj==obj2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
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
