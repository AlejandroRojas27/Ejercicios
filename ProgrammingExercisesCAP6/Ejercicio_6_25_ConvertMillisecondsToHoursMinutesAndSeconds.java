package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_25_ConvertMillisecondsToHoursMinutesAndSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Milliseconds: ");
        long milliSeconds = input.nextLong();
        System.out.println("Display as HH:MM:SS  " + convertMillis(milliSeconds));

    }

    public static String convertMillis(long milliSeconds){
        currentSeconds(milliSeconds);

        return currentSeconds(milliSeconds);
    }

    public static String currentSeconds(long milliSeconds){
        long totalSeconds = milliSeconds /1000;
        long currentS = totalSeconds % 60;
        currentMinute(totalSeconds);
        String x = ":".concat(Integer.toString((int)currentS));
        return currentMinute(totalSeconds) + x ;
    }

    public static String currentMinute(long totalSeconds){
        long totalMinutes = totalSeconds / 60;
        long currentM = totalMinutes % 60;
        String x = ":".concat(Integer.toString((int)currentM ));
        currentHour(totalMinutes);
        return currentHour(totalMinutes).concat(x);
    }

    public static String currentHour(long totalMinutes){
        long totalHour = totalMinutes / 60;
        String x = Integer.toString((int)totalHour);
        return x;
    }


}
