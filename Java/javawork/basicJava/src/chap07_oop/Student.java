package chap07_oop;

public class Student extends Person {
	private int korean;
	private int english;
	private int math;
	private int science;
	public Student() {
		super();
	}
	
	public Student(String name, int korean, int english, int math, int science) {
		super();
		//this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public Student(String name, int age, int korean, int english, int math, int science) {
		super(name, age);	//부모의 private 멤버를 직접 엑세스하지 않고 생성자를 호출하며 전달한다.
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	//Getter & Setter --------------------------------------------
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		double avg = 
				(this.korean+this.english+this.math+this.science)/4.0;
		return avg;
	}
	public String getGrade() {
		double avg = getAvg();
		String grade = "";
		if(avg>100 | avg<0) {
			System.out.println("잘못입력");
		}else {
			if(avg>=90) {
				grade = "A학점";
			}else if(avg>=70) {
				grade = "B학점";
			}else if(avg>=50) {
				grade = "C학점";
			}else if(avg>=30) {
				grade ="D학점";
			}else {
				grade ="F학점";
			}
		}
		return grade;
	}
	public void print() {
		super.print();	//부모 클래스인 Person 클래스의 print메소드를 호출
		System.out.println(" 평균:"+getAvg()+" 학점:"+getGrade());
	}
	public static void show() {
		System.out.println("=================================");
	}
}
















