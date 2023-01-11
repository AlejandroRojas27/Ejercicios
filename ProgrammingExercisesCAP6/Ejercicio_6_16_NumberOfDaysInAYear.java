package ProgrammingExercisesCAP6;

public class Ejercicio_6_16_NumberOfDaysInAYear {
    public static void main(String[] args) {
        int promptYear = 2000;
        numberOfDaysInAYear(promptYear);
    }

    public static int numberOfDaysInAYear(int year){
            int days = 0;
        for (int x = year; x<=2020;x++) {
            days = x;

            if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
                days = 366;
            else
                days = 365;

            System.out.println(x + " Had " + days + " days");
        }
        return year;
    }
}
