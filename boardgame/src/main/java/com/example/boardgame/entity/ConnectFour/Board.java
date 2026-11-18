package com.example.boardgame.entity.ConnectFour;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	private final int ROWS = 6;
	
	private final int COLUMNS = 7;
	
	private Puck[][] board;
}
