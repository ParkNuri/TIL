package api.util;

import java.util.ArrayList;
//Collection에 저장할 타입을 Generic형태로 정의한다.
//Collection<data_type>;
//	|_ArrayList<String>;
public class ArrayListTest02 {

	public static void main(String[] args) {
		//String[] arr = new String[]();
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("oracle");
		list.add("JDBC");
		list.add("자바");
		list.add("누리");
		list.add("하나");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+"  ");
		}
		
	}

}
