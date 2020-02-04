package dl.book.exam.constructor;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker(){
		System.out.println("AppleSpeaker °´Ã¼»ý¼º");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeakerÀÇ º¼·ý¾÷¢Ö");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeakerÀÇ º¼·ý´Ù¿î¢Ù");
		
	}
	
}
