package chap07_oop;
//static ������ ������ �� �ִ� ����
public class StaticDemo {
	String name;
	int num;
	static int staticNum;
	public StaticDemo() {
		
	}
	public StaticDemo(String name) {
		this.name = name;
		num++;
		staticNum++;
		
	}
	public void display() {
		System.out.println("name: "+name+"\tnum: "+num+"\tstaticNum: "+staticNum);
		
		
	}
}