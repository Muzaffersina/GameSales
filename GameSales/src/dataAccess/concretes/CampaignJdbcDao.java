package dataAccess.concretes;

import dataAccess.abstracts.CampaignDao;
import entities.concrets.Campaign;

public class CampaignJdbcDao implements  CampaignDao{

	@Override
	public void addCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingInfo()+ " kampanyasÄ± Jdbc sistemine kaydedildi.");
		
	}

	@Override
	public void updateCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingInfo()+ " kampanyasÄ± Jdbc sisteminde guncellendi.");
		
	}

	@Override
	public void deleteCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingInfo()+ " kampanyasÄ± Jdbc sisteminden silindi.");
		
	}

}
