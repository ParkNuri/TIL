package workbook.section3;

public class Test3 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
		};
		int sum=0,cnt=0;
		for(int i=0;i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");
				sum+=arr2[i][j];
				cnt++;
			}
			System.out.println("\t");
		}
		System.out.println();
		System.out.println("sum="+sum);
		System.out.println("avg="+(double)sum/cnt);

	}

}
