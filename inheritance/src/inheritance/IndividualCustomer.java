package inheritance;
// Bireysel Müþteri
public class IndividualCustomer extends Customer{

	 private String firstName;
	 private String lastName;
	 private String nationalIDentity;
	 
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNationalIDentity() {
		return nationalIDentity;
	}
	
	public void setNationalIDentity(String nationalIDentity) {
		this.nationalIDentity = nationalIDentity;
	}
	
	
}
