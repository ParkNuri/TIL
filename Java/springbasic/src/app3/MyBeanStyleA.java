package app3;

public class MyBeanStyleA extends MyBeanStyle{
	public MyBeanStyleA() {
		System.out.println("MyBeanStyleA의 기본생성자");
	}
	@Override
	public void hello(String name) {
		System.out.println("안녕하세요...,"+name);
	}
}
