package chap06_oop;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		while(true) {
			Scanner key = new Scanner(System.in);
			System.out.println("========�λ� ���� �ý���=========");
			System.out.println("\t1.�λ���");
			System.out.println("\t2.��������");
			System.out.println("\t3.����������ȸ");
			System.out.println("\t4.������");
			System.out.print("���ϴ� �۾��� �����ϼ���. : ");

			Person p = new Person();
			
			int work = key.nextInt();
			switch (work) {
			case 1:
				System.out.print("�̸�:");
				String name = key.next();
				System.out.print("�ּ�:");
				String addr = key.next();
				System.out.print("����:");
				int age = key.nextInt();
				
				p.name = name;
				p.addr = addr;
				p.age = age;
				System.out.println(p.name+"\t"+p.addr+"\t"+p.age+"\t"); 
				break;
			case 2:
				System.out.println("=====���� �����ϱ�=====");
				System.out.print("������ �׸�(1.�̸�  2.�ּ�  3.����):");
				int i = key.nextInt();
				switch(i) {
				case 1: System.out.print("������ �̸�:");
						p.name = key.next();
						break;
				case 2: System.out.print("������ �ּ�:");
						p.addr = key.next();
						break;
				case 3: System.out.print("������ ����:");
						p.age = key.nextInt();
						break;
				}
			case 3:
			case 4:
			}
		}
	}
	

}