package app3;
//상위 인터페이스를 작성한다.
public abstract class MyBeanStyle {
	public abstract void hello(String name);
	//객체가 생성될때 한 번 호출되는 메소드
	public void myInit() {
		System.out.println("init...");
	}
	//객체가 소멸될때 한 번 호출되는 메소드
	public void myDestroy() {
		System.out.println("destroy...");
	}
}
