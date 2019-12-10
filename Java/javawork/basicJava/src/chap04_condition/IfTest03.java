package chap04_condition;

import java.util.Scanner;
//중첩 if문 - if문 안에 if문 정의하고 사용하기(모든 제어문은 중첩할 수 있다.)
public class IfTest03 {

	public static void main(String[] args) {
		//Scanner로 점수를 입력받아 90점 이상이면 "통과"를 출력하고
		//90점 미만이면 "재시험"을 출력하세요.
		Scanner s = new Scanner(System.in);
		System.out.print("시험 점수 : ");
		int score = s.nextInt();
		System.out.print("응시 횟수 : ");
		int count = s.nextInt();
		
		if(score>=90) {
			System.out.println("통과");
		}else {
			if(count<=3) {
			System.out.println("이 과목만 재시험...");			
			}else {System.out.println("처음부터 다시 시작...");}
		}
	}

}
