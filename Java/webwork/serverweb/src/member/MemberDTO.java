package member;

import java.sql.Date;

public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private String deptno;
	private String grade;
	private int point;

	public MemberDTO() {

	}
	// insert
	public MemberDTO(String id, String pass, String name, String addr, String deptno, int point, String grade) {
		super();
		this.id = id;
		this.grade = grade;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.point = point;
		this.deptno = deptno;
	}
	// delete
	public MemberDTO(String id) {
		super();
		this.id = id;
	}
	// update
	public MemberDTO(String id, String addr) {
		super();
		this.id = id;
		this.addr = addr;
	}
	// select

	
	
	
	
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", deptno=" + deptno
				+ ", grade=" + grade + ", point=" + point + "]";
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
	

}
