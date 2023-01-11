package ProgrammingExercisesCAP9;

import java.util.Random;

public class Ejercicio_9_4_UseTheRandomClass {
    public static void main(String[] args) {
        java.util.Random random = new Random(1000);

        for (int i = 1; i <= 50; i++) {
            if(i % 10 == 0) {
                System.out.println(random.nextInt(100));
            }else {
                System.out.print(random.nextInt(100) + " ");
            }
        }
    }
}
