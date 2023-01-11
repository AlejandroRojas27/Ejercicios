package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_34_SortCharactersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] s = new String[1];
        System.out.println("Enter characters: ");
        for (int i  = 0; i < 1 ;i++){
            s[i] = input.next();
        }

        System.out.println("Characters inside the array sorted: " + sort(s));
    }

    public static String sort(String[] s){
        int length = s[0].length();
        String sort = "";
        String[] x = new String[length];
        for (int i=0; i < length;i++){
            x[i] = String.valueOf(s[0].charAt(i));
        }
        java.util.Arrays.sort(x);
        String toSort = java.util.Arrays.toString(x);

        for (int i = 0; i < toSort.length();i++){
            if(Character.isLetter(toSort.charAt(i))){
                sort += toSort.charAt(i);
            }
        }

        return sort;
    }
}
