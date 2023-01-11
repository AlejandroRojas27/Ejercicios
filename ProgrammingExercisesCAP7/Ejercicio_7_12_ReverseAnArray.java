package ProgrammingExercisesCAP7;

public class Ejercicio_7_12_ReverseAnArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Original array " + java.util.Arrays.toString(numbers));
        String  reverseArray = java.util.Arrays.toString(reverse(numbers));
        System.out.println("Reverse array " + reverseArray);
    }

    public static int[] reverse(int[] numbers){

        int [] rev = new int[numbers.length];
        for (int i = 0, j = numbers.length-1;i < numbers.length;i++,j--){
            rev[i] = numbers[j];
        }
        System.arraycopy(rev,0,numbers,0,rev.length);
        return numbers;
    }
}
