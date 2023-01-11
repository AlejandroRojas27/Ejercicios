import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();
        //Mi solucion propuesta
        {

            System.out.println((int) year + " Is a leap year: ");

            if ((year % 4 == 0) ^ (year % 100 == 0))
                System.out.println("true");
            else if (year % 400 == 0)
                System.out.println("true");
            else
                System.out.println("false");
        }

        //Solucion del libro

        boolean isLeapYear =
                (year % 4 == 0 && year % 100 !=0 ) || (year % 400 == 0);
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
