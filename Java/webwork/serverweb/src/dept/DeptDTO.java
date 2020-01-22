package dept;

public class DeptDTO {
	private String deptno;
	private String deptname;
	private String loc;
	private String tel;
	private String mgr;
	
	public DeptDTO() {
		
	}
	
	public DeptDTO(String deptno, String deptname, String loc, String tel, String mgr) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.loc = loc;
		this.tel = tel;
		this.mgr = mgr;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", deptname=" + deptname + ", loc=" + loc + ", tel=" + tel + ", mgr=" + mgr
				+ "]";
	}
	
	
	
	
	
	
	
}
