package exam01;

public class SamsungTV implements TV {
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}