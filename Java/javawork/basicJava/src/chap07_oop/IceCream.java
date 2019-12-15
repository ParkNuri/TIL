package chap07_oop;

public class IceCream extends Dessert {
	private int cal;
	
	
	//Constructor--------------------------------
	public IceCream() {
	}
	
	
/*	public IceCream(String productName, int price, int count, int cal) {
		super(productName, price, count);
		this.cal = cal;
	}
*/	
	public IceCream(String productName, int price, int count, int cal) {
		super(productName, price, count);
		this.cal = cal;
	} //Generate Constructor 에서 select super constructor ..... 에서 super(int...) 선택
	
	
	//Method----------------------------------
	public static void print(){
		System.out.println("==============================\n주문항목\t가격\t수량\t칼로리\n==============================");
	}

	public void printProductInfo(){
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+this.cal);
	}


	//Getter Setter------------------------------
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
}
