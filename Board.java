package com.bluedigit.knoughtsandcrosses;

public class Board {

    Player player1;

    Player player2;

    /**
     * 3 x 3 grid
     */
    private Move[][] theBoard = {{Move.NOTHING, Move.NOTHING, Move.NOTHING},
            {Move.NOTHING, Move.NOTHING, Move.NOTHING},
            {Move.NOTHING, Move.NOTHING, Move.NOTHING}};

    /**
     * represents the board
     *
     * @param player1 name of player 1
     * @param player2 name of player 2
     */
    public Board(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Boolean isBoardFull(){
        if(theBoard[0][0].equals(Move.CROSS) || theBoard[0][0].equals(Move.KNOUGHT) &&
                theBoard[1][0].equals(Move.CROSS) || theBoard[1][0].equals(Move.KNOUGHT) &&
                theBoard[2][0].equals(Move.CROSS) || theBoard[2][0].equals(Move.KNOUGHT) &&
                theBoard[0][1].equals(Move.CROSS) || theBoard[0][1].equals(Move.KNOUGHT) &&
                theBoard[0][2].equals(Move.CROSS) || theBoard[0][2].equals(Move.KNOUGHT) &&
                theBoard[1][1].equals(Move.CROSS) || theBoard[1][1].equals(Move.KNOUGHT) &&
                theBoard[2][2].equals(Move.CROSS) || theBoard[2][2].equals(Move.KNOUGHT) &&
                theBoard[1][2].equals(Move.CROSS) || theBoard[1][2].equals(Move.KNOUGHT) &&
                theBoard[2][1].equals(Move.CROSS) || theBoard[2][1].equals(Move.KNOUGHT)) {
            return true;
        } else {
            return false;
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    /**
     * Checks if someone has won the game
     *
     * @return the player who won or null
     */
    public Player hasSomeoneWon() {
        int numberOfXsOrOsInARow = 0;

        if (
            // horizontals
                theBoard[0][0].equals(Move.CROSS) && theBoard[0][1].equals(Move.CROSS) && theBoard[0][2].equals(Move.CROSS) ||
                        theBoard[1][0].equals(Move.CROSS) && theBoard[1][1].equals(Move.CROSS) && theBoard[1][2].equals(Move.CROSS) ||
                        theBoard[2][0].equals(Move.CROSS) && theBoard[2][1].equals(Move.CROSS) && theBoard[2][2].equals(Move.CROSS) ||
                        //verticals
                        theBoard[0][0].equals(Move.CROSS) && theBoard[1][0].equals(Move.CROSS) && theBoard[2][0].equals(Move.CROSS) ||
                        theBoard[0][1].equals(Move.CROSS) && theBoard[1][1].equals(Move.CROSS) && theBoard[2][1].equals(Move.CROSS) ||
                        theBoard[0][2].equals(Move.CROSS) && theBoard[1][2].equals(Move.CROSS) && theBoard[2][2].equals(Move.CROSS) ||

                        //diagonals
                        theBoard[0][0].equals(Move.CROSS) && theBoard[1][1].equals(Move.CROSS) && theBoard[2][2].equals(Move.CROSS) ||
                        theBoard[2][0].equals(Move.CROSS) && theBoard[1][1].equals(Move.CROSS) && theBoard[0][2].equals(Move.CROSS)
                ) {
            return player1;
        } else if (// horizontals
                theBoard[0][0].equals(Move.KNOUGHT) && theBoard[0][1].equals(Move.KNOUGHT) && theBoard[0][2].equals(Move.KNOUGHT) ||
                        theBoard[1][0].equals(Move.KNOUGHT) && theBoard[1][1].equals(Move.KNOUGHT) && theBoard[1][2].equals(Move.KNOUGHT) ||
                        theBoard[2][0].equals(Move.KNOUGHT) && theBoard[2][1].equals(Move.KNOUGHT) && theBoard[2][2].equals(Move.KNOUGHT) ||
                        //verticals
                        theBoard[0][0].equals(Move.KNOUGHT) && theBoard[1][0].equals(Move.KNOUGHT) && theBoard[2][0].equals(Move.KNOUGHT) ||
                        theBoard[0][1].equals(Move.KNOUGHT) && theBoard[1][1].equals(Move.KNOUGHT) && theBoard[2][1].equals(Move.KNOUGHT) ||
                        theBoard[0][2].equals(Move.KNOUGHT) && theBoard[1][2].equals(Move.KNOUGHT) && theBoard[2][2].equals(Move.KNOUGHT) ||

                        //diagonals
                        theBoard[0][0].equals(Move.KNOUGHT) && theBoard[1][1].equals(Move.KNOUGHT) && theBoard[2][2].equals(Move.KNOUGHT) ||
                        theBoard[2][0].equals(Move.KNOUGHT) && theBoard[1][1].equals(Move.KNOUGHT) && theBoard[0][2].equals(Move.KNOUGHT)
                ) {
            return player2;
        } else {
            return null;
        }
    }

    /**
     * prints the players playing the game
     */
    public void printPlayers() {
        System.out.println(player1 + " vs " + player2);
    }

    public Boolean playerOneMakeMove(int x, int y) {
        if (theBoard[x][y] == Move.NOTHING) {
            this.theBoard[x][y] = Move.CROSS;
            return true;
        } else {
            return false;
        }
    }

    public Boolean playerTwoMakeMove(int x, int y) {
        if (theBoard[x][y] == Move.NOTHING) {
            this.theBoard[x][y] = Move.KNOUGHT;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gives a print out of the board so players know
     * where they can and cant move.
     */
    public void printBoard() {
        for (int i = 0; i < theBoard.length; i++) {
            System.out.println();
            for (int j = 0; j < theBoard.length; j++) {
                if (theBoard[i][j].equals(Move.CROSS)) {
                    //System.out.print(i + "" + j + "|X|");
                    System.out.print("|X|");

                } else if (theBoard[i][j].equals(Move.KNOUGHT)) {
                    //System.out.print(i + "" + j + "|O|");
                    System.out.print("|O|");

                } else {
                    System.out.print("|_|");
                }

            }
        }
    }

    enum Move {
        CROSS, KNOUGHT, NOTHING;

    }
}
