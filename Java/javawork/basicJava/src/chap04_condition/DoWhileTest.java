package chap04_condition;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 10;
		while(num<10) {
			//while���� ������ �������� ������ �������� �ڵ尡 ������� �ʴ´�.
			System.out.println("while�� - ������ɹ�:"+num);
			num++;
		}
		num=10;
		do {
			System.out.print("�����Է� :");
			num = s.nextInt();
			System.out.println("do_while�� - ������ɹ�: "+num);
		}while(num<10);

		
	}

}