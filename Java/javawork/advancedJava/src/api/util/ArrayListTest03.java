package api.util;

import java.util.ArrayList;
//Collection에 저장할 타입을 Generic형태로 정의한다.
//Collection<data_type>;
//	|_ArrayList<String>;
public class ArrayListTest03 {

	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css", "java"};
	
		
		ArrayList<String> list = changeData(arr);
		//변환되어 리턴된 ArrayList에 저장된 값을 꺼내서 출력하기
		int size= list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}	//for문 실행시마다 list.size를 구하기위해 heap에 접근하여 속도가 느려진다. 때문에 size를 미리 정의된 변수에 받아서 사용하자
		
		for (String data : list) {
			System.out.println("요소: "+data);
			
		}//for each
	}
	//배열을 ArrayList로 변환해서 리턴하는 메소드
	public static ArrayList<String> changeData(String[] arr){
		//매개변수로 전달된 배열에서 데이터를 꺼내서 ArrayList에 저장하는 코드
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}

}
