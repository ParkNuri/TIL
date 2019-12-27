package api.util;

import java.util.Vector;

//Vector를 만들고 사용하는 방법
public class VectorTest01 {
	public static void main(String args[]) {
//		Vector<element_type> var = new Vector<element_type>();		<>: 제네릭. Collection 형 클래스를 사용할때 데이터 타입 명시하는 방법
		Vector<Integer> v = new Vector<Integer>();
//		v.add("java");
		v.add(10);
		System.out.println("Vector의 용량:"+v.capacity());	//총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수:"+v.size());	//들어가있는 데이터의 갯수

		System.out.println("==================================================");
		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}

		
		System.out.println("Vector의 용량:"+v.capacity());	//총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수:"+v.size());	//들어가있는 데이터의 갯수
				
	}
}
