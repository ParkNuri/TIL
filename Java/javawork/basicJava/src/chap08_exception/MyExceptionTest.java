package chap08_exception;

import java.util.Scanner;
//홀수가 입력되면 예외 발생
public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력: ");
		int num = key.nextInt();
		try {
			if(num%2==1) {
				//예외발생 상황
				//JVM이 인식하는 오류가 아니라 사용자가 정의한 오류이므로 예외를 발생시킬 수 있도록 정의
				throw new MyException("홀수를 입력했습니다.");	//RuntimeException의 하위클래스일때만 문법오류가 나지 않음
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
