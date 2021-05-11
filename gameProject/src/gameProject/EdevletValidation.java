package gameProject;

public class EdevletValidation implements Validation{

	@Override
	public  boolean Validate(Gamer gamer) {
		
		if(gamer.getName() == "Hakan Yýldýrým" && gamer.getBirthYear() == "2000" && gamer.getDentityNumber() == "118943") {
			
			return true;
		
		}else {
			
			return false;
		}
	}
	


	
	

}
