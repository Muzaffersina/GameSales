package entities.concrets;

import entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaingInfo;
	private double campaingAmount;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String campaingInfo, double campaingAmount) {
		super();
		this.id = id;
		this.campaingInfo = campaingInfo;
		this.campaingAmount = campaingAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingInfo() {
		return campaingInfo;
	}

	public void setCampaingInfo(String campaingInfo) {
		this.campaingInfo = campaingInfo;
	}

	public double getCampaingAmount() {
		return campaingAmount;
	}

	public void setCampaingAmount(double campaingAmount) {
		this.campaingAmount = campaingAmount;
	}
	
	

}
