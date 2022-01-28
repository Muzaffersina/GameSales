package business.concretes;

import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concrets.Game;

public class GameManager  implements GameService{

	private GameDao gameDao;
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}
	@Override
	public void addGame(Game game) {
		
		if(game.getPrice() <= 10) {
			System.out.println("Oyun fiyati 11 birimden ucuz olamaz!");
			System.out.println(game.getName()+ " adli oyun eklenemedi!!!");
		}
		else {
			System.out.println(game.getName()+ " oyunu bilgileri eklendi.");
			gameDao.addGame(game);			
		}
		
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getName()+ " oyunu bilgileri guncellendi.");
		gameDao.updateGame(game);
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getName()+ " oyunu bilgileri silindi.");
		gameDao.deleteGame(game);
	}
	
}
