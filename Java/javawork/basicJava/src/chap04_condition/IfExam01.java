package chap04_condition;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ���->");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println(num+"�� ¦���Դϴ�.");
			}
			
			else {
				System.out.println(num+"�� Ȧ���Դϴ�.");
			}
		}else if(num==0) {
			System.out.println("0�Դϴ�.");
		}
		else {
			System.out.println(num+"�� �����Դϴ�.");
		}
	
	}

}