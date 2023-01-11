import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void  main(String[] args) {
        //Crate a Scanner object
        //Scanner input = new Scanner(System.in);

        //Que el usuario anote los nuneros
        //System.out.print("Enter a number for radius: ");
        //double radius = input.nextDouble();

        //Calculo
        double radius = 1.0;
        double area = radius * radius * 3.14159;
        System.out.println("The area is " + area + " for radius " + radius);

        //Calculo
        radius = 2.0;
        area = radius * radius * 3.14159;
        System.out.println("The area is " + area + " for radius " + radius);

        //Display results
        //System.out.println("The area for the circle of radius " + radius + " is " + area );

        //If-else expressions
        {
            radius = -1;
            if (radius < 0) {
                System.out.println("Incorrect input");
            } else {
                double area1 = radius * radius * 3.14159;
                System.out.println("Area is " + area1);

            }
        }
    }
}
