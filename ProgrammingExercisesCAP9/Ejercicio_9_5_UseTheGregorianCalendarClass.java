package ProgrammingExercisesCAP9;

import java.util.GregorianCalendar;

public class Ejercicio_9_5_UseTheGregorianCalendarClass {
    public static void main(String[] args) {
        java.util.GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("Current year/month/day is " + gregorianCalendar.get(GregorianCalendar.YEAR)
                + " / " + gregorianCalendar.get((GregorianCalendar.MONTH))
                + " / " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        gregorianCalendar.setTimeInMillis(34355555133101L);
        System.out.println("From 1234567898765L year/month/day is " + gregorianCalendar.get(GregorianCalendar.YEAR)
                + " / " + (gregorianCalendar.get(GregorianCalendar.MONTH) + 1)
                + " / " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));


    }
}
