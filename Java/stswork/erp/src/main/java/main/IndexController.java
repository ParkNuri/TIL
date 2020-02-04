package main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {
	/*	
	 * /index.do 로 요청하면 'index'라는 이름의 뷰를 forward하겠다.
	 *	=> index라는 뷰는 내 스프링 설정파일에 등록된 ViewResolver에 따라 다르게 작성된다.
	 */
	@RequestMapping("/index.do")
	public String index() {
		return "index";
	}
	
}
