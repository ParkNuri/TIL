package chap03_variable;

public class variableTest {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;
		
		System.out.println("==============기본형==============");
		if(i==j) {
			System.out.println("기본형 같다.");
			
		}
		else {
			System.out.println("기본형 다르다.");
		}
		
	
		//참조형 변수
		String str1 = new String("java");
		String str2 = new String("java"); // 주소 저장
		
		if(str1==str2) {
			System.out.println("참조형 같다.");
		}
		else {
			System.out.println("참조형 다르다.");
		}
		
		//문자열 비교 - String클래스 메소드로 처리
		//문자열 비교는 무조건 equals 이용해서 비교한다.
		//==안돼!!
		if(str1.equals(str2)) {	// equals-> String 클래스 내의 value 비교
			System.out.println("문자열 같다.");
		}else {
			System.out.println("문자열 다르다.");

		}
		
	}
}
