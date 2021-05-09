package interfaces2;

public class SmsLogger implements Logger {

	@Override
	public void log(String message) {

		System.out.println("SMS Gönderildi : " + message);
		
		
	}

	@Override
	public void delet(String message) {

		System.out.println("SMS Gönderildi : " + message);
		
	}

	
		
}
