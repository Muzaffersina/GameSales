package entities.concrets;

import entities.abstracts.Entity;

public class Sale implements Entity{
	
	private Gamers gamer; 
	private Game game;
	private Campaign campaign;
	private double price;
	public Sale() {
		super();
	}
	public Sale(Gamers gamer, Game game, Campaign campaign, double price) {
		super();
		this.gamer = gamer;
		this.game = game;
		this.campaign = campaign;
		this.price = price;
	}
	public Gamers getGamer() {
		return gamer;
	}
	public void setGamer(Gamers gamer) {
		this.gamer = gamer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public double getPrice() {
		if (campaign.getCampaingAmount()!= 0)
		{
			double price = (game.getPrice()-campaign.getCampaingAmount());
			System.out.println("Oyun tutari: "+ price);
			return price ;
		}
		else {
			System.out.println("Oyun tutari: "+ price);
			return price;
		}
		
	}
	
	
	
	
}
