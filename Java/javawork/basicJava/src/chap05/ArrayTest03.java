package chap05;

public class ArrayTest03 {

	public static void main(String[] args) {
		int[] myarr = new int[15];
		
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
		//=> for문
		//배열 요소의 크기 출력
		System.out.println("배열 요소의 갯수: "+myarr.length);
		System.out.println("----------------------------");
		for (int i = 0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
	}

}
