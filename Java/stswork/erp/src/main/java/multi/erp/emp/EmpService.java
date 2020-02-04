package multi.erp.emp;


import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public interface EmpService {
	ArrayList<MemberVO> getTreeEmpList(String deptno);
	int insert(MemberVO user,MultipartFile file,String realpath,String filename);
	public boolean idCheck(String id);
	ArrayList<MemberVO> getMemberList();
	int delete(String id);
	MemberVO read(String id);
	ArrayList<MemberVO> search(String column, String search
					,String pass);
	int update(MemberVO user);
	MemberVO login(MemberVO loginUser);
}
