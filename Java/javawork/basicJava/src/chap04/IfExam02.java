package chap04;
//if���� ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ����ϴ� ����
import java.util.Scanner;
//ctrl + shift + f => �鿩���� ���� ����Ű
public class IfExam02 {

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���->");
		Scanner s = new Scanner(System.in);
		int gender = s.nextInt();
		System.out.print("���̸� �Է��ϼ���->");
		int age = s.nextInt();

		if (gender == 1 || gender == 3) {
			if (age > 19) {
				System.out.print("����");
			} else {
				System.out.print("û�ҳ�");
			}

			System.out.println("����");
		} else if (gender == 2 || gender == 4) {
			if (age > 19) {
				System.out.print("����");
			} else {
				System.out.print("û�ҳ�");
			}
			System.out.println("����");
		} else
		{
			System.out.println("�Է� ����!!");
		}
	}

}