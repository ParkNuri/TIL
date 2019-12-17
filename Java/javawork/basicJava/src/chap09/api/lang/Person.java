package chap09.api.lang;

public class Person {
	String name;
	int age;
	String addr;
	
	
	
	//Constructor----------------------------------------------------
	public Person() {
		
	}
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	//Method---------------------------------------------------------
	/*public String toString() {
		return this.name+","+this.age+","+this.addr;
	}
	*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	//Getter&Setter--------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
