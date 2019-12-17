package chap09.api.lang;
//String객체를 다른 타입의 데이터로 변환
public class StringTest04 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle servlet jsp spring");
		
		//1. String -> byte[]
		System.out.println("1. String -> byte[]");
		byte[] bArr = str1.getBytes();
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i]);
		}
	
		//2. String -> char[]
		System.out.println("\n2. String -> char[]");
		char[] cArr = str1.toCharArray();
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		//3. String -> String[]		//문자열을 잘라서 문자열 배열에 저장
		System.out.println("\n3. String -> String[]");
		String[] sArr = str2.split(" ");
		/*for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr+"|");
		}*/
		for(String string : sArr) {
			System.out.print(string+"\t");
		}
		System.out.println();
		
		//4. 기본형 -> String
		//case 1
		System.out.println("\n4-1. 기본형 -> String");
		int i = 1000;
		double d = 10.0;
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		//case 2
		System.out.println("\n4-2. 기본형 -> String");
		test(i+"");
		test(d+"");
		
	}
	public static void test(String str) {
		System.out.println("전달된 데이터=>"+str);
	}
}
