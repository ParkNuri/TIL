package chap08_exception;
//try~catch로 예외 처리
public class ExceptionTest02 {
	public static void main(String[]args) {
		try{
			System.out.println("******프로그램 시작******");
			System.out.println(10/0);//예외가 발생할 수 있는 문장
			System.out.println("******프로그램 종료******");
			
			//예외발생 가능한 코드블럭 전체를 try로 묶기
		}catch(Exception e) {
			System.out.println("오류발생..");
			System.out.println("예외메세지: "+e.getMessage()); // 오류 내용
			e.printStackTrace(); //void   오류 위치 추적
		}
		
	}
}
