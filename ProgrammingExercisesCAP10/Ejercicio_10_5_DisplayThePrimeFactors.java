package ProgrammingExercisesCAP10;


import ProgrammingExercisesCAP6.Ejercicio_6_10_UseThe_isPrimeMethod;

import java.util.Scanner;

public class Ejercicio_10_5_DisplayThePrimeFactors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int promptNumber = input.nextInt();
        int x = promptNumber;

        StackOfIntegers stackOfIntegers = new StackOfIntegers();


        while (x != 1) {
            if (Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(promptNumber)) {
                stackOfIntegers.push(promptNumber);
                x = 1;
            }

            for (int i = 2; i < (int) (Math.sqrt(promptNumber)); i++) {
                if (Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(i)) {
                    if (x % i == 0) {
                        x /= i;
                        stackOfIntegers.push(i);
                        i = 2;
                    }
                }
            }
        }

        reverse(stackOfIntegers);

    }

    public static void reverse(StackOfIntegers stackOfIntegers) {
        StackOfIntegers reverseFactors = new StackOfIntegers();

        int size = stackOfIntegers.getSize();

        System.out.println("Original stack");
        for (int i = 0; i < size; i++) {
            int pop = stackOfIntegers.pop();
            reverseFactors.push(pop);
            System.out.print(pop + " ");

            if (i == size - 1)
                System.out.println(" ");

        }


        System.out.println("Reverse stack");

        while (!reverseFactors.empty())
            System.out.print(reverseFactors.pop() + " ");


    }

}


