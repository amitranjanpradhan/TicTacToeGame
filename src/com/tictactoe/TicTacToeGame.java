package com.tictactoe;

public class TicTacToeGame {
	public char board[] = new char[10];//created a tictactoe board of size 10

    TicTacToeGame() {
        createboard();   //inside the constructor am calling createboard method
    }

    public void createboard() { //created a method named createboard.
        for (int count = 1; count < 10; count++) {
            board[count] = ' ';
        }
    }

    public static void main(String[] args) {
    	System.out.println("Welcome To TicTacToe Game");
    	TicTacToeGame tictactoegame = new TicTacToeGame();
    	tictactoegame.createboard();
    }
}
