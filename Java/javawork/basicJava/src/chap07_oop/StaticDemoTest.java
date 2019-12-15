package chap07_oop;
//StaticDemo를 테스트하는 클래스
//static으로 선언한 변수는인스턴스의 고유한 값을 저장하는 인스턴스 변수가 아니므로
//인스턴스변수로 접근할 수 없다.
//클래스명으로 접근해야 한다.
public class StaticDemoTest {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo("obj1");
		obj1.display();	//정상적인 방법
		System.out.println(obj1.num+", "+obj1.staticNum);	//강제 접근
		System.out.println(obj1.num+", "+StaticDemo.staticNum);	//정상 접근
		
		StaticDemo obj2 = new StaticDemo("obj1");
		obj2.display();	//정상적인 방법
		System.out.println(obj2.num+", "+obj2.staticNum);	//강제 접근
		System.out.println(obj2.num+", "+StaticDemo.staticNum);	//정상 접근

		StaticDemo obj3 = new StaticDemo("obj1");
		obj3.display();	//정상적인 방법
		System.out.println(obj3.num+", "+obj3.staticNum);	//강제 접근
		System.out.println(obj2.num+", "+StaticDemo.staticNum);	//정상 접근
		
	}

}
