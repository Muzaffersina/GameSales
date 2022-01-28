package entities.concrets;

import entities.abstracts.Entity;

public class Gamers implements Entity{
	private int  id;
	private String firstName;
	private String lastName;
	private int birth;
	public String natioanalityID;
	public Gamers() {
		super();
	}
	public Gamers(int id, String firstName, String lastName, int birth, String natioanalityID) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birth = birth;
		this.natioanalityID = natioanalityID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getNatioanalityID() {
		return natioanalityID;
	}
	public void setNatioanalityID(String natioanalityID) {
		this.natioanalityID = natioanalityID;
	}
	

}
