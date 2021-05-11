package gameProject;

public class Main {

	public static void main(String[] args) {

		// OYUNCU EKLEME
		Gamer gamer = new Gamer();
		gamer.setName("Hakan Y�ld�r�m");
		gamer.setBirthYear("2000");
		gamer.setDentityNumber("118943");
		gamer.setCart("");
		gamer.setGame("");

		Gamer gamer1 = new Gamer();
		gamer1.setName("Engin Demiro�");
		gamer1.setBirthYear("1976");
		gamer1.setDentityNumber("213");
		gamer1.setCart("");
		gamer1.setGame("");
		
		////////////////////////////////////////////////////////
		
		
		// KAMPANYA EKLEME
		Campaign campaign = new Campaign();
		campaign.setName("�lk al��veri�e %20 �ndirim");
		Campaign campaign1 = new Campaign();
		campaign1.setName("Dev Ramazan Kampanyas�(%50)");
		Campaign campaign2 = new Campaign();
		campaign2.setName("Se�ili �r�nlerde 2 al 1 �de");
		
		////////////////////////////////////////////////////////
		
		// OYUN EKLEME
		Game game = new Game();
		game.setName("League of Legends");
		Game game1 = new Game();
		game1.setName("Call Of Duty 2");
		
		////////////////////////////////////////////////////////
		
		//OYUNCU KAYIT-G�NCELLEME-S�LME
		GamerManager gamerManager = new GamerManager();
		gamerManager.signUp(gamer);
		gamerManager.update(gamer);

		////////////////////////////////////////////////////////
		
		//KAMPANYA EKLEY�C�S� (HANG� OYUNCUYA HANG� KAMPANYAYI EKLEMEK �STERS�N�Z G�B�)
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addToCart(gamer, campaign);
		campaignManager.addToCart(gamer, campaign1);
		campaignManager.addToCart(gamer1, campaign1);
		campaignManager.addToCart(gamer1, campaign2);
		
		////////////////////////////////////////////////////////
		
		//OYUN EKLEY�C�S� (HANG� OYUNCUYA HANG� OYUNU EKLEMEK �STERS�N�Z G�B�)
		GameManager gameManager = new GameManager();
		gameManager.addGame(gamer, game);
		gameManager.addGame(gamer, game1);
		gameManager.addGame(gamer1, game1);
		
		////////////////////////////////////////////////////////
		
		
		
		
		System.out.println(gamer.getName() +" Kampanyalar� : "+ gamer.getCart());
		System.out.println(gamer1.getName() +" Kampanyalar� : "+ gamer1.getCart());
		System.out.println(gamer.getName() +" Mevcut Oyunlar� : "+gamer.getGame());
		System.out.println(gamer1.getName() +" Mevcut Oyunlar� : "+gamer1.getGame());
		
		
		
	}

}
