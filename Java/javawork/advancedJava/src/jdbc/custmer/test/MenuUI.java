package jdbc.custmer.test;
import java.sql.Date;
import java.util.Scanner;

public class MenuUI {
	
	CustomerDAO dao = new CustomerDAO();
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		//입사일은 오늘날짜 = sysdate, point = 1000가 삽입이 되도록
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
	
		
		CustomerDTO dto = new CustomerDTO(id, pass, name, addr);
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		dao.insert(dto);
		
		
		
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		
		CustomerDTO dto = new CustomerDTO(id, addr);
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		
		CustomerDTO dto = new CustomerDTO(id);
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		dao.delete(id);
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
	}
	
	
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
	}
}


















