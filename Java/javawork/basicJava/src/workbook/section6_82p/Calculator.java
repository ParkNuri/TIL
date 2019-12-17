package workbook.section6_82p;

public class Calculator {
	public double plus(int a, int b) {
		System.out.println("결과 : "+ (a+b));
		return a+b;
	}
	public double minus(int a, int b) {
		System.out.println("결과 : "+ (a-b));
		return a-b;
	}	
	public double multiplication(int a, int b) {
		System.out.println("결과 : "+ (a*b));
		return a*b;
	}	
	public double divide(int a, int b) {
		double result=0;
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Exception이 발생하였습니다. 다시 입력해주세요.");
		}
		System.out.println("결과 : "+ result);
		return result;
	}
	
}
