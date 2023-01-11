package ProgrammingExercisesCAP10;

import java.math.BigInteger;

public class Ejercicio_10_18_LargePrimeNumbers {
    public static void main(String[] args) {
        String maxLongValue = String.valueOf(Long.MAX_VALUE);
        BigInteger num = new BigInteger(maxLongValue);
        BigInteger one = BigInteger.ONE;

        int count = 0;
        while (count < 5) {
            if (num.isProbablePrime(1)) {
                count++;
                System.out.println(num);
            }
            num = num.add(one);
        }

    }
}
