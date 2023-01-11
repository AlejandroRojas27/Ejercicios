package ProgrammingExercisesCAP9;

import java.util.Date;

public class Ejercicio_9_3_UseTheDateClass {
    public static void main(String[] args) {
        java.util.Date date = new Date();
        long time1 = 10000;
        for (int i = 1; i <= 8; i++) {
            date.setTime(time1);
            System.out.println(date.toString());
            time1 *=10;
        }




    }
}



