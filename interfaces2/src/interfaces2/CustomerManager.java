package interfaces2;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
		
	}
	
	public void add(Customer customer) {
		
		System.out.println("M��teri Eklendi : " + customer.getName());

		Utils.runLoggers(loggers, customer.getName());

	}
	
	public void deleted(Customer customer) {
		
		System.out.println("M��teri Kayd� Silindi : " + customer.getName());

		Utils.runLoggersnt(loggers, customer.getName());
		
	}
	

}
