package chap04;
//if문을 중첩해서 사용하는 연습 - gender와 age를 판단해서 결과를 출력하는 예제
import java.util.Scanner;
//ctrl + shift + f => 들여쓰기 정리 단축키
public class IfExam02 {

	public static void main(String[] args) {
		System.out.print("성별을 입력하세오->");
		Scanner s = new Scanner(System.in);
		int gender = s.nextInt();
		System.out.print("나이를 입력하세오->");
		int age = s.nextInt();

		if (gender == 1 || gender == 3) {
			if (age > 19) {
				System.out.print("성인");
			} else {
				System.out.print("청소년");
			}

			System.out.println("남자");
		} else if (gender == 2 || gender == 4) {
			if (age > 19) {
				System.out.print("성인");
			} else {
				System.out.print("청소년");
			}
			System.out.println("여자");
		} else
		{
			System.out.println("입력 오류!!");
		}
	}

}
