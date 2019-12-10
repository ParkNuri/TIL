package test.exam;
//기본으로 인식하는 패키지의 위치는 java.lang 패키지와 현재 작업 패키지
//=:>다른 패키지에 있는 클래스를 사용하는 경우 API나 내가 작성한 클래스나 모두 import
import chap06_oop.Person;

public class PublicTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name="";
//		p1.addr = "";//default이므로 외부 패키지에서 접근할 수 없다.
//		p1.age = 45;//private이므로 외부 패키지, 외부 클래스 모두 접근할 수 없다. 
	}

}
