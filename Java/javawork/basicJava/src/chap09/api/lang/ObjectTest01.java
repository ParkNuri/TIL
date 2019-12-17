package chap09.api.lang;


import java.util.Date;
import java.util.Random;

//Object클래스는 자바에서 작성하는 모든 클래스의 최상위 클래스
public class ObjectTest01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());	//클래스의 정보를 return
		System.out.println(obj1.hashCode());	//객체의 정보를 return
		System.out.println(obj1.toString());	//객체의 주소 return - 기본메소드
		System.out.println(obj1);//==obj1.toString()
								  //기본메소드이므로 생략이 가능
		
		
		Person p1 = new Person("장동건",50,"서울");
		System.out.println(p1.toString());	//개발자가 작성하는 모든 클래스에서
											//오버라이딩해야한다.
		System.out.println(p1);				
		
		//API의 클래스들..
		Random rand = new Random();
		System.out.println(rand);		//toString 주소출력
		Date d = new Date();			//toString 날짜출력(오버라이딩됨)
		System.out.println(d);
		String str = new String("java");//toString str값출력(오버라이딩됨)
		System.out.println(str);
	
	
		//=>우리가 만드는 클래스의 값들을 확인하기위해 항상 toString을 오버라이딩하기.
	}
	

}
