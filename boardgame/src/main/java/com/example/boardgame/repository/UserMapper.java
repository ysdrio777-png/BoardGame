package com.example.boardgame.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.boardgame.entity.User;

@Mapper
public interface UserMapper {

	void registerUser(User user);
	
	List<User> selectAllUser();
	
	User findByUsername();
	
	User findById(int id);
	
	void updateUser(User user);
}
