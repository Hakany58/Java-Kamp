package gameProject;

public class GamerManager implements GamerService {
	
	@Override
	public void signUp(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();
	
		if(edevletValidation.Validate(gamer) == true) {
			System.out.println("Edevlet ile doðrulandý");
			System.out.println(gamer.getName() + " Kayýt yaptý");
		}else {
			System.out.println("Kayýt yapýlamadý, Bilgilerinizi kontrol ediniz..");
		}	
	}

	@Override
	public void update(Gamer gamer) {
	
		EdevletValidation edevletValidation = new EdevletValidation();
		
		if(edevletValidation.Validate(gamer) == true) {
			
			System.out.println(gamer.getName() + " Bilgilerini güncelledi");
		}else {
			System.out.println("Lütfen Kayýt Yapýnýz..");
		}
		
	}

	@Override
	public void deleted(Gamer gamer) {

EdevletValidation edevletValidation = new EdevletValidation();
		
		if(edevletValidation.Validate(gamer) == true) {
			
			System.out.println(gamer.getName() + " Kaydýný sildi");
		}else {
			System.out.println("Lütfen Kayýt Yapýnýz..");
		}
		
		
	}

	
	

}
