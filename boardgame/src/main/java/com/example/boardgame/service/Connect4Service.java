package com.example.boardgame.service;

public interface Connect4Service {

//	private Board board;
//	
//	private GameMatch gameMatch;
//	
//	private User currentPlayer;
	
	void startGame();
	
	void playerTurn();
	
	void placePuck();
	
	boolean isValidColumn(int column);
	
	boolean checkWin();
	
	boolean checkHorizontal();
	
	boolean checkVertical();
	
	boolean checkRightDiagonal();
	
	boolean checkLeftDiagonal();
	
	boolean checkDraw();
	
	void changeTurn();
	
	void finishGame();
	
	void saveResult();
}
