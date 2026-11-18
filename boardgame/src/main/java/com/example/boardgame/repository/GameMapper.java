package com.example.boardgame.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.boardgame.entity.Game;

@Mapper
public interface GameMapper {

	Game findById(int id);
	
	void updateGameDes(Game game);
	
	void registerGame(Game game);
	
	void deleteGame(Game game);
	
}
