package dataAccess.concretes;

import java.util.ArrayList;


import dataAccess.abstracts.GamerDao;
import entities.concrets.Gamers;


public class GamerJdbcDao implements GamerDao{

	
	public ArrayList<Gamers> oyuncuListesi = new ArrayList<Gamers>();
	@Override
	public void add(Gamers user) {
		if(oyuncuListesi.size() != 0) {			
			for (Gamers oyuncu : oyuncuListesi ) {  
				if (oyuncu.getNatioanalityID()==user.getNatioanalityID()){
					System.out.println("KAYIT YAPILAMADI!! Daha once boyle bir TC bulunmaktadir.");
					return;					
				}
				else 
				{
					this.oyuncuListesi.add(user);
					System.out.println(user.getFirstName()+ " bilgileri Jdbc sistemine kaydedildi.");
					return;
				}
			}
		}
		else {
			this.oyuncuListesi.add(user);
			System.out.println(user.getFirstName()+ " bilgileri Jdbc sistemine kaydedildi.");
			
		}
	}

	@Override
	public void update(Gamers user) {
		System.out.println(user.getFirstName()+" bilgileri Jdbc sisteminde guncellendi.");
		
	}

	@Override
	public void delete(Gamers user) {
		System.out.println(user.getFirstName()+" bilgileri Jdbc sisteminden silindi.");
		
	}

}
