package com.bluedigit.knoughtsandcrosses.com.bluedigit.knoughtsandcrosses.test;

import com.bluedigit.knoughtsandcrosses.Board;
import com.bluedigit.knoughtsandcrosses.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BoardUnitTest{

    Board theBoard;
    Player edmond;
    Player shelly;

    @BeforeEach
    void beforeEach() {
        edmond = new Player("Edmond");
        shelly = new Player("Shelly");

        theBoard = new Board(edmond, shelly);
    }

    @Test
    void testFirstVerticalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(0, 0);
        theBoard.playerOneMakeMove(1, 0);
        theBoard.playerOneMakeMove(2, 0);
        assertEquals(theBoard.hasSomeoneWon(), edmond);
    }

    @Test
    void testSecondVerticalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(0, 1);
        theBoard.playerOneMakeMove(1, 1);
        theBoard.playerOneMakeMove(2, 1);
        assertEquals(theBoard.hasSomeoneWon(), edmond);

    }

    @Test
    void testThirdVerticalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(0, 2);
        theBoard.playerOneMakeMove(1, 2);
        theBoard.playerOneMakeMove(2, 2);
        assertEquals(theBoard.hasSomeoneWon(), edmond);

    }

    @Test
    void testFirstHorizontalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(0, 0);
        theBoard.playerOneMakeMove(0, 1);
        theBoard.playerOneMakeMove(0, 2);
        assertEquals(theBoard.hasSomeoneWon(), edmond);
    }

    @Test
    void testSecondHorizontalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(1, 0);
        theBoard.playerOneMakeMove(1, 1);
        theBoard.playerOneMakeMove(1, 2);
        assertEquals(theBoard.hasSomeoneWon(), edmond);

    }

    @Test
    void testThirdHorizontalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(2, 0);
        theBoard.playerOneMakeMove(2, 1);
        theBoard.playerOneMakeMove(2, 2);
        assertEquals(theBoard.hasSomeoneWon(), edmond);

    }

    @Test
    void testFirstDiagonalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(0, 0);
        theBoard.playerOneMakeMove(1, 0);
        theBoard.playerOneMakeMove(2, 0);
        assertEquals(theBoard.hasSomeoneWon(), edmond);
    }

    @Test
    void testSecondDiagonalWinConditionForPlayerOne() {
        theBoard.playerOneMakeMove(0, 1);
        theBoard.playerOneMakeMove(1, 1);
        theBoard.playerOneMakeMove(2, 1);
        assertEquals(theBoard.hasSomeoneWon(), edmond);

    }


    @Test
    void testFirstVerticalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(0, 0);
        theBoard.playerTwoMakeMove(1, 0);
        theBoard.playerTwoMakeMove(2, 0);
        assertEquals(theBoard.hasSomeoneWon(), shelly);
    }

    @Test
    void testSecondVerticalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(0, 1);
        theBoard.playerTwoMakeMove(1, 1);
        theBoard.playerTwoMakeMove(2, 1);
        assertEquals(theBoard.hasSomeoneWon(), shelly);

    }

    @Test
    void testThirdVerticalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(0, 2);
        theBoard.playerTwoMakeMove(1, 2);
        theBoard.playerTwoMakeMove(2, 2);
        assertEquals(theBoard.hasSomeoneWon(), shelly);

    }

    @Test
    void testFirstHorizontalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(0, 0);
        theBoard.playerTwoMakeMove(0, 1);
        theBoard.playerTwoMakeMove(0, 2);
        assertEquals(theBoard.hasSomeoneWon(), shelly);
    }

    @Test
    void testSecondHorizontalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(1, 0);
        theBoard.playerTwoMakeMove(1, 1);
        theBoard.playerTwoMakeMove(1, 2);
        assertEquals(theBoard.hasSomeoneWon(), shelly);

    }

    @Test
    void testThirdHorizontalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(2, 0);
        theBoard.playerTwoMakeMove(2, 1);
        theBoard.playerTwoMakeMove(2, 2);
        assertEquals(theBoard.hasSomeoneWon(), shelly);

    }

    @Test
    void testFirstDiagonalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(0, 0);
        theBoard.playerTwoMakeMove(1, 0);
        theBoard.playerTwoMakeMove(2, 0);
        assertEquals(theBoard.hasSomeoneWon(), shelly);
    }

    @Test
    void testSecondDiagonalWinConditionForPlayerTwo() {
        theBoard.playerTwoMakeMove(0, 1);
        theBoard.playerTwoMakeMove(1, 1);
        theBoard.playerTwoMakeMove(2, 1);
        assertEquals(theBoard.hasSomeoneWon(), shelly);

    }

    @Test
    void testStaleMate() {
        theBoard.playerOneMakeMove(1, 1);
        theBoard.playerTwoMakeMove(2, 2);
        theBoard.playerOneMakeMove(0, 0);
        theBoard.playerTwoMakeMove(0, 2);
        theBoard.playerOneMakeMove(1, 2);
        theBoard.playerTwoMakeMove(2, 0);
        theBoard.playerOneMakeMove(2, 1);
        theBoard.playerTwoMakeMove(1, 0);
        theBoard.playerTwoMakeMove(0, 1);
        assertEquals(theBoard.hasSomeoneWon(), null);
    }

    @Test
    void testBoardFull() {
        theBoard.playerOneMakeMove(1, 1);
        theBoard.playerTwoMakeMove(2, 2);
        theBoard.playerOneMakeMove(0, 0);
        theBoard.playerTwoMakeMove(0, 2);
        theBoard.playerOneMakeMove(1, 2);
        theBoard.playerTwoMakeMove(2, 0);
        theBoard.playerOneMakeMove(2, 1);
        theBoard.playerTwoMakeMove(1, 0);
        theBoard.playerOneMakeMove(0, 1);
        assertEquals(theBoard.isBoardFull(), true);
    }

    @Test
    void testBoardNotFull() {
        theBoard.playerOneMakeMove(1, 1);
        theBoard.playerTwoMakeMove(2, 2);
        theBoard.playerOneMakeMove(0, 0);
        theBoard.playerTwoMakeMove(0, 2);
        theBoard.playerOneMakeMove(1, 2);
        theBoard.playerTwoMakeMove(2, 0);
        theBoard.playerOneMakeMove(2, 1);
        theBoard.playerTwoMakeMove(1, 0);
        theBoard.printBoard();
        assertEquals(theBoard.isBoardFull(), false);
    }


}
