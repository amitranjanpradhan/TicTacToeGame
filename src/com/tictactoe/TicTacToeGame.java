package com.tictactoe;

import java.util.Scanner;
public class TicTacToeGame {
	private char board[]=new char[10]; //created a tictactoe board of size 10
    private String usersymbol,computersymbol;
    TicTacToeGame(){

        createboard(); //inside the constructor am calling createboard method
        takeUserInput();//inside the constructor am calling takeUserInput method
    }
    public void createboard(){  //created a method named createboard.
        for(int count=1;count<10;count++){ //it will iterate this forloop from 1 to 10
            board[count]=' '; //assigned empty space
        }
    }
    public void takeUserInput(){ //created a method named
        Scanner Sc=new Scanner(System.in);
        System.out.println("Your turn: ");
        String symbol=Sc.next(); // taking user input to check
        if (symbol=="x"){        //Comparing the user input
            usersymbol= "x";
            computersymbol="o";
        }else if (symbol=="o"){
            usersymbol="o";
            computersymbol="x";
        }else{
            System.out.println("invalid option");
        }
    }
    public static void main(String[] args) {
    	System.out.println("Welcome To TicTacToe Game");
    	TicTacToeGame tictactoegame = new TicTacToeGame();
    }
	
}
