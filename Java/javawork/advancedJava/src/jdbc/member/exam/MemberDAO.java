package jdbc.member.exam;

public interface MemberDAO {
	
	int insert(MemberDTO user);
	int update(String id, String addr);
	int delete(String id);
}
