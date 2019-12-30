package api.util;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;

public class ArrayListExam02 {
	public static void main(String[] args) {
		/*	번호		성명		자바		웹		android
		 *	1	     장동건	 97		100			88		=>	StudentDTO
		 *	2	     이민호	100		92			91
		 *  3	     류준열	 88		96			78
		 * 
		 */
		 // ArrayList에 데이터 저장하기
		ArrayList<StudentDTO> stdlist = new ArrayList<StudentDTO>();
		StudentDTO std1 = new StudentDTO(1, "장동건", 97, 100, 88);
		StudentDTO std2 = new StudentDTO(2, "이민호", 100, 92, 91);
		StudentDTO std3 = new StudentDTO(3, "류준열", 88, 96, 78);
		
		stdlist.add(std1);
		stdlist.add(std2);
		stdlist.add(std3);
		
		display(stdlist);
	}
	
	// 매개변수로 전달받은 ArrayList에 저장된 데이터 꺼내서 출력하기
	public static void display(ArrayList<StudentDTO> stdlist) {
		int size = stdlist.size();
				for (int i = 0; i < size; i++) {
					StudentDTO std = stdlist.get(i);
					System.out.print("번호 : "+ std.getNum() + ",");
					System.out.print("성명 : "+ std.getName() + ",");
					System.out.print("자바 : "+ std.getJava() + ",");
					System.out.print("웹 : "+ std.getWeb() + ",");
					System.out.print("안드로이드 : "+ std.getAndroid());
				}
	}
}
