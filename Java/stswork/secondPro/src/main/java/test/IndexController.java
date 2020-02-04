package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String main() {
		System.out.println("Annotation기반 컨트롤러");
		return "test/index";//view에 대한 정보
	}
}
