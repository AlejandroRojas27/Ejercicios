import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //System.out.print("Enter a degree un Fahrenheit: ");
    //double Fahrenheit = input.nextDouble();

    //Convert to celsius
    //double Celsius = ( 5.0 / 9) * (Fahrenheit -32);
    //System.out.println(("Fahrenheit" + Fahrenheit + " is " + Celsius + "º Celsius"));

    // Covert to Fahrenheit
    System.out.print("Enter a degree un Celsius: ");
    double Celsius = input.nextDouble();

    double Fahrenheit = (9.0 / 5) * Celsius + 32;
    System.out.println("Celsius: º" + Celsius + " is " + "Fahrenheit: º" + Fahrenheit );
    }
}
