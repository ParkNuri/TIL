package chap05_array;

public class ArrayExam02 {

	public static void main(String[] args) {
		//���� 8
		int[] arr= {10, 20, 30, 40, 50};
		
		int sum=0;
		
		for(int i =0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+sum/arr.length);
		

	}

}
