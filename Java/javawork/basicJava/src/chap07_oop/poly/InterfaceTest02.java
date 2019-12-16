package chap07_oop.poly;

import javax.swing.JFrame;
//인터페이스를 사용하는 목적은 다중상속을 허용하고, 다형성을 적용할 수 있도록,
//					  기본적으로 구현해야하는 기능이 무엇인지 정의하기 위한 목적
class GUITest extends JFrame implements Runnable{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceTest02 {

	public static void main(String[] args) {
		GUITest Obj = new GUITest("인터페이스 연습");
	}

}
