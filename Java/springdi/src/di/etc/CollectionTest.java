package di.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//멤버변수가 List나 Map인 경우 DI를 어떻게 적용하나?
//멤버변수에 추가된 List나 Map의 데이터는 xml에서 추가
public class CollectionTest {
	private ArrayList<String> list;
	private HashMap<String,String> map;
	public CollectionTest() {}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	
	//ArrayList에 저장된 데이터 출력하기
	public void getList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void getMap() {
		Set<String> keylist = map.keySet();
		for (String key : keylist) {
			System.out.println("key: "+key+","+"value:"+map.get(key));
		}
	}
}
