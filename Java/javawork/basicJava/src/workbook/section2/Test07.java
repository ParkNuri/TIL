package workbook.section2;

public class Test07 {

	public static void main(String[] args) {
		System.out.println("정수를 입력하시오");
		
		int num = Integer.parseInt(args[0]);
		System.out.print(num);
		int i = 2;
		int sum= 0;
		while(true) {
			if(num*i>100)break;
			sum+=num*i;
			
			i++;
			System.out.print("+"+num*i);
		}
		System.out.println("="+sum);
	}

}
