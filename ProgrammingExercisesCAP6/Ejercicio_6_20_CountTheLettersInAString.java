package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_20_CountTheLettersInAString {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        System.out.println("Promt a word: ");
        String word = lol.next();
        System.out.println("Letters in the Sting: " + countLetters(word) );

    }

    public static int countLetters(String s){
        int x = s.length();
        int count = 0;
        for (int y = 0;y<=x-1;y++){
            char ch = s.charAt(y);
            if (Character.isLetter(ch))
                count++;
        }
        return count;
    }
}
