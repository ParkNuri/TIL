package dl.book.exam.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 스프링컨테이너에 의해 생성해서 객체를 전달받아 사용할 수 있도록 수정하기
		 * Dependency LookUp 적용
		 * 설정파일: config/bean.xml
		 * 빈 등록:
		 * 		SamsungTv => samsung
		 * 		LgTv -> lg
		 * 
		 * getBean으로 얻어와서 작업하도록 코드 수정하기
		 * 
		 */
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml"); 
		//TV samsung = (TV)factory.getBean("samsung");
		TV tv = factory.getBean("tv", TV.class);
		playTV(tv);
		
		TV lg = (TV)factory.getBean("lg");
		playTV(lg);
	}
	public static void playTV(TV tv) {
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
	}

}
