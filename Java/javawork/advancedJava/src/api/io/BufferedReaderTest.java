package api.io;
import java.io.BufferedReader;
//한글 읽기
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader로 한 문장씩 읽기
public class BufferedReaderTest {
	public static void main(String [] args) {
		//FileReader fr = null;
		BufferedReader br = null;
		try {
			//fr = new FileReader("test.txt");
			//br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader("src/api/io/FileTest01.java"));
			int count = 0;
			long start = System.nanoTime();
			while(true) {
				String data = br.readLine();
				if(data==null) {
					break;
				}
				count++;
				System.out.println(data);
			}
			long end = System.nanoTime();
			System.out.println("실행횟수=>"+ count);		//39	//FileReader보다 훨씬 적게 실행
			System.out.println("실행시간=>"+(end-start));	//1609700	//FileReader보다 10배 빠름
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. 파일닫기
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
