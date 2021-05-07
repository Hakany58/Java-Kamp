package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		
		System.out.println(customer.getCustomerNumber() + " Numaralý Müþteri Kayýt Edildi..");
		
	}
	
	public void deleted(Customer customer) {
		
		System.out.println(customer.getCustomerNumber() + " Kayýt Silme Ýþlemi Yapýldý..");
	}
	
	
	
	
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer : customers) {
			
			add(customer);
		}
		}
		
		public void deletedMultiple(Customer[] customers) {
			
			for(Customer customer : customers) {
				
				deleted(customer);
				
			}
		
	}
	

}
