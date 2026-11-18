package com.example.boardgame.repository;

import com.example.boardgame.entity.GameMatch;

public interface GameMatchMapper {

	void registerMatch(GameMatch gameMatch);
	
	void updateMatch(GameMatch gameMatch);
	
	void updateEndDatetime(GameMatch gameMatch);
	
}
