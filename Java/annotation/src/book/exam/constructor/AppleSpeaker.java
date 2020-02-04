package book.exam.constructor;

import org.springframework.stereotype.Service;

@Service("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker°´Ã¼»ý¼º");
	}
	public void soundUp() {
		System.out.println("AppleSpeakerÀÇ º¼·ý¾÷~~~~");
	}
	public void soundDown() {
		System.out.println("AppleSpeakerÀÇ º¼·ý´Ù¿î~~~~");
	}
}
