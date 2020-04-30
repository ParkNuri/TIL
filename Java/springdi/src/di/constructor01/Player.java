package di.constructor01;

//Player�� ���� �մ� Dice�� �ܺο��� (�����������̳�) Injection�޾� ����ؾ� �ϹǷ� Injection ���� �� �ֵ��� �̸� �غ��ؾ��Ѵ�.
//==> Constructor or Setter�޼ҵ�
public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	public Player(){}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player�� �Ű����� 1�� ������");
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