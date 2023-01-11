package ProgrammingExercisesCAP10;

import java.util.GregorianCalendar;

public class Ejercicio_10_14_TheMyDateClass {
    public static void main(String[] args) {

        MyDate myDate = new MyDate();
        System.out.println("MyDate: " + myDate.getYear() + "/" + myDate.getMonth() + "/" + myDate.getDay());

        MyDate myDate1 = new MyDate(34355555133101L);
        System.out.println("MyDate1: " + myDate1.getYear() + "/" + myDate1.getMonth() + "/" + myDate1.getDay());

        MyDate myDate2 = new MyDate(1234567898765L);
        System.out.println("MyDate2: " + myDate2.getYear() + "/" + myDate2.getMonth() + "/" + myDate2.getDay());

        MyDate myDate3 = new MyDate(1996,12, 27);
        System.out.println("MyDate3: " + myDate3.getYear() + "/" + myDate3.getMonth() + "/" + myDate3.getDay());

        System.out.println("Change elapsed time in myDate1 to 1234567898765L");
        myDate1.setDate(1234567898765L);
        System.out.println("MyDate1: " + myDate1.getYear() + "/" + myDate1.getMonth() + "/" + myDate1.getDay());


    }
}

class MyDate {
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
        java.util.GregorianCalendar gregorianCalendar = new GregorianCalendar();
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
        java.util.GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = 1 + gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
