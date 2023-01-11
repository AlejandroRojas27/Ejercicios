package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_11_GameNineHeadsAndTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 511: ");
        int num = input.nextInt();
        String numberInBinary = decimalToBinary(num);

        //System.out.println(numberInBinary);

        char[][] headOrTail = new char[3][3];
        for (int i = 0; i < headOrTail.length; i++) {
            for (int j = 0; j < headOrTail[i].length; j++) {
                headOrTail[i][j] = 'X';
            }

        }


        for (int i = 0; i < numberInBinary.length(); i++) {

            if (i <= 2) {
                for (int j = 0; j < 1; j++) {
                    if (numberInBinary.charAt(i) == '0') {
                        headOrTail[j][i] = 'H';
                    } else if (numberInBinary.charAt(i) == '1') {
                        headOrTail[j][i] = 'T';
                    }
                }
            } else if (i > 2 && i < 6) {
                for (int j = 1; j < 2; j++) {
                    if (numberInBinary.charAt(i) == '0') {
                        headOrTail[j][(i - 3)] = 'H';
                    } else if (numberInBinary.charAt(i) == '1') {
                        headOrTail[j][(i - 3)] = 'T';
                    }
                }
            } else if (i >= 6) {
                for (int j = 2; j < 3; j++) {

                    if (numberInBinary.charAt(i) == '0') {
                        headOrTail[j][(i - 6)] = 'H';
                    } else if (numberInBinary.charAt(i) == '1') {
                        headOrTail[j][(i - 6)] = 'T';
                    }
                }
            }

        }

        for (int i = 0; i < headOrTail.length; i++) {
            for (int j = 0; j < headOrTail[i].length; j++) {
                System.out.print(headOrTail[i][j] + " ");
            }
            System.out.println(" ");
        }


    }

    public static String decimalToBinary(int number) {
        int quotient = 0;
        int reminder = 0;
        String bin = "";

        for (int i = number; i > 0; ) {
            quotient = i / 2;
            reminder = i % 2;
            bin += reminder;
            i = quotient;
        }

        String binary = "";
        for (int i = bin.length() - 1, j = 0; i >= 0; i--, j++) {
            binary += bin.charAt(i);
        }

        String zero = "";
        if (binary.length() < 9) {

            for (int i = binary.length(); i < 9; i++) {
                zero += "0";
            }
        }

        String binaryNineChar = zero.concat(binary);

        return binaryNineChar;
    }


}
