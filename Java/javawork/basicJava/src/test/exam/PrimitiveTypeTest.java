package test.exam;
//�ڹ� �⺻�� �������� ���ͷ��� ���ؼ� ���캸�� ����
public class PrimitiveTypeTest
{
	public static void main(String[] args){
		
		//boolean
		boolean bool = true; // true or false
		System.out.println(bool);

		//������
		char c = 'a'; //char Ÿ�� ������ ���ͷ� ǥ���� '' �� ǥ��
		System.out.println(c);

		//������
		//������������ �⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� int
		byte b = 127;
		System.out.println(b);

		short s = 32767; // short = int
		System.out.println(s);

		int i = 2147483647; // int = int
		System.out.println(i);
	
		long l = 2147483648l; // long Ÿ���� ��� ���̻� L or l �߰�
		System.out.println(l);
	
		//�Ǽ��� ����
		//�Ǽ��� ���ͷ��� �⺻Ÿ�� double
		float f = 10.5f; //float Ÿ���� ��� ���̻� F or f �߰�
		System.out.println(f);

		double d = 10.5;
		System.out.println(d);

		double exam = 10/3.0;
		System.out.println(exam);
	}
}