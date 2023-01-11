package ProgrammingExercisesCAP7;

public class Ejercicio_7_21_SumIntegers_MAIN {
    public static void main(int[] args) {
        int sum =0;
        for (int i = 0; i < args.length;i++){
            sum+= args[i];
        }
        System.out.println("The sum is: " + sum);
    }
}
