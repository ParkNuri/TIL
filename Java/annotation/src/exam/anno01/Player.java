package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/* @Service : 이것을 bean으로 생성하겠다. */
@Service("myplayer")	
public class Player implements AbstractPlayer {
	/* @AutoWired : 해당 타입의 빈이 생성된 것이 있다면 자동으로 맵핑 */
	@Autowired
	@Qualifier("dice2") /* 교차 테스트시 내용 바꾸기 */	
	AbstractDice d;
	int totalValue=0;
	
	// annotation을 사용하면 기본 생성자로 생성한다.
	public Player() {
		
	}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player의 매개변수 1개 생성자");
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}