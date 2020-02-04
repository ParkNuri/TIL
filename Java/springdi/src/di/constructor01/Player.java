package di.constructor01;

//Player가 갖고 잇는 Dice를 외부에서 (스프링컨테이너) Injection받아 사용해야 하므로 Injection 받을 수 있도록 미리 준비해야한다.
//==> Constructor or Setter메소드
public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	public Player(){}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player의 매개변수 1개 생성자");
	}
	//Dice d = new Dice();
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