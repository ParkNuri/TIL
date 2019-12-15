package chap06_oop;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		while(true) {
			Scanner key = new Scanner(System.in);
			System.out.println("========인사 관리 시스템=========");
			System.out.println("\t1.인사등록");
			System.out.println("\t2.정보수정");
			System.out.println("\t3.개인정보조회");
			System.out.println("\t4.사원목록");
			System.out.print("원하는 작업을 선택하세요. : ");

			Person p = new Person();
			
			int work = key.nextInt();
			switch (work) {
			case 1:
				System.out.print("이름:");
				String name = key.next();
				System.out.print("주소:");
				String addr = key.next();
				System.out.print("나이:");
				int age = key.nextInt();
				
				p.name = name;
				p.addr = addr;
				p.age = age;
				System.out.println(p.name+"\t"+p.addr+"\t"+p.age+"\t"); 
				break;
			case 2:
				System.out.println("=====정보 수정하기=====");
				System.out.print("변경할 항목(1.이름  2.주소  3.나이):");
				int i = key.nextInt();
				switch(i) {
				case 1: System.out.print("변경할 이름:");
						p.name = key.next();
						break;
				case 2: System.out.print("변경할 주소:");
						p.addr = key.next();
						break;
				case 3: System.out.print("변경할 나이:");
						p.age = key.nextInt();
						break;
				}
			case 3:
			case 4:
			}
		}
	}
	

}
