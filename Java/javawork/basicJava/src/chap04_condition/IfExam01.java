package chap04_condition;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세오->");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println(num+"는 짝수입니다.");
			}
			
			else {
				System.out.println(num+"는 홀수입니다.");
			}
		}else if(num==0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println(num+"은 음수입니다.");
		}
	
	}

}
