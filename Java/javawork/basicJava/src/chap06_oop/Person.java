package chap06_oop;
//클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean은 false
// - 멤버변수를 정의할때 접근 제어자를 추가해서 접근을 제어할 수 있다.
// public 
// default
// protected
// private
public class Person {
	private String name;	//class의 특성을 나타내는 데이터
	private String addr;	// : 멤버변수 or 필드
	private int age;		// 고정값 정의하지 x
	
	public Person(String name, String addr, int age){
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	//Person p = new Person();
	
}
