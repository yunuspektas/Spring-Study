package service;

public class MailService implements MessageService {

	@Override
	public String sendMessage() {

		return "I am mail service, I sent a message";
	}

}
