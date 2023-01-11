package ProgrammingExercisesCAP9;

import java.util.Random;

public class Ejercicio_9_6_Stopwatch {
    public static void main(String[] args) {
        double[] list = new double[100000];
        java.util.Random randomNumber = new Random(1);

        for (int i = 0; i < list.length; i++) {
            list[i] = randomNumber.nextDouble(100);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Start time: " + stopWatch.getStartTime());

        selectionSort(list);

        stopWatch.stop();
        System.out.println("End time: " + stopWatch.getEndTime());

        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");


    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            //Find the minimum in the list[i...list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                //this "if" found the min, if we want to change to max, we must change the restriction
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }

}

class StopWatch {

    /**
     * Private data fields startTime and endTime with getter methods.
     */
    private long startTime;

    public long getStartTime() {
        return startTime;
    }

    private long endTime;

    public long getEndTime() {
        return endTime;
    }

    /**
     * A no-arg constructor that initializes startTime with the current time.
     */
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    /**
     * A method named start() that resets the startTime to the current time.
     */
    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

}
