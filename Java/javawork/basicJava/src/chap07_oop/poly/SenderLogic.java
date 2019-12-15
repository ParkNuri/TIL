package chap07_oop.poly;
public class SenderLogic {
	//모듈화의 중요성!!!!
	public void run(Sender obj) {
		//Sender클래스의 클래스들을 활용하는 메소드
		System.out.println("실행");
		obj.print();
	}
	
	//요구사항이 변경될때마다 변경해야하는 번거로움이 생김
/*	public void run(EmailSender obj) {
		
	}
	public void run(SMSSender obj) {
		
	}
*/
}
