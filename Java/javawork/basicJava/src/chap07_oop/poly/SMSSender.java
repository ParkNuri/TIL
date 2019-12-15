package chap07_oop.poly;
public class SMSSender extends Sender {
	int length;
	public SMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//SMSSender에서만 처리되는 고유의 기능 실행
		System.out.println("(SMS)"+name+"에게 "+length+"로 전송완료");
	}
}
