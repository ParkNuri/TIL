package chap09.api.lang;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("원본->"+sb);
		
		//메소드
		sb.append(" 재밌다");	//맨 끝에 추가
		System.out.println("원본->"+sb);
		
		sb.insert(2, "자바");	//해당 인덱스에 삽입
		System.out.println("원본->"+sb);

		sb.delete(2, 6);	//begin ~ end-1 삭제
		System.out.println("원본->"+sb);
		
		sb.reverse();	//문자열의 순서를 거꾸로
		System.out.println("원본->"+sb);
		
		
	}

}
