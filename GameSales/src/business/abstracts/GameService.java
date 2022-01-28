package business.abstracts;

import entities.concrets.Game;

public interface GameService {
	void addGame(Game game);
	void updateGame(Game game);
	void deleteGame(Game game);

}
