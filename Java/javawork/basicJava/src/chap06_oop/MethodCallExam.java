package chap06_oop;

public class MethodCallExam {
	public void test() {
		first();
	}
	public void first() {
		second();
	}
	public void second() {
		System.out.println("i'm second!");
	}
	public static void main(String[] args) {
		MethodCallExam obj = new MethodCallExam();
		obj.test();
		int age=10;
	}
}
