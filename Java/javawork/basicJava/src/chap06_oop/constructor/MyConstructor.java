package chap06_oop.constructor;
//생성자 연습
public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	
	public MyConstructor() {
		System.out.println("기본생성자");		
	}// default처럼 늘 만들기
	
	
	//로그인용
	public MyConstructor(String name, String id, String pass) {
		// 맴버변수(=인스턴스변수=객체변수)를 초기화
		
		this.name = name;
		this.id = id;
		this.pass = pass;
		
		System.out.println("매개변수 3개 생성자");		
	}// 초기생성시 vs getter&setter 정보 수정시
	
	//수정용
	public MyConstructor(String name, String id, String pass, String nickname) {
		// 맴버변수(=인스턴스변수=객체변수)를 초기화
		this(name, id, pass);//기존에 작성해놓은 매개변수 3개의 생성자를 호출
		
		this.nickname = nickname;
		
		System.out.println("매개변수 4개 생성자");		
	}	
	//조회용
	public MyConstructor(String name, String id, String pass, String nickname, String addr) {
		// 맴버변수(=인스턴스변수=객체변수)를 초기화
		
		this(name, id, pass, nickname);
		this.addr = addr;
		
		
		System.out.println("매개변수 5개 생성자");		
	}	
	//삽입용
	public MyConstructor(String name, String id, String pass, String nickname, String addr, int point) {
		// 맴버변수(=인스턴스변수=객체변수)를 초기화
		
		this(name, id, pass, nickname, addr);
		this.point = point;
		
		
		System.out.println("매개변수 6개 생성자");		
	}	
	
	
	
	
	
	
	
	//Getter&Setter****************************************
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
