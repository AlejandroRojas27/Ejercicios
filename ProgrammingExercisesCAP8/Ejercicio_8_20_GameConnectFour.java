package ProgrammingExercisesCAP8;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Ejercicio_8_20_GameConnectFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Create and initialize arrayToPrint
        char[][] arrayBoard = new char[6][7];
        for (int i = 0; i < arrayBoard.length; i++) {
            for (int j = 0; j < arrayBoard[i].length; j++) {
                arrayBoard[i][j] = ' ';
            }
        }


        printTheBoard(arrayBoard);

        /*
        char[][] arrayBoard = {
                {' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' '},
        };

         */


        int sentinel = 0;
        int draw = 0;

        int column = 0;
        int[] rowCount = new int[arrayBoard[0].length];
        java.util.Arrays.fill(rowCount, arrayBoard.length - 1);



        while (sentinel < 1) {

            //Red disk

            System.out.println("Drop a red disk at column (0–6): ");
            column = input.nextInt();


            //System.out.println(rowCount[column]);

            arrayBoard[rowCount[column]][column] = 'R';
            rowCount[column]--;

            //Print the board

            printTheBoard(arrayBoard);

            //Check if player X win
            if (checkIfWin(arrayBoard, 'R')) {
                System.out.println("Player R win");
                sentinel++;
                break;
            }
            if (!checkIfWin(arrayBoard, 'R')) {
                draw++;
            }
            if (draw == 42) {
                System.out.println("Its a draw");
                sentinel++;
                break;
            }

            //Yellow disk

            System.out.println("Drop a yellow disk at column (0–6): ");
            column = input.nextInt();


            //System.out.println(rowCount[column]);

            arrayBoard[rowCount[column]][column] = 'Y';
            rowCount[column]--;

            //Print the board

            printTheBoard(arrayBoard);

            //Check if player Y win
            if (checkIfWin(arrayBoard, 'Y')) {
                System.out.println("Player Y win");
                sentinel++;
                break;
            }
            if (!checkIfWin(arrayBoard, 'Y')) {
                draw++;
            }

        }

    }

    public static boolean checkIfWin(char[][] arrayResult, char player) {
        boolean win = false;
        //Win by row
        for (int i = arrayResult.length - 1; i >= 0; i--) {

            int count = 0;
            for (int j = 0; j < arrayResult[i].length; j++) {

                if (arrayResult[i][j] == player) {
                    count++;
                    if (count >= 4) {
                        win = true;
                        break;
                    }
                } else if (arrayResult[i][j] != player) {
                    count = 0;
                }
            }

        }

        //Win by col
        for (int i = 0; i < arrayResult[0].length; i++) {

            int count = 0;
            for (int j = arrayResult.length - 1; j >= 0; j--) {

                if (arrayResult[j][i] == player) {
                    count++;
                    if (count >= 4) {
                        win = true;
                        break;
                    }
                } else if (arrayResult[j][i] != player) {
                    count = 0;
                }
            }

        }

        //Win by diagonal left to right
        for (int i = arrayResult.length - 1; i >= 0; i--) {

            for (int j = 0; j < arrayResult[i].length; j++) {

                int count = 0;
                for (int k = i, l = j; k >= 0 && l < arrayResult[i].length; k--, l++) {


                    if (arrayResult[k][l] == player) {
                        count++;
                        if (count >= 4) {
                            win = true;
                            break;
                        }
                    } else if (arrayResult[k][l] != player) {
                        count = 0;
                    }

                }
            }

        }

        //Win by diagonal right to left
        for (int i = arrayResult.length - 1; i >= 0; i--) {


            for (int j = arrayResult[i].length - 1; j >= 0; j--) {

                int count = 0;


                for (int k = i, l = j; k >= 0 && l >= 0; k--, l--) {
                    if (arrayResult[k][l] == player) {
                        count++;
                        if (count >= 4) {
                            win = true;
                            break;
                        }
                    } else if (arrayResult[k][l] != player) {
                        count = 0;
                    }

                }

            }

        }


        return win;
    }

    public static void printTheBoard(char[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            //System.out.println("---------------");
            System.out.print("|");
            for (int j = 0; j < arrayToPrint[i].length; j++) {
                System.out.print(" " + arrayToPrint[i][j] + " |");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------");
    }
}
