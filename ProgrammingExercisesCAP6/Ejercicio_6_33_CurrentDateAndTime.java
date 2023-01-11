package ProgrammingExercisesCAP6;

public class Ejercicio_6_33_CurrentDateAndTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println(dateFormat(totalMilliseconds));

    }

    public static String dateFormat(long totalMillisecods){
        String x = currentDate(totalMillisecods);
        int a = x.length();
        String day = x.substring(0,2);
        String year = x.substring((a-4),a);
        String month = x.substring(3, (a-5));
        String date = month.concat(" ").concat(day).concat(", ").concat(year).concat(" ").concat(currentTime(totalMillisecods).concat(" GMT"));
        return date;
    }

    public static String currentDate(long totalMillisecods){
      return Ejercicio_6_24_DisplayCurrentDateAndTime.currentDate(totalMillisecods);
    }

    public static String currentTime(long totalMilliseconds){
        return Ejercicio_6_24_DisplayCurrentDateAndTime.currentTime(totalMilliseconds);
    }


}
