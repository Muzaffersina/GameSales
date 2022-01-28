package business.abstracts;

import entities.concrets.Gamers;

public interface GamerService {
	void add(Gamers gamer);
	void update(Gamers gamer);
	void delete(Gamers gamer);

}
