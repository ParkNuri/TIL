package app1;
/*
 * ���� ����п� ����..
 * 
 * ���յ��� �ص��� ���� ���α׷�
 * => Ŭ�������� ���յ��� ���ϰ� �������� ����.
 * => ���Ǵ� Ŭ������ �����ϸ� �� Ŭ������ ����ϰ� �ִ� ��� �ҽ��� �����ؾ� �Ѵ�.
 * 	    ��, �����ؾ��ϴ� ������ �о�����.
 * 	  oop Ư���� ����Ǿ� ���� �ʴ�.
 * 
 */

public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		
		//MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);

	}
	public static void run(MyBeanStyleA obj) {
		System.out.println("*****************************************");
		obj.testHello("����");
		obj.testHello("����");		
		System.out.println("*****************************************");
	}
	
	public static void show(MyBeanStyleA obj) {
		System.out.println("*****************************************");
		obj.testHello("����");
		obj.testHello("����");		
		System.out.println("*****************************************");
	}
	

}