package chap04_condition;

import java.util.Scanner;

public class ScoreMultiIfExam {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = s.nextInt();
		if(100>=score && score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else if(score>0) {
			System.out.println("F");
		}else {
			System.out.println("Input Error");
		}
	}
}
