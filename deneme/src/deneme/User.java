package deneme;

public class User implements UserDao{
	
	private String TCKimlikNo;
	private String ad;
	private String soyad;
	private int dogumYili;
	
	public User() {
		
	}
	
	public User(String tCKimlikNo, String ad, String soyad, int dogumYili) {
		super();
		TCKimlikNo = tCKimlikNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
	}

	public String getTCKimlikNo() {
		return TCKimlikNo;
	}

	public void setTCKimlikNo(String tCKimlikNo) {
		TCKimlikNo = tCKimlikNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	
	
	

}
