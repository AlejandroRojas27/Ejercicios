package ProgrammingExercisesCAP6;

public class Ejercicio_6_22_MathApproximateTheSquareRoot {
    public static void main(String[] args) {
        long num = 16;
        System.out.println("Squere aproximate square root of number " + num + " is: " + sqrt(num));
    }

    public static double sqrt(long num){
        double lastguess = 1.0;
        double nextguess = 0.0;
        int y = 0;
        for (int x=1;x<=10;y++){

            nextguess = (lastguess + num) / lastguess;
            double z = nextguess -lastguess;
            lastguess = nextguess;

            //System.out.println(y + " Last: " + lastguess + "| Next: " + nextguess + "| resta: " + z);

            if (z < 0.0001 && z > 0){

                break;
            }

        }
        return nextguess;
    }
}
