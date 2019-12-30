package jdbc.board.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();

	public void insertMenu() {
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();

		// 여기에서 EmpDAO의 메소드를 호출하세요
		BoardDTO board = new BoardDTO(id, title, content);
		int result = dao.insert(board);
	}

	public void updateMenu() {
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		String boardNum = key.next();
		// 여기에서 EmpDAO의 메소드를 호출하세요
		// dao.update(boardNum, id);
	}

	public void deleteMenu() {
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		String boardNum = key.next();
		// 여기에서 EmpDAO의 메소드를 호출하세요
	}

	public void selectMenu() {
		System.out.println("*******게시글조회********");
		// 여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		for (int i = 0; i < size; i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriteDate() + "\t" + board.getHit());
		}
	}

	public void readMenu() {
		System.out.println("*******게시글상세보기********");
		System.out.print("게시글 번호: ");
		int boardnum = key.nextInt();
		BoardDTO board = dao.read(boardnum);
		dao.updateHit(boardnum);
		if (board == null) {
			System.out.println("해당 게시물이 존재하지 않습니다");
		} else {
			System.out.println(board.getBoardNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriteDate() + "\t" + board.getHit());
		}
	}

	public void findByTitleMenu() {
		System.out.println("*******제목으로게시글검색********");
		System.out.print("게시글 제목: ");
		String title = key.next();
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		if (size == 0) {
			System.out.println("해당 게시물이 존재하지 않습니다");
		} else {
			for (int i = 0; i < size; i++) {
				BoardDTO board = boardlist.get(i);
				System.out.println(board.getBoardNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
						+ board.getWriteDate() + "\t" + board.getHit());
			}
		}
	}
}
