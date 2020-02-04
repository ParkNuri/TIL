package dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//dao의 메소드를 호출하는 클래스
@Service("deptService")
public class DeptServiceImpl {
	@Autowired
	DeptDAOImpl dao;
	
	public int count() {
		return dao.count();
	}
	public int insert(String deptno, String deptname) {
		return dao.insert(deptno, deptname);
	}
	public int update(String deptno, String deptname) {
		return dao.update(deptno, deptname);
	}
	public List<DeptDTO> selectAll(){
		return dao.selectAll();
	}
}
