package workbook.section4_52p;

public class Test3 {

	public static void main(String[] args) {
		int num =Integer.parseInt((args[0]));
		int sum = 0;
		char c=' ';
		for (int i = num; i <= 10; i++) {
			if(i%3==0||i%5==0) {}
			else {
				sum+=i;
				System.out.print(i);
				c = i==8?' ':'+';
				System.out.print(c);
			}
		}
		System.out.println();
		
		System.out.println("°á°ú : "+sum);
	}

}
