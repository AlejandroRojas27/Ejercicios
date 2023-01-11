package ProgrammingExercisesCAP6;

public class Ejercicio_6_9_ConversionsBetweenFeetAndMeters {
    public static void main(String[] args) {
        double meter = 0;
        double foot = 0;

        System.out.println("Feet   Meters   |   Meters   Feet");
        System.out.println("_____________________________________");
        for (foot = 1, meter = 20; foot<=10; foot++,meter+=5){
            System.out.printf("%4.1f      %4.3f    |     %4.1f      %4.3f\n",foot , footToMeter(foot), meter, meterToFoot(meter));
        }
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        ;
        return 3.2787    * meter;
    }
}
