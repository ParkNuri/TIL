package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//InputStream을 이용해서 키보드로 입력받는 문자열 읽기
// - Scanner클래스의 next메소드의 기능을 구현
public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in; //System.in : 상수
		PrintStream out = System.out;
		
		while (true) {
			//1. 스트림의 데이터를 1byte 읽기
			try {
				int data = in.read();
//				if(data == -1) {	//계속 입력
				if(data == 13) {	//한번만 입력 (엔터 만나면 종료)
					break;
				}
				out.println((char)data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
// input :  14
// output : 49 52 13 10	
// 49 52 -> 1과 4
// 13 => enter 
// 10 -> init cursor to first place
