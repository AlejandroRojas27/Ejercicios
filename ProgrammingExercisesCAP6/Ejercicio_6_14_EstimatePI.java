package ProgrammingExercisesCAP6;

public class Ejercicio_6_14_EstimatePI {
    public static void main(String[] args) {
        estimatePi(1000);
    }

    public static void estimatePi(int n0){
        double a= 0;
        double count = 0;
        System.out.println("i        m(i)");
        for (int i = 1;i<=n0;i++){
            double m = 4 * ((Math.pow(-1,i+1)) / ((2*i)-1));
            a+=m;

            for (count=1;count<=n0;count+=100)
                if(i == count) {
                System.out.printf("%d       %1.4f\n", i, a);
            }
        }
    }
}


