package api.util;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		//E는 element의 약자. ArrayList를 사용하는 시점에 정의하는 데이터 타입
		//ArrayList에 저장되는 요소의 타입
		//Object랑 같다고 생각하면 됨
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println("사이즈:"+list.size());
		
		System.out.print("ArrayList에 저장된 요소들:  ");
		for (int i = 0; i <= list.size()-1; i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
