package deneme;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Kontrol {
	
	boolean kontrol(User user) throws RemoteException {
		

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = proxy.TCKimlikNoDogrula(Long.parseLong(user.getTCKimlikNo()),user.getAd(), user.getSoyad(), user.getDogumYili());
		System.out.println("Doðrulama : " + (result ? "Baþarýlý giriþ : Hoþgeldiniz " + user.getAd() +" "+ user.getSoyad() : "Baþarýsýz Giriþ : " + user.getAd() +" "+ user.getSoyad()));
		return result;
		
		
	}

}
