package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_32_GameChanceOfWinningAtCraps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Times to run Game craps: ");
        int times = input.nextInt();
        System.out.println("Number of winning games: " + runCraps(times));
    }

    public static int runCraps(int times){
        int count = 0;
        for (int x = 1;x<=times;x++){
            int diceOne = (int) (1+Math.random() * 6);
            int diceTwo = (int) (1+Math.random() * 6);
            if(Ejercicio_6_30_GameCraps.diceRolled(diceOne, diceTwo).equals("You win"))
                count++;
        }
        System.out.println(" ");

        return count;
    }
}
