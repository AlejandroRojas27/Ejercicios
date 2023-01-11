package ProgrammingExercisesCAP6;

public class Ejercicio_6_24_DisplayCurrentDateAndTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        System.out.println("Current Time GMT: " + currentTime(totalMilliseconds));
        System.out.println("Current Date: " + currentDate(totalMilliseconds));
        currentDate(totalMilliseconds);

    }

    /**CURRENT DATE*/
    public static String currentDate(long totalMilliseconds){
        long totalSeconds = totalMilliseconds /1000;
        long totalDays = totalSeconds / 86400;
        String day = "X";
        final int YEAR_ZERO = 1970;

        long totalYears = totalDays / 365;
        long currentYear = totalYears + YEAR_ZERO;
        String x = Integer.toString((int) currentYear); //Current Year
        currentMonth(totalDays, currentYear, YEAR_ZERO);
        currentDays(totalDays, totalYears, currentYear, YEAR_ZERO);
        return currentDays(totalDays, totalYears, currentYear, YEAR_ZERO).concat("/")
                .concat(currentMonth(totalDays, currentYear, YEAR_ZERO).concat("/").concat(x));
    }

    public static String currentMonth(long totalDays, long currentYear, final int YEAR_ZERO){
        long leapYears = 0;
        for (long z = currentYear;z>=YEAR_ZERO;z--){
            if ((z % 4 == 0 && z % 100 !=0 ) || (z % 400 == 0))
                leapYears++;
        }


        long sumOfDays = (totalDays % 365) - leapYears;
        String month = " ";

        final int JAN = 31;
        int FEB = 0;
        if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
            FEB = 29;
        } else {
            FEB = 28;
        }
        final int MARCH = 31;
        final int APR = 30;
        final int MAY = 31;
        final int JUN = 30;
        final int JUL = 31;
        final int AUG = 31;
        final int SEP = 30;
        final int OCT = 31;
        final int NOV = 30;
        final int DEC = 31;

        long numberOfMonth = 0;

        if (sumOfDays <=JAN) {
            numberOfMonth = 1;
            month = "January";
        }
        else if(sumOfDays<=(JAN+FEB)) {
            numberOfMonth = 2;
            month = "Febrary";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH)) {
            numberOfMonth = 3;
            month = "March";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR)){
            numberOfMonth = 4;
            month = "April";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY)) {
            numberOfMonth = 5;
            month = "May";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY+JUN)) {
            numberOfMonth = 6;
            month = "June";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY+JUN+JUL)) {
            numberOfMonth = 7;
            month = "July";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG)) {
            numberOfMonth = 8;
            month = "August";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP)) {
            numberOfMonth = 9;
            month = "September";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+OCT)) {
            numberOfMonth = 10;
            month = "October";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+OCT+NOV)) {
            numberOfMonth = 11;
            month = "November";
        }
        else if(sumOfDays<=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+OCT+NOV+DEC)) {
            numberOfMonth = 12;
            month = "December";
        }
        //System.out.println(month + "|" + numberOfMonth);
        return month;
    }

    public static String currentDays(long totalDays, long totalYears , long currentYear, final int YEAR_ZERO){
        long leapYears = 0;
        for (long z = currentYear;z>=YEAR_ZERO;z--){
            if ((z % 4 == 0 && z % 100 !=0 ) || (z % 400 == 0))
                leapYears++;
        }
        long daysOfTheYear = totalDays - ((totalYears * 365) + leapYears);


        final int JAN = 31;
        int FEB = 0;
        if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
            FEB = 29;
        } else {
            FEB = 28;
        }
        final int MARCH = 31;
        final int APR = 30;
        final int MAY = 31;
        final int JUN = 30;
        final int JUL = 31;
        final int AUG = 31;
        final int SEP = 30;
        final int OCT = 31;
        final int NOV = 30;
        final int DEC = 31;

        long dayToday = 0;

        if(daysOfTheYear<=JAN){
            dayToday = daysOfTheYear;
        }
        else if (daysOfTheYear <=(JAN+FEB)) {
            dayToday = daysOfTheYear-JAN;
        } else if (daysOfTheYear <=(JAN+FEB+MARCH)) {
            dayToday = daysOfTheYear-(JAN+FEB);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY+JUN)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR+MAY);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY+JUN+JUL)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR+MAY+JUN);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR+MAY+JUN+JUL);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+OCT)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+OCT+NOV)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+OCT);
        } else if (daysOfTheYear <=(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+OCT+NOV+DEC)) {
            dayToday = daysOfTheYear-(JAN+FEB+MARCH+APR+MAY+JUN+JUL+AUG+SEP+NOV);
        }

        return Integer.toString((int) dayToday);
    }


    /**CURRENT TIME*/
    public static String currentTime(long totalMiliseconds){
        currentSeconds(totalMiliseconds);
        //System.out.println(currentSeconds(totalMiliseconds));

        return currentSeconds(totalMiliseconds);
    }

    public static String currentSeconds(long totalMilliseconds){
        long totalSeconds = totalMilliseconds /1000;
        long currentS = totalSeconds & 60;
        currentMinutes(totalSeconds);
        String x = ":".concat(Integer.toString((int)currentS)); /** Dummy value */
        //System.out.println(currentMinutes(totalSeconds) + x);

        if (Integer.toString((int)currentS).length() < 2)
            x = ":0".concat(Integer.toString((int)currentS));

        return currentMinutes(totalSeconds) + x;
    }

    public static String currentMinutes(long totalSeconds){
        long totalMinutes = totalSeconds /60;
        long currentM = totalMinutes % 60;
        currentHour(totalMinutes);

        String y =  ":".concat(Integer.toString((int)currentM)); /** Dummy value */

        if (Integer.toString((int)currentM).length() < 2)
            y = ":0".concat(Integer.toString((int)currentM));

        return currentHour(totalMinutes).concat(y);
    }

    public static String currentHour(long totalMinutes){
        long totalHours = totalMinutes /60;
        long currentH = totalHours % 24;

        String z = Integer.toString((int)currentH);

        if (z.length() < 2)
            z = "0".concat(Integer.toString((int)currentH));

        return z;
    }
}
