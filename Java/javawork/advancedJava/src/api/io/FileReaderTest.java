package api.io;
//한글 읽기
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String [] args) {
		FileReader fr = null;
		try {
			//1. 파일 오픈하기
			fr = new FileReader("src/api/io/FileTest01.java");
			//2. 파일엑세스
			int count = 0;
			long start = System.nanoTime();
			while(true) {
				int data = fr.read();
				if(data==-1) {
					break;
				}
				count++;
				System.out.println((char)data);
			}
			long end = System.nanoTime();
			System.out.println("실행횟수=>"+ count);	//1535	//buffer보다 많이 실행함
			System.out.println("실행시간=>"+(end-start));	//17518500
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. 파일닫기
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
