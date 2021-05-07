package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Huawei MateBook X",12999,"16 GB Ram",10,100); 
		
		Product product2 = new Product(); //Örnek-Referans oluþturma
		product2.setId(2);
		product2.setName("Casper Excalibur");
		product2.setUnitPrice(9599);
		product2.setDetail("12 GB Ram");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		
	/*	Product product3 = new Product(); 
		product3.id = 3;
		product3.name = "HP Omen";
		product3.unitPrice = 9000;
		product3.detail = "8 GB Ram";            */   // get-set yapýlýnca bu þekil kullaným yapýlamaz
		  

	/*	Product[] products = {product1,product2,product3};
	
		System.out.println(products.length); 
		
		
		for (Product x : products) {
			System.out.println(x.name);
		} 										*/
		
	/*	Category category1 = new Category();
		category1.id = 1;
		category1.name = "Leptop";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev Aletleri";			*/
		
		Category category1 = new Category();
		Category category2 = new Category();
		
		category1.setId(123);
		category2.setId(124);
		
		category1.setName("Elektronik");
		category2.setName("Yaþam");
		
		Category[] categories = {category1,category2};
		
				for(Category x : categories) {
					System.out.println("Kategori : " + x.getName() + x.getId());
				}
		
		
		
		
	/*	ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);					*/
        
		
		}

	}