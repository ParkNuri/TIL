package chap04_condition;

public class ForExam03 {

	public static void main(String[] args) {
		//1���� 100������ ��, Ȧ����, ¦���� ���ϱ�
		//��: Ȧ����: ¦����:
		int sum = 0, evenSum = 0, oddSum = 0; 
		for(int i = 1; i <= 100; i++) {
			sum+=i;
			if(i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		System.out.println("�� : "+sum);
		System.out.println("¦���� : "+evenSum);
		System.out.println("Ȧ���� : "+oddSum);
	}

}