package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.GameDao;
import entities.concrets.Game;


public class GameJdbcDao implements GameDao {

	public ArrayList<Game> oyunListesi = new ArrayList<Game>();
	
	@Override
	public void addGame(Game game1) {
		if(oyunListesi.size() != 0) {
			for (Game oyun : oyunListesi) {
				if (oyun.getName() == game1.getName()){
					System.out.println("KAYIT YAPILAMADI!! Aynı isimde oyun bulunmaktadir.");
					return;					
				}
				else 
				{
					this.oyunListesi.add(game1);
					System.out.println(game1.getName()+ " isimli oyun Jdbc sistemine kaydedildi.");
					return;
				}
			
			}
		}
		else {
			this.oyunListesi.add(game1);
			System.out.println(game1.getName()+ " isimli oyun Jdbc sistemine kaydedildi.");
		}
		
		
	}

	@Override
	public void updateGame(Game game1) {
		System.out.println(game1.getName()+ " oyun Jdbc sisteminde guncellendi.");
		
	}

	@Override
	public void deleteGame(Game game1) {
		System.out.println(game1.getName()+ " oyun Jdbc sisteminden silindi.");
		
	}

}
