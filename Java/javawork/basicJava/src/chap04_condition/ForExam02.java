package chap04_condition;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("출력할 단 : ");
		int num = s.nextInt();
		for(int i = 1; i<10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
