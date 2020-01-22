package api.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		//FileTest01.java파일 copy 하기
			
		//1. FileReader로 읽고 FileWriter로 출력하기
		FileReader fs = null;
		FileWriter fw = null;
		try {
			fs = new FileReader("src/api/io/FileTest01.java");
			
			//2. scr/data/copy_result.txt로 생성하기
			fw = new FileWriter("src/data/result.txt");
			
			
			while(true) {
				int data = fs.read();
				if(data==-1) {
					break;
				}
				fw.write(data);
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//fs.close();
				if(fs!=null)fs.close();
				if(fw!=null)fw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		//3. 콘솔로도 출력되도록 작성
	}

}
