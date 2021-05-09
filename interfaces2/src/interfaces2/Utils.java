package interfaces2;

public class Utils {
	
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers) {
			logger.log(message);
		}
	}
	
	public static void runLoggersnt(Logger[] loggers, String message) {
		
		for(Logger logger : loggers) {
			logger.delet(message);
		}
		
	}
	

}
