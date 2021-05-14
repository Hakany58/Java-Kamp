package Concrete;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
	
		System.out.println("Starbucks Ýçin Veri Tabanýna Kaydedildi : " + customer.getName());
		
	}


	public void buy(Customer customer) {

		System.out.println(customer.getName() + " Kahve satýn aldý ve 1 yýldýz kazandý " 	);
		customer.setStar(customer.getStar()+1);
	}
	
	

}
