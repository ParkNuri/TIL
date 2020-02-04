package multi.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/board/list.do")
	public ModelAndView boardList(String category) {
		System.out.println("category=>"+category);
		ModelAndView mav = new ModelAndView();
		//1. 요청정보 추출
		//2. 비지니스 메소드 호출
		List<BoardVO> list = service.boardList(category);
		System.out.println(list);
		//3. 데이터 공유 - jsp페이지에서 응답뷰 만들때 사용
		//	 => 기본값  : request에 저장
		mav.addObject("boardlist", list);
		mav.addObject("category", category);
		//4. 뷰의 이름을 등록
		mav.setViewName("board/list"); //tiles에 등록하는 이름과 일치
		
		//5. 기본이 forward
		
		
		return mav;
	}
	//게시글을 작성하기 위한 뷰를 response할 메소드
	@RequestMapping(value="/board/write.do", method=RequestMethod.GET)
	public String insertView() {
		return "board/write";	//tiles에 등록하는 이름과 일치
	} 
	//입력한 글을 실제 db에 저장하는 메소드
	@RequestMapping(value="/board/write.do", method=RequestMethod.POST)
	public String insert(BoardVO board){
		System.out.println("*****************"+board);
		int result = service.insert(board);
		System.out.println("#################"+result);
		return "redirect:/board/list.do?category=all";
	}
	@RequestMapping(value="/board/search.do")
	public ModelAndView search(String tag, String search) {
		ModelAndView mav= new ModelAndView();
		List<BoardVO> list = service.searchList(tag, search);
		mav.addObject("boardlist", list);
		mav.setViewName("board/list");
		
		return mav;
	}
}
