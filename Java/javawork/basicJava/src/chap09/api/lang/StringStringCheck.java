package chap09.api.lang;
//String과 StringBuffer의 성능 비교
public class StringStringCheck {
	//String의 작업을 체크하는 메소드
	public static void stringCheck(int count) {
		//시작할때 시간 측정 - nano 초
		String str = new String("자바");
		for (int i = 0; i <= count; i++) {
			str = str + "java";
		}
		long start = System.nanoTime();
		
		for (int i = 0; i <= count ; i++) {
			str = str + "java";
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str=str+java");
		System.out.println("걸린시간:"+time);
	}
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= count; i++) {
			sb.append("java");
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append(\"java\")"+sb.append("java"));
		System.out.println("걸린시간:"+time);
	}
	public static void main(String[] args) {
		
	}

}
