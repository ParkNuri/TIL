package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		
		//c:/iot/iotest 폴더의 하위폴더 및 파일을 출력

		File file1 = new File("c:/iot/iotest");
		
		File[] fileList = file1.listFiles();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년mm월dd일");
		System.out.println("======print file list======");
		for (File data : fileList) {
			System.out.print(data.getName()+" -------------[");
			if(data.isFile()==true) {System.out.print("파일:"+data.length());}
			else {
				System.out.print("폴더");
				sdf.format(data.lastModified());
			}
			System.out.println("]");
		}
		
		
		//[출력형태]
		//a -----------------[폴더]
		//b -----------------[폴더]
		//ArrayTest01.java ----------------[파일:(파일의 사이즈 출력)]
		//.
		//.
		//.
		//마지막 접속한 날짜를 년 월 일 형식으로 출력
		
	}

}
