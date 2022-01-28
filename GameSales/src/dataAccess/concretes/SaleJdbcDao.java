package dataAccess.concretes;

import dataAccess.abstracts.SaleDao;
import entities.concrets.Sale;

public class SaleJdbcDao implements SaleDao {

	@Override
	public void addSale(Sale sale1) {
		System.out.println(sale1.getGamer().getFirstName()+ " adlı oyuncunun " +sale1.getGame().getName() + " adlı oyun satışı Jdbc sistemine kaydedildi.");
		
	}

	
	@Override
	public void deleteSale(Sale sale1) {
		System.out.println(sale1.getGamer().getFirstName()+ " adlı oyuncunun " +sale1.getGame().getName() + " adlı oyun satışı Jdbc sisteminden silindi.");
	}

	
	

}
