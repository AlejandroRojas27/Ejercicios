package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_37_GameBeanMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int slotsInTheBeanMachine = input.nextInt();

        char[] direction = new char[slotsInTheBeanMachine-1];
        int[] slot = new int[slotsInTheBeanMachine];
        int countR = 0;

        //To generate paths and give balls to the slot

        for (int j = 0; j < balls; j++) {
            countR = 0;

            //Balls falling
            for (int i = 0; i < slotsInTheBeanMachine - 1; i++) {
                int leftOrRight = (int) (Math.random() * 2);

                if (leftOrRight == 0) {
                    direction[i] = 'L';
                } else if (leftOrRight == 1) {
                    direction[i] = 'R';
                    countR++;
                }

            }

            //Print direction
            for (int i = 0; i < direction.length; i++) {
                System.out.print(direction[i] + " ");

            }

            //Array of balls in slot
            slot[countR]++;

            System.out.println(" ");

        }
        System.out.println(java.util.Arrays.toString(slot));

        //Print balls distribution
        char[] ballsCh = new char[slotsInTheBeanMachine];
        java.util.Arrays.fill(ballsCh, ' ');

        for (int i = balls-1; i >= 0 ; i--) {

            for (int j = 0; j < slot.length; j++) {
                if(slot[j] > i){
                    ballsCh[j] = 'O';
                }

                System.out.print(ballsCh[j]);
            }
            System.out.println(" ");

            java.util.Arrays.fill(ballsCh, ' ');

        }

    }
}
