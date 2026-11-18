package com.example.boardgame.service;

import com.example.boardgame.entity.GameMatch;

public interface GameMatchService {

	void registerMatch(GameMatch gameMatch);
	
	void finishMatch(GameMatch gameMatch);
}
