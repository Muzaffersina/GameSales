package dataAccess.abstracts;

import entities.concrets.Campaign;

public interface CampaignDao {
	void addCampaing(Campaign campaign);
	void updateCampaing(Campaign campaign);
	void deleteCampaing(Campaign campaign);

}
