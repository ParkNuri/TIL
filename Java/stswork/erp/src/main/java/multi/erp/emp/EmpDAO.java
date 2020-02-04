package multi.erp.emp;


import java.util.ArrayList;

public interface EmpDAO {
	ArrayList<MemberVO> getTreeEmpList(String deptno);
	int insert(MemberVO user);
	ArrayList<MemberVO> getMemberList();
	int delete(String id);
	MemberVO read(String id);
	ArrayList<MemberVO> search(String column, String search,String pass);
	int update(MemberVO user);
	MemberVO login(MemberVO loginUser);
	boolean idCheck(String id);
	MemberVO findById(String id);
}














