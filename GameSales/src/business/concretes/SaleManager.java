package business.concretes;


import business.abstracts.SaleService;

import dataAccess.abstracts.SaleDao;
import entities.concrets.Sale;

public class SaleManager implements SaleService{

	private SaleDao saleDao1;
	
	public SaleManager(SaleDao saleDao1) {
		super();		
		this.saleDao1 = saleDao1;
	}
	
	@Override
	public void addSale(Sale sale1) {
		if (sale1.getGame().getPrice() < sale1.getCampaign().getCampaingAmount()) {
			System.out.println("Kampanya tutarı oyun tutarindan buyuk olamaz!!");
		}
		else {
			this.saleDao1.addSale(sale1);
		}
		
	}	

	@Override
	public void deleteSale(Sale sale1) {
		this.saleDao1.deleteSale(sale1);
		
	}

	
	
	
}
