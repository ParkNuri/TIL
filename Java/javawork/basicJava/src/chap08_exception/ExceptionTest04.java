package chap08_exception;
//���ܰ� �߻��ϰų� �߻����� �ʰų� �ݵ�� ������ ���ɹ��� �ִ� ���??????????
//finally������ �߰��ϰ� �� �ȿ� ���
import java.util.Scanner;
import java.util.Stack;

public class ExceptionTest04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		try {
			System.out.print("�迭�� ��� ������ �Է��ϼ���: ");

			int size = key.nextInt();
			String[] arr = new String[size];
			System.out.println("step01");
			if (size > 3) {
				arr[1] = new String("java");
			}
			System.out.println(arr[1].length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ��Ҹ� �߸� �׼���");
		} catch (NullPointerException e) {
			System.out.println("null�Դϴ�");
		} catch (Exception e) {
			System.out.println("�����߻�!");
		}finally {
			System.out.println("�ݵ�� ������ ���ɹ� - ������ ����");
		}

	}

}