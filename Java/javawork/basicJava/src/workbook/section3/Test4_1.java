package workbook.section3;

import java.util.Random;

public class Test4_1 {

	public static void main(String[] args) {
		int[] arr3=new int [5];
		Random r = new Random();
		int sum=0;
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=r.nextInt(10)+1;
			for(int j=0;j<i;j++) {
				if(arr3[i]==arr3[j]) {
					arr3[i]=r.nextInt(10)+1;
					j=-1;
				}
			}
		}
		for(int i=0;i<arr3.length;i++) {
			sum+=arr3[i];
			System.out.print(arr3[i]+"\t");
		}
		System.out.println();
		System.out.println("sum="+sum);
		System.out.println("avg="+(float)sum/5);
	}

}
