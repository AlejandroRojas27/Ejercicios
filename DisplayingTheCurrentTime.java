import java.util.Scanner;

public class DisplayingTheCurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1 Obtain the total milliseconds since midnight, January 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        //2 Obtain the total seconds totalSeconds by dividing totalMilliseconds by 1000
       long totalSeconds = totalMilliseconds / 1000 ;
       //3 Compute the current second from totalSeconds % 60
        long currentSecond = totalSeconds % 60;
        //4 Obtain the total minutes totalMinutes by dividing totalSeconds by 60
        long totalMinutes = totalSeconds / 60;
        //5 Compute the current minute from totalMinutes % 60
        long currentMinute = totalMinutes % 60;
        //6 Obtain the total hours totalHours by dividing totalMinutes by 60
        long totalHours = totalMinutes / 60;
        //7 Compute the current hour from totalHours % 24
        long currentHour = totalHours % 24;

        //Display results
        System.out.println("Ajuste de zona horaria respecto a GMT:");
        int Ajuste = input.nextInt();
        System.out.println("Current time is " + (currentHour + Ajuste) + ":"
        + currentMinute + ":" + currentSecond + " GMT "+ Ajuste);
    }
}
