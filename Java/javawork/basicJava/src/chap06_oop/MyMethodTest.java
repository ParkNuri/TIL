package chap06_oop;
//MyMethod클래스에서 정의한 메소드를 사용하는 클래스
public class MyMethodTest {

	public static void main(String[] args) {
		
		System.out.println("----------프로그램 시작----------");
		MyMethod m = new MyMethod();
		//1. 매개변수가 없고 리턴값이 없는 메소드
		m.display();
		System.out.println("++++++step1++++++");
		m.display();
		System.out.println("++++++step2++++++");
		m.display();
		
		//2. 매개변수가 한 개, 리턴값이 없는 메소드의 호출
		m.display("★");
		m.display("§");
		m.display("♥");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		//3. 리턴값이없고 매개변수가 두 개인 메소드
		m.display(16,"★", 1);
		m.display(5,"§", 3);
		m.display(4,"♥", 5);		
		m.display(6,"★", 7);	//diplay(int,String,int)
		m.display(2,"§", 9);
		m.display("♥", 11);		//display(String,int)
		m.display(16,"▥", 1);
		m.display(16,"▥", 1);
		//m.display(16,"");	// diplay(int,String)
		System.out.println();
		System.out.println();
		//매개변수와 리턴값이 있는 메소드의 호출
		//메소드를 호출하는 경우 리턴값이 존재하는 메소드라면 리턴값과
		//① 동일한 타입의 변수를 선언해서 저장해 주어야 한다.
		//② 다른 메소드의 매개변수로 전달할 수 있다.
		int result=m.add(100, 200);
		//①
		System.out.println("메소드 호출 결과는..."+result);
		//②
		System.out.println("메소드 호출 2:"+m.add(200, 100));
	}
	

}
