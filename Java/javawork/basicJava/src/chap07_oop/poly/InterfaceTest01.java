package chap07_oop.poly;
/*
 * 인터페이스 연습
 * <<인터페이스>>
 * => 추상메소드(상수도 포함)만 정의하는 특별한 클래스
 * 
 * 1. 인터페이스는 interface키워드를 이용해서 정의
 * 2. 인터페이스는 추상메소드만 정의하는 특별한 클래스
 * 	  - public abstract 생략가능
 * 	  - 상속을 받으면 자동으로 추가된다.
 * 3. 인터페이스가 인터페이스를 상속할 수 있다.	(extends 이용)
 * 	  - 하위인터페이스가 상위인터페이스의 추상메소드를 상속받는다.
 * 4. 클래스가 인터페이스를 상속할 수 있다. (implements 이용)
 * 	  - 인터페이스를 상속받는 클래스가 이미 다른 클래스를 상속하는 경우에
 * 		extends를 먼저 정의하고 implements를 정의해야한다.
 * 5. 인터페이스는 여러 개를 상속할 수 있다. 즉, 다중상속이 가능하다.
 * 	  implements 뒤에 인터페이스를 정의할때 ','로 구분해서 나열
 * 6. 클래스와 인터페이스들을 상속받는 하위클래스는 모든 클래스와 인터페이스의 하위로 인식된다.
 * 	  (상속받는 모든 클래스, 인터페이스의 하위 타입이 된다.)
 * 
 * */
interface InterA{
	public abstract void test();
	void display(int num);
}
interface InterB extends InterA{
	void show();
}
interface InterC {
}
class SuperA{}
//SubA는 SuperA, InterA, InterB, InterC 의 하위
class SubA extends SuperA implements InterB, InterC{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceTest01 {

	public static void main(String[] args) {
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();
		// 다형성 극대화 가능
	}

}
