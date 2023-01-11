package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_29_TwinPrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Twin primes less that: ");
        int num = input.nextInt();
        twinPrimes(num);
    }
    public static void twinPrimes(int num){
        for (int x = 2;x<num;x++){
            if (Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(x) && Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(x+2)) {
                System.out.printf("(%1d, %1d)\n",x,(x+2));
            }
        }


    }
}
