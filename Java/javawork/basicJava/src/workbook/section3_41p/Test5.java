package workbook.section3_41p;

public class Test5 {

	public static void main(String[] args) {
		Calc c = new Calc();
		int sum = c.calcSum(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));

		float avg = (float)sum/4;
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+avg);
		if(100>=avg && avg>=90) {
			System.out.println("A");
		}else if(avg>=70) {
			System.out.println("B");
		}else if(avg>=50) {
			System.out.println("C");
		}else if(avg>=30) {
			System.out.println("D");
		}else if(avg>0) {
			System.out.println("F");
		}
	}

}