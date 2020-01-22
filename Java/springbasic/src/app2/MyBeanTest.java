package app2;
/*
 * 개발 방법론에 대해..
 * 
 * oop가 적용되어 있는 프로그램
 * oop 특성을 적용하기 위해 상위클래스를 정의하고 MyBeanStyleXXX 클래스를 사용하는 매개변수의 타입을 상위타입으로 변경하며 다형성을 적용.
 * 사용되는 객체가 변경되더라도 코드를 수정하는 범위는 줄어든다.
 * 그러나 실제 객체를 생성해서 전달하고있다.
 * 사용하는 객체가 바뀔때마다 객체를 직접 생성하는 코드를 모두 수정해야 한다는 단점은 존재함.
 * 사용하는 곳에서 직접 new해서 객체를 생성하는 코드는 없어져야 한다.
 * 
 */

public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		
		MyBeanStyleB obj1 = new MyBeanStyleB();
		run(obj);
		show(obj);
		run(obj1);
		show(obj1);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************************************");
		obj.testHello("현빈");
		obj.testHello("현빈");		
		System.out.println("*****************************************");
	}
	
	public static void show(MyBeanStyle obj) {
		System.out.println("*****************************************");
		obj.testHello("현빈");
		obj.testHello("현빈");		
		System.out.println("*****************************************");
	}
	

}
