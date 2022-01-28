package business.concretes;

import adapters.abstracts.PersonCheckService;
import business.abstracts.GamerService;
import dataAccess.abstracts.GamerDao;
import entities.concrets.Gamers;

public class GamerManager implements GamerService{
	
	private PersonCheckService gamerCheckService;
	private GamerDao gamerDao;
	
	public GamerManager(PersonCheckService gamerCheckService,GamerDao gamerDao) {
		super();
		this.gamerCheckService = gamerCheckService;
		this.gamerDao = gamerDao;
	}
			
	@Override
	public void add(Gamers gamer) { 
		
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+ " isimli kisi bilgileri onaylandı.");
			gamerDao.add(gamer);
			
			return;
		}
		else {
			System.out.println(gamer.getFirstName()+" isimli kisi bilgilerinde hata var.");
		}		
	}


	@Override
	public void update(Gamers gamer) {
			gamerDao.update(gamer);
		
	}


	@Override
	public void delete(Gamers gamer) {
			gamerDao.delete(gamer);
		
	}

}
