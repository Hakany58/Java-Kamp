package inheritance;
// Kurumsal M��teri
public class CorporateCustomer extends Customer{

	 private String companyName;
	private String texNumber;
	
	 public String getCompanyName() {
			return companyName;
		}
	 
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		
		public String getTexNumber() {
			return texNumber;
		}
		
		public void setTexNumber(String texNumber) {
			this.texNumber = texNumber;
		}


	
}
