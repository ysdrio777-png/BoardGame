package com.example.boardgame.service;

import java.util.List;

import com.example.boardgame.entity.User;

public interface RankingService {

	List<User> getAllUsers();
	
	List<User> getTop3users();
}
