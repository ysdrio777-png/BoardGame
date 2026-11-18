package com.example.boardgame.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int id;
	
	private String username;
	
	private int winCount;
	
	private int loseCount;
	
	private int drawCount;
	
	private LocalDateTime createdAt;
}
