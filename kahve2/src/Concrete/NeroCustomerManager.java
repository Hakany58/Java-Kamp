package Concrete;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		
		System.out.println("Nero i�in Veri Taban�na Kaydedildi : " + customer.getName());
		
	}

	@Override
	public void buy(Customer customer) {
		// TODO Auto-generated method stub
		
	}



}
