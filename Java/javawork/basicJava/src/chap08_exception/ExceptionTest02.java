package chap08_exception;
//try~catch�� ���� ó��
public class ExceptionTest02 {
	public static void main(String[]args) {
		try{
			System.out.println("******���α׷� ����******");
			System.out.println(10/0);//���ܰ� �߻��� �� �ִ� ����
			System.out.println("******���α׷� ����******");
			
			//���ܹ߻� ������ �ڵ���� ��ü�� try�� ����
		}catch(Exception e) {
			System.out.println("�����߻�..");
			System.out.println("���ܸ޼���: "+e.getMessage()); // ���� ����
			e.printStackTrace(); //void   ���� ��ġ ����
		}
		
	}
}