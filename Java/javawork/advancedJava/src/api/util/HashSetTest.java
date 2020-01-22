package api.util;
//집합 : 중복 허용 x
//HashSet 사용하기 - 데이터 저장하고 저장된 데이터 꺼내기
import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("javascript");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("jquery");
		set.add("java");
		set.add("json");
		//8개 데이터
		System.out.println("사이즈->"+set.size()); 	//사이즈->7
		// 중복된 데이터는 하나로 쳐서 갯수에 카운트되지 않는다
		
		//set 안에 저장된 요소를 추출
		//1. HashSet데이터를 표준 인터페이스(모든 자료구조에 담긴 데이터를 
		//	 변환해서 담을 수 있도록 제공되는 추출전용)인 Iterator로 변환
		Iterator<String> it =set.iterator();

		//2. 변환 후 추출
		while(it.hasNext())
		{	// Iterator 안에 저장된 요소가 있는지 확인 - boolean 리턴
			String data = it.next();	//Iterator에 저장된 요소를 하나 꺼내서 반환
			System.out.println("꺼낸 요소:"+data);
		}
		
		//=
		for (String data : set) {
			System.out.println("set에 저장된 요소:"+data);
		}
	
	}
}
