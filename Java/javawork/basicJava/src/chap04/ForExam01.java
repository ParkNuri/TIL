package chap04;
//for 예제 - ABC~Z까지 출력
public class ForExam01 {

	public static void main(String[] args) {
		char c = 'A';
		for(int i = 0; i<26;i++) {
			System.out.print((char)(c+i));
		}
		System.out.println();
		//선생님 풀이
		for(char data = 'A'; data<='Z';data++) {
			System.out.print(data);
		}
	
	}

}
