package basic;
public interface Insa {
	void addUser(MemberDTO user);
	MemberDTO getUser(String id);
	void setDao(MemberDAO dao);
}

