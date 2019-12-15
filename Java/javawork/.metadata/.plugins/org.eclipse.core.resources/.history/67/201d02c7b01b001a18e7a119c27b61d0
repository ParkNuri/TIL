package chap06_oop;
//메소드 정의하는 연습을 위한 클래스
public class MyMethod {
	//4. 매개변수, 리턴값이 모두 있는 메소드
	// ->숫자 2개를 매개변수로 전달받아 더해서 결과를 리턴하는 메소드
	// 	 메소드 선언부에 리턴타입을 정의하는 경우 반드시 메소드의 마지막에서
	//	 값을 return해야 한다.
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public void display(int spc,String str, int cnt) {
		for(int i =1;i<spc;i++) {
			System.out.print(" ");
		}
		for(int i = 1; i<=cnt;i++) {
			System.out.print(str);
		}
		System.out.println();
		
	}
	
	//3. 리턴값이없고 매개변수가 두 개인 메소드
	//	 -> 출력기호, 출력할 횟수를 매개변수로 전달 받아 사용할 수 있도록
	//		메소드를 정의하고, MyMethodTest.java에서 호출해서 테스트하기
	public void display(String str, int cnt) {
		for(int i = 1; i<=cnt;i++) {
			System.out.print(str);
		}
		System.out.println();
		
	}
	//2. 리턴 값이 없고 매개변수가 한 개인 메소드
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	//1. 메개변수가 없고 return 값이 없는 메소드
	public void display() {
		for(int i = 1; i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
