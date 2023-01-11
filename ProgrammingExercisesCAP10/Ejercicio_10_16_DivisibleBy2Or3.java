package ProgrammingExercisesCAP10;

import java.math.BigDecimal;

public class Ejercicio_10_16_DivisibleBy2Or3 {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("10000000000000000000000000000000000000000000000000");
        BigDecimal one = BigDecimal.ONE;

        int count = 0;
        while (count < 10) {
            if (num.remainder(new BigDecimal("2")) == BigDecimal.ZERO ||
                    num.remainder(new BigDecimal("3")) == BigDecimal.ZERO) {
                System.out.println(num);
                count++;
            }
            num = num.add(one);
        }


    }
}
