package chap07_oop;

public class Dessert {
	private String productName; 
	private int price;
	private int count;
	
	//Constructor==============
	public Dessert() {
	}
	public Dessert(String productName, int price, int count) {
		super();
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	
	//Method----------------------
	
	public int getTotalPrice(){
		int sum = 0;
		sum= this.price*this.count;
		return sum;
	}
	public static void print(){
		System.out.println("==============================\n주문항목\t가격\t수량\n==============================");
	}
	public void printProductInfo(){
		System.out.println(this.productName+"\t"+this.price+"\t"+this.count);
	}
	
	
	//Getter Setter------------------
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
