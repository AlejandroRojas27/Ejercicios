package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_9_GamePlayATicTacToeGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**Create and initialize arrayToPrint */
        char[][] arrayBoard = new char[3][3];
        for (int i = 0; i < arrayBoard.length; i++) {
            for (int j = 0; j < arrayBoard[i].length; j++) {
                arrayBoard[i][j] = ' ';
            }
        }

        int row = 0;
        int column = 0;

        //Start
        printTheBoard(arrayBoard);

        int sentinel = 0;
        int draw = 0;

        while (sentinel < 1) {

            //Player X
            System.out.println("Enter a row (0, 1, or 2) for player X: ");
            row = input.nextInt();
            if(row != 0 ^ row != 1 ^ row != 2){
                for (int i = 0; i < 1;) {
                    System.out.println("Invalid value, try again 0, 1, or 2");
                    row = input.nextInt();
                    if(row == 0 || row == 1 || row == 2){
                        i++;
                    }
                }
            }
            System.out.println("Enter a column (0, 1, or 2) for player X: ");
            column = input.nextInt();
            if(column != 0 ^ column != 1 ^ column != 2){
                for (int i = 0; i < 1;) {
                    System.out.println("Invalid value, try again with 0, 1, or 2");
                    column = input.nextInt();
                    if(column == 0 || column == 1 || column == 2){
                        i++;
                    }
                }
            }

            arrayBoard[row][column] = 'X';

            //Pint the board
            printTheBoard(arrayBoard);

            //Check if player X win
            if (checkIfWin(arrayBoard, 'X')) {
                System.out.println("X player won");
                sentinel++;
                break;
            }
            if(!checkIfWin(arrayBoard, 'X')){
                draw++;
            }
            //Check if  draw
            if(draw == 9){
                System.out.println("Its a draw");
                sentinel++;
                break;
            }

            //Player O
            System.out.println("Enter a row (0, 1, or 2) for player 0: ");
            row = input.nextInt();
            if(row != 0 ^ row != 1 ^ row != 2){
                for (int i = 0; i < 1;) {
                    System.out.println("Invalid value, try again 0, 1, or 2");
                    row = input.nextInt();
                    if(row == 0 || row == 1 || row == 2){
                        i++;
                    }
                }
            }
            System.out.println("Enter a column (0, 1, or 2) for player 0: ");
            column = input.nextInt();
            if(column != 0 ^ column != 1 ^ column != 2){
                for (int i = 0; i < 1;) {
                    System.out.println("Invalid value, try again with 0, 1, or 2");
                    column = input.nextInt();
                    if(column == 0 || column == 1 || column == 2){
                        i++;
                    }
                }
            }

            arrayBoard[row][column] = 'O';

            //Print the board
            printTheBoard(arrayBoard);

            //Check if player O win
            if (checkIfWin(arrayBoard, 'O')) {
                System.out.println("O player won");
                sentinel++;
                break;
            }
            if(!checkIfWin(arrayBoard, 'O')){
                draw++;
            }
        }

    }

    public static boolean checkIfWin(char[][] arrayResult, char player) {
        boolean win = false;
        //Win by columns
        for (int i = 0; i < arrayResult.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayResult.length; j++) {
                if (arrayResult[j][i] == player) {
                    count++;
                }
            }
            if (count == 3) {
                win = true;
                break;
            }
        }

        //Win by row
        for (int i = 0; i < arrayResult.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayResult[i].length; j++) {
                if (arrayResult[i][j] == player) {
                    count++;
                }
            }
            if (count == 3) {
                win = true;
                break;
            }
        }

        //Win by diagonal

        int count = 0;
        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = i; j <= i; j++) {
                if (arrayResult[i][j] == player) {
                    count++;

                }
            }
            if (count == 3) {
                win = true;
                break;
            }

        }

        count = 0;
        for (int i = 0, k = arrayResult.length - 1; i < arrayResult.length; i++, k--) {
            for (int j = i; j <= i; j++) {
                if (arrayResult[i][k] == player) {
                    count++;
                }
            }
            if (count == 3) {
                win = true;
                break;
            }
        }

        return win;
    }

    public static void printTheBoard(char[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("---------------");
            System.out.print("| ");
            for (int j = 0; j < arrayToPrint[i].length; j++) {
                System.out.print(" " + arrayToPrint[i][j] + " |");
            }
            System.out.println(" ");
        }
        System.out.println("---------------");
    }
}
