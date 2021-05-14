package Concrete;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class OsmanliCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("Osmanli Kahvecisi Ýçin Veri Tabanýna Kaydedildi");
		
	}

	@Override
	public void buy(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
