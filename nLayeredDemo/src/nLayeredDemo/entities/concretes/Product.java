package nLayeredDemo.entities.concretes;
import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {

	private int id;
	private int catogoryId;
	private String name;
	private double unitPrice;
	private int unitInStock;
	
	public Product() {
		
	}

	public Product(int id, int catogoryId, String name, double unitPrice, int unitInStock) {
		super();
		this.id = id;
		this.catogoryId = catogoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCatogoryId() {
		return catogoryId;
	}

	public void setCatogoryId(int catogoryId) {
		this.catogoryId = catogoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	
	
	
	
	
	
	
	
	
}
