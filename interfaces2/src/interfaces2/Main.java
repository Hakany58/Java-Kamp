package interfaces2;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Hakan YILDIRIM");
		
		Customer customer1 = new Customer();
		customer1.setId(2);
		customer1.setName("Engin Demiroð");
		
		
		Logger[] loggers = {new SmsLogger(), new FileLogger(), new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		customerManager.add(customer);
		System.out.println("-------------");
		
		CustomerManager customerManager1 = new CustomerManager(loggers);
		customerManager1.deleted(customer1);
		

	}

}
