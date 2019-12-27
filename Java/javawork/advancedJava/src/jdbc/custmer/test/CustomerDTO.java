package jdbc.custmer.test;

import java.sql.Date;

public class CustomerDTO {
	private String id;
	private String pass;
	private String name;
	private Date regDate;
	private int point;
	private String addr;

	public CustomerDTO() {

	}
	// insert
	public CustomerDTO(String id, String pass, String name, String addr) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
	}
	
	// delete
	public CustomerDTO(String id) {
		super();
		this.id = id;
	}
	// update
	public CustomerDTO(String id, String addr) {
		super();
		this.id = id;
		this.addr = addr;
	}

	
	
	
	
	
	
	
	
	// getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	

}
