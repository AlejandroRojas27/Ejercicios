package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_33_CultureChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int x = year % 12;

        String[] zodiac = {"Monkey" , "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        System.out.println("Zodiac animal: " + zodiac[x]);


    }
}
