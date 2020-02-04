package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//기본 web에서 작성하던 서블릿과 동일한 역할을 하는 클래스
//컨트롤러
//- DispatcherServlet에서 호출되는 클래스
//- 서블릿에서 했던 것 처럼 dao의 메소드를 호출
//- 데이터 공유(스프링의 방법대로 )
public class TestController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		System.out.println("컨트롤러 요청 완료");
		//공유데이터 정보와 응답뷰에 대한 정보를 담고 있는 스프링객체
		ModelAndView mav = new ModelAndView();
		
		//공유데이터 저장
		//request.setAttribute("msg","스프링컨트롤러에서 넘긴 데이터")
		String data="";
		for(int i=1;i<=9;i++) {
			data = data+(9+"*"+i+"="+(9*i))+"<br/>";
		}
		mav.addObject("msg",data);
		
		//forward할 뷰의 정보를 정의 - 기본이 forward
		mav.setViewName("test/result");
		return mav;
	}

}






