package api.util;

import java.util.Scanner;

//Scanner Ŭ���� ����
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���");
		
		String data = key.next();
		
		System.out.println("Ű����� �Է¹��� ���ڿ�:"+data);
		
		
		System.out.print("���ڸ� �Է��ϼ���");
		
		int data2 = key.nextInt();
		
		System.out.print("�Է¹��� ����:"+data2);
		
		
	}
}