package dl.book.exam.constructor;

public class SamsungTV implements TV {
	//현재 클래스 내부에서 사용하는 객체 - 스프링컨테이너를 통해 전달받을 수 있도록 준비
	Speaker s;
	public SamsungTV(Speaker s) {
		this.s = s;
	}
	public void turnOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
		s.volumeUp();
	}

	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
		s.volumeDown();
	}
}
