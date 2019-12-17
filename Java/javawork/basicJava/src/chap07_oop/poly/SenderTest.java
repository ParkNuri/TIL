package chap07_oop.poly;
import java.util.Scanner;

public class SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender�ý���********");
		System.out.println("1. Email�� ����");
		System.out.println("2. SMS�� ����");
		System.out.println("3. MMS�� ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int work = key.nextInt();
		//EmailSender�� SMSSender ��� �����ϱ� ���� Sender�� ����
		Sender sender = null;
		switch(work){
			case 1:
				sender = new EmailSender("���Ϸ�����",100);
				break;
			case 2:
				sender = new SMSSender("�ܹ���",80);
				break;
			case 3:
				sender = new MMSSender("MMS",1180);
				break;
				
		}
		SenderLogic s = new SenderLogic();//SenderŬ�������� Ȱ���ϴ� Ŭ����
		s.run(sender);

	}

}