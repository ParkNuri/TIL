package dept;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("config/erp.xml");
		DeptServiceImpl service = factory.getBean("deptService", DeptServiceImpl.class);
		System.out.println("전체 부서 갯수:"+service.count());
		//System.out.println("삽입성공?"+service.insert("aa12346", "stswork"));
		System.out.println("업데이트성공?"+service.update("aa12345", "javawork"));
		
		List<DeptDTO> list = service.selectAll();
		
		for (DeptDTO a : list) {
			System.out.println(a.getDeptname()+"  "+a.getDeptno());
		}
	}

}
