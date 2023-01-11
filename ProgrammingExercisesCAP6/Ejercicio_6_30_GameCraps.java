package ProgrammingExercisesCAP6;

public class Ejercicio_6_30_GameCraps {
    public static void main(String[] args) {
        //Roll the dice
        int diceOne = (int) (1+Math.random() * 6);
        int diceTwo = (int) (1+Math.random() * 6);
        System.out.println("You rolled " + diceOne + " + " + diceTwo + " = " + (diceOne+diceTwo));
        System.out.println(diceRolled(diceOne, diceTwo));

    }
    public static String diceRolled(int diceOne, int diceTwo){
        String answer = "x";
        if ((diceOne+diceTwo) == 2 || (diceOne+diceTwo) == 3 || (diceOne+diceTwo) == 12){
            answer = "You lose";
        }
        else if ((diceOne+diceTwo) == 7 || (diceOne+diceTwo) == 11){
            answer = "You win";
        }
        else {
            System.out.println("point is " + (diceOne+diceTwo));
            int diceOneRolledAgain = (int) (1+Math.random() * 6);
            int diceTwoRolledAgain = (int) (1+Math.random() * 6);
            System.out.println("You rolled " + diceOneRolledAgain + " + " + diceTwoRolledAgain +
                    " = " + (diceOneRolledAgain+diceTwoRolledAgain));
            if ((diceOne+diceTwo) == (diceOneRolledAgain+diceTwoRolledAgain))
                answer = "You win";
            else
                answer = "You lose";
        }
        return answer;
    }
}
