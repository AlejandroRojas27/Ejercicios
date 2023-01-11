package ProgrammingExercisesCAP10;

public class Ejercicio_10_1_TheTimeClass {
    public static void main(String[] args) {

        Time time = new Time(5, 23, 55);
        System.out.println(time.toStringTime());


        Time time1 = new Time(555550000);
        System.out.println(time1.toStringTime());

        Time time2 = new Time();
        System.out.println(time2.toStringTime());

        Time time3 = new Time();
        time3.setTime(55555000);
        System.out.println(time3.toStringTime());


    }
}

class Time {

    /**
     * The data fields hour, minute, and second that represent a time.
     */
    private long hour;
    private long minutes;
    private long second;

    private long timeInMilliseconds = System.currentTimeMillis();

    /**
     * A no-arg constructor that creates a Time object for the current time.
     * (The values of the data fields will represent the current time.)
     */
    public Time() {
    }

    /**
     * A constructor that constructs a Time object with a specified elapsed time
     * since midnight, January 1, 1970, in milliseconds.
     * (The values of the data fields will represent this time.)
     */


    public Time(long elapsedTimeInMilliseconds) {
        this.timeInMilliseconds = elapsedTimeInMilliseconds;
    }

    /**
     * A constructor that constructs a Time object with the specified hour, minute, and second.
     */
    public Time(long hour, long minutes, long second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;

    }

    /**
     * Three getter methods for the data fields hour, minute, and second,
     * respectively.
     */

    public long getHour() {
        long currentHour;

        if (hour != 0) {
            currentHour = hour;
        } else {
            long totalSeconds = timeInMilliseconds / 1000;
            long totalMinutes = totalSeconds / 60;
            long totalHour = totalMinutes / 60;
            currentHour = totalHour % 24;
        }

        return currentHour;
        //return totalHour % 24; //Current hour
    }

    public long getMinutes() {
        long currentMinutes;

        if (minutes != 0) {
            currentMinutes = minutes;
        } else {

            long totalSeconds = timeInMilliseconds / 1000;
            long totalMinutes = totalSeconds / 60;
            currentMinutes = totalMinutes % 60;
        }

        return currentMinutes;
        //return totalMinutes % 60; //Current minute
    }

    public long getSeconds() {
        long currentSecond;

        if (second != 0) {
            currentSecond = second;
        } else {

            long totalSeconds = timeInMilliseconds / 1000;
            currentSecond = totalSeconds % 60;
        }

        return currentSecond;
        //return totalSeconds % 60; //Current seconds
    }

    /**
     * A method named setTime(long elapseTime) that sets a new time for the
     * object using the elapsed time. For example, if the elapsed time is 555550000
     * milliseconds, the hour is 10, the minute is 19, and the second is 10.
     */

    public void setTime(long elapsedTime) {
        this.timeInMilliseconds = elapsedTime;
    }

    /**
     * A method to print the current time
     */

    public String toStringTime() {
        return getHour() + ":" + getMinutes() + ":" + getSeconds();
    }
}
