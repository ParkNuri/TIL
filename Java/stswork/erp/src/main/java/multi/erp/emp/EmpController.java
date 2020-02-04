package multi.erp.emp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
//emp테이블에서 작업하는 모든 내용에 대한 컨트롤러
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	
	@Autowired
	EmpService service;
	
	//로그인 페이지 요청
	@RequestMapping(value="/emp/login.do", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	//로그인 처리
	//- 매개변수가 VO객체:
	//스프링 내부의 DispatcherServlet에서 자동으로 입력된 파라미터들을 추출해서 VO객체를 만들고 setter메소드의 값으로 전달한다.
	@RequestMapping(value="/emp/login.do", method=RequestMethod.POST)
	public ModelAndView login(MemberVO loginUserInfo, HttpServletRequest request) {
		System.out.println("=====loginUserInfo/input=====\n"+loginUserInfo+"\n=====================");
		ModelAndView mav = new ModelAndView();
		MemberVO user = service.login(loginUserInfo);
		//user = db연동 후 로그인된 사용자의 정보
		//loginUserInfo = 로그인하기 위해서 사용자가 입력한 데이터를 vo로 만든 객체
		System.out.println("=========user/output=========\n"+user+"\n=========================");
		//session<=login user data
		//세션을 사용하기 위해서 매개변수에 HttpServletRequest를 정의
		String viewName="";
		//1. 세션을 생성
		if(user!=null) {
			//로그인 성공시
			HttpSession ses =  request.getSession();
			
			//2. 세션에 데이터 공유
			ses.setAttribute("user", user);
			viewName="index";
		}
		else {
			//로그인 실패시
			viewName="login";
		}
		mav.addObject("user", user);
		mav.setViewName(viewName);
		//		mav.setViewName("redirect:/board/list.do");
		return mav;
	}
	
	@RequestMapping("emp/logout.do")
	public String logout(HttpSession session)	{
		//로그아웃 처리를 위해 매개변수로 session을 받도록 처리
		//사용하던 세션객체가 있으면 사용하던 세션객체가 전달된다.
		if(session!=null) {
			//null이 아니라 session이 존재하면 session객체를 해제
			session.invalidate();	//session remove
		}
		
		return "redirect:/index.do";
	}
}
