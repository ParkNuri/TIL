package jdbc.dept;
import java.sql.Date;
import java.util.Scanner;

public class MenuUI {
	
	DeptDAO dao = new DeptDAO();
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		 System.out.println("*******부서등록********");
	        System.out.print("아이디:");
	        String id = key.next();
	        System.out.print("제목:");
	        String title = key.next();
	        System.out.print("내용:");
	        String content = key.next();

	        DeptDTO dept = new DeptDTO(id, title, content);
	        int result = dao.insert(dept);
		
		
		
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		
		DeptDTO dto = new DeptDTO(id, addr);
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		
		DeptDTO dto = new DeptDTO(id);
		
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


















