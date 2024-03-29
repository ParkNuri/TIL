package workbook.section3_41p;

public class Student {
	private String name;
	private int korea;
	private int english;
	private int math;
	private int science;
//	private double avg;
	
	public Student() {
		
	}

	public Student(String name, int korea, int english, int math, int science) {
		setName(name);
		setKorea(korea);
		setEnglish(english);
		setMath(math);
		setScience(science);
	}
	
	public double getAvg() {
		double avg=0;
		avg = (double)(korea+english+math+science)/4;

		return avg;
	}
	public String getGrade() {
		String grade="";
		
		double avg=getAvg();
		
		if(100>=avg && avg>=90) {
			grade = "A";
		}else if(avg>=70) {
			grade = "B";
		}else if(avg>=50) {
			grade = "C";
		}else if(avg>=30) {
			grade = "D";
		}else if(avg>0) {
			grade = "F";
		}
		
		return grade;
	}
	
	public void print() {
		System.out.println(getName()+" ���:" + getAvg()+"\t����:"+getGrade()+"����");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorea() {
		return korea;
	}

	public void setKorea(int korea) {
		this.korea = korea;
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
	
}
