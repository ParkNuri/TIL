package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest2 {
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

		print(set, "set");
		
		//합집합을 구현하는 방법은-> Set객체를 생성할때 합집합으로 표현할 Set을 생성자의 매개변수로 전달
		HashSet<String> set2 = new HashSet<String>(set);
		
		set2.add("servlet");
		set2.add("jsp");
		set2.add("hadoop");
		System.out.println("사이즈->"+set2.size()); 	//사이즈->7
		
		print(set2, "set2");
	
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("hive");
		set3.add("java");		
		set3.add("oracle");
		set3.add("jdbc");
		
		System.out.println("사이즈->"+set3.size()); 	//사이즈->7
		
		print(set3, "set3");
		
		//set과 set3의 교집합 구하기
		set.retainAll(set3);	//set과 set3에 저장된 요소 중 중복되는 요소만
								//가지고 새로운 set구조가 만들어진다.
								//set과 set3을 비교해서 일치하는 것만 남기고
								//나머지가 제거된다.
		print(set, "교집합set");
		
	}//set에 저장된 데이터를 꺼내서 출력하기
//	public static void print(HashSet<String> set) {
	public static void print(Set<String> set, String setName) {	//다형성을 적용하기 위해 hashset이 아닌 set 사용
		for (String data : set) {
			System.out.println(setName+"에 저장된 요소->"+data);
		}
		
		System.out.println("=================================");
	}
	
}
