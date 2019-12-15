package chap07_oop;

public class Staff extends Person{

	private String dept;
	
	//Constructor -------------------------------------------------
	public Staff() {	}

	public Staff(String name, int age, String dept) {
		super(name, age);
	/*	this.name = name;
		this.age = age;*/
		this.dept = dept;
	}

	
	//Getter & Setter ---------------------------------------------
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		super.print();
		System.out.println(" ºÎ¼­: "+getDept());
	}
	
}
