package chap06_oop;

import java.awt.DisplayMode;

import workbook.section3.Student;

//메소드의 매개변수와 리턴타입으로 참조형, 배열 , 기본형 모두 사용할 수 있다.
public class MethodTest {

	public static void main(String[] args) {
		Person p = new Person("장동건", "서울", 46);
		
		display(p.getName(),p.getAddr(),p.getAge());
		display(p);//Person객체를 매개변수로 넘겨줄 수 있다.
		
	}
	public static void display(String name, String addr, int age) {
		System.out.println("이름: "+name+"\t주소: "+addr+"\t나이: "+age);
	}
	//변수값 한번에 넘기고 싶을때
	public static void display(Person p) {
		System.out.println(p.toString());
	}
	//메소드를 정의할때 한 개의 값만 리턴할 수 있는데
	//동일한 타입의 데이터를 여러 개 리턴해야 한다면 
	//배열을 리턴타입으로 정의하고 사용할 수 있다.
	public static int[] addNumber() {
		int[] i = new int[3];
		i[0]=100;
		i[1]=200;
		i[2]=300;
		
		return i; 
	}
	//타입이 다른 여러 개의 데이터를 리턴하고 싶은 경우
	//배열로 리턴할 수 없으므로 리턴하고 싶은 값을 갖고있는 객체를 생성해서
	//리턴할 수 있다.
	public static Student getInfo() {
		//Student의 모든 정보를 리턴
		return new Student("장동건", 90,100,50,66);
	}
}
