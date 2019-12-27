package jdbc.board.exam;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;

public class BoardDaoTest {

	public static void main(String[] args) {

		
		
		Scanner key = new Scanner(System.in);
		BoardDAOImpl dao = new BoardDAOImpl();
/*
		boolean status = true;

		while (status) {
			
			System.out.println("1. 게시글 등록\n2.게시글 삭제\n3.게시글 아이디 수정\n4. 게시글 목록\n0. 프로그램 종료");
			System.out.print("수행할 작업을 선택하세요. : ");
			int funcNum = key.nextInt();

			switch (funcNum) {

			// insert
			case 1:
				System.out.println("==========게시글 등록==========");
				System.out.print("아이디: ");
				String iId = key.next();
				System.out.print("제목: ");
				String title = key.next();
				System.out.print("내용: ");
				String content = key.next();

				dao.insert(iId, title, content);
				break;

				// select
			case 2:
				dao.select();
				break;

				// delete
			case 3:
				System.out.print("삭제할 게시물 번호 : ");
				int dBoardNum = key.nextInt();

				dao.delete(dBoardNum);
				break;

				// update
			case 4:

				System.out.print("변경할 id:");
				String uId = key.next();
				System.out.print("변경할 boardnum: ");
				int uBoardNum = key.nextInt();

				dao.update(uId, uBoardNum);
				break;
				
			case 0: status = false;
			}
		}
		System.out.println("프로그램 종료");
 */
		dao.select();
	}

}
