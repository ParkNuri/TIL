package chap08_exception;

import java.io.IOException;

//사용자 정의 Exception
public class MyException extends RuntimeException {
	public MyException(String msg) {
		super(msg);
	}
	//MyException이 발생했을때 저장하고 싶은 정보가 있고나 처리해야 할 내용이 있는 경우 구현
	
}
