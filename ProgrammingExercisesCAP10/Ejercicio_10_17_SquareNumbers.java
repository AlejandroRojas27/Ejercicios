package ProgrammingExercisesCAP10;

import java.math.BigInteger;

public class Ejercicio_10_17_SquareNumbers {
    public static void main(String[] args) {

        String maxValue = String.valueOf(Long.MAX_VALUE);
        System.out.println("long max value: " + maxValue);

        /*
        String sqrMaxValue = String.valueOf(Math.sqrt((double)Long.parseLong(maxValue)));
        System.out.println(sqrMaxValue);

         */


        BigInteger longMaxValue = new BigInteger(maxValue);
        BigInteger num = new BigInteger(maxValue);
        BigInteger sqr = new BigInteger(String.valueOf(num.sqrt()));
        BigInteger x = BigInteger.ONE;

        System.out.println(sqr);

        int count = 0;
        while (count < 10){

            if(sqr.multiply(sqr).compareTo(longMaxValue) == 1){
                System.out.println("num:" + sqr);
                System.out.println("square num: " + sqr.multiply(sqr));
                count++;
            }
            sqr = sqr.add(x);
        }


    }
}
