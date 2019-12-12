package chap07_oop;

public class Teacher extends Person{
	private String subject;
	
	//Constructor ----------------------------------------------
	public Teacher() {	}

		
	public Teacher(String name, int age, String subject) {
		super(name, age);
/*		this.name = name;
		this.age = age;
*/		this.subject = subject;
	}




	//Getter & Setter --------------------------------------------
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.println(" ����: "+getSubject());
	}

}
