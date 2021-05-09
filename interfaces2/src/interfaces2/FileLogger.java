package interfaces2;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {

		System.out.println("Dosyaya Loglandý : " + message);
		
	}

	@Override
	public void delet(String message) {
		
		System.out.println("Dosyadan silindi : " + message);
		
	}

}
