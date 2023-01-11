package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_23_OccurrencesOfASpecifiedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = input.nextLine();
        System.out.println("Enter a letter: ");
        char letter = input.next().charAt(0);

        System.out.println("The number of occurrences of the character " + letter + " in the string: " +
                word + " is " + count(word, letter));
    }

    public static int count(String s, char ch){
        String sUpper = s.toUpperCase();
        char chUpper = Character.toUpperCase(ch);
        int x = sUpper.length();
        int contador = 0;
        for (int y = 0; y <= x-1 ;y++){
            char z = sUpper.charAt(y);
            //System.out.println(y + "| char at y: " + z + " | char to count: " + chUpper);
            if(z == chUpper)
                contador++;
        }
        return contador;
    }
}
