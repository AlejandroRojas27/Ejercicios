package ProgrammingExercisesCAP6;

public class Ejercicio_6_8_ConversionsBetweenCelsiusAndFahrenheit {
    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit = 0;
        System.out.println("Celsius   Fahrenheit   |   Fahrenheit    Celsius");
        System.out.println("_________________________________________________");
        for (celsius = 40 , fahrenheit = 120; celsius>=31;celsius--, fahrenheit-=10){
           //double celsiusTofahrenheit = (9.0 / 5) * celsius + 32;
            // double fahrenheitTocelsiusTo = (5.0 /9.0) * (fahrenheit - 32);
            System.out.printf("%4.1f      %4.1f    |     %4.1f      %4.2f\n", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }

    /**Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    /**Convert from Fahrenheit to Celsius*/
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 /9.0) * (fahrenheit - 32);
    }

}
