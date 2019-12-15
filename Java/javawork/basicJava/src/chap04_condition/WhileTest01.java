package chap04_condition;
//while문 연습 - ForTest01.java에서 작업한 내용 while문으로 변경
public class WhileTest01 {

	public static void main(String[] args) {
		int i=1;
		while(i<6) {
			System.out.println("java programming");
			i++;
		}
		
		System.out.println("===========================");
		
		i=1;
		while(true) {
			if(i>5) {break;}
			System.out.println("java programming:" + i);
			i++;
		}

	}

}
