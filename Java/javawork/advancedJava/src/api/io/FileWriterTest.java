package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		//File출력은 매개변수로 전달된 파일이 있으면 해당 파일을 열고 작업하지만 없는 경우 새로 파일을 생성하여 작업한다.
		
		
		//1. 파일 open
		//파일을 덮어쓰기
		//FileWriter fw = new FileWriter("src/data/output.txt");
		//write 메소드가 호출될때마다 파일에 내용을 추가 - appen mode = true
		FileWriter fw = new FileWriter("src/data/output2.txt",true);
		
		//2. 파일 엑세스
		fw.write(97);	//97에 대한 ASCII코드 문자가 출력
		fw.write("문자열1 쓰기");
		fw.write("\ntest");
		
		//3. 파일 close
		fw.close();
	}

}
