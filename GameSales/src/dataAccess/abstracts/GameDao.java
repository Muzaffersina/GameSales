package dataAccess.abstracts;

import entities.concrets.Game;

public interface GameDao {
	void addGame(Game game1);
	void updateGame(Game game1);
	void deleteGame(Game game1);

}
