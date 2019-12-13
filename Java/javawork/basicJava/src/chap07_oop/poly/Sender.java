package chap07_oop.poly;
public abstract class Sender {
	String name;
	Sender(String name){
		this.name = name;
	}
	public abstract void print();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

