package chap07_oop.poly;

public abstract class Content {
	String title;
	int price;

	
	//Constructor================
	public Content() {
		super();
	}
	
	public Content(String title) {
		super();
		this.title = title;
	}


	//Method=====================
	public abstract void totalPrice();

	public void show() {
		System.out.println(title+" 비디오의 가격은 "+price+"원 입니다.");
	}
	//Getter&Setter==============
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
