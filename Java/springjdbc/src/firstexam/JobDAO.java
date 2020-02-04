package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//hr 계정의 job테이블을 제어하는 DAO 클래스
@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate myTemplate;
	
	//job테이블의 레코드 갯수를 리턴하는 메소드
	public int count() {
		return myTemplate.queryForObject("select count(*) from jobs", Integer.class);
		// query문 , 리턴타입.클래스
	}
}
