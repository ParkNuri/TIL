package chap06_oop;
//클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean은 false
// - 멤버변수를 정의할때 접근 제어자를 추가해서 접근을 제어할 수 있다.
// public 
// default
// protected
// private
// 클래스를 정의할때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
// public 메소드를 통해서 접근할 수 있도록 구현한다.
public class Person {
	@Override
	public String toString() {
		return "Person name=" + name + ", addr=" + addr + ", age=" + age ;
	}
	private String name;	//class의 특성을 나타내는 데이터
	private String addr;	// : 멤버변수 or 필드
	private int age;		// 고정값 정의하지 x
	
	public Person() {
		
	}
	public Person(String name, String addr, int age){
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	//Person p = new Person();
	
	//모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와
	//값을 가져올 수 있는 메소드가 필요하다.
	//이런 역할을 하는 메소드를 정의하는 경우
	
	//name변수에 값을 설정하는 메소드	(setter)
	//메소드명 : set + 멤버변수명(첫글자를 대문자로 바꾼)
	//		 setName
	
	public void setName(String name) {
//		name = name;	// 가장 가까이있는 변수를 인식 (여기선 함수 매개변수 String name)
		this.name = name;
	}//Setter 메소드
	//security coding을 위해 인증번호를 함께 매개변수로 받아 함수 내에서 인증 절차를 걸쳐야한다.
	
	//name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	//메소드명: get + 멤버변수명(첫 글자를 대문자로 바꾼)
	//		 getName		
	public String getName() {
		
		//return this.name;	//충돌이 일어나지 않을 상황에선 this 사용하지 않아도 괜찮
		return name;
	}//Getter 메소드
	
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
