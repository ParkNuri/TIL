package exam01;

public class TVUser {
	public static void main(String[] args) {
		
		TV sstv = new SamsungTV();
		playTV(sstv);
		
		TV lgtv = new LgTV();
		playTV(lgtv);
	}
	public static void playTV(TV tv) {
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
	}

}
