package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl() {//기본생성자
	}
	//1. 생성자를 이용해서 작업
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao=dao;
	}
	//2. setter 메소드를 이용해서 작업하는 방법
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void addUser(MemberDTO user) {
		dao = new MemberDAO();
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
