package Abstract;
import Entities.Customer;

public interface CustomerService {
	
	void save(Customer customer);
	void buy(Customer customer);

}