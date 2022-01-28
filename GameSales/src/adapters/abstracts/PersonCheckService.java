package adapters.abstracts;

import entities.concrets.Gamers;

public interface PersonCheckService {
	boolean CheckIfRealPerson(Gamers gamer);
}
