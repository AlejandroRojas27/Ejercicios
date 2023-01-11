import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        double weight = Math.random() * 300;
        System.out.println("Enter weight in pounds: " + (int)weight);

        // Prompt the user to enter height in inches
        double inches = Math.random() * 100;
        System.out.println("Enter height in inches: " + (int)inches);
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double kilograms = weight * KILOGRAMS_PER_POUND;
        double meters = inches * METERS_PER_INCH;
        double bmi = kilograms / (Math.pow(meters,2));
        System.out.println("BMI is: " + bmi);

        //Display result
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi <30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
