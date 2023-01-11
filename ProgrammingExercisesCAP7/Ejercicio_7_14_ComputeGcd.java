package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_14_ComputeGcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5]; //{125,2525,175,200,1250};
        System.out.println("Enter the values: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        String strNumbers = java.util.Arrays.toString(numbers);
        System.out.println("Great common divisor of " + strNumbers);


        System.out.println("Great common divisor is: " + gcd(numbers));
        //gcd(numbers);

    }

    public static int gcd(int... numbers){
        int gcd = 1; //Initial great common divisor
        int k = 2; //Possible gcd

        while (k <=numbers[0] && k <=numbers[1] && k <=numbers[2] && k <=numbers[3] && k <=numbers[4] ){//&& k <=numbers[2] && k <=numbers[3] && k <=numbers[4]){
            if(numbers[0] % k == 0 && numbers[1] % k == 0 && numbers[2] % k == 0 && numbers[3] % k == 0 && numbers[4] % k == 0)
                gcd = k; //Update gcd
            k++;
        }

        return gcd; //Return gcd
    }
}
