package api.util;

import java.util.Scanner;

//Scanner 클래스 사용법
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		
		String data = key.next();
		
		System.out.println("키보드로 입력받은 문자열:"+data);
		
		
		System.out.print("숫자를 입력하세요");
		
		int data2 = key.nextInt();
		
		System.out.print("입력받은 숫자:"+data2);
		
		
	}
}
