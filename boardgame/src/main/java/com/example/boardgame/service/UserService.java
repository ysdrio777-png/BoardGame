package com.example.boardgame.service;

import com.example.boardgame.entity.PlayerType;
import com.example.boardgame.entity.User;

public interface UserService {

	void registerUser(User user);
	
	void loginUser(User user, PlayerType playerType);
}
