package api.util;

public class StudentDTO {
	private int num;
	private String name;
	private int java;
	private int web;
	private int android;
	
	public StudentDTO() {}
	
	public StudentDTO(int num, String name, int java, int web, int android) {
		super();
		this.num = num;
		this.name = name;
		this.java = java;
		this.web = web;
		this.android = android;
	}

	
	
	@Override
	public String toString() {
		return "StudentDTO [num=" + num + ", name=" + name + ", java=" + java + ", web=" + web + ", android=" + android
				+ "]";
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getAndroid() {
		return android;
	}

	public void setAndroid(int android) {
		this.android = android;
	}
	
	
	
}
