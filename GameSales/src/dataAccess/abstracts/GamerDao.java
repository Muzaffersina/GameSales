package dataAccess.abstracts;

import entities.concrets.Gamers;

public interface GamerDao {
	void add(Gamers user);
	void update(Gamers user);
	void delete(Gamers user);

}
