package chap05_array;

import java.util.Random;

//�迭�� ����, ����, �ʱ�ȭ�� �Ѳ����� ó���ϱ�
public class ArrayTest04 {

	public static void main(String[] args) {
		// �ٸ� ���� ������ ������� �����ϱ� - ','�� �迭 ��Ҹ� �����Ѵ�.
		// int[] myarr = new int[5]; �� ����
		int[] myarr = { 10, 20, 30, 40, 50 };
		System.out.println("�迭 ����� ���� : " + myarr.length);

		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}

		// java����� ����, ����, �ʱ�ȭ ���
		int[] myarr2 = new int[] { 10, 20, 15, 30, 40 };

		System.out.println("�迭 ����� ���� : " + myarr2.length);

		for (int i = 0; i < myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}

		// ������ �迭�� ����� ������ �ʱ�ȭ�� �Ѳ�����
		
		String[] strArr = { new String("new"), new String("servlet"), new String("java") };
		System.out.println("�������迭�� ����:" + strArr.length);
		//������ �迭�̱� ������ ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� �ϳ�
		//String�� ����
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i + "��° �迭 ��� : " + strArr[i]);
		}
		
		// String�� �ٸ��� ���� �ּҰ� ����
		Random[] randArr = {new Random(),new Random()};
		
		for(int i =0; i<randArr.length;i++) {
			System.out.println("�迭���:"+randArr[i]);
		}
		
		//String Ŭ������ �⺻��ó�� ����� �� �ִ�. - ���� ���� ���̴� �������̹Ƿ� ���
		String[] strArr2 = {"java", "servlet", "spring"};
		System.out.println("����:"+strArr2.length);
		for(int i = 0; i<strArr2.length;i++) {
			System.out.println(strArr2[i]);
		}
		
	}

}