package Entities;

public class Customer {

	private int id;
	private String name;
	private int birthYear;
	private String dentityNumber;
	private int star;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, int birthYear, String dentityNumber,int star) {
		super();
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.dentityNumber = dentityNumber;
		this.star = star;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getDentityNumber() {
		return dentityNumber;
	}

	public void setDentityNumber(String dentityNumber) {
		this.dentityNumber = dentityNumber;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
	
	
}
