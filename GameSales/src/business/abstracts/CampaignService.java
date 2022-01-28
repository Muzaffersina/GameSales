package business.abstracts;

import entities.concrets.Campaign;

public interface CampaignService {
	void addCampaing(Campaign campaign);
	void updateCampaing(Campaign campaign);
	void deleteCampaing(Campaign campaign);

}
