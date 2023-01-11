package ProgrammingExercisesCAP10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Ejercicio_10_20_ApproximateE {
    public static void main(String[] args) {
        long i1 = 100;
        System.out.println("When i = " + i1 + " value of e: " + approximateE(i1));

        long i2 = 200;
        System.out.println("When i = " + i2 + " value of e: " + approximateE(i2));

        long i3 = 1000;
        System.out.println("When i = " + i3 + " value of e: " + approximateE(i3));


    }

    public static BigDecimal factorial(long n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigDecimal(i + "")); // i + ""  to be a String

        return result;
    }

    public static BigDecimal approximateE(long i) {

        BigDecimal div;
        BigDecimal e = BigDecimal.ZERO;
        for (long j = 0; j <= i; j++) {
            BigDecimal x = factorial(j);
            div = BigDecimal.ONE.divide(x, 25, RoundingMode.CEILING);
            e = e.add(div);
        }
        return e;
    }


}
