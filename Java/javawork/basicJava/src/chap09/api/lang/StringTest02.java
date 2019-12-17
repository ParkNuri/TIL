package chap09.api.lang;
//String 클래스의 주요 메소드
public class StringTest02 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String(" 재밌다.");
		System.out.println(str1);	//toString이 호출됨(문자열 호출_
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));	//result |  1  => 
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));	//result | -1  => 해당하는 문자열이 없다.
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));	//인덱스를 오른쪽에서부터 찾기
		System.out.println("str1.length()=>"+str1.length());
		
		
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));

		//문자열 비교 - 대소문자 비교 안함
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"+str1.equalsIgnoreCase("Java programming"));
		
		//문자열 비교 - prefix
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"ming\")=>"+str1.startsWith("ming"));
	
		//문자열 비교 - suffix
		System.out.println("str1.endsWith(\"java\")=>"+str1.endsWith("java"));
		System.out.println("str1.endsWith(\"ming\")=>"+str1.endsWith("ming"));
		
		
	}

}
