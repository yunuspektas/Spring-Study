package service;

public class SMSService implements MessageService {

	@Override
	public String sendMessage() {
		
		return "I am a SMS service, I sent a SMS";
	}

}
