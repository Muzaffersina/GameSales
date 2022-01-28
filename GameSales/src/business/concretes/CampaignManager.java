package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concrets.Campaign;

public class CampaignManager implements CampaignService {
	private CampaignDao campaignDao;
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}
	@Override
	public void addCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingInfo()+ " kampanya eklendi.");
		this.campaignDao.addCampaing(campaign);
		
	}

	@Override
	public void updateCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingInfo()+ " kampanya bilgileri guncellendi.");
		this.campaignDao.updateCampaing(campaign);
		
	}

	@Override
	public void deleteCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingInfo()+ " kampanya silindi.");
		this.campaignDao.deleteCampaing(campaign);
		
	}

}
