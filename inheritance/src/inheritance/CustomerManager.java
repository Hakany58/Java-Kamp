package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		
		System.out.println(customer.getCustomerNumber() + " Numaral� M��teri Kay�t Edildi..");
		
	}
	
	public void deleted(Customer customer) {
		
		System.out.println(customer.getCustomerNumber() + " Kay�t Silme ��lemi Yap�ld�..");
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
