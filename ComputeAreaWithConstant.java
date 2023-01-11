import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
       System.out.println("Ejercicio 2.4");
        final double PI = 3.14159; //DECLARAMOS LA CONSTANTE

        //Creamos el objeto scanner
        Scanner input = new Scanner(System.in);

        //Prompt "Entrada" del radio por parte del user
        System.out.print("Enter a number for radius:  ");
        double radius = input.nextDouble();

        //Cumpute area
        double area = radius * radius * PI;

        //Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);

        // Ejercicio 2.7.1
        System.out.println("Ejercicio 2.7.1");
        final int SIZE = 2;
        System.out.println(SIZE * 1);

        // Ejercicio 2.7.2
        System.out.println("Ejercicio 2.7.2");
        System.out.print("Enter the value for miles: ");
        double miles = input.nextDouble();
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println("kilometros = " + kilometers);


    }
}
