package di.etc;

public class ConstructorTest {
	String num1;
	String num2;
	int num3;
	int num4;
	long num5;
	long num6;
	public ConstructorTest() {}
	public ConstructorTest(String num1, String num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("String String持失切");
	}
	public ConstructorTest(int num3, int num4) {
		super();
		this.num3 = num3;
		this.num4 = num4;
		System.out.println("int int持失切");
	}
	public ConstructorTest(long num5, long num6) {
		super();
		this.num5 = num5;
		this.num6 = num6;
		System.out.println("long long持失切");
	}
	@Override
	public String toString() {
		return "ConstructorTest [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5="
				+ num5 + ", num6=" + num6 + "]";
	}
	
	
	
	
}
