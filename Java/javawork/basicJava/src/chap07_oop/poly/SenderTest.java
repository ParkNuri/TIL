package chap07_oop.poly;
import java.util.Scanner;

public class SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender시스템********");
		System.out.println("1. Email로 전송");
		System.out.println("2. SMS로 전송");
		System.out.println("3. MMS로 전송");
		System.out.print("원하는 작업을 선택하세요:");
		int work = key.nextInt();
		//EmailSender와 SMSSender 모두 수용하기 위해 Sender로 선언
		Sender sender = null;
		switch(work){
			case 1:
				sender = new EmailSender("메일로전송",100);
				break;
			case 2:
				sender = new SMSSender("단문자",80);
				break;
			case 3:
				sender = new MMSSender("MMS",1180);
				break;
				
		}
		SenderLogic s = new SenderLogic();//Sender클래스들을 활용하는 클래스
		s.run(sender);

	}

}
