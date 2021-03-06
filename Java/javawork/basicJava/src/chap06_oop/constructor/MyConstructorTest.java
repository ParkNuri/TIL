package chap06_oop.constructor;

import chap07_oop.StaticDemo;

public class MyConstructorTest {

	public static void main(String[] args) {
		//기본 생성자를 호출해서 객체를 생성한 후 setter메소드를 이용해서 값 초기화하기
		//MyConstructor() 호출
		MyConstructor obj1 = new MyConstructor();
		obj1.setName("박누리");
		obj1.setId("qkrsnrl");
		obj1.setPass("a123456789");
		System.out.println(obj1.getName()+", "+obj1.getId()+", "+obj1.getPass());

		//매개변수가 있는 생성자 메소드를 호출하면서 값을 초기화하기
		//MyConstructor(String, String, String) 호출
		MyConstructor obj = new MyConstructor("박누리", "qkrsnrl", "a123456789");
		System.out.println(obj.getName()+", "+obj.getId()+", "+obj.getPass());

		//MyConstructor(String, String, String, String) 호출
		MyConstructor obj2 = new MyConstructor("박누리", "qkrsnrl", "a123456789","violet");
		System.out.println(obj2.getName()+", "+obj2.getId()+", "+obj2.getPass()+", "+obj2.getNickname());

		//MyConstructor(String, String, String, String) 호출
		MyConstructor obj3 = new MyConstructor("박누리", "qkrsnrl", "a123456789","violet","Seoul", 10);
		System.out.println(obj3.getName()+", "+obj3.getId()+", "+obj3.getPass()+", "+obj3.getNickname()+", "+obj3.getAddr()+", "+obj3.getPoint());

		
	}

}
