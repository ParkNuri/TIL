package chap05;

public class ArrayExam01 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[2] = 100;
		arr[3] = 200;
		arr[5] = 300;
		int i=0;
		while(i<arr.length) {
			System.out.println("배열의 "+i+"번째 요소 값 : "+arr[i]);
			i++;
		}

	}

}
