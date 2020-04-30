package member;

import java.util.ArrayList;

public interface MemberDAO {

	MemberDTO findById(String id);
	int insert(MemberDTO user);//������
	int update(String id, String addr);//������� ����
	int delete(String id);//���Ż��
	ArrayList<MemberDTO> memberList();//��ü ������ ��ȸ
	ArrayList<MemberDTO> findByAddr(String addr);//�ּҷ� �˻��ϱ�
	MemberDTO login(String id, String pass);//�α���

}