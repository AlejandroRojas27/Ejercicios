package ProgrammingExercisesCAP6;

public class Ejercicio_6_2_Sum_the_digits_in_an_integer {
    public static void main(String[] args) {
        System.out.println("Sum of the digists 234 is  " + sumDigits(234));
    }

    public static int sumDigits(long n){

        String numStr = n + "";
        int length = numStr.length();
        int y = 0;
        long x = 0;
        long w = 0;
        long z = 0;
        long sum = 0;

        for (y = length; y>0; y--){
            if(y == length)
                w = n;
            else
                w = z;
            x = w % 10;
            z = w / 10;
            sum+=x;
        }

        return (int) sum;
    }
}
