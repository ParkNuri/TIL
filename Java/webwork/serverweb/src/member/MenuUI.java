package member;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	MemberDAO dao = new MemberDAOImpl();
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
		System.out.print("부서번호:");
		String deptno = key.next();
		
		MemberDTO dto = new MemberDTO(id, pass, name, addr, deptno);
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		dao.insert(dto);
		
		
		
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		
		MemberDTO dto = new MemberDTO(id, addr);
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		
		MemberDTO dto = new MemberDTO(id);
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		dao.delete(id);
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		
		ArrayList<MemberDTO> memArr = dao.findByAddr(addr);
		MemberDTO member = new MemberDTO(); 
		int size = memArr.size();
		for (int i = 0; i < size; i++) {
			member = memArr.get(i);
			System.out.println(member.toString());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
		ArrayList<MemberDTO> memArr = dao.memberList();
		int size = memArr.size();
		MemberDTO member = new MemberDTO();
		for (int i = 0; i < size; i++) {
			member = memArr.get(i);
			System.out.println(member.toString());
					
		}
		
	}
	public void loginMenu() {
		System.out.println("*******로그인********");
		System.out.print("아이디: ");
		String id = key.next();
		System.out.print("패스워드: ");
		String pass = key.next();
		
		
		dao.login(id, pass);
		
		
	}
}


















