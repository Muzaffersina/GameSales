import adapters.concretes.MernisServiceAdapter;
import adapters.concretes.PersonCheckManager;
import business.abstracts.CampaignService;
import business.abstracts.GameService;
import business.abstracts.GamerService;
import business.abstracts.SaleService;
import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.GamerManager;
import business.concretes.SaleManager;
import dataAccess.concretes.CampaignJdbcDao;
import dataAccess.concretes.GameJdbcDao;
import dataAccess.concretes.GamerJdbcDao;
import dataAccess.concretes.SaleJdbcDao;
import entities.concrets.Campaign;
import entities.concrets.Game;
import entities.concrets.Gamers;
import entities.concrets.Sale;

public class Main {

	public static void main(String[] args) {			
													// PersonCheckManager = rastgele bilgi
													// MernisServiceAdapter = gercek bilgi ile sorgulama
		GamerService gamerService = new GamerManager(new PersonCheckManager(),new GamerJdbcDao());
		Gamers gamer1 = new Gamers(1,"awe","ewa",1998,"512");
		Gamers gamer2 = new Gamers(2,"awe2","ewa2",1998,"512");
									
		//gamerService.add(gamer1);		
		//gamerService.add(gamer2);
		//gamerService.update(gamer2);
		//gamerService.delete(gamer1);
		
		
		GameService gameService = new GameManager(new GameJdbcDao());
		Game game1 = new Game(0,"cs",120,"silahvs");
		Game game2 = new Game(0,"cs",50,"silahvs");
		//gameService.addGame(game1);
		//gameService.addGame(game2);
		//gameService.deleteGame(game2);
		//gameService.updateGame(game2);
		
		CampaignService campaignService = new CampaignManager(new CampaignJdbcDao());
		Campaign campaign1 = new Campaign(0,"kampanya1",0);
		//campaignService.addCampaing(campaign1);
		//campaignService.deleteCampaing(campaign1);
		//campaignService.updateCampaing(campaign1);
		
		
		
		SaleService  saleService = new SaleManager(new SaleJdbcDao());
		Sale sale1 = new Sale(gamer1,game2,campaign1,100);
		//saleService.addSale(sale1);
		//saleService.deleteSale(sale1);
		
		
	}

}
