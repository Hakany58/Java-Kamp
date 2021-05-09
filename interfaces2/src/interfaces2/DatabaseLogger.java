package interfaces2;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {

		System.out.println("Database Loglandý : " + message);
		
	}

	@Override
	public void delet(String message) {
		
		System.out.println("Database temizlendi : " + message);		
		
	}
	
	

}
