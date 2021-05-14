package gameProject;

public class Main {

	public static void main(String[] args) {

		// OYUNCU EKLEME
		Gamer gamer = new Gamer();
		gamer.setName("Hakan Yýldýrým");
		gamer.setBirthYear("2000");
		gamer.setDentityNumber("118943");
		gamer.setCart("");
		gamer.setGame("");

		Gamer gamer1 = new Gamer();
		gamer1.setName("Engin Demiroð");
		gamer1.setBirthYear("1976");
		gamer1.setDentityNumber("213");
		gamer1.setCart("");
		gamer1.setGame("");
		
		////////////////////////////////////////////////////////
		
		
		// KAMPANYA EKLEME
		Campaign campaign = new Campaign();
		campaign.setName("Ýlk alýþveriþe %20 Ýndirim");
		Campaign campaign1 = new Campaign();
		campaign1.setName("Dev Ramazan Kampanyasý(%50)");
		Campaign campaign2 = new Campaign();
		campaign2.setName("Seçili ürünlerde 2 al 1 öde");
		
		////////////////////////////////////////////////////////
		
		// OYUN EKLEME
		Game game = new Game();
		game.setName("League of Legends");
		Game game1 = new Game();
		game1.setName("Call Of Duty 2");
		Game game2 = new Game();
		game2.setName("NFS Most Wanted");
		
		////////////////////////////////////////////////////////
		
		//OYUNCU KAYIT-GÜNCELLEME-SÝLME
		GamerManager gamerManager = new GamerManager();
		gamerManager.signUp(gamer);
		gamerManager.update(gamer);
		
		////////////////////////////////////////////////////////
		
		//KAMPANYA EKLEYÝCÝSÝ (HANGÝ OYUNCUYA HANGÝ KAMPANYAYI EKLEMEK ÝSTERSÝNÝZ GÝBÝ)
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addToCart(gamer, campaign);
		campaignManager.addToCart(gamer, campaign1);
		campaignManager.addToCart(gamer1, campaign1);
		campaignManager.addToCart(gamer1, campaign2);

		////////////////////////////////////////////////////////
		
		//OYUN EKLEYÝCÝSÝ (HANGÝ OYUNCUYA HANGÝ OYUNU EKLEMEK ÝSTERSÝNÝZ GÝBÝ)
		GameManager gameManager = new GameManager();
		gameManager.addGame(gamer, game);
		gameManager.addGame(gamer, game1);
		gameManager.addGame(gamer1, game1);
		gameManager.addGame(gamer, game2);
		gameManager.addGame(gamer1, game2);
		
		////////////////////////////////////////////////////////
		
		
		System.out.println(gamer.getName() +" Kampanyalarý : "+ gamer.getCart());
		System.out.println(gamer1.getName() +" Kampanyalarý : "+ gamer1.getCart());
		System.out.println(gamer.getName() +" Mevcut Oyunlarý : "+ gamer.getGame());
		System.out.println(gamer1.getName() +" Mevcut Oyunlarý : "+ gamer1.getGame());
		
		
		
	}

}
