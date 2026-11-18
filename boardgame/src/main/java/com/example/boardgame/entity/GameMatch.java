package com.example.boardgame.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameMatch {

	private int id;
	
	private Game game;
	
	private User player1;
	
	private User player2;
	
	private User winner;
	
	private User loser;
	
	private boolean isDraw;
	
	private LocalDateTime startDateTime;
	
	private LocalDateTime endDateTime;
}
