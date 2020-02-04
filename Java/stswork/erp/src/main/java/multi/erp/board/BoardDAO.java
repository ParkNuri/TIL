package multi.erp.board;

import java.util.List;

public interface BoardDAO {
	//게시글전체목록조회
	List<BoardVO> boardList();
	//게시글등록하기
	int insert(BoardVO board);
	List<BoardVO> categorySearch(String category);
	List<BoardVO> searchList(String tag,String search);
	List<BoardVO> pageList();
	//게시글조회
	BoardVO read(String board_no);
	//게시글수정
	int update(BoardVO board);
	//게시글삭제
	int delete(String board_no);
}
