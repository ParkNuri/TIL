package exam.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//메뉴화면을 선택했을때 화면을 교체해서 보여주도록 처리하는 컨트롤러
//컨트롤러에 처리할 메소드를 여러 개 등록해서 사용할 수 있다. - 비슷한 기능을 처리하는 경우
@Controller
public class TilesIndexController {
	@RequestMapping("/exam/index.do")
	public String index() {
		return "index";//tiles설정 파일에 등록된 view의 이름
	}
	
	@RequestMapping("/menu/mybatis.do")
	public String mybatisView() {
		return "menu/mybatis"; //tiles에 등록된 menu/mybatis를 기준으로
		                       //view를 만들어라
	}
	
	@RequestMapping("/menu/advanced.do")
	public String advancedView() {
		return "menu/advanced";
	}
}








