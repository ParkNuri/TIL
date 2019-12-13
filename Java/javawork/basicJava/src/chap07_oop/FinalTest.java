package chap07_oop;

final class FinalSuper{
	public final void display() {
		System.out.println("super diplay");
	}
}
class FinalSub extends FinalSuper{	//final 클래스는 상속 불가.
	static final int NUM = 100;	//상수는 대문자로 naming

	//@Override
	/*public void display() {	//final 메소드는 overiding할 수 없다.
		System.out.println("diplay");
	}*/
	
}
public class FinalTest {

	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000;	//상수이므로 값을 수정할 수 없다.
		System.out.println(FinalSub.NUM);	//static변수이기 때문에 클래스명으로 접근
	}

}
