package com.example.boardgame.service;

import com.example.boardgame.entity.Game;

public interface GameService {

	Game findById(int id);
	
	void updateGameDis(Game game);
	
	void registerGame(Game game);
	
	void deleteGame(Game game);
	
}
