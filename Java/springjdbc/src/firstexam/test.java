package firstexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("config/hr.xml");
		JobDAO dao = factory.getBean("jobdao", JobDAO.class);
		System.out.println("전체레코드수:"+dao.count());
	}

}
