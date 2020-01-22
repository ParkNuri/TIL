package app1;
/*
 * 개발 방법론에 대해..
 * 
 * 결합도가 극도로 높은 프로그램
 * => 클래스간의 결합도가 강하고 의존성이 높다.
 * => 사용되는 클래스를 변경하면 이 클래스를 사용하고 있는 모든 소스를 수정해야 한다.
 * 	    즉, 수정해야하는 범위가 넓어진다.
 * 	  oop 특성도 적용되어 있지 않다.
 * 
 */

public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		
		//MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);

	}
	public static void run(MyBeanStyleA obj) {
		System.out.println("*****************************************");
		obj.testHello("현빈");
		obj.testHello("현빈");		
		System.out.println("*****************************************");
	}
	
	public static void show(MyBeanStyleA obj) {
		System.out.println("*****************************************");
		obj.testHello("현빈");
		obj.testHello("현빈");		
		System.out.println("*****************************************");
	}
	

}
