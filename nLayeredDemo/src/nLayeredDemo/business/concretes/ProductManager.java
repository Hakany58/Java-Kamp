package nLayeredDemo.business.concretes;
import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.care.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{

	private LoggerService loggerService;
	private ProductDao productDao;
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService ;
	
	}
	
	
	@Override
	public void add(Product product) {
		if(product.getCatogoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün Eklendi : " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		return null;
	}
	
	

}
