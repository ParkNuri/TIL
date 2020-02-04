package dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


//사용자 정의 dao클래스
@Repository
public class DeptDAOImpl {
	
	@Autowired
	JdbcTemplate mytemplate;
	
	public int count() {
		
		return mytemplate.queryForObject("select count(*) from dept", Integer.class);
	}
	public int insert(String deptno, String deptname) {
		String sql = "insert into dept(deptno, deptname) values (?,?)";
		int result = mytemplate.update(sql, deptno, deptname);
		return result;
	}
	public int update(String deptno, String deptname) {
		String sql = "update dept set deptname=? where deptno=?";
		int result = mytemplate.update(sql, deptname, deptno);
		return result;
	}
	public List<DeptDTO> selectAll(){
		return mytemplate.query("select deptno, deptname from dept", new MyDeptRowMapper());
	}
}
