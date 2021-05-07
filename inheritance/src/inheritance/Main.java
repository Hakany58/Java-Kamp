package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer hakan = new IndividualCustomer();
		hakan.setId(11);
		hakan.setFirstName("Hakan");
		hakan.setLastName("YILDIRIM");
		hakan.setCustomerNumber("117");
		hakan.setNationalIDentity("12345678901");
		
		
		CorporateCustomer detay = new CorporateCustomer();
		detay.setCompanyName("Detay Soft");
		detay.setCustomerNumber("123");
		detay.setId(13);
		detay.setTexNumber("155");
		
		UnionCustomer dernekYuva = new UnionCustomer();
		dernekYuva.setCustomerNumber("336");
		
/*		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(hakan);
		customerManager.add(detay);
		customerManager.add(dernekYuva);
		
		System.out.println("--------------");
		 
		customerManager.deleted(hakan);
		customerManager.deleted(detay);
		customerManager.deleted(dernekYuva);
*/
		
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {hakan, detay, dernekYuva};
		
		customerManager.addMultiple(customers);
		System.out.println("------------");
		customerManager.deletedMultiple(customers);
		
		
		
		
		
		
		
		
		
		
		
	}

}
