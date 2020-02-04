package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/test.do")
	public ModelAndView test(){
		System.out.println("컨트롤러 요청 완료");
		ModelAndView mav = new ModelAndView();
		String data="";
		for (int i = 1; i < 10; i++) {
			data=data+(i+" x "+"9"+"="+(i*9)+"<br/>");
		}
		mav.addObject("gugu",data);
		mav.setViewName("test/result");
		return mav;
		
	}
}
