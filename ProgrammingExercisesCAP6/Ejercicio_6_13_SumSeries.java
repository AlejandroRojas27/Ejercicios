package ProgrammingExercisesCAP6;

public class Ejercicio_6_13_SumSeries {
    public static void main(String[] args) {
        lastNumber(20);
    }

    public static void lastNumber (int x){
        double a = 0;
        System.out.println("i        m(i)");
        for (int i = 1; i<=x;i++){
            double m = i / (i+1.0);
            a +=m;
            System.out.printf("%d       %1.4f\n", i, a);
        }
    }
}
