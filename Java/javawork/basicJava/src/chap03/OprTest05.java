package chap03;

public class OprTest05 {
	public static void main(String[]args) {
		int num1 =80;
		System.out.println(num1>=90?"합격":"불합격");
	
		//50이하는 a, 나머지 b
		int num2=45;
		char result = num2<=50?'A':'B';
		System.out.println("result is.."+result);
		
		int i = 10;
		i = i + 20;
		System.out.println("result is.."+i);
		i =10;
		i+=20;
		System.out.println("result is.."+i);
		
	}
}
