package chap07_oop.poly;

public class Tea extends Beverage {

	static int amount;

	//Constructor
	public Tea() {
	}
	
	public Tea(String name) {
		super(name);
		amount++;
		calcPrice();
		
	}
	
	
	//Method
	@Override
	public void calcPrice() {
		
		switch(getName()) {
		case "lemonTea":setPrice(1500);break;
		case "ginsengTea":setPrice(2000);break;
		case "redginsengTea":setPrice(2500);break;
		}
		
	}

	//Getter & Setter


}
