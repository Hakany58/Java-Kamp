package gameProject;

public class GamerManager implements GamerService {
	
	@Override
	public void signUp(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();
	
		if(edevletValidation.Validate(gamer) == true) {
			System.out.println("Edevlet ile do�ruland�");
			System.out.println(gamer.getName() + " Kay�t yapt�");
		}else {
			System.out.println("Kay�t yap�lamad�, Bilgilerinizi kontrol ediniz..");
		}	
	}

	@Override
	public void update(Gamer gamer) {
	
		EdevletValidation edevletValidation = new EdevletValidation();
		
		if(edevletValidation.Validate(gamer) == true) {
			
			System.out.println(gamer.getName() + " Bilgilerini g�ncelledi");
		}else {
			System.out.println("L�tfen Kay�t Yap�n�z..");
		}
		
	}

	@Override
	public void deleted(Gamer gamer) {

EdevletValidation edevletValidation = new EdevletValidation();
		
		if(edevletValidation.Validate(gamer) == true) {
			
			System.out.println(gamer.getName() + " Kayd�n� sildi");
		}else {
			System.out.println("L�tfen Kay�t Yap�n�z..");
		}
		
		
	}

	
	

}
