package api.util;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		//다음과 같은 변수명으로 HashSet 객체 2개 생성하기
		// set1 -> 1~10까지의 정수
		// set2 -> 5~15까지의 정수
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			set1.add(i);
			set2.add(i+4);
		}				
		set2.add(15);
		// set1과 set2 합집합 출력하기
		HashSet<Integer> setR = new HashSet<Integer>(set1);
		setR.addAll(set2);
		System.out.println("----합집합 결과----");
		for (Integer data : setR) {
			System.out.println("합집합 요소: "+data);
		}
		
		// set1과 set2 교집합 출력하기
		set1.retainAll(set2);
		
		System.out.println("----교집합 결과----");
		
		for (Integer data : set1) {
			System.out.println("교집합 요소: "+data);
		}
		
	}
		
		

}
