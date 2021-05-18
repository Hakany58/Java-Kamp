package nLayeredDemo;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.care.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.XProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		// Spring IoC ile iyileþtirilecek
		ProductService productService = new ProductManager(new XProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(2,2,"Elma",13,100);
		productService.add(product);

		
		ProductDao praductDao = new HibernateProductDao();
		praductDao.get(2);
		
		
		
	}

}
