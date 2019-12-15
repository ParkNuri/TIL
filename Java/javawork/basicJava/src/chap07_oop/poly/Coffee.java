package chap07_oop.poly;

public class Coffee extends Beverage {

	static int amount;
	
	//Constructor

	public Coffee() {
	}
	
	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
		
	}


	//Method
	@Override
	public void calcPrice() {
		switch(getName()) {
		case "Americano":setPrice(1500);break;
		case "CafeLatte":setPrice(2500);break;
		case "Cappuccino":setPrice(3000);break;
		}
	}

	//Getter & Setter
	//static멤버를 액세스하기 위해서 static메소드를 정의해서 액세스한다.
	public static int getAmount() {
		return amount;
	}
}
