package chap06_oop;
//Person 클래스를 사용하는 클래스
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
/*		
		p.name= "박보검";
		p.addr= "서울시 광진구";
		p.age= 27;	// age변수는 private으로 선언되어 있으므로
					// 같은 패키지의 클래스에서도 접근할 수 없다.
*/		
		
		p.setName("박보검");
		p.setAddr("서울시 광진구");
		p.setAge(27);	// age변수는 private으로 선언되어 있으므로
					// 같은 패키지의 클래스에서도 접근할 수 없다.
/*
		System.out.println("성명:"+p.name);
		System.out.println("주소:"+p.addr);
		System.out.println("나이:"+p.age);
*/

		System.out.println("성명:"+p.getName());
		System.out.println("주소:"+p.getAddr());
		System.out.println("나이:"+p.getAge());

		
		Person p2 = new Person();
		
		/*
		p2.name= "박누리";
		p2.addr= "서울시 광진구";
		p2.age= 24;
		*/
		
		p2.setName("박누리");
		p2.setAddr("서울시 광진구");
		p2.setAge(24);

		
		System.out.println("성명:"+p2.getName());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("나이:"+p2.getAge());

		
		//생성자 사용
		Person p3 = new Person("박누리", "서울시 광진구", 24);
		
		System.out.println("성명:"+p3.getName()+"주소:"+p3.getAddr()+"나이:"+p3.getAge());
	}

}
