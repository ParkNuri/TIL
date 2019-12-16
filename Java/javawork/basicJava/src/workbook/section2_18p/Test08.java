package workbook.section2_18p;

public class Test08 {

	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 40, 50};
		
		int sum=0;
		
		for(int i =0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+sum/arr.length);
	}

}
