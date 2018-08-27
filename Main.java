package com.bluedigit.knoughtsandcrosses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Knoughts and Crosses programming training");
        System.out.println("by Edmond Chhung");
        Scanner userInput = new Scanner(System.in);

        Boolean gameHasntFinished =true;
        Board theBoard = new Board(new Player("Edmond"), new Player("Shelly"));

        theBoard.printPlayers();
        theBoard.printBoard();

        int xValue;
        int yValue;
        Boolean madeMove = false;
        Boolean isItPlayerOneTurn = true;
        Player winner = null;

        while (gameHasntFinished) {
            System.out.println();
            if (isItPlayerOneTurn.equals(true)) {

                while (madeMove.equals(false)) {
                    System.out.println("player 1 - whats your x + y value ?");
                    xValue = Integer.parseInt(userInput.nextLine());
                    yValue = Integer.parseInt(userInput.nextLine());
                    madeMove = theBoard.playerOneMakeMove(xValue, yValue);
                    isItPlayerOneTurn = false;
                }
                madeMove = false;
            } else {

                while (madeMove.equals(false)) {
                    System.out.println("player 2 - whats your x + y value ?");
                    xValue = Integer.parseInt(userInput.nextLine());
                    yValue = Integer.parseInt(userInput.nextLine());
                    madeMove = theBoard.playerTwoMakeMove(xValue, yValue);
                    isItPlayerOneTurn = true;
                }
                madeMove = false;
            }
            theBoard.printBoard();
            if (theBoard.hasSomeoneWon() != null) {
                winner = theBoard.hasSomeoneWon();
                gameHasntFinished = false;
            }
        }
        userInput.close();
        System.out.println();
        System.out.println("Player:" + winner + " wins");

    }
}
