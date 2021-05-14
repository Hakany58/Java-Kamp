package gameProject;

public class CampaignManager{

	public void addToCart(Gamer gamer, Campaign campaign) {
		gamer.setCart(gamer.getCart() +" + "+ campaign.getName());
		System.out.println("Kampanya eklendi : " + campaign.getName() +" : "+ gamer.getName() );
		
	}
	

	
	
}
