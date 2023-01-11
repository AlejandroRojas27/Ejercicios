package ProgrammingExercisesCAP7;

public class Ejercicio_7_2_ReverseTheNumbersEntered {
    public static void main(String[] args) {
        int[] integers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(java.util.Arrays.toString(integers));
        int[] reverse = new int[integers.length];

        for (int i = integers.length - 1, j = 0; i >= 0; i--, j++){
            reverse[j] = integers[i];
        }

        System.out.println(java.util.Arrays.toString(reverse));



    }
}
