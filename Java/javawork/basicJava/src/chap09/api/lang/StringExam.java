package chap09.api.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1을 AVAJ로 출력되게 구현하기
		//단, StringBuffer의 reverse()사용x
		//	  String의 toCharArray() 사용x
		//	 String클래스의 charAt과 toUpperCase()사용
		String str1 = "java";
		String str2 = str1.toUpperCase();
		for (int i = str2.length()-1; i >= 0 ; i--) {
			System.out.print(str2.charAt(i));
		}
	}

}
