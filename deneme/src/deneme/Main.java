package deneme;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class Main {

	public static void main(String[] args) throws RemoteException {
		
		User user1 = new User();
		user1.setAd("Hakan");
		user1.setSoyad("Y�ld�r�m");
		user1.setDogumYili(2000);
		user1.setTCKimlikNo("123");
		
		User user2 = new User();
		user2.setAd("asd");
		user2.setSoyad("asdf");
		user2.setDogumYili(1);
		user2.setTCKimlikNo("1234");
		
		Kontrol kontrol = new Kontrol();
		
		if(kontrol.kontrol(user1)) {
			System.out.println("E-DEVLET �LE DO�RULANDI ^^");
			System.out.println("--------------------------");
		}else {
			System.out.println("KULLANICI B�LG�LER� HATALI !!");
		}
		if(kontrol.kontrol(user2)) {
			System.out.println("E-DEVLET �LE DO�RULANDI ^^");
		}else {
			System.out.println("KULLANICI B�LG�LER� HATALI !!");
			
		}}}
			
			
			
			
			
			


