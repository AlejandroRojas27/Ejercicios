package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_27_Emirp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Emirp numbers, print the first: ");
        int numbers = input.nextInt();

        printEmirpNumbers(numbers);
    }

    public static void printEmirpNumbers(int numbers) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;//Display 10 per line
        int count = 0; //Display 10 per line
        int number = 2; //A number to be tested for primeness

        //Repeatedly find prime numbers
        while (count <= numbers - 1) {
            //Print the prime number and increase the count
            int toTest = Ejercicio_6_3_Palindrome_integer.reverse(number);

            if (Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(number) && Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(toTest) && !Ejercicio_6_3_Palindrome_integer.isPalindrome(number) ) { //Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(number)
                count++; // Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //Print the number and advance to the new line
                    System.out.printf(" %1d\n", number);
                } else
                    System.out.printf(" %1d", number);
            }

            //Check whether the next number is prime
            number++;
        }
    }
}
