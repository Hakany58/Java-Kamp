package Concrete;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
	
		System.out.println("Starbucks ��in Veri Taban�na Kaydedildi : " + customer.getName());
		
	}


	public void buy(Customer customer) {

		System.out.println(customer.getName() + " Kahve sat�n ald� ve 1 y�ld�z kazand� " 	);
		customer.setStar(customer.getStar()+1);
	}
	
	

}
