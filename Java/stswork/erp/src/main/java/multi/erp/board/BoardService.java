package multi.erp.board;

import java.util.List;

public interface BoardService {
	//게시글 조회 - 전체조회 및 카테고리별 조회 작업
	List<BoardVO> boardList(String category);
	int txinsert(BoardVO board);
	//게시글 등록
	int insert(BoardVO board);
	List<BoardVO> searchList(String search);
	List<BoardVO> searchList(String tag, String search);
	List<BoardVO> pageList();
	BoardVO read(String board_no);
	int update(BoardVO board);
	int delete(String board_no);
	
	
	List<BoardVO> findByCategory(String category);
	
}









