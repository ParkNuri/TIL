package jdbc;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
	
		
		//여기에서 EmpDAO의 메소드를 호출하세요
		BoardDTO board  = new BoardDTO(id, title, content);
		int result = dao.insert(board);
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		String boardNum = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		String boardNum = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
	}
	public void findByAddrMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
		String title = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
	}
	
	
	public void selectMenu(){
		System.out.println("*******게시글조회********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
	}
}


















