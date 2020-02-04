package book.exam.constructor;

import org.springframework.stereotype.Service;

@Service("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("SonySpeaker°´Ã¼»ý¼º");
	}
	public void soundUp() {
		System.out.println("SonySpeakerÀÇ º¼·ý¾÷~~~~");
	}
	public void soundDown() {
		System.out.println("SonySpeakerÀÇ º¼·ý´Ù¿î~~~~");
	}
}
