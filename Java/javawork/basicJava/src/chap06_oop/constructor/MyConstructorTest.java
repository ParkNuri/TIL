package chap06_oop.constructor;

import chap07_oop.StaticDemo;

public class MyConstructorTest {

	public static void main(String[] args) {
		//�⺻ �����ڸ� ȣ���ؼ� ��ü�� ������ �� setter�޼ҵ带 �̿��ؼ� �� �ʱ�ȭ�ϱ�
		//MyConstructor() ȣ��
		MyConstructor obj1 = new MyConstructor();
		obj1.setName("�ڴ���");
		obj1.setId("qkrsnrl");
		obj1.setPass("a123456789");
		System.out.println(obj1.getName()+", "+obj1.getId()+", "+obj1.getPass());

		//�Ű������� �ִ� ������ �޼ҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�
		//MyConstructor(String, String, String) ȣ��
		MyConstructor obj = new MyConstructor("�ڴ���", "qkrsnrl", "a123456789");
		System.out.println(obj.getName()+", "+obj.getId()+", "+obj.getPass());

		//MyConstructor(String, String, String, String) ȣ��
		MyConstructor obj2 = new MyConstructor("�ڴ���", "qkrsnrl", "a123456789","violet");
		System.out.println(obj2.getName()+", "+obj2.getId()+", "+obj2.getPass()+", "+obj2.getNickname());

		//MyConstructor(String, String, String, String) ȣ��
		MyConstructor obj3 = new MyConstructor("�ڴ���", "qkrsnrl", "a123456789","violet","Seoul", 10);
		System.out.println(obj3.getName()+", "+obj3.getId()+", "+obj3.getPass()+", "+obj3.getNickname()+", "+obj3.getAddr()+", "+obj3.getPoint());

		
	}

}