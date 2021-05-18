package kahve2;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Abstract.BaseCustomerManager;
import Concrete.OsmanliCustomerManager;
public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Hakan Y�ld�r�m");
		customer.setBirthYear(2000);
		customer.setDentityNumber("11 Haneli Say�");
		
		Customer customer1 = new Customer();
		customer1.setId(2);
		customer1.setName("Engin Demiro�");
		customer1.setBirthYear(1983);
		customer1.setDentityNumber("11 Haneli Say�");
		customer1.setStar(0);
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);
		customerManager.buy(customer);
		System.out.println(customer.getName() + " Y�ld�z Say�s� : " + customer.getStar());

		BaseCustomerManager customerManager1 = new StarbucksCustomerManager();
		customerManager1.save(customer1);
		customerManager1.buy(customer1);
		customerManager1.buy(customer1);
		customerManager1.buy(customer1);
		System.out.println(customer1.getName() + " Y�ld�z Say�s� : " + customer1.getStar());
		
		
		BaseCustomerManager customerManager2 = new OsmanliCustomerManager();
		customerManager2.save(customer);
		
		

	}

}
