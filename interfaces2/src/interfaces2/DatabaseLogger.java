package interfaces2;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {

		System.out.println("Database Logland� : " + message);
		
	}

	@Override
	public void delet(String message) {
		
		System.out.println("Database temizlendi : " + message);		
		
	}
	
	

}
