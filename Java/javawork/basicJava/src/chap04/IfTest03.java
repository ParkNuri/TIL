package chap04;

import java.util.Scanner;
//��ø if�� - if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�.)
public class IfTest03 {

	public static void main(String[] args) {
		//Scanner�� ������ �Է¹޾� 90�� �̻��̸� "���"�� ����ϰ�
		//90�� �̸��̸� "�����"�� ����ϼ���.
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int score = s.nextInt();
		System.out.print("���� Ƚ�� : ");
		int count = s.nextInt();
		
		if(score>=90) {
			System.out.println("���");
		}else {
			if(count<=3) {
			System.out.println("�� ���� �����...");			
			}else {System.out.println("ó������ �ٽ� ����...");}
		}
	}

}