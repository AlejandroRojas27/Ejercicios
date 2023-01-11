package ProgrammingExercisesCAP11;

import java.util.GregorianCalendar;

public class MyDate {
    /**
     * The data fields year, month, and day that represent a date. month is 0-based,
     * i.e., 0 is for January
     */

    private int year;
    private int month;
    private int day;

    /**
     * A no-arg constructor that creates a MyDate object for the current date.
     */


    public MyDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = 1 + gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    /**
     * A constructor that constructs a MyDate object with a specified elapsed time
     * since midnight, January 1, 1970, in milliseconds.
     */
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    /**
     * A constructor that constructs a MyDate object with the specified year, month,
     * and day.
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /** Three getter methods for the data fields year, month, and day, respectively. */

    public int getYear(){
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    /** A method named setDate(long elapsedTime) that sets a new date for
     the object using the elapsed time. */
    public void setDate(long elapsedTime){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = 1 + gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
