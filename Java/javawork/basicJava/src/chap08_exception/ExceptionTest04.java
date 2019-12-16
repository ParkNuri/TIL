package chap08_exception;
//예외가 발생하거나 발생하지 않거나 반드시 실행할 명령문이 있는 경우??????????
//finally블럭을 추가하고 그 안에 기술
import java.util.Scanner;
import java.util.Stack;

public class ExceptionTest04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		try {
			System.out.print("배열의 요소 개수를 입력하세요: ");

			int size = key.nextInt();
			String[] arr = new String[size];
			System.out.println("step01");
			if (size > 3) {
				arr[1] = new String("java");
			}
			System.out.println(arr[1].length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 요소를 잘못 액세스");
		} catch (NullPointerException e) {
			System.out.println("null입니다");
		} catch (Exception e) {
			System.out.println("오류발생!");
		}finally {
			System.out.println("반드시 실행할 명령문 - 무조건 실행");
		}

	}

}
