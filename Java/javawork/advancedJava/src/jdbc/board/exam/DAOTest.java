package jdbc.board.exam;

import java.util.Scanner;
public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******게시판********");
		System.out.println("1. 게시글등록");
		System.out.println("2. 게시글전체목록조회");
		System.out.println("3. 게시글수정");
		System.out.println("4. 게시글삭제");
		System.out.println("5. 제목으로 게시글 검색");
		System.out.println("6. 게시글 상세보기");

		
		
		System.out.print("원하는 작업을 선택하세요:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		MenuUI ui = new MenuUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.selectMenu();
				break;
			case 3:
				ui.updateMenu();
				break;
			case 4:
				ui.deleteMenu();
				break;
			case 5:
				ui.findByTitleMenu();
				break;
			case 6:
				ui.readMenu();
				break;
		}
	}
}













