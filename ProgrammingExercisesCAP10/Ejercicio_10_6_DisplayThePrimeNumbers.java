package ProgrammingExercisesCAP10;


import ProgrammingExercisesCAP6.Ejercicio_6_10_UseThe_isPrimeMethod;

public class Ejercicio_10_6_DisplayThePrimeNumbers {
    public static void main(String[] args) {

        int number = 15;
        System.out.println("Prime numbers less than " + number);

        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        for (int i = number; i >= 2; i--) {
            if (Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(i)) {
                System.out.print(i + " ");
                stackOfIntegers.push(i);
            }
        }
        System.out.println(" ");


        Ejercicio_10_5_DisplayThePrimeFactors.reverse(stackOfIntegers);


    }
}
