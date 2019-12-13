package chap07_oop;


public class DessertTest {
	public static void main(String[] args){
		Dessert coffee = new Dessert("아메리카노",4500,5);
		Dessert tea = new Dessert("허브티",3800,1);
		IceCream ice = new IceCream("나뚜르", 5000, 2, 310);
		
		System.out.println("*****매 출 전 표 ***** ");
		Dessert.print();	//클래스이름으로 액세스(static)
		coffee.printProductInfo();	//객체참조 변수로 액세스(non-static)
		tea.printProductInfo();
		System.out.println();
		
		IceCream.print();
		ice.printProductInfo();
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + ice.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}
