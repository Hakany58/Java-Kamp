package gameProject;

public class GameManager {

	public void addGame(Gamer gamer, Game game) {
		gamer.setGame(gamer.getGame() +" + "+ game.getName());
		
		System.out.println("Oyun Eklendi : " + game.getName() +" : "+ gamer.getName());
		
	}
	
}
