package chap09.api.lang;
//String 클래스의 기본 메소드와 String 클래스의 특징
//=> 문자열처리메소드를 자주 호출하거나 +연산자로 문자열을 연결하는 작업이 많은 경우
//	 String을 사용하지 않고 StringBuffer or StringBuilder를 사용한다.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String ("java programming");
		String str2 = new String ("재밌다~");
		
		//원본 변환
		System.out.println(" str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("원본데이터: "+str1);
		
		System.out.println(" str1.toLowerCase()=>"+str1.toLowerCase());
		System.out.println(" str1.substring(2)=>"+str1.substring(2));
		System.out.println(" str1.substring(2,8)=>"+str1.substring(2,8));
		System.out.println(" str1.replace('a','A')=>"+str1.replace('a','A'));
		
		System.out.println("원본데이터: "+str1);
		
	}// 
}
