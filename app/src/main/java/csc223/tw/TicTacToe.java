package csc223.tw;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static char currPlayer = 'X';

    public void printBoard(){
        System.out.println("----------");
        for (char[] row : board){
            System.out.print("| ");
            for (char cell : row){
                System.out.print(cell + " | ");
            }
            System.out.println();
            System.out.println("----------");
        }
    }

    public void takeTurn(){
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;

        System.out.println("Player  " + currPlayer + ", enter your move (row[0-2] column[0-2]): ");
        row = scanner.nextInt();
        col = scanner.nextInt();

        while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ');
        
        board[row][col] = currPlayer;
    }

    public boolean isGameOver(){
        for (char[] row:board){
            for (char cell:row){
                if (cell == ' '){
                    return false;
                }
            }
        }
        for (int i = 0; i < 3; i++){
            if (board[i][0] == currPlayer && board[i][1] == currPlayer && board[i][2] == currPlayer){
                return true;
            }
            if (board[0][i] == currPlayer && board[1][i] == currPlayer && board[2][i] == currPlayer){
                return true;
            }
        }
        if (board[0][0] == currPlayer && board[1][1] == currPlayer && board[2][2] == currPlayer){
            return true;
        }
        if (board[0][2] == currPlayer && board[1][1] == currPlayer && board[2][0] == currPlayer){
            return true;
        }
        return false;
    }
}

