package dl.book.exam.constructor;

public class SonySpeaker implements Speaker {

	public SonySpeaker(){
		System.out.println("SonySpeaker °´Ã¼»ý¼º");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeakerÀÇ º¼·ý¾÷¢Ö");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeakerÀÇ º¼·ý´Ù¿î¢Ù");
		
	}
	
}
