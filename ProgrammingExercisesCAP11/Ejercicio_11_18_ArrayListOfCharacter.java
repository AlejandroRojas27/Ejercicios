package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_18_ArrayListOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        ArrayList<Character> characters = toCharacterArray(s);
        System.out.println(characters);


    }

    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ch.add(s.charAt(i));

        }
        return ch;
    }
}
