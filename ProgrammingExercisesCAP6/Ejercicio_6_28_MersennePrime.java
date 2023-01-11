package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_28_MersennePrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mersenne prime, p<= ");
        int num = input.nextInt();
        mersenneprime(num);
    }

    public static void mersenneprime(int num){
        int prime = 0;
        System.out.println("p    (2^p)-1");
        for (prime = 2;prime<=num;prime++){
            int x = 0;
            if (Ejercicio_6_10_UseThe_isPrimeMethod.isPrime(prime)) {
                x = prime;
                int p = (int) ((Math.pow(2,prime)) -1);
                System.out.printf("%1d %5d\n",x,p);
            }

        }
    }
}
