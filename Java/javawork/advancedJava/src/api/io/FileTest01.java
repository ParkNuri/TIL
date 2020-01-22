package api.io;

import java.io.File;

public class FileTest01 {

	public static void main(String[] args) {
		//엑세스하고 싶은 파일이나 폴더의 위치를 File객체 만들때 매개변수에 정의
		//1. c:\iot\iotest폴더 - c:\iot\iotest로 표현
//		File file1 = new File("c:\\iot\\iotest");	// escape 문자
		File file1 = new File("c:/iot/iotest");	// \\대신 /로 접근 가능		// 절대경로는 잘 사용하지 않음
		
		//2. 프로젝트 폴더에 저장한 test.txt파일
		//	 ->파일 경로를 정의하지 않는 경우 기본으로 인식하는 위치는 프로젝트 폴더 
		File file2 = new File("test.txt");
		
		//3. scr/data폴더에 저장된 test.txt파일
		File file3 = new File("src/data/test.txt");
		System.out.println(file1);
		System.out.println(file2);
		System.out.println(file3);
		
		System.out.println("file3.canRead()=>"+file3.canRead());
		System.out.println("file3.canWrite()=>"+file3.canWrite());
		System.out.println("file3.getName()=>"+file3.getName());
		System.out.println("file3.getAbsolutePath()=>"+file3.getAbsolutePath());
		System.out.println("file3.getParent()=>"+file3.getParent());
		System.out.println("file3.getPath()=>"+file3.getPath());		//실제 우리가 저장한 경로
		System.out.println("file3.isDirectory()=>"+file3.isDirectory());		//디렉터리니?
		System.out.println("file1.isDirectory()=>"+file1.isDirectory());
		System.out.println("file3.isFile()=>"+file3.isFile());			//파일이니?
		System.out.println("file1.isFile()=>"+file1.isFile());
		System.out.println("file3.isHidden()=>"+file3.isHidden());
		System.out.println("file3.lastModified()=>"+file3.lastModified());		//마지막 수정 시간을 19??년 을 기준으로 시간

		file3.setReadOnly();	//파일을 읽기 전용으로 변경
	}

}
