package chap03_variable;
//비교연산자-||,&&(숏컷 연산자) - 모든 항을 검사하지 않고 조건에 만족하면 
//						   skip하는 경우가 발생한다.
public class OprTest04_short {
	public static void main(String[]args) {
		int num = 100;
		String str = null; // 현재 str은 아무것도 저장되지 않은 변수
		//str.length();
		System.out.println(num>=100 || str.length()>10); //or연산자일때 앞의 식이 true면 패스
		//System.out.println(num>=100 | str.length()>10); //or연산자일때 앞의 식이 true여도 뒤 검사

		System.out.println(num<100 && str.length()>10); //and연산자일때 앞의 식이 false면 패스
		//System.out.println(num<100 & str.length()>10); //and연산자일때 앞의 식이 false여도 뒤 검사
	}
}
