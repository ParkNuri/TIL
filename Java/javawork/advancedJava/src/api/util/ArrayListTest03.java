package api.util;

import java.util.ArrayList;
//Collection�� ������ Ÿ���� Generic���·� �����Ѵ�.
//Collection<data_type>;
//	|_ArrayList<String>;
public class ArrayListTest03 {

	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css", "java"};
	
		
		ArrayList<String> list = changeData(arr);
		//��ȯ�Ǿ� ���ϵ� ArrayList�� ����� ���� ������ ����ϱ�
		int size= list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}	//for�� ����ø��� list.size�� ���ϱ����� heap�� �����Ͽ� �ӵ��� ��������. ������ size�� �̸� ���ǵ� ������ �޾Ƽ� �������
		
		for (String data : list) {
			System.out.println("���: "+data);
			
		}//for each
	}
	//�迭�� ArrayList�� ��ȯ�ؼ� �����ϴ� �޼ҵ�
	public static ArrayList<String> changeData(String[] arr){
		//�Ű������� ���޵� �迭���� �����͸� ������ ArrayList�� �����ϴ� �ڵ�
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}

}