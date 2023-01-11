package ProgrammingExercisesCAP10;

import java.math.BigInteger;

public class Ejercicio_10_19_MersennePrime {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2");

        int count = 0;

        System.out.printf("%5s %10s\n", "p", "2^-1");
        System.out.println("----------------------");

        while (count < 100){

            if(num.isProbablePrime(1)){

                int prime = Integer.parseInt(String.valueOf(num));

                BigInteger mersennePrime = BigInteger.TWO.pow(prime).add(BigInteger.valueOf(Long.parseLong("-1")));

                if(mersennePrime.compareTo(BigInteger.ZERO) == 1){
                    System.out.println("   "+ num + "          " + mersennePrime);

                    count++;
                }


            }
            num = num.add(BigInteger.ONE);

        }
    }
}
