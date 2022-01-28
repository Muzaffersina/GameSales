package adapters.concretes;

import adapters.abstracts.PersonCheckService;
import entities.concrets.Gamers;

public class PersonCheckManager implements PersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamers gamer) {
		//dogrulanmis varsayma
		return true;
	}

}
